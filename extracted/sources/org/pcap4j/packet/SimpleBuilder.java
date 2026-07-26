package org.pcap4j.packet;

import org.pcap4j.packet.AbstractPacket;

/* JADX INFO: loaded from: classes4.dex */
public final class SimpleBuilder extends AbstractPacket.AbstractBuilder {
    private Packet packet;

    public SimpleBuilder() {
    }

    @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
    public Packet build() {
        return this.packet;
    }

    public SimpleBuilder packet(Packet packet) {
        this.packet = packet;
        return this;
    }

    public SimpleBuilder(Packet packet) {
        this.packet = packet;
    }
}
