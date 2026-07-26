package org.pcap4j.packet;

import java.net.InetAddress;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;

/* JADX INFO: loaded from: classes4.dex */
public interface IpPacket extends Packet {

    public interface IpHeader extends Packet.Header {
        InetAddress getDstAddr();

        IpNumber getProtocol();

        InetAddress getSrcAddr();

        IpVersion getVersion();
    }

    @Override // org.pcap4j.packet.Packet
    IpHeader getHeader();
}
