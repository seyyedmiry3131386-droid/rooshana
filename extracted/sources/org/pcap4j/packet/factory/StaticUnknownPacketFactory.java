package org.pcap4j.packet.factory;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.NamedNumber;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticUnknownPacketFactory implements PacketFactory<Packet, NamedNumber<?, ?>> {
    private static final StaticUnknownPacketFactory INSTANCE = new StaticUnknownPacketFactory();

    private StaticUnknownPacketFactory() {
    }

    public static StaticUnknownPacketFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass(NamedNumber<?, ?> namedNumber) {
        return getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass() {
        return UnknownPacket.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public /* bridge */ /* synthetic */ Packet newInstance(byte[] bArr, int i, int i2, NamedNumber namedNumber) {
        return newInstance2(bArr, i, i2, (NamedNumber<?, ?>) namedNumber);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    /* JADX INFO: renamed from: newInstance, reason: avoid collision after fix types in other method */
    public Packet newInstance2(byte[] bArr, int i, int i2, NamedNumber<?, ?> namedNumber) {
        return newInstance(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i, int i2) {
        return UnknownPacket.newPacket(bArr, i, i2);
    }
}
