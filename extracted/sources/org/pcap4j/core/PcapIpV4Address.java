package org.pcap4j.core;

import java.net.Inet4Address;
import org.pcap4j.core.NativeMappings;

/* JADX INFO: loaded from: classes4.dex */
public final class PcapIpV4Address extends AbstractPcapAddress {
    private PcapIpV4Address(NativeMappings.pcap_addr pcap_addrVar, short s, String str) {
        super(pcap_addrVar, s, str);
    }

    public static PcapIpV4Address newInstance(NativeMappings.pcap_addr pcap_addrVar, short s, String str) {
        return new PcapIpV4Address(pcap_addrVar, s, str);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getAddress() {
        return (Inet4Address) super.getAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getBroadcastAddress() {
        return (Inet4Address) super.getBroadcastAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getDestinationAddress() {
        return (Inet4Address) super.getDestinationAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getNetmask() {
        return (Inet4Address) super.getNetmask();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public Inet4Address ntoInetAddress(NativeMappings.sockaddr sockaddrVar) {
        return Inets.ntoInetAddress(new NativeMappings.sockaddr_in(sockaddrVar.getPointer()).sin_addr);
    }
}
