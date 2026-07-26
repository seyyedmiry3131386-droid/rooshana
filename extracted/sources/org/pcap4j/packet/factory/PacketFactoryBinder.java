package org.pcap4j.packet.factory;

import org.pcap4j.packet.namednumber.NamedNumber;

/* JADX INFO: loaded from: classes4.dex */
public interface PacketFactoryBinder {
    <T, N extends NamedNumber<?, ?>> PacketFactory<T, N> getPacketFactory(Class<T> cls, Class<N> cls2);
}
