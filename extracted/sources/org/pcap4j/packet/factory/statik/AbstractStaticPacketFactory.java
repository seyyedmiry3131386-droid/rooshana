package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.NamedNumber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractStaticPacketFactory<N extends NamedNumber<?, ?>> implements PacketFactory<Packet, N> {
    protected final Map<N, PacketInstantiater> instantiaters = new HashMap();

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass(N n) {
        if (n == null) {
            throw new NullPointerException("number must not be null.");
        }
        PacketInstantiater packetInstantiater = this.instantiaters.get(n);
        return packetInstantiater != null ? packetInstantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i, int i2, N n) {
        if (bArr != null && n != null) {
            PacketInstantiater packetInstantiater = this.instantiaters.get(n);
            if (packetInstantiater != null) {
                try {
                    return packetInstantiater.newInstance(bArr, i, i2);
                } catch (IllegalRawDataException unused) {
                    return IllegalPacket.newPacket(bArr, i, i2);
                }
            }
            return newInstance(bArr, i, i2);
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(n);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass() {
        return UnknownPacket.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i, int i2) {
        return UnknownPacket.newPacket(bArr, i, i2);
    }
}
