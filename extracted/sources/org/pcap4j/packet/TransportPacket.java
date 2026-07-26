package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.Port;

/* JADX INFO: loaded from: classes4.dex */
public interface TransportPacket extends Packet {

    public interface TransportHeader extends Packet.Header {
        Port getDstPort();

        Port getSrcPort();
    }

    @Override // org.pcap4j.packet.Packet
    TransportHeader getHeader();
}
