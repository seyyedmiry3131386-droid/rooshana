package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.ArpPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.SnapPacket;
import org.pcap4j.packet.namednumber.LlcNumber;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticLlcNumberPacketFactory extends AbstractStaticPacketFactory<LlcNumber> {
    private static final StaticLlcNumberPacketFactory INSTANCE = new StaticLlcNumberPacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticLlcNumberPacketFactory() {
        this.instantiaters.put(LlcNumber.ARP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticLlcNumberPacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<ArpPacket> getTargetClass() {
                return ArpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return ArpPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(LlcNumber.SNAP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticLlcNumberPacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<SnapPacket> getTargetClass() {
                return SnapPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return SnapPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticLlcNumberPacketFactory getInstance() {
        return INSTANCE;
    }
}
