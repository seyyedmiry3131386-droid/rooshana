package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.DnsPacket;
import org.pcap4j.packet.GtpSelector;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.UdpPort;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticUdpPortPacketFactory extends AbstractStaticPacketFactory<UdpPort> {
    private static final StaticUdpPortPacketFactory INSTANCE = new StaticUdpPortPacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticUdpPortPacketFactory() {
        this.instantiaters.put(UdpPort.GTP_C, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<GtpSelector> getTargetClass() {
                return GtpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return GtpSelector.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(UdpPort.GTP_U, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<GtpSelector> getTargetClass() {
                return GtpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return GtpSelector.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(UdpPort.GTP_PRIME, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.3
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<GtpSelector> getTargetClass() {
                return GtpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return GtpSelector.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(UdpPort.DOMAIN, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.4
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

    public static StaticUdpPortPacketFactory getInstance() {
        return INSTANCE;
    }
}
