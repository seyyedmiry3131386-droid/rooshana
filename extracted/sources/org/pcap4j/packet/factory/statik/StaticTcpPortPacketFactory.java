package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.DnsPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.TcpPort;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticTcpPortPacketFactory extends AbstractStaticPacketFactory<TcpPort> {
    private static final StaticTcpPortPacketFactory INSTANCE = new StaticTcpPortPacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticTcpPortPacketFactory() {
        this.instantiaters.put(TcpPort.DOMAIN, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpPortPacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<DnsPacket> getTargetClass() {
                return DnsPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return DnsPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticTcpPortPacketFactory getInstance() {
        return INSTANCE;
    }
}
