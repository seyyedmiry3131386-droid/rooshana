package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV4InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV4TimeExceededPacket extends IcmpV4InvokingPacketPacket {
    private static final long serialVersionUID = -7403391242412189831L;
    private final IcmpV4TimeExceededHeader header;

    public static final class Builder extends IcmpV4InvokingPacketPacket.Builder {
        private int unused;

        public Builder unused(int i) {
            this.unused = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4TimeExceededPacket build() {
            return new IcmpV4TimeExceededPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        private Builder(IcmpV4TimeExceededPacket icmpV4TimeExceededPacket) {
            super(icmpV4TimeExceededPacket);
            this.unused = icmpV4TimeExceededPacket.getHeader().unused;
        }
    }

    public static IcmpV4TimeExceededPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IcmpV4TimeExceededHeader icmpV4TimeExceededHeader = new IcmpV4TimeExceededHeader(bArr, i, i2);
        int length = i2 - icmpV4TimeExceededHeader.length();
        return length > 0 ? new IcmpV4TimeExceededPacket(icmpV4TimeExceededHeader, bArr, icmpV4TimeExceededHeader.length() + i, length) : new IcmpV4TimeExceededPacket(icmpV4TimeExceededHeader);
    }

    @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static final class IcmpV4TimeExceededHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV4_TIME_EXCEEDED_HEADER_SIZE = 4;
        private static final int UNUSED_OFFSET = 0;
        private static final int UNUSED_SIZE = 4;
        private static final long serialVersionUID = -4958423484698708497L;
        private final int unused;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv4 Time Exceeded Header (");
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
            return IcmpV4TimeExceededHeader.class.isInstance(obj) && this.unused == ((IcmpV4TimeExceededHeader) obj).unused;
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

        private IcmpV4TimeExceededHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.unused = ByteArrays.getInt(bArr, i);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv4 Time Exceeded Header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV4TimeExceededHeader(Builder builder) {
            this.unused = builder.unused;
        }
    }

    private IcmpV4TimeExceededPacket(IcmpV4TimeExceededHeader icmpV4TimeExceededHeader) {
        this.header = icmpV4TimeExceededHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4TimeExceededHeader getHeader() {
        return this.header;
    }

    private IcmpV4TimeExceededPacket(IcmpV4TimeExceededHeader icmpV4TimeExceededHeader, byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.header = icmpV4TimeExceededHeader;
    }

    private IcmpV4TimeExceededPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4TimeExceededHeader(builder);
    }
}
