package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpV6RoutingType;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6ExtRoutingPacket extends AbstractPacket {
    private static final long serialVersionUID = -4408422883412551431L;
    private final IpV6ExtRoutingHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6ExtRoutingPacket> {
        private boolean correctLengthAtBuild;
        private IpV6RoutingData data;
        private byte hdrExtLen;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;
        private IpV6RoutingType routingType;
        private byte segmentsLeft;

        public Builder() {
        }

        public Builder data(IpV6RoutingData ipV6RoutingData) {
            this.data = ipV6RoutingData;
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

        public Builder routingType(IpV6RoutingType ipV6RoutingType) {
            this.routingType = ipV6RoutingType;
            return this;
        }

        public Builder segmentsLeft(byte b) {
            this.segmentsLeft = b;
            return this;
        }

        public Builder(IpV6ExtRoutingPacket ipV6ExtRoutingPacket) {
            this.nextHeader = ipV6ExtRoutingPacket.header.nextHeader;
            this.hdrExtLen = ipV6ExtRoutingPacket.header.hdrExtLen;
            this.routingType = ipV6ExtRoutingPacket.header.routingType;
            this.segmentsLeft = ipV6ExtRoutingPacket.header.segmentsLeft;
            this.data = ipV6ExtRoutingPacket.header.data;
            this.payloadBuilder = ipV6ExtRoutingPacket.payload != null ? ipV6ExtRoutingPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6ExtRoutingPacket> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtRoutingPacket build() {
            return new IpV6ExtRoutingPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public interface IpV6RoutingData extends Serializable {
        byte[] getRawData();

        int length();
    }

    public static IpV6ExtRoutingPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6ExtRoutingPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class IpV6ExtRoutingHeader extends AbstractPacket.AbstractHeader {
        private static final int HDR_EXT_LEN_OFFSET = 1;
        private static final int HDR_EXT_LEN_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int ROUTING_TYPE_OFFSET = 2;
        private static final int ROUTING_TYPE_SIZE = 1;
        private static final int SEGMENTS_LEFT_OFFSET = 3;
        private static final int SEGMENTS_LEFT_SIZE = 1;
        private static final int TYPE_SPECIFIC_DATA_OFFSET = 4;
        private static final long serialVersionUID = -72622140516174483L;
        private final IpV6RoutingData data;
        private final byte hdrExtLen;
        private final IpNumber nextHeader;
        private final IpV6RoutingType routingType;
        private final byte segmentsLeft;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[IPv6 Routing Header (");
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
            t61.y(sb, " [bytes])", property, "  Routing Type: ");
            sb.append(this.routingType);
            sb.append(property);
            sb.append("  Segments Left: ");
            sb.append(getSegmentsLeftAsInt());
            sb.append(property);
            sb.append("  type-specific data: ");
            sb.append(this.data);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.data.hashCode() + ((((this.routingType.hashCode() + ((((this.nextHeader.hashCode() + 527) * 31) + this.hdrExtLen) * 31)) * 31) + this.segmentsLeft) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.data.length() + 4;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IpV6ExtRoutingHeader.class.isInstance(obj)) {
                return false;
            }
            IpV6ExtRoutingHeader ipV6ExtRoutingHeader = (IpV6ExtRoutingHeader) obj;
            return this.nextHeader.equals(ipV6ExtRoutingHeader.nextHeader) && this.data.equals(ipV6ExtRoutingHeader.data) && this.routingType.equals(ipV6ExtRoutingHeader.routingType) && this.segmentsLeft == ipV6ExtRoutingHeader.segmentsLeft && this.hdrExtLen == ipV6ExtRoutingHeader.hdrExtLen;
        }

        public IpV6RoutingData getData() {
            return this.data;
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
            arrayList.add(ByteArrays.toByteArray(this.routingType.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.segmentsLeft));
            arrayList.add(this.data.getRawData());
            return arrayList;
        }

        public IpV6RoutingType getRoutingType() {
            return this.routingType;
        }

        public byte getSegmentsLeft() {
            return this.segmentsLeft;
        }

        public int getSegmentsLeftAsInt() {
            return this.segmentsLeft & 255;
        }

        private IpV6ExtRoutingHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i)));
                this.hdrExtLen = ByteArrays.getByte(bArr, i + 1);
                int hdrExtLenAsInt = (getHdrExtLenAsInt() + 1) * 8;
                if (i2 >= hdrExtLenAsInt) {
                    IpV6RoutingType ipV6RoutingType = IpV6RoutingType.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i + 2)));
                    this.routingType = ipV6RoutingType;
                    this.segmentsLeft = ByteArrays.getByte(bArr, i + 3);
                    this.data = (IpV6RoutingData) PacketFactories.getFactory(IpV6RoutingData.class, IpV6RoutingType.class).newInstance(bArr, i + 4, hdrExtLenAsInt - 4, ipV6RoutingType);
                    return;
                }
                StringBuilder sb = new StringBuilder(110);
                sb.append("The data is too short to build an IPv6 routing header(");
                sb.append(hdrExtLenAsInt);
                sb.append(" bytes). data: ");
                t61.t(i, " ", ", offset: ", sb, bArr);
                sb.append(", length: ");
                sb.append(i2);
                throw new IllegalRawDataException(sb.toString());
            }
            StringBuilder sbA = o40.A(110, "The data length of IPv6 routing header is must be more than 3. data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IpV6ExtRoutingHeader(Builder builder) {
            if (builder.data.length() >= 4) {
                if ((builder.data.length() + 4) % 8 == 0) {
                    this.nextHeader = builder.nextHeader;
                    this.routingType = builder.routingType;
                    this.segmentsLeft = builder.segmentsLeft;
                    this.data = builder.data;
                    if (!builder.correctLengthAtBuild) {
                        this.hdrExtLen = builder.hdrExtLen;
                        return;
                    } else {
                        this.hdrExtLen = (byte) (((r0.length() + 4) / 8) - 1);
                        return;
                    }
                }
                StringBuilder sbA = o40.A(100, "(builder.data.length() + 8 ) % 8 must be 0. data: ");
                sbA.append(builder.data);
                throw new IllegalArgumentException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(100, "data length must be more than 3. data: ");
            sbA2.append(builder.data);
            throw new IllegalArgumentException(sbA2.toString());
        }
    }

    private IpV6ExtRoutingPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        Packet packet;
        IpV6ExtRoutingHeader ipV6ExtRoutingHeader = new IpV6ExtRoutingHeader(bArr, i, i2);
        this.header = ipV6ExtRoutingHeader;
        int length = i2 - ipV6ExtRoutingHeader.length();
        if (length <= 0) {
            this.payload = null;
            return;
        }
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipV6ExtRoutingHeader.getNextHeader()).equals(factory.getTargetClass())) {
            packet = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV6ExtRoutingHeader.length() + i, length, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            if (packet instanceof IllegalPacket) {
                packet = (Packet) factory.newInstance(bArr, ipV6ExtRoutingHeader.length() + i, length);
            }
        } else {
            packet = (Packet) factory.newInstance(bArr, ipV6ExtRoutingHeader.length() + i, length, ipV6ExtRoutingHeader.getNextHeader());
        }
        this.payload = packet;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtRoutingHeader getHeader() {
        return this.header;
    }

    private IpV6ExtRoutingPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null && builder.data != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new IpV6ExtRoutingHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader + " builder.data: " + builder.data);
        }
    }
}
