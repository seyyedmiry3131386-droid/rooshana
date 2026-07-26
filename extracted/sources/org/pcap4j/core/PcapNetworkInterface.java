package org.pcap4j.core;

import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import defpackage.gt4;
import defpackage.m96;
import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.NativePacketDllMappings;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.LinkLayerAddress;
import org.pcap4j.util.MacAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class PcapNetworkInterface {
    private static final int PCAP_IF_LOOPBACK = 1;
    private static final int PCAP_IF_RUNNING = 4;
    private static final int PCAP_IF_UP = 2;
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PcapNetworkInterface.class);
    private final String description;
    private final boolean local;
    private final boolean loopBack;
    private final String name;
    private final boolean running;
    private final boolean up;
    private final List<PcapAddress> addresses = new ArrayList();
    private final List<LinkLayerAddress> linkLayerAddresses = new ArrayList();

    public enum PromiscuousMode {
        PROMISCUOUS(1),
        NONPROMISCUOUS(0);

        private final int value;

        PromiscuousMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    private PcapNetworkInterface(NativeMappings.pcap_if pcap_ifVar, boolean z) {
        MacAddress macAddress;
        short saFamily;
        this.name = pcap_ifVar.name;
        this.description = pcap_ifVar.description;
        NativeMappings.pcap_addr.ByReference byReference = pcap_ifVar.addresses;
        while (true) {
            if (byReference == null) {
                break;
            }
            NativeMappings.sockaddr.ByReference byReference2 = byReference.addr;
            if (byReference2 == null && byReference.netmask == null && byReference.broadaddr == null && byReference.dstaddr == null) {
                logger.warn("Empty pcap_addr on {} ({}). Ignore it.", this.name, this.description);
            } else {
                if (byReference2 != null) {
                    saFamily = byReference2.getSaFamily();
                } else {
                    NativeMappings.sockaddr.ByReference byReference3 = byReference.netmask;
                    if (byReference3 != null) {
                        saFamily = byReference3.getSaFamily();
                    } else {
                        NativeMappings.sockaddr.ByReference byReference4 = byReference.broadaddr;
                        if (byReference4 != null) {
                            saFamily = byReference4.getSaFamily();
                        } else {
                            NativeMappings.sockaddr.ByReference byReference5 = byReference.dstaddr;
                            saFamily = byReference5 != null ? byReference5.getSaFamily() : (short) 0;
                        }
                    }
                }
                if (saFamily == Inets.AF_INET) {
                    this.addresses.add(PcapIpV4Address.newInstance(byReference, saFamily, this.name));
                } else if (saFamily == Inets.AF_INET6) {
                    this.addresses.add(PcapIpV6Address.newInstance(byReference, saFamily, this.name));
                } else if (m96.e() && saFamily == Inets.AF_PACKET) {
                    NativeMappings.sockaddr_ll sockaddr_llVar = new NativeMappings.sockaddr_ll(byReference.addr.getPointer());
                    byte[] bArr = sockaddr_llVar.sll_addr;
                    int i = sockaddr_llVar.sll_halen & 255;
                    if (i == 6) {
                        this.linkLayerAddresses.add(ByteArrays.getMacAddress(bArr, 0));
                    } else if (bArr.length != 0) {
                        this.linkLayerAddresses.add(LinkLayerAddress.getByAddress(ByteArrays.getSubArray(bArr, 0, i > bArr.length ? bArr.length : i)));
                    }
                } else if (m96.f() || m96.d() || m96.e == 5 || (m96.i() && saFamily == Inets.AF_LINK)) {
                    byte[] address = new NativeMappings.sockaddr_dl(byReference.addr.getPointer()).getAddress();
                    if (address.length == 6) {
                        this.linkLayerAddresses.add(MacAddress.getByAddress(address));
                    } else if (address.length != 0) {
                        this.linkLayerAddresses.add(LinkLayerAddress.getByAddress(address));
                    }
                } else {
                    logger.warn("{} is not supported address family. Ignore it.", Short.valueOf(saFamily));
                }
            }
            byReference = byReference.next;
        }
        if (m96.h() && (macAddress = getMacAddress(this.name)) != null) {
            this.linkLayerAddresses.add(macAddress);
        }
        int i2 = pcap_ifVar.flags;
        this.loopBack = (i2 & 1) != 0;
        this.up = (i2 & 2) != 0;
        this.running = (i2 & 4) != 0;
        this.local = z;
    }

    private MacAddress getMacAddress(String str) {
        Pointer pointerPacketOpenAdapter = NativePacketDllMappings.PacketOpenAdapter(str);
        if ((pointerPacketOpenAdapter != null ? Native.i == 4 ? pointerPacketOpenAdapter.e(0L) : pointerPacketOpenAdapter.f(0L) : -1L) == -1) {
            logger.error("Unable to open the NIF {}, Error Code: {}", str, Integer.valueOf(Native.getLastError()));
            return null;
        }
        gt4 gt4Var = new gt4(NativePacketDllMappings.PACKET_OID_DATA_SIZE);
        Native.setMemory(gt4Var, gt4Var.a, 0L, gt4Var.b, (byte) 0);
        NativePacketDllMappings.PACKET_OID_DATA packet_oid_data = new NativePacketDllMappings.PACKET_OID_DATA(gt4Var);
        packet_oid_data.Length = new NativeLong(6L);
        packet_oid_data.Oid = new NativeLong(16843010L);
        int iPacketRequest = NativePacketDllMappings.PacketRequest(pointerPacketOpenAdapter, 0, packet_oid_data);
        NativePacketDllMappings.PacketCloseAdapter(pointerPacketOpenAdapter);
        if (iPacketRequest != 0) {
            return MacAddress.getByAddress(packet_oid_data.Data);
        }
        logger.error("Failed to retrieve the link layer address of the NIF: {}", str);
        return null;
    }

    public static PcapNetworkInterface newInstance(NativeMappings.pcap_if pcap_ifVar, boolean z) {
        return new PcapNetworkInterface(pcap_ifVar, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PcapNetworkInterface)) {
            return false;
        }
        PcapNetworkInterface pcapNetworkInterface = (PcapNetworkInterface) obj;
        if (!this.addresses.equals(pcapNetworkInterface.addresses)) {
            return false;
        }
        String str = this.description;
        if (str == null) {
            if (pcapNetworkInterface.description != null) {
                return false;
            }
        } else if (!str.equals(pcapNetworkInterface.description)) {
            return false;
        }
        return this.linkLayerAddresses.equals(pcapNetworkInterface.linkLayerAddresses) && this.local == pcapNetworkInterface.local && this.loopBack == pcapNetworkInterface.loopBack && this.up == pcapNetworkInterface.up && this.running == pcapNetworkInterface.running && this.name.equals(pcapNetworkInterface.name);
    }

    public List<PcapAddress> getAddresses() {
        return new ArrayList(this.addresses);
    }

    public String getDescription() {
        return this.description;
    }

    public ArrayList<LinkLayerAddress> getLinkLayerAddresses() {
        return new ArrayList<>(this.linkLayerAddresses);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = (this.addresses.hashCode() + 31) * 31;
        String str = this.description;
        return this.name.hashCode() + ((((((((((this.linkLayerAddresses.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.local ? 1231 : 1237)) * 31) + (this.loopBack ? 1231 : 1237)) * 31) + (this.up ? 1231 : 1237)) * 31) + (this.running ? 1231 : 1237)) * 31);
    }

    public boolean isLocal() {
        return this.local;
    }

    public boolean isLoopBack() {
        return this.loopBack;
    }

    public boolean isRunning() {
        return this.running;
    }

    public boolean isUp() {
        return this.up;
    }

    public PcapHandle openLive(int i, PromiscuousMode promiscuousMode, int i2) throws PcapNativeException {
        if (promiscuousMode == null) {
            throw new NullPointerException("mode: " + promiscuousMode);
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pointerPcap_open_live = NativeMappings.pcap_open_live(this.name, i, promiscuousMode.getValue(), i2, pcapErrbuf);
        if (pointerPcap_open_live == null || pcapErrbuf.length() != 0) {
            throw new PcapNativeException(pcapErrbuf.toString());
        }
        if (i2 == 0 && m96.e == 3) {
            NativeMappings.timeval timevalVar = new NativeMappings.timeval();
            timevalVar.tv_sec = new NativeLong(0L);
            timevalVar.tv_usec = new NativeLong(0L);
            if (NativeMappings.PcapLibrary.INSTANCE.strioctl(NativeMappings.getFdFromPcapT(pointerPcap_open_live), 16897, timevalVar.size(), timevalVar.getPointer()) < 0) {
                Pointer pointerPcap_strerror = NativeMappings.pcap_strerror(NativeMappings.ERRNO_P.e(0L));
                pointerPcap_strerror.getClass();
                throw new PcapNativeException("SBIOCSTIME: ".concat(pointerPcap_strerror.i(Native.g())));
            }
        }
        return new PcapHandle(pointerPcap_open_live, PcapHandle.TimestampPrecision.MICRO);
    }

    public String toString() {
        StringBuilder sbA = o40.A(250, "name: [");
        sbA.append(this.name);
        sbA.append("] description: [");
        sbA.append(this.description);
        for (PcapAddress pcapAddress : this.addresses) {
            sbA.append("] address: [");
            sbA.append(pcapAddress.getAddress());
        }
        for (LinkLayerAddress linkLayerAddress : this.linkLayerAddresses) {
            sbA.append("] link layer address: [");
            sbA.append(linkLayerAddress.getAddress());
        }
        sbA.append("] loopBack: [");
        sbA.append(this.loopBack);
        sbA.append("]] up: [");
        sbA.append(this.up);
        sbA.append("]] running: [");
        sbA.append(this.running);
        sbA.append("]] local: [");
        return t61.l(sbA, this.local, "]");
    }
}
