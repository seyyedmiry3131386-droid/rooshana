package org.pcap4j.core;

import org.pcap4j.packet.Packet;

/* JADX INFO: loaded from: classes4.dex */
public interface PacketListener {
    void gotPacket(Packet packet);
}
