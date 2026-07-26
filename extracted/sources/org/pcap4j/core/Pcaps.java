package org.pcap4j.core;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import defpackage.rm7;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.core.BpfProgram;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.Inet4NetworkAddress;
import org.pcap4j.util.MacAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class Pcaps {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) Pcaps.class);
    private static final Object lock = new Object();

    private Pcaps() {
        throw new AssertionError();
    }

    public static BpfProgram compileFilter(int i, DataLinkType dataLinkType, String str, BpfProgram.BpfCompileMode bpfCompileMode, Inet4Address inet4Address) throws PcapNativeException {
        if (dataLinkType != null && str != null && bpfCompileMode != null && inet4Address != null) {
            NativeMappings.bpf_program bpf_programVar = new NativeMappings.bpf_program();
            int iPcap_compile_nopcap = NativeMappings.pcap_compile_nopcap(i, dataLinkType.value().intValue(), bpf_programVar, str, bpfCompileMode.getValue(), ByteArrays.getInt(ByteArrays.toByteArray(inet4Address), 0));
            if (iPcap_compile_nopcap >= 0) {
                return new BpfProgram(bpf_programVar, str);
            }
            throw new PcapNativeException("Failed to compile the BPF expression: ".concat(str), Integer.valueOf(iPcap_compile_nopcap));
        }
        throw new NullPointerException("dlt: " + dataLinkType + " bpfExpression: " + str + " mode: " + bpfCompileMode + " netmask: " + inet4Address);
    }

    public static DataLinkType dataLinkNameToVal(String str) throws PcapNativeException {
        if (str == null) {
            throw new NullPointerException("name: " + str);
        }
        int iPcap_datalink_name_to_val = NativeMappings.pcap_datalink_name_to_val(str);
        if (iPcap_datalink_name_to_val >= 0) {
            return DataLinkType.getInstance(Integer.valueOf(iPcap_datalink_name_to_val));
        }
        throw new PcapNativeException("Failed to convert the data link name to the value: ".concat(str), Integer.valueOf(iPcap_datalink_name_to_val));
    }

    public static String dataLinkTypeToDescription(DataLinkType dataLinkType) throws PcapNativeException {
        if (dataLinkType != null) {
            return dataLinkValToDescription(dataLinkType.value().intValue());
        }
        throw new NullPointerException("dlt: " + dataLinkType);
    }

    public static String dataLinkTypeToName(DataLinkType dataLinkType) throws PcapNativeException {
        if (dataLinkType != null) {
            return dataLinkValToName(dataLinkType.value().intValue());
        }
        throw new NullPointerException("dlt: " + dataLinkType);
    }

    public static String dataLinkValToDescription(int i) throws PcapNativeException {
        String strPcap_datalink_val_to_description = NativeMappings.pcap_datalink_val_to_description(i);
        if (strPcap_datalink_val_to_description != null) {
            return strPcap_datalink_val_to_description;
        }
        throw new PcapNativeException(rm7.n(i, "Failed to convert the data link value to the description: "));
    }

    public static String dataLinkValToName(int i) throws PcapNativeException {
        String strPcap_datalink_val_to_name = NativeMappings.pcap_datalink_val_to_name(i);
        if (strPcap_datalink_val_to_name != null) {
            return strPcap_datalink_val_to_name;
        }
        throw new PcapNativeException(rm7.n(i, "Failed to convert the data link value to the name: "));
    }

    public static List<PcapNetworkInterface> findAllDevs() throws PcapNativeException {
        PointerByReference pointerByReference = new PointerByReference();
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        ArrayList arrayList = new ArrayList();
        synchronized (lock) {
            try {
                int iPcap_findalldevs = NativeMappings.pcap_findalldevs(pointerByReference, pcapErrbuf);
                if (iPcap_findalldevs != 0) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Return code: ");
                    sb.append(iPcap_findalldevs);
                    sb.append(", Message: ");
                    sb.append(pcapErrbuf);
                    throw new PcapNativeException(sb.toString(), Integer.valueOf(iPcap_findalldevs));
                }
                if (pcapErrbuf.length() != 0) {
                    logger.warn("{}", pcapErrbuf);
                }
                Pointer pointerG = pointerByReference.a.g(0L);
                if (pointerG == null) {
                    logger.info("No NIF was found.");
                    return Collections.EMPTY_LIST;
                }
                NativeMappings.pcap_if pcap_ifVar = new NativeMappings.pcap_if(pointerG);
                for (NativeMappings.pcap_if pcap_ifVar2 = pcap_ifVar; pcap_ifVar2 != null; pcap_ifVar2 = pcap_ifVar2.next) {
                    arrayList.add(PcapNetworkInterface.newInstance(pcap_ifVar2, true));
                }
                NativeMappings.pcap_freealldevs(pcap_ifVar.getPointer());
                logger.info("{} NIF(s) found.", Integer.valueOf(arrayList.size()));
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static PcapNetworkInterface getDevByAddress(InetAddress inetAddress) throws PcapNativeException {
        if (inetAddress == null) {
            throw new NullPointerException("addr: " + inetAddress);
        }
        for (PcapNetworkInterface pcapNetworkInterface : findAllDevs()) {
            Iterator<PcapAddress> it = pcapNetworkInterface.getAddresses().iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(inetAddress)) {
                    return pcapNetworkInterface;
                }
            }
        }
        return null;
    }

    public static PcapNetworkInterface getDevByName(String str) throws PcapNativeException {
        if (str == null) {
            throw new NullPointerException("name: " + str);
        }
        for (PcapNetworkInterface pcapNetworkInterface : findAllDevs()) {
            if (pcapNetworkInterface.getName().equals(str)) {
                return pcapNetworkInterface;
            }
        }
        return null;
    }

    public static String libVersion() {
        return NativeMappings.pcap_lib_version();
    }

    public static String lookupDev() throws PcapNativeException {
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pointerPcap_lookupdev = NativeMappings.pcap_lookupdev(pcapErrbuf);
        if (pointerPcap_lookupdev == null || pcapErrbuf.length() != 0) {
            throw new PcapNativeException(pcapErrbuf.toString());
        }
        return pointerPcap_lookupdev.l();
    }

    public static Inet4NetworkAddress lookupNet(String str) throws PcapNativeException {
        if (str == null) {
            throw new NullPointerException("devName: " + str);
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        IntByReference intByReference = new IntByReference();
        IntByReference intByReference2 = new IntByReference();
        int iPcap_lookupnet = NativeMappings.pcap_lookupnet(str, intByReference, intByReference2, pcapErrbuf);
        if (iPcap_lookupnet < 0) {
            throw new PcapNativeException(pcapErrbuf.toString(), Integer.valueOf(iPcap_lookupnet));
        }
        return new Inet4NetworkAddress(Inets.itoInetAddress(intByReference.a.e(0L)), Inets.itoInetAddress(intByReference2.a.e(0L)));
    }

    public static PcapHandle openDead(DataLinkType dataLinkType, int i) throws PcapNativeException {
        if (dataLinkType == null) {
            throw new NullPointerException("dlt: " + dataLinkType);
        }
        Pointer pointerPcap_open_dead = NativeMappings.pcap_open_dead(dataLinkType.value().intValue(), i);
        if (pointerPcap_open_dead != null) {
            return new PcapHandle(pointerPcap_open_dead, PcapHandle.TimestampPrecision.MICRO);
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Failed to open a PcapHandle. dlt: ");
        sb.append(dataLinkType);
        sb.append(" snaplen: ");
        sb.append(i);
        throw new PcapNativeException(sb.toString());
    }

    public static PcapHandle openOffline(String str) throws PcapNativeException {
        if (str == null) {
            throw new NullPointerException("filePath: " + str);
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pointerPcap_open_offline = NativeMappings.pcap_open_offline(str, pcapErrbuf);
        if (pointerPcap_open_offline == null || pcapErrbuf.length() != 0) {
            throw new PcapNativeException(pcapErrbuf.toString());
        }
        return new PcapHandle(pointerPcap_open_offline, PcapHandle.TimestampPrecision.MICRO);
    }

    public static String strError(int i) {
        Pointer pointerPcap_strerror = NativeMappings.pcap_strerror(i);
        pointerPcap_strerror.getClass();
        return pointerPcap_strerror.i(Native.g());
    }

    public static String toBpfString(InetAddress inetAddress) {
        if (inetAddress != null) {
            String string = inetAddress.toString();
            return string.substring(string.lastIndexOf("/") + 1);
        }
        throw new NullPointerException("inetAddr: " + inetAddress);
    }

    public static String toBpfString(MacAddress macAddress) {
        if (macAddress != null) {
            StringBuilder sb = new StringBuilder();
            for (byte b : macAddress.getAddress()) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
                sb.append(":");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("macAddr: " + macAddress);
    }

    public static PcapHandle openOffline(String str, PcapHandle.TimestampPrecision timestampPrecision) throws PcapNativeException {
        if (str != null && timestampPrecision != null) {
            NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
            try {
                Pointer pointerPcap_open_offline_with_tstamp_precision = NativeMappings.PcapLibrary.INSTANCE.pcap_open_offline_with_tstamp_precision(str, timestampPrecision.getValue(), pcapErrbuf);
                if (pointerPcap_open_offline_with_tstamp_precision != null && pcapErrbuf.length() == 0) {
                    return new PcapHandle(pointerPcap_open_offline_with_tstamp_precision, timestampPrecision);
                }
                throw new PcapNativeException(pcapErrbuf.toString());
            } catch (UnsatisfiedLinkError unused) {
                throw new PcapNativeException("pcap_open_offline_with_tstamp_precision is not supported by the pcap library installed in this environment.");
            }
        }
        throw new NullPointerException("filePath: " + str + " precision: " + timestampPrecision);
    }

    public static PcapHandle openDead(DataLinkType dataLinkType, int i, PcapHandle.TimestampPrecision timestampPrecision) throws PcapNativeException {
        if (dataLinkType != null && timestampPrecision != null) {
            try {
                Pointer pointerPcap_open_dead_with_tstamp_precision = NativeMappings.PcapLibrary.INSTANCE.pcap_open_dead_with_tstamp_precision(dataLinkType.value().intValue(), i, timestampPrecision.getValue());
                if (pointerPcap_open_dead_with_tstamp_precision != null) {
                    return new PcapHandle(pointerPcap_open_dead_with_tstamp_precision, timestampPrecision);
                }
                StringBuilder sb = new StringBuilder(50);
                sb.append("Failed to open a PcapHandle. dlt: ");
                sb.append(dataLinkType);
                sb.append(" snaplen: ");
                sb.append(i);
                sb.append(" precision: ");
                sb.append(timestampPrecision);
                throw new PcapNativeException(sb.toString());
            } catch (UnsatisfiedLinkError unused) {
                throw new PcapNativeException("pcap_open_dead_with_tstamp_precision is not supported by the pcap library installed in this environment.");
            }
        }
        throw new NullPointerException("dlt: " + dataLinkType + " precision: " + timestampPrecision);
    }
}
