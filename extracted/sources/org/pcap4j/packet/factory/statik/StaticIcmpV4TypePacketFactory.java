package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IcmpV4DestinationUnreachablePacket;
import org.pcap4j.packet.IcmpV4EchoPacket;
import org.pcap4j.packet.IcmpV4EchoReplyPacket;
import org.pcap4j.packet.IcmpV4InformationReplyPacket;
import org.pcap4j.packet.IcmpV4InformationRequestPacket;
import org.pcap4j.packet.IcmpV4ParameterProblemPacket;
import org.pcap4j.packet.IcmpV4RedirectPacket;
import org.pcap4j.packet.IcmpV4SourceQuenchPacket;
import org.pcap4j.packet.IcmpV4TimeExceededPacket;
import org.pcap4j.packet.IcmpV4TimestampPacket;
import org.pcap4j.packet.IcmpV4TimestampReplyPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IcmpV4Type;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIcmpV4TypePacketFactory extends AbstractStaticPacketFactory<IcmpV4Type> {
    private static final StaticIcmpV4TypePacketFactory INSTANCE = new StaticIcmpV4TypePacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticIcmpV4TypePacketFactory() {
        this.instantiaters.put(IcmpV4Type.ECHO_REPLY, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4EchoReplyPacket> getTargetClass() {
                return IcmpV4EchoReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4EchoReplyPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.DESTINATION_UNREACHABLE, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4DestinationUnreachablePacket> getTargetClass() {
                return IcmpV4DestinationUnreachablePacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4DestinationUnreachablePacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.SOURCE_QUENCH, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.3
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4SourceQuenchPacket> getTargetClass() {
                return IcmpV4SourceQuenchPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4SourceQuenchPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.REDIRECT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.4
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4RedirectPacket> getTargetClass() {
                return IcmpV4RedirectPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4RedirectPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.ECHO, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.5
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4EchoPacket> getTargetClass() {
                return IcmpV4EchoPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4EchoPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.TIME_EXCEEDED, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.6
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4TimeExceededPacket> getTargetClass() {
                return IcmpV4TimeExceededPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4TimeExceededPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.PARAMETER_PROBLEM, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.7
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4ParameterProblemPacket> getTargetClass() {
                return IcmpV4ParameterProblemPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4ParameterProblemPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.TIMESTAMP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.8
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4TimestampPacket> getTargetClass() {
                return IcmpV4TimestampPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4TimestampPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.TIMESTAMP_REPLY, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.9
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4TimestampReplyPacket> getTargetClass() {
                return IcmpV4TimestampReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4TimestampReplyPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.INFORMATION_REQUEST, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.10
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4InformationRequestPacket> getTargetClass() {
                return IcmpV4InformationRequestPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4InformationRequestPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(IcmpV4Type.INFORMATION_REPLY, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.11
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4InformationReplyPacket> getTargetClass() {
                return IcmpV4InformationReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IcmpV4InformationReplyPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticIcmpV4TypePacketFactory getInstance() {
        return INSTANCE;
    }
}
