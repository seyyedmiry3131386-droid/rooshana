package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.Dot11ProbeRequestPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.Dot11FrameType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticDot11FrameTypePacketFactory extends AbstractStaticPacketFactory<Dot11FrameType> {
    private static final StaticDot11FrameTypePacketFactory INSTANCE = new StaticDot11FrameTypePacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticDot11FrameTypePacketFactory() {
        this.instantiaters.put(Dot11FrameType.PROBE_REQUEST, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDot11FrameTypePacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Dot11ProbeRequestPacket> getTargetClass() {
                return Dot11ProbeRequestPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return Dot11ProbeRequestPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticDot11FrameTypePacketFactory getInstance() {
        return INSTANCE;
    }
}
