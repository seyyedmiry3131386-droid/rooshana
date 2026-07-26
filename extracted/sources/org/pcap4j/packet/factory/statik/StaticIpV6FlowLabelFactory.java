package org.pcap4j.packet.factory.statik;

import defpackage.o40;
import defpackage.t61;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.IpV6SimpleFlowLabel;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpV6FlowLabelFactory implements PacketFactory<IpV6Packet.IpV6FlowLabel, NotApplicable> {
    private static final StaticIpV6FlowLabelFactory INSTANCE = new StaticIpV6FlowLabelFactory();

    public static StaticIpV6FlowLabelFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public Class<? extends IpV6Packet.IpV6FlowLabel> getTargetClass(NotApplicable notApplicable) {
        return getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6Packet.IpV6FlowLabel> getTargetClass() {
        return IpV6SimpleFlowLabel.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public IpV6Packet.IpV6FlowLabel newInstance(byte[] bArr, int i, int i2, NotApplicable notApplicable) {
        return newInstance(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6Packet.IpV6FlowLabel newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        if (i2 >= 4) {
            return IpV6SimpleFlowLabel.newInstance(ByteArrays.getInt(bArr, i));
        }
        StringBuilder sbA = o40.A(100, "rawData is too short: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalArgumentException(sbA.toString());
    }
}
