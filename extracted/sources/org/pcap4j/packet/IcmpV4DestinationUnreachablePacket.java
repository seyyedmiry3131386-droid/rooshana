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
public final class IcmpV4DestinationUnreachablePacket extends IcmpV4InvokingPacketPacket {
    private static final long serialVersionUID = 2435425895590241470L;
    private final IcmpV4DestinationUnreachableHeader header;

    public static final class Builder extends IcmpV4InvokingPacketPacket.Builder {
        private int unused;

        public Builder unused(int i) {
            this.unused = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4DestinationUnreachablePacket build() {
            return new IcmpV4DestinationUnreachablePacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        private Builder(IcmpV4DestinationUnreachablePacket icmpV4DestinationUnreachablePacket) {
            super(icmpV4DestinationUnreachablePacket);
            this.unused = icmpV4DestinationUnreachablePacket.getHeader().unused;
        }
    }

    public static IcmpV4DestinationUnreachablePacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IcmpV4DestinationUnreachableHeader icmpV4DestinationUnreachableHeader = new IcmpV4DestinationUnreachableHeader(bArr, i, i2);
        int length = i2 - icmpV4DestinationUnreachableHeader.length();
        return length > 0 ? new IcmpV4DestinationUnreachablePacket(icmpV4DestinationUnreachableHeader, bArr, icmpV4DestinationUnreachableHeader.length() + i, length) : new IcmpV4DestinationUnreachablePacket(icmpV4DestinationUnreachableHeader);
    }

    @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static final class IcmpV4DestinationUnreachableHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV4_DESTINATION_UNREACHABLE_HEADER_SIZE = 4;
        private static final int UNUSED_OFFSET = 0;
        private static final int UNUSED_SIZE = 4;
        private static final long serialVersionUID = 5245447443272345197L;
        private final int unused;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv4 Destination Unreachable Header (");
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
            return IcmpV4DestinationUnreachableHeader.class.isInstance(obj) && this.unused == ((IcmpV4DestinationUnreachableHeader) obj).unused;
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

        private IcmpV4DestinationUnreachableHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.unused = ByteArrays.getInt(bArr, i);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv4 Destination Unreachable Header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV4DestinationUnreachableHeader(Builder builder) {
            this.unused = builder.unused;
        }
    }

    private IcmpV4DestinationUnreachablePacket(IcmpV4DestinationUnreachableHeader icmpV4DestinationUnreachableHeader) {
        this.header = icmpV4DestinationUnreachableHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4DestinationUnreachableHeader getHeader() {
        return this.header;
    }

    private IcmpV4DestinationUnreachablePacket(IcmpV4DestinationUnreachableHeader icmpV4DestinationUnreachableHeader, byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.header = icmpV4DestinationUnreachableHeader;
    }

    private IcmpV4DestinationUnreachablePacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4DestinationUnreachableHeader(builder);
    }
}
