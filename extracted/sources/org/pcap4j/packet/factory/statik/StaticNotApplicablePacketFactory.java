package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.CompressedPacket;
import org.pcap4j.packet.EncryptedPacket;
import org.pcap4j.packet.FragmentedPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV6ExtUnknownPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.NotApplicable;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticNotApplicablePacketFactory extends AbstractStaticPacketFactory<NotApplicable> {
    private static final StaticNotApplicablePacketFactory INSTANCE = new StaticNotApplicablePacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticNotApplicablePacketFactory() {
        this.instantiaters.put(NotApplicable.UNKNOWN, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<UnknownPacket> getTargetClass() {
                return UnknownPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) {
                return UnknownPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(NotApplicable.FRAGMENTED, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.2
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<FragmentedPacket> getTargetClass() {
                return FragmentedPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) {
                return FragmentedPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(NotApplicable.UNKNOWN_IP_V6_EXTENSION, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.3
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtUnknownPacket> getTargetClass() {
                return IpV6ExtUnknownPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6ExtUnknownPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(NotApplicable.COMPRESSED, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.4
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<CompressedPacket> getTargetClass() {
                return CompressedPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) {
                return CompressedPacket.newPacket(bArr, i, i2);
            }
        });
        this.instantiaters.put(NotApplicable.ENCRYPTED, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.5
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<EncryptedPacket> getTargetClass() {
                return EncryptedPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) {
                return EncryptedPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticNotApplicablePacketFactory getInstance() {
        return INSTANCE;
    }
}
