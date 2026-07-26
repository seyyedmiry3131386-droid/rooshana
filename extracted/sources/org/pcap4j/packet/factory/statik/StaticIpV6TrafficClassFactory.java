package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.IpV6SimpleTrafficClass;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpV6TrafficClassFactory implements PacketFactory<IpV6Packet.IpV6TrafficClass, NotApplicable> {
    private static final StaticIpV6TrafficClassFactory INSTANCE = new StaticIpV6TrafficClassFactory();

    public static StaticIpV6TrafficClassFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public Class<? extends IpV6Packet.IpV6TrafficClass> getTargetClass(NotApplicable notApplicable) {
        return getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6Packet.IpV6TrafficClass> getTargetClass() {
        return IpV6SimpleTrafficClass.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public IpV6Packet.IpV6TrafficClass newInstance(byte[] bArr, int i, int i2, NotApplicable notApplicable) {
        return newInstance(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6Packet.IpV6TrafficClass newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return IpV6SimpleTrafficClass.newInstance(bArr[i]);
    }
}
