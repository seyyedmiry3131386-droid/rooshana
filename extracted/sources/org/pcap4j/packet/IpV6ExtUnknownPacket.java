package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6ExtUnknownPacket extends AbstractPacket {
    private static final long serialVersionUID = -7055290165058067091L;
    private final IpV6ExtUnknownHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6ExtUnknownPacket> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte hdrExtLen;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;

        public Builder() {
        }

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder hdrExtLen(byte b) {
            this.hdrExtLen = b;
            return this;
        }

        public Builder nextHeader(IpNumber ipNumber) {
            this.nextHeader = ipNumber;
            return this;
        }

        public Builder(IpV6ExtUnknownPacket ipV6ExtUnknownPacket) {
            this.nextHeader = ipV6ExtUnknownPacket.header.nextHeader;
            this.hdrExtLen = ipV6ExtUnknownPacket.header.hdrExtLen;
            this.data = ipV6ExtUnknownPacket.header.data;
            this.payloadBuilder = ipV6ExtUnknownPacket.payload != null ? ipV6ExtUnknownPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6ExtUnknownPacket> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtUnknownPacket build() {
            return new IpV6ExtUnknownPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static IpV6ExtUnknownPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6ExtUnknownPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class IpV6ExtUnknownHeader extends AbstractPacket.AbstractHeader {
        private static final int DATA_OFFSET = 2;
        private static final int HDR_EXT_LEN_OFFSET = 1;
        private static final int HDR_EXT_LEN_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final long serialVersionUID = -4314577591889991355L;
        private final byte[] data;
        private final byte hdrExtLen;
        private final IpNumber nextHeader;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[IPv6 Unknown Extension Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Next Header: ");
            sb.append(this.nextHeader);
            sb.append(property);
            sb.append("  Hdr Ext Len: ");
            sb.append(getHdrExtLenAsInt());
            sb.append(" (");
            sb.append((getHdrExtLenAsInt() + 1) * 8);
            t61.y(sb, " [bytes])", property, "  data: ");
            return t61.m(this.data, " ", sb, property);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return Arrays.hashCode(this.data) + ((((this.nextHeader.hashCode() + 527) * 31) + this.hdrExtLen) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.data.length + 2;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IpV6ExtUnknownHeader.class.isInstance(obj)) {
                return false;
            }
            IpV6ExtUnknownHeader ipV6ExtUnknownHeader = (IpV6ExtUnknownHeader) obj;
            return this.nextHeader.equals(ipV6ExtUnknownHeader.nextHeader) && this.hdrExtLen == ipV6ExtUnknownHeader.hdrExtLen && Arrays.equals(this.data, ipV6ExtUnknownHeader.data);
        }

        public byte[] getData() {
            return ByteArrays.clone(this.data);
        }

        public byte getHdrExtLen() {
            return this.hdrExtLen;
        }

        public int getHdrExtLenAsInt() {
            return this.hdrExtLen & 255;
        }

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.hdrExtLen));
            arrayList.add(getData());
            return arrayList;
        }

        private IpV6ExtUnknownHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i)));
                this.hdrExtLen = ByteArrays.getByte(bArr, i + 1);
                int hdrExtLenAsInt = (getHdrExtLenAsInt() + 1) * 8;
                if (i2 >= hdrExtLenAsInt) {
                    this.data = ByteArrays.getSubArray(bArr, i + 2, hdrExtLenAsInt - 2);
                    return;
                }
                StringBuilder sb = new StringBuilder(110);
                sb.append("The data is too short to build this header(");
                sb.append(hdrExtLenAsInt);
                sb.append(" bytes). data: ");
                t61.t(i, " ", ", offset: ", sb, bArr);
                sb.append(", length: ");
                sb.append(i2);
                throw new IllegalRawDataException(sb.toString());
            }
            StringBuilder sbA = o40.A(110, "The data length of this header is must be more than 3. data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IpV6ExtUnknownHeader(Builder builder) {
            if (builder.data.length >= 6) {
                if ((builder.data.length + 2) % 8 == 0) {
                    this.nextHeader = builder.nextHeader;
                    this.data = ByteArrays.clone(builder.data);
                    if (!builder.correctLengthAtBuild) {
                        this.hdrExtLen = builder.hdrExtLen;
                        return;
                    } else {
                        this.hdrExtLen = (byte) (((r0.length + 2) / 8) - 1);
                        return;
                    }
                }
                StringBuilder sbA = o40.A(100, "(builder.data.length + 2) % 8 must be 0. data: ");
                sbA.append(builder.data);
                throw new IllegalArgumentException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(100, "data length must be more than 5. data: ");
            sbA2.append(ByteArrays.toHexString(builder.data, " "));
            throw new IllegalArgumentException(sbA2.toString());
        }
    }

    private IpV6ExtUnknownPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        Packet packet;
        IpV6ExtUnknownHeader ipV6ExtUnknownHeader = new IpV6ExtUnknownHeader(bArr, i, i2);
        this.header = ipV6ExtUnknownHeader;
        int length = i2 - ipV6ExtUnknownHeader.length();
        if (length <= 0) {
            this.payload = null;
            return;
        }
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipV6ExtUnknownHeader.getNextHeader()).equals(factory.getTargetClass())) {
            packet = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV6ExtUnknownHeader.length() + i, length, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            if (packet instanceof IllegalPacket) {
                packet = (Packet) factory.newInstance(bArr, ipV6ExtUnknownHeader.length() + i, length);
            }
        } else {
            packet = (Packet) PacketFactories.getFactory(Packet.class, IpNumber.class).newInstance(bArr, ipV6ExtUnknownHeader.length() + i, length, ipV6ExtUnknownHeader.getNextHeader());
        }
        this.payload = packet;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtUnknownHeader getHeader() {
        return this.header;
    }

    private IpV6ExtUnknownPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null && builder.data != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new IpV6ExtUnknownHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader + " builder.data: " + builder.data);
        }
    }
}
