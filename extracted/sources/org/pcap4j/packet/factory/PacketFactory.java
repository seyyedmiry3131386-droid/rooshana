package org.pcap4j.packet.factory;

import org.pcap4j.packet.namednumber.NamedNumber;

/* JADX INFO: loaded from: classes4.dex */
public interface PacketFactory<T, N extends NamedNumber<?, ?>> {
    Class<? extends T> getTargetClass();

    Class<? extends T> getTargetClass(N n);

    T newInstance(byte[] bArr, int i, int i2);

    T newInstance(byte[] bArr, int i, int i2, N n);
}
