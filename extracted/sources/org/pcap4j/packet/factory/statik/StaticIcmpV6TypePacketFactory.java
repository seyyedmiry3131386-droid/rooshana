package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IcmpV6DestinationUnreachablePacket;
import org.pcap4j.packet.IcmpV6EchoReplyPacket;
import org.pcap4j.packet.IcmpV6EchoRequestPacket;
import org.pcap4j.packet.IcmpV6HomeAgentAddressDiscoveryReplyPacket;
import org.pcap4j.packet.IcmpV6HomeAgentAddressDiscoveryRequestPacket;
import org.pcap4j.packet.IcmpV6MobilePrefixAdvertisementPacket;
import org.pcap4j.packet.IcmpV6MobilePrefixSolicitationPacket;
import org.pcap4j.packet.IcmpV6NeighborAdvertisementPacket;
import org.pcap4j.packet.IcmpV6NeighborSolicitationPacket;
import org.pcap4j.packet.IcmpV6PacketTooBigPacket;
import org.pcap4j.packet.IcmpV6ParameterProblemPacket;
import org.pcap4j.packet.IcmpV6RedirectPacket;
import org.pcap4j.packet.IcmpV6RouterAdvertisementPacket;
import org.pcap4j.packet.IcmpV6RouterSolicitationPacket;
import org.pcap4j.packet.IcmpV6TimeExceededPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IcmpV6Type;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIcmpV6TypePacketFactory extends AbstractStaticPacketFactory<IcmpV6Type> {
    private static final StaticIcmpV6TypePacketFactory INSTANCE = new StaticIcmpV6TypePacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticIcmpV6TypePacketFactory() {
        this.instantiaters.put(IcmpV6Type.DESTINATION_UNREACHABLE, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6DestinationUnreachablePacket> getTargetClass() {
                return IcmpV6DestinationUnreachablePacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6DestinationUnreachablePacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.PACKET_TOO_BIG, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6PacketTooBigPacket> getTargetClass() {
                return IcmpV6PacketTooBigPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6PacketTooBigPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.TIME_EXCEEDED, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.3
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6TimeExceededPacket> getTargetClass() {
                return IcmpV6TimeExceededPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6TimeExceededPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.PARAMETER_PROBLEM, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.4
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6ParameterProblemPacket> getTargetClass() {
                return IcmpV6ParameterProblemPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6ParameterProblemPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.ECHO_REQUEST, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.5
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6EchoRequestPacket> getTargetClass() {
                return IcmpV6EchoRequestPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6EchoRequestPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.ECHO_REPLY, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.6
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6EchoReplyPacket> getTargetClass() {
                return IcmpV6EchoReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6EchoReplyPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.ROUTER_SOLICITATION, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.7
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6RouterSolicitationPacket> getTargetClass() {
                return IcmpV6RouterSolicitationPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6RouterSolicitationPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.ROUTER_ADVERTISEMENT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.8
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6RouterAdvertisementPacket> getTargetClass() {
                return IcmpV6RouterAdvertisementPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6RouterAdvertisementPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.NEIGHBOR_SOLICITATION, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.9
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6NeighborSolicitationPacket> getTargetClass() {
                return IcmpV6NeighborSolicitationPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6NeighborSolicitationPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.NEIGHBOR_ADVERTISEMENT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.10
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6NeighborAdvertisementPacket> getTargetClass() {
                return IcmpV6NeighborAdvertisementPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6NeighborAdvertisementPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.REDIRECT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.11
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6RedirectPacket> getTargetClass() {
                return IcmpV6RedirectPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6RedirectPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.HOME_AGENT_ADDRESS_DISCOVERY_REQUEST, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.12
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6HomeAgentAddressDiscoveryRequestPacket> getTargetClass() {
                return IcmpV6HomeAgentAddressDiscoveryRequestPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6HomeAgentAddressDiscoveryRequestPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.HOME_AGENT_ADDRESS_DISCOVERY_REPLY, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.13
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6HomeAgentAddressDiscoveryReplyPacket> getTargetClass() {
                return IcmpV6HomeAgentAddressDiscoveryReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6HomeAgentAddressDiscoveryReplyPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.MOBILE_PREFIX_SOLICITATION, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.14
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6MobilePrefixSolicitationPacket> getTargetClass() {
                return IcmpV6MobilePrefixSolicitationPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6MobilePrefixSolicitationPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV6Type.MOBILE_PREFIX_ADVERTISEMENT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory.15
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6MobilePrefixAdvertisementPacket> getTargetClass() {
                return IcmpV6MobilePrefixAdvertisementPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV6MobilePrefixAdvertisementPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticIcmpV6TypePacketFactory getInstance() {
        return INSTANCE;
    }
}
