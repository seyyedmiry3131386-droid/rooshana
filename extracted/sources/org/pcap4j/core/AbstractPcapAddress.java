package org.pcap4j.core;

import defpackage.o40;
import java.net.InetAddress;
import org.pcap4j.core.NativeMappings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractPcapAddress implements PcapAddress {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) AbstractPcapAddress.class);
    private final InetAddress address;
    private final InetAddress broadcastAddr;
    private final InetAddress dstAddr;
    private final InetAddress netmask;

    public AbstractPcapAddress(NativeMappings.pcap_addr pcap_addrVar, short s, String str) {
        pcap_addrVar.getClass();
        NativeMappings.sockaddr.ByReference byReference = pcap_addrVar.addr;
        if (byReference == null || byReference.getSaFamily() == 0) {
            this.address = null;
        } else if (pcap_addrVar.addr.getSaFamily() != s) {
            warn(pcap_addrVar.addr.getSaFamily(), s, str, "addr");
            this.address = null;
        } else {
            this.address = ntoInetAddress(pcap_addrVar.addr);
        }
        NativeMappings.sockaddr.ByReference byReference2 = pcap_addrVar.netmask;
        if (byReference2 == null || byReference2.getSaFamily() == 0) {
            this.netmask = null;
        } else if (pcap_addrVar.netmask.getSaFamily() != s) {
            warn(pcap_addrVar.netmask.getSaFamily(), s, str, "netmask");
            this.netmask = null;
        } else {
            this.netmask = ntoInetAddress(pcap_addrVar.netmask);
        }
        NativeMappings.sockaddr.ByReference byReference3 = pcap_addrVar.broadaddr;
        if (byReference3 == null || byReference3.getSaFamily() == 0) {
            this.broadcastAddr = null;
        } else if (pcap_addrVar.broadaddr.getSaFamily() != s) {
            warn(pcap_addrVar.broadaddr.getSaFamily(), s, str, "broadaddr");
            this.broadcastAddr = null;
        } else {
            this.broadcastAddr = ntoInetAddress(pcap_addrVar.broadaddr);
        }
        NativeMappings.sockaddr.ByReference byReference4 = pcap_addrVar.dstaddr;
        if (byReference4 == null || byReference4.getSaFamily() == 0) {
            this.dstAddr = null;
        } else if (pcap_addrVar.dstaddr.getSaFamily() == s) {
            this.dstAddr = ntoInetAddress(pcap_addrVar.dstaddr);
        } else {
            warn(pcap_addrVar.dstaddr.getSaFamily(), s, str, "dstaddr");
            this.dstAddr = null;
        }
    }

    private void warn(short s, short s2, String str, String str2) {
        Logger logger2 = logger;
        if (logger2.isWarnEnabled()) {
            logger2.warn("Couldn't analyze an address. devName: {}, field: {}, actual saFamily: {}, expected saFamily: {}", str, str2, Short.valueOf(s), Short.valueOf(s2));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractPcapAddress abstractPcapAddress = (AbstractPcapAddress) obj;
        InetAddress inetAddress = this.address;
        if (inetAddress == null) {
            if (abstractPcapAddress.address != null) {
                return false;
            }
        } else if (!inetAddress.equals(abstractPcapAddress.address)) {
            return false;
        }
        InetAddress inetAddress2 = this.broadcastAddr;
        if (inetAddress2 == null) {
            if (abstractPcapAddress.broadcastAddr != null) {
                return false;
            }
        } else if (!inetAddress2.equals(abstractPcapAddress.broadcastAddr)) {
            return false;
        }
        InetAddress inetAddress3 = this.dstAddr;
        if (inetAddress3 == null) {
            if (abstractPcapAddress.dstAddr != null) {
                return false;
            }
        } else if (!inetAddress3.equals(abstractPcapAddress.dstAddr)) {
            return false;
        }
        InetAddress inetAddress4 = this.netmask;
        if (inetAddress4 == null) {
            if (abstractPcapAddress.netmask != null) {
                return false;
            }
        } else if (!inetAddress4.equals(abstractPcapAddress.netmask)) {
            return false;
        }
        return true;
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getAddress() {
        return this.address;
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getBroadcastAddress() {
        return this.broadcastAddr;
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getDestinationAddress() {
        return this.dstAddr;
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getNetmask() {
        return this.netmask;
    }

    public int hashCode() {
        InetAddress inetAddress = this.address;
        int iHashCode = ((inetAddress == null ? 0 : inetAddress.hashCode()) + 31) * 31;
        InetAddress inetAddress2 = this.broadcastAddr;
        int iHashCode2 = (iHashCode + (inetAddress2 == null ? 0 : inetAddress2.hashCode())) * 31;
        InetAddress inetAddress3 = this.dstAddr;
        int iHashCode3 = (iHashCode2 + (inetAddress3 == null ? 0 : inetAddress3.hashCode())) * 31;
        InetAddress inetAddress4 = this.netmask;
        return iHashCode3 + (inetAddress4 != null ? inetAddress4.hashCode() : 0);
    }

    public abstract InetAddress ntoInetAddress(NativeMappings.sockaddr sockaddrVar);

    public String toString() {
        StringBuilder sbA = o40.A(190, "address: [");
        sbA.append(this.address);
        sbA.append("] netmask: [");
        sbA.append(this.netmask);
        sbA.append("] broadcastAddr: [");
        sbA.append(this.broadcastAddr);
        sbA.append("] dstAddr [");
        sbA.append(this.dstAddr);
        sbA.append("]");
        return sbA.toString();
    }
}
