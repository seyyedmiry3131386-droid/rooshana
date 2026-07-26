package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.ProtocolFamily;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticProtocolFamilyPacketFactory extends AbstractStaticPacketFactory<ProtocolFamily> {
    private static final StaticProtocolFamilyPacketFactory INSTANCE = new StaticProtocolFamilyPacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticProtocolFamilyPacketFactory() {
        this.instantiaters.put(ProtocolFamily.PF_INET, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticProtocolFamilyPacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV4Packet> getTargetClass() {
                return IpV4Packet.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4Packet.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(ProtocolFamily.PF_INET6, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticProtocolFamilyPacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6Packet> getTargetClass() {
                return IpV6Packet.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6Packet.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticProtocolFamilyPacketFactory getInstance() {
        return INSTANCE;
    }
}
