package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.ArpPacket;
import org.pcap4j.packet.Dot1qVlanTagPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.LlcPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.EtherType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticEtherTypePacketFactory extends AbstractStaticPacketFactory<EtherType> {
    private static final StaticEtherTypePacketFactory INSTANCE = new StaticEtherTypePacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticEtherTypePacketFactory() {
        this.instantiaters.put(EtherType.IPV4, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV4Packet> getTargetClass() {
                return IpV4Packet.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV4Packet.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(EtherType.ARP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<ArpPacket> getTargetClass() {
                return ArpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return ArpPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(EtherType.DOT1Q_VLAN_TAGGED_FRAMES, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.3
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Dot1qVlanTagPacket> getTargetClass() {
                return Dot1qVlanTagPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return Dot1qVlanTagPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(EtherType.IPV6, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.4
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

    public static StaticEtherTypePacketFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.statik.AbstractStaticPacketFactory, org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i, int i2, EtherType etherType) {
        if (bArr != null && etherType != null) {
            PacketInstantiater packetInstantiater = this.instantiaters.get(etherType);
            if (packetInstantiater != null) {
                try {
                    return packetInstantiater.newInstance(bArr, i, i2);
                } catch (IllegalRawDataException unused) {
                    return IllegalPacket.newPacket(bArr, i, i2);
                }
            }
            if ((etherType.value().shortValue() & 65535) <= 1500) {
                try {
                    return LlcPacket.newPacket(bArr, i, i2);
                } catch (IllegalRawDataException unused2) {
                    IllegalPacket.newPacket(bArr, i, i2);
                }
            }
            return newInstance(bArr, i, i2);
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(etherType);
        throw new NullPointerException(sb.toString());
    }
}
