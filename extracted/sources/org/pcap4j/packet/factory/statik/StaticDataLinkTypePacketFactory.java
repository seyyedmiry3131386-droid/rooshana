package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.BsdLoopbackPacket;
import org.pcap4j.packet.Dot11Selector;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.HdlcPppPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpSelector;
import org.pcap4j.packet.LinuxSllPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.PppSelector;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.packet.namednumber.DataLinkType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticDataLinkTypePacketFactory extends AbstractStaticPacketFactory<DataLinkType> {
    private static final StaticDataLinkTypePacketFactory INSTANCE = new StaticDataLinkTypePacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticDataLinkTypePacketFactory() {
        this.instantiaters.put(DataLinkType.EN10MB, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<EthernetPacket> getTargetClass() {
                return EthernetPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return EthernetPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(DataLinkType.PPP, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<PppSelector> getTargetClass() {
                return PppSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return PppSelector.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(DataLinkType.RAW, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.3
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpSelector> getTargetClass() {
                return IpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpSelector.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(DataLinkType.PPP_SERIAL, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.4
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<HdlcPppPacket> getTargetClass() {
                return HdlcPppPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return HdlcPppPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(DataLinkType.IEEE802_11, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.5
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Dot11Selector> getTargetClass() {
                return Dot11Selector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return Dot11Selector.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(DataLinkType.LINUX_SLL, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.6
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<LinuxSllPacket> getTargetClass() {
                return LinuxSllPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return LinuxSllPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(DataLinkType.IEEE802_11_RADIO, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.7
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<RadiotapPacket> getTargetClass() {
                return RadiotapPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return RadiotapPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(DataLinkType.NULL, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.8
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<BsdLoopbackPacket> getTargetClass() {
                return BsdLoopbackPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return BsdLoopbackPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticDataLinkTypePacketFactory getInstance() {
        return INSTANCE;
    }
}
