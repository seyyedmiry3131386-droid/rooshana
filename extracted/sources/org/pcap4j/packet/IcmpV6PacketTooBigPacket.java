package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV6PacketTooBigPacket extends IcmpV6InvokingPacketPacket {
    private static final long serialVersionUID = -8558258364388627250L;
    private final IcmpV6PacketTooBigHeader header;

    public static final class Builder extends IcmpV6InvokingPacketPacket.Builder {
        private int mtu;

        public Builder mtu(int i) {
            this.mtu = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6PacketTooBigPacket build() {
            return new IcmpV6PacketTooBigPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        private Builder(IcmpV6PacketTooBigPacket icmpV6PacketTooBigPacket) {
            super(icmpV6PacketTooBigPacket);
            this.mtu = icmpV6PacketTooBigPacket.getHeader().mtu;
        }
    }

    public static IcmpV6PacketTooBigPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IcmpV6PacketTooBigHeader icmpV6PacketTooBigHeader = new IcmpV6PacketTooBigHeader(bArr, i, i2);
        int length = i2 - icmpV6PacketTooBigHeader.length();
        return length > 0 ? new IcmpV6PacketTooBigPacket(icmpV6PacketTooBigHeader, bArr, icmpV6PacketTooBigHeader.length() + i, length) : new IcmpV6PacketTooBigPacket(icmpV6PacketTooBigHeader);
    }

    @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static final class IcmpV6PacketTooBigHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_PACKET_TOO_BIG_HEADER_SIZE = 4;
        private static final int MTU_OFFSET = 0;
        private static final int MTU_SIZE = 4;
        private static final long serialVersionUID = 8034982803428261280L;
        private final int mtu;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Packet Too Big Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  MTU: ");
            return dw1.k(this.mtu, property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.mtu;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return IcmpV6PacketTooBigHeader.class.isInstance(obj) && this.mtu == ((IcmpV6PacketTooBigHeader) obj).mtu;
        }

        public int getMtu() {
            return this.mtu;
        }

        public long getMtuAsLong() {
            return ((long) this.mtu) & 4294967295L;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.mtu));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private IcmpV6PacketTooBigHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.mtu = ByteArrays.getInt(bArr, i);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv6 Packet Too Big Header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV6PacketTooBigHeader(Builder builder) {
            this.mtu = builder.mtu;
        }
    }

    private IcmpV6PacketTooBigPacket(IcmpV6PacketTooBigHeader icmpV6PacketTooBigHeader) {
        this.header = icmpV6PacketTooBigHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6PacketTooBigHeader getHeader() {
        return this.header;
    }

    private IcmpV6PacketTooBigPacket(IcmpV6PacketTooBigHeader icmpV6PacketTooBigHeader, byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.header = icmpV6PacketTooBigHeader;
    }

    private IcmpV6PacketTooBigPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV6PacketTooBigHeader(builder);
    }
}
