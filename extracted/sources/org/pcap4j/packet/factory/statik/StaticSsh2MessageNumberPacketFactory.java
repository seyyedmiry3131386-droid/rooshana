package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.Ssh2KexInitPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticSsh2MessageNumberPacketFactory extends AbstractStaticPacketFactory<Ssh2MessageNumber> {
    private static final StaticSsh2MessageNumberPacketFactory INSTANCE = new StaticSsh2MessageNumberPacketFactory();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private StaticSsh2MessageNumberPacketFactory() {
        this.instantiaters.put(Ssh2MessageNumber.SSH_MSG_KEXINIT, new PacketInstantiater() { // from class: org.pcap4j.packet.factory.statik.StaticSsh2MessageNumberPacketFactory.1
            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Ssh2KexInitPacket> getTargetClass() {
                return Ssh2KexInitPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return Ssh2KexInitPacket.newPacket(bArr, i, i2);
            }
        });
    }

    public static StaticSsh2MessageNumberPacketFactory getInstance() {
        return INSTANCE;
    }
}
