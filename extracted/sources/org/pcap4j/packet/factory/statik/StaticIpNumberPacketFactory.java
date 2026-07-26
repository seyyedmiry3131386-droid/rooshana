package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV6ExtDestinationOptionsPacket;
import org.pcap4j.packet.IpV6ExtFragmentPacket;
import org.pcap4j.packet.IpV6ExtHopByHopOptionsPacket;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.UdpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.IpNumber;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpNumberPacketFactory extends AbstractStaticPacketFactory<IpNumber> {
    private static final StaticIpNumberPacketFactory INSTANCE = new StaticIpNumberPacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticIpNumberPacketFactory() {
        this.instantiaters.put(IpNumber.UDP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<UdpPacket> getTargetClass() {
                return UdpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return UdpPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.ICMPV4, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4CommonPacket> getTargetClass() {
                return IcmpV4CommonPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4CommonPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.ICMPV6, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.3
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6CommonPacket> getTargetClass() {
                return IcmpV6CommonPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6CommonPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.TCP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.4
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<TcpPacket> getTargetClass() {
                return TcpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_HOPOPT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.5
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtHopByHopOptionsPacket> getTargetClass() {
                return IpV6ExtHopByHopOptionsPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6ExtHopByHopOptionsPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_FRAG, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.6
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtFragmentPacket> getTargetClass() {
                return IpV6ExtFragmentPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6ExtFragmentPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_DST_OPTS, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.7
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtDestinationOptionsPacket> getTargetClass() {
                return IpV6ExtDestinationOptionsPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6ExtDestinationOptionsPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_ROUTE, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.8
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtRoutingPacket> getTargetClass() {
                return IpV6ExtRoutingPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6ExtRoutingPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_NONXT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.9
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<UnknownPacket> getTargetClass() {
                return UnknownPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return UnknownPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IpNumber.SCTP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.10
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<SctpPacket> getTargetClass() {
                return SctpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return SctpPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticIpNumberPacketFactory getInstance() {
        return INSTANCE;
    }
}
