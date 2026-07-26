package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.PppDllProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticPppDllProtocolPacketFactory extends AbstractStaticPacketFactory<PppDllProtocol> {
    private static final StaticPppDllProtocolPacketFactory INSTANCE = new StaticPppDllProtocolPacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticPppDllProtocolPacketFactory() {
        this.instantiaters.put(PppDllProtocol.IPV4, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticPppDllProtocolPacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV4Packet> getTargetClass() {
                return IpV4Packet.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4Packet.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(PppDllProtocol.IPV6, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticPppDllProtocolPacketFactory.2
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

    public static StaticPppDllProtocolPacketFactory getInstance() {
        return INSTANCE;
    }
}
