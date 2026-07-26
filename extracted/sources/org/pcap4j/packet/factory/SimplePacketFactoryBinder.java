package org.pcap4j.packet.factory;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.NamedNumber;

/* JADX INFO: loaded from: classes4.dex */
final class SimplePacketFactoryBinder {
    private static final SimplePacketFactoryBinder INSTANCE = new SimplePacketFactoryBinder();

    private SimplePacketFactoryBinder() {
    }

    public static SimplePacketFactoryBinder getInstance() {
        return INSTANCE;
    }

    public <T, N extends NamedNumber<?, ?>> PacketFactory<T, N> getPacketFactory(Class<T> cls, Class<N> cls2) {
        if (Packet.class.isAssignableFrom(cls)) {
            return StaticUnknownPacketFactory.getInstance();
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("targetClass: ");
        sb.append(cls);
        sb.append(" numberClass: ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }
}
