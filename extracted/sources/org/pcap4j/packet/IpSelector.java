package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpSelector extends AbstractPacket {
    private static final long serialVersionUID = -1;

    private IpSelector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        int i3 = (bArr[i] >> 4) & 15;
        PacketFactory factory = PacketFactories.getFactory(Packet.class, EtherType.class);
        return i3 == IpVersion.IPV4.value().intValue() ? (Packet) factory.newInstance(bArr, i, i2, EtherType.IPV4) : i3 == IpVersion.IPV6.value().intValue() ? (Packet) factory.newInstance(bArr, i, i2, EtherType.IPV6) : (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i, i2, NotApplicable.UNKNOWN);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
