package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6ExtFragmentPacket extends AbstractPacket {
    private static final long serialVersionUID = 8789423734186381406L;
    private final IpV6ExtFragmentHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private short fragmentOffset;
        private int identification;
        private boolean m;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;
        private byte res;
        private byte reserved;

        public Builder() {
        }

        public Builder fragmentOffset(short s) {
            this.fragmentOffset = s;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder identification(int i) {
            this.identification = i;
            return this;
        }

        public Builder m(boolean z) {
            this.m = z;
            return this;
        }

        public Builder nextHeader(IpNumber ipNumber) {
            this.nextHeader = ipNumber;
            return this;
        }

        public Builder res(byte b) {
            this.res = b;
            return this;
        }

        public Builder reserved(byte b) {
            this.reserved = b;
            return this;
        }

        public Builder(IpV6ExtFragmentPacket ipV6ExtFragmentPacket) {
            this.nextHeader = ipV6ExtFragmentPacket.header.nextHeader;
            this.reserved = ipV6ExtFragmentPacket.header.reserved;
            this.fragmentOffset = ipV6ExtFragmentPacket.header.fragmentOffset;
            this.res = ipV6ExtFragmentPacket.header.res;
            this.m = ipV6ExtFragmentPacket.header.m;
            this.identification = ipV6ExtFragmentPacket.header.identification;
            this.payloadBuilder = ipV6ExtFragmentPacket.payload != null ? ipV6ExtFragmentPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtFragmentPacket build() {
            return new IpV6ExtFragmentPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static IpV6ExtFragmentPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6ExtFragmentPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class IpV6ExtFragmentHeader extends AbstractPacket.AbstractHeader {
        private static final int FFRAGMENT_OFFSET_AND_RES_AND_M_SIZE = 2;
        private static final int FRAGMENT_OFFSET_AND_RES_AND_M_OFFSET = 2;
        private static final int IDENTIFICATION_OFFSET = 4;
        private static final int IDENTIFICATION_SIZE = 4;
        private static final int IPV6_EXT_FRAGMENT_HEADER_SIZE = 8;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int RESERVED_OFFSET = 1;
        private static final int RESERVED_SIZE = 1;
        private static final long serialVersionUID = 3488980383672562461L;
        private final short fragmentOffset;
        private final int identification;
        private final boolean m;
        private final IpNumber nextHeader;
        private final byte res;
        private final byte reserved;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[IPv6 Fragment Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Next Header: ");
            sb.append(this.nextHeader);
            sb.append(property);
            sb.append("  Reserved: ");
            sb.append(ByteArrays.toHexString(this.reserved, " "));
            sb.append(property);
            sb.append("  Fragment Offset: ");
            sb.append((int) this.fragmentOffset);
            sb.append(property);
            sb.append("  Res: ");
            sb.append(ByteArrays.toHexString(this.res, " "));
            sb.append(property);
            sb.append("  M: ");
            o40.K(sb, this.m, property, "  Identification: ");
            return dw1.k(this.identification, property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((((this.nextHeader.hashCode() + 527) * 31) + this.reserved) * 31) + this.fragmentOffset) * 31) + this.res) * 31) + (this.m ? 1231 : 1237)) * 31) + this.identification;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IpV6ExtFragmentHeader.class.isInstance(obj)) {
                return false;
            }
            IpV6ExtFragmentHeader ipV6ExtFragmentHeader = (IpV6ExtFragmentHeader) obj;
            return this.fragmentOffset == ipV6ExtFragmentHeader.fragmentOffset && this.identification == ipV6ExtFragmentHeader.identification && this.nextHeader.equals(ipV6ExtFragmentHeader.nextHeader) && this.m == ipV6ExtFragmentHeader.m && this.reserved == ipV6ExtFragmentHeader.reserved && this.res == ipV6ExtFragmentHeader.res;
        }

        public short getFragmentOffset() {
            return this.fragmentOffset;
        }

        public int getIdentification() {
            return this.identification;
        }

        public boolean getM() {
            return this.m;
        }

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            arrayList.add(ByteArrays.toByteArray((short) ((this.fragmentOffset << 3) | (this.res << 1) | (this.m ? 1 : 0))));
            arrayList.add(ByteArrays.toByteArray(this.identification));
            return arrayList;
        }

        public byte getRes() {
            return this.res;
        }

        public byte getReserved() {
            return this.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 8;
        }

        private IpV6ExtFragmentHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 8) {
                this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i)));
                this.reserved = ByteArrays.getByte(bArr, i + 1);
                short s = ByteArrays.getShort(bArr, i + 2);
                this.fragmentOffset = (short) ((65528 & s) >> 3);
                this.res = (byte) ((s & 6) >> 1);
                this.m = (s & 1) == 1;
                this.identification = ByteArrays.getInt(bArr, i + 4);
                return;
            }
            StringBuilder sbA = o40.A(110, "The data is too short to build an IPv6 fragment header(8 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IpV6ExtFragmentHeader(Builder builder) {
            if ((builder.fragmentOffset & 57344) == 0) {
                if ((builder.res & 65532) == 0) {
                    this.nextHeader = builder.nextHeader;
                    this.reserved = builder.reserved;
                    this.fragmentOffset = builder.fragmentOffset;
                    this.res = builder.res;
                    this.m = builder.m;
                    this.identification = builder.identification;
                    return;
                }
                throw new IllegalArgumentException("Invalid res: " + ((int) builder.res));
            }
            throw new IllegalArgumentException("Invalid fragmentOffset: " + ((int) builder.fragmentOffset));
        }
    }

    private IpV6ExtFragmentPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        IpV6ExtFragmentHeader ipV6ExtFragmentHeader = new IpV6ExtFragmentHeader(bArr, i, i2);
        this.header = ipV6ExtFragmentHeader;
        int length = i2 - ipV6ExtFragmentHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV6ExtFragmentHeader.length() + i, length, NotApplicable.FRAGMENTED);
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtFragmentHeader getHeader() {
        return this.header;
    }

    private IpV6ExtFragmentPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new IpV6ExtFragmentHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader);
        }
    }
}
