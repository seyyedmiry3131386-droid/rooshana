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
public final class IcmpV6TimeExceededPacket extends IcmpV6InvokingPacketPacket {
    private static final long serialVersionUID = 548806622487019458L;
    private final IcmpV6TimeExceededHeader header;

    public static final class Builder extends IcmpV6InvokingPacketPacket.Builder {
        private int unused;

        public Builder unused(int i) {
            this.unused = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6TimeExceededPacket build() {
            return new IcmpV6TimeExceededPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        private Builder(IcmpV6TimeExceededPacket icmpV6TimeExceededPacket) {
            super(icmpV6TimeExceededPacket);
            this.unused = icmpV6TimeExceededPacket.getHeader().unused;
        }
    }

    public static IcmpV6TimeExceededPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IcmpV6TimeExceededHeader icmpV6TimeExceededHeader = new IcmpV6TimeExceededHeader(bArr, i, i2);
        int length = i2 - icmpV6TimeExceededHeader.length();
        return length > 0 ? new IcmpV6TimeExceededPacket(icmpV6TimeExceededHeader, bArr, icmpV6TimeExceededHeader.length() + i, length) : new IcmpV6TimeExceededPacket(icmpV6TimeExceededHeader);
    }

    @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static final class IcmpV6TimeExceededHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_TIME_EXCEEDED_HEADER_SIZE = 4;
        private static final int UNUSED_OFFSET = 0;
        private static final int UNUSED_SIZE = 4;
        private static final long serialVersionUID = 7744561095455514341L;
        private final int unused;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Time Exceeded Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Unused: ");
            return dw1.k(this.unused, property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return IcmpV6TimeExceededHeader.class.isInstance(obj) && this.unused == ((IcmpV6TimeExceededHeader) obj).unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.unused));
            return arrayList;
        }

        public int getUnused() {
            return this.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private IcmpV6TimeExceededHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.unused = ByteArrays.getInt(bArr, i);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv6 Time Exceeded Header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV6TimeExceededHeader(Builder builder) {
            this.unused = builder.unused;
        }
    }

    private IcmpV6TimeExceededPacket(IcmpV6TimeExceededHeader icmpV6TimeExceededHeader) {
        this.header = icmpV6TimeExceededHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6TimeExceededHeader getHeader() {
        return this.header;
    }

    private IcmpV6TimeExceededPacket(IcmpV6TimeExceededHeader icmpV6TimeExceededHeader, byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.header = icmpV6TimeExceededHeader;
    }

    private IcmpV6TimeExceededPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV6TimeExceededHeader(builder);
    }
}
