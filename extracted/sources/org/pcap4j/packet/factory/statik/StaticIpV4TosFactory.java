package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpV4TosFactory implements PacketFactory<IpV4Packet.IpV4Tos, NotApplicable> {
    private static final StaticIpV4TosFactory INSTANCE = new StaticIpV4TosFactory();

    public static StaticIpV4TosFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public Class<? extends IpV4Packet.IpV4Tos> getTargetClass(NotApplicable notApplicable) {
        return getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV4Packet.IpV4Tos> getTargetClass() {
        return IpV4Rfc1349Tos.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public IpV4Packet.IpV4Tos newInstance(byte[] bArr, int i, int i2, NotApplicable notApplicable) {
        return newInstance(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV4Packet.IpV4Tos newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return IpV4Rfc1349Tos.newInstance(bArr[i]);
    }
}
