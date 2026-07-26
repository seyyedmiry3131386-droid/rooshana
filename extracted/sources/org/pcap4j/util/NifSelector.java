package org.pcap4j.util;

import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.pcap4j.core.PcapAddress;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;

/* JADX INFO: loaded from: classes4.dex */
public class NifSelector {
    private static String LINE_SEPARATOR = System.getProperty("line.separator");

    public PcapNetworkInterface doSelect(List<PcapNetworkInterface> list) throws IOException {
        while (true) {
            write("Select a device number to capture packets, or enter 'q' to quit > ");
            String str = read();
            if (str != null) {
                if (str.equals("q")) {
                    return null;
                }
                try {
                    int i = Integer.parseInt(str);
                    if (i >= 0 && i < list.size()) {
                        return list.get(i);
                    }
                    write("Invalid input." + LINE_SEPARATOR);
                } catch (NumberFormatException unused) {
                    write("Invalid input." + LINE_SEPARATOR);
                }
            }
        }
    }

    public String read() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public final PcapNetworkInterface selectNetworkInterface() throws IOException {
        try {
            List<PcapNetworkInterface> listFindAllDevs = Pcaps.findAllDevs();
            if (listFindAllDevs == null || listFindAllDevs.isEmpty()) {
                throw new IOException("No NIF to capture.");
            }
            showNifList(listFindAllDevs);
            return doSelect(listFindAllDevs);
        } catch (PcapNativeException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void showNifList(List<PcapNetworkInterface> list) throws IOException {
        StringBuilder sb = new StringBuilder(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        int i = 0;
        for (PcapNetworkInterface pcapNetworkInterface : list) {
            sb.append("NIF[");
            sb.append(i);
            sb.append("]: ");
            sb.append(pcapNetworkInterface.getName());
            sb.append(LINE_SEPARATOR);
            if (pcapNetworkInterface.getDescription() != null) {
                sb.append("      : description: ");
                sb.append(pcapNetworkInterface.getDescription());
                sb.append(LINE_SEPARATOR);
            }
            for (LinkLayerAddress linkLayerAddress : pcapNetworkInterface.getLinkLayerAddresses()) {
                sb.append("      : link layer address: ");
                sb.append(linkLayerAddress);
                sb.append(LINE_SEPARATOR);
            }
            for (PcapAddress pcapAddress : pcapNetworkInterface.getAddresses()) {
                sb.append("      : address: ");
                sb.append(pcapAddress.getAddress());
                sb.append(LINE_SEPARATOR);
            }
            i++;
        }
        sb.append(LINE_SEPARATOR);
        write(sb.toString());
    }

    public void write(String str) throws IOException {
        System.out.print(str);
    }
}
