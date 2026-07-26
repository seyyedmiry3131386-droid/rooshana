package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IpPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6Packet extends AbstractPacket implements IpPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) IpV6Packet.class);
    private static final long serialVersionUID = 1837307843939979665L;
    private final IpV6Header header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6Packet> {
        private boolean correctLengthAtBuild;
        private Inet6Address dstAddr;
        private IpV6FlowLabel flowLabel;
        private byte hopLimit;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;
        private short payloadLength;
        private Inet6Address srcAddr;
        private IpV6TrafficClass trafficClass;
        private IpVersion version;

        public Builder() {
        }

        public Builder dstAddr(Inet6Address inet6Address) {
            this.dstAddr = inet6Address;
            return this;
        }

        public Builder flowLabel(IpV6FlowLabel ipV6FlowLabel) {
            this.flowLabel = ipV6FlowLabel;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder hopLimit(byte b) {
            this.hopLimit = b;
            return this;
        }

        public Builder nextHeader(IpNumber ipNumber) {
            this.nextHeader = ipNumber;
            return this;
        }

        public Builder payloadLength(short s) {
            this.payloadLength = s;
            return this;
        }

        public Builder srcAddr(Inet6Address inet6Address) {
            this.srcAddr = inet6Address;
            return this;
        }

        public Builder trafficClass(IpV6TrafficClass ipV6TrafficClass) {
            this.trafficClass = ipV6TrafficClass;
            return this;
        }

        public Builder version(IpVersion ipVersion) {
            this.version = ipVersion;
            return this;
        }

        public Builder(IpV6Packet ipV6Packet) {
            this.version = ipV6Packet.header.version;
            this.trafficClass = ipV6Packet.header.trafficClass;
            this.flowLabel = ipV6Packet.header.flowLabel;
            this.payloadLength = ipV6Packet.header.payloadLength;
            this.nextHeader = ipV6Packet.header.nextHeader;
            this.hopLimit = ipV6Packet.header.hopLimit;
            this.srcAddr = ipV6Packet.header.srcAddr;
            this.dstAddr = ipV6Packet.header.dstAddr;
            this.payloadBuilder = ipV6Packet.payload != null ? ipV6Packet.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6Packet> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6Packet build() {
            return new IpV6Packet(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public interface IpV6FlowLabel extends Serializable {
        int value();
    }

    public static final class IpV6Header extends AbstractPacket.AbstractHeader implements IpPacket.IpHeader {
        private static final int DST_ADDR_OFFSET = 24;
        private static final int DST_ADDR_SIZE = 16;
        private static final int HOP_LIMIT_OFFSET = 7;
        private static final int HOP_LIMIT_SIZE = 1;
        private static final int IPV6_HEADER_SIZE = 40;
        private static final int NEXT_HEADER_OFFSET = 6;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int PAYLOAD_LENGTH_OFFSET = 4;
        private static final int PAYLOAD_LENGTH_SIZE = 2;
        private static final int SRC_ADDR_OFFSET = 8;
        private static final int SRC_ADDR_SIZE = 16;
        private static final int VERSION_AND_TRAFFIC_CLASS_AND_FLOW_LABEL_OFFSET = 0;
        private static final int VERSION_AND_TRAFFIC_CLASS_AND_FLOW_LABEL_SIZE = 4;
        private static final long serialVersionUID = 6587661877529988149L;
        private final Inet6Address dstAddr;
        private final IpV6FlowLabel flowLabel;
        private final byte hopLimit;
        private final IpNumber nextHeader;
        private final short payloadLength;
        private final Inet6Address srcAddr;
        private final IpV6TrafficClass trafficClass;
        private final IpVersion version;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[IPv6 Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Version: ");
            sb.append(this.version);
            sb.append(property);
            sb.append("  Traffic Class: ");
            sb.append(this.trafficClass);
            sb.append(property);
            sb.append("  Flow Label: ");
            sb.append(this.flowLabel);
            sb.append(property);
            sb.append("  Payload length: ");
            sb.append(getPayloadLengthAsInt());
            t61.y(sb, " [bytes]", property, "  Next Header: ");
            sb.append(this.nextHeader);
            sb.append(property);
            sb.append("  Hop Limit: ");
            sb.append(getHopLimitAsInt());
            sb.append(property);
            sb.append("  Source address: ");
            sb.append(this.srcAddr);
            sb.append(property);
            sb.append("  Destination address: ");
            sb.append(this.dstAddr);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.dstAddr.hashCode() + ((this.srcAddr.hashCode() + ((((this.nextHeader.hashCode() + ((((this.flowLabel.hashCode() + ((this.trafficClass.hashCode() + ((this.version.hashCode() + 527) * 31)) * 31)) * 31) + this.payloadLength) * 31)) * 31) + this.hopLimit) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IpV6Header.class.isInstance(obj)) {
                return false;
            }
            IpV6Header ipV6Header = (IpV6Header) obj;
            return this.srcAddr.equals(ipV6Header.srcAddr) && this.dstAddr.equals(ipV6Header.dstAddr) && this.payloadLength == ipV6Header.payloadLength && this.hopLimit == ipV6Header.hopLimit && this.nextHeader.equals(ipV6Header.nextHeader) && this.trafficClass.equals(ipV6Header.trafficClass) && this.flowLabel.equals(ipV6Header.flowLabel) && this.version.equals(ipV6Header.version);
        }

        public IpV6FlowLabel getFlowLabel() {
            return this.flowLabel;
        }

        public byte getHopLimit() {
            return this.hopLimit;
        }

        public int getHopLimitAsInt() {
            return this.hopLimit & 255;
        }

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        public short getPayloadLength() {
            return this.payloadLength;
        }

        public int getPayloadLengthAsInt() {
            return 65535 & this.payloadLength;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpNumber getProtocol() {
            return this.nextHeader;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((this.version.value().byteValue() << 28) | ((this.trafficClass.value() & 255) << 20) | this.flowLabel.value()));
            arrayList.add(ByteArrays.toByteArray(this.payloadLength));
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.hopLimit));
            arrayList.add(ByteArrays.toByteArray(this.srcAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstAddr));
            return arrayList;
        }

        public IpV6TrafficClass getTrafficClass() {
            return this.trafficClass;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpVersion getVersion() {
            return this.version;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 40;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet6Address getDstAddr() {
            return this.dstAddr;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet6Address getSrcAddr() {
            return this.srcAddr;
        }

        private IpV6Header(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 40) {
                int i3 = ByteArrays.getInt(bArr, i);
                this.version = IpVersion.getInstance(Byte.valueOf((byte) (i3 >>> 28)));
                this.trafficClass = (IpV6TrafficClass) PacketFactories.getFactory(IpV6TrafficClass.class, NotApplicable.class).newInstance(new byte[]{(byte) ((i3 & 267386880) >> 20)}, 0, 1);
                this.flowLabel = (IpV6FlowLabel) PacketFactories.getFactory(IpV6FlowLabel.class, NotApplicable.class).newInstance(bArr, i, 4);
                this.payloadLength = ByteArrays.getShort(bArr, i + 4);
                this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i + 6)));
                this.hopLimit = ByteArrays.getByte(bArr, i + 7);
                this.srcAddr = ByteArrays.getInet6Address(bArr, i + 8);
                this.dstAddr = ByteArrays.getInet6Address(bArr, i + 24);
                return;
            }
            StringBuilder sbA = o40.A(110, "The data is too short to build an IPv6 header(40 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IpV6Header(Builder builder, Packet packet) {
            this.version = builder.version;
            this.trafficClass = builder.trafficClass;
            this.flowLabel = builder.flowLabel;
            this.nextHeader = builder.nextHeader;
            this.hopLimit = builder.hopLimit;
            this.srcAddr = builder.srcAddr;
            this.dstAddr = builder.dstAddr;
            if (!builder.correctLengthAtBuild) {
                this.payloadLength = builder.payloadLength;
            } else if (packet == null) {
                this.payloadLength = builder.payloadLength;
            } else {
                this.payloadLength = (short) packet.length();
            }
        }
    }

    public interface IpV6TrafficClass extends Serializable {
        byte value();
    }

    public static IpV6Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6Packet(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    private IpV6Packet(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        Packet packet;
        IpV6Header ipV6Header = new IpV6Header(bArr, i, i2);
        this.header = ipV6Header;
        int length = i2 - ipV6Header.length();
        if (ipV6Header.getPayloadLengthAsInt() == 0) {
            logger.debug("Total Length is 0. Assuming segmentation offload to be working.");
        } else {
            int payloadLengthAsInt = ipV6Header.getPayloadLengthAsInt();
            if (payloadLengthAsInt < 0) {
                throw new IllegalRawDataException("The value of payload length field seems to be wrong: " + ipV6Header.getPayloadLengthAsInt());
            }
            if (payloadLengthAsInt <= length) {
                length = payloadLengthAsInt;
            }
        }
        if (length == 0) {
            this.payload = null;
            return;
        }
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipV6Header.getNextHeader()).equals(factory.getTargetClass())) {
            packet = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV6Header.length() + i, length, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            if (packet instanceof IllegalPacket) {
                packet = (Packet) factory.newInstance(bArr, ipV6Header.length() + i, length);
            }
        } else {
            packet = (Packet) factory.newInstance(bArr, ipV6Header.length() + i, length, ipV6Header.getNextHeader());
        }
        this.payload = packet;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6Header getHeader() {
        return this.header;
    }

    private IpV6Packet(Builder builder) {
        if (builder != null && builder.version != null && builder.trafficClass != null && builder.flowLabel != null && builder.nextHeader != null && builder.srcAddr != null && builder.dstAddr != null) {
            Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = packetBuild;
            this.header = new IpV6Header(builder, packetBuild);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.version: " + builder.version + " builder.trafficClass: " + builder.trafficClass + " builder.flowLabel: " + builder.flowLabel + " builder.nextHeader: " + builder.nextHeader + " builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
    }
}
