package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import java.io.Serializable;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IpPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4Packet extends AbstractPacket implements IpPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) IpV4Packet.class);
    private static final long serialVersionUID = 5348211496230027548L;
    private final IpV4Header header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<IpV4Packet>, LengthBuilder<IpV4Packet> {
        private boolean correctChecksumAtBuild;
        private boolean correctLengthAtBuild;
        private boolean dontFragmentFlag;
        private Inet4Address dstAddr;
        private short fragmentOffset;
        private short headerChecksum;
        private short identification;
        private byte ihl;
        private boolean moreFragmentFlag;
        private List<IpV4Option> options;
        private byte[] padding;
        private boolean paddingAtBuild;
        private Packet.Builder payloadBuilder;
        private IpNumber protocol;
        private boolean reservedFlag;
        private Inet4Address srcAddr;
        private IpV4Tos tos;
        private short totalLength;
        private byte ttl;
        private IpVersion version;

        public Builder() {
        }

        public Builder dontFragmentFlag(boolean z) {
            this.dontFragmentFlag = z;
            return this;
        }

        public Builder dstAddr(Inet4Address inet4Address) {
            this.dstAddr = inet4Address;
            return this;
        }

        public Builder fragmentOffset(short s) {
            this.fragmentOffset = s;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder headerChecksum(short s) {
            this.headerChecksum = s;
            return this;
        }

        public Builder identification(short s) {
            this.identification = s;
            return this;
        }

        public Builder ihl(byte b) {
            this.ihl = b;
            return this;
        }

        public Builder moreFragmentFlag(boolean z) {
            this.moreFragmentFlag = z;
            return this;
        }

        public Builder options(List<IpV4Option> list) {
            this.options = list;
            return this;
        }

        public Builder padding(byte[] bArr) {
            this.padding = bArr;
            return this;
        }

        public Builder paddingAtBuild(boolean z) {
            this.paddingAtBuild = z;
            return this;
        }

        public Builder protocol(IpNumber ipNumber) {
            this.protocol = ipNumber;
            return this;
        }

        public Builder reservedFlag(boolean z) {
            this.reservedFlag = z;
            return this;
        }

        public Builder srcAddr(Inet4Address inet4Address) {
            this.srcAddr = inet4Address;
            return this;
        }

        public Builder tos(IpV4Tos ipV4Tos) {
            this.tos = ipV4Tos;
            return this;
        }

        public Builder totalLength(short s) {
            this.totalLength = s;
            return this;
        }

        public Builder ttl(byte b) {
            this.ttl = b;
            return this;
        }

        public Builder version(IpVersion ipVersion) {
            this.version = ipVersion;
            return this;
        }

        public Builder(IpV4Packet ipV4Packet) {
            this.version = ipV4Packet.header.version;
            this.ihl = ipV4Packet.header.ihl;
            this.tos = ipV4Packet.header.tos;
            this.totalLength = ipV4Packet.header.totalLength;
            this.identification = ipV4Packet.header.identification;
            this.reservedFlag = ipV4Packet.header.reservedFlag;
            this.dontFragmentFlag = ipV4Packet.header.dontFragmentFlag;
            this.moreFragmentFlag = ipV4Packet.header.moreFragmentFlag;
            this.fragmentOffset = ipV4Packet.header.fragmentOffset;
            this.ttl = ipV4Packet.header.ttl;
            this.protocol = ipV4Packet.header.protocol;
            this.headerChecksum = ipV4Packet.header.headerChecksum;
            this.srcAddr = ipV4Packet.header.srcAddr;
            this.dstAddr = ipV4Packet.header.dstAddr;
            this.options = ipV4Packet.header.options;
            this.padding = ipV4Packet.header.padding;
            this.payloadBuilder = ipV4Packet.payload != null ? ipV4Packet.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<IpV4Packet> correctChecksumAtBuild(boolean z) {
            this.correctChecksumAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: merged with bridge method [inline-methods] */
        public LengthBuilder<IpV4Packet> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV4Packet build() {
            return new IpV4Packet(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static final class IpV4Header extends AbstractPacket.AbstractHeader implements IpPacket.IpHeader {
        private static final int DST_ADDR_OFFSET = 16;
        private static final int DST_ADDR_SIZE = 4;
        private static final int FLAGS_AND_FRAGMENT_OFFSET_OFFSET = 6;
        private static final int FLAGS_AND_FRAGMENT_OFFSET_SIZE = 2;
        private static final int HEADER_CHECKSUM_OFFSET = 10;
        private static final int HEADER_CHECKSUM_SIZE = 2;
        private static final int IDENTIFICATION_OFFSET = 4;
        private static final int IDENTIFICATION_SIZE = 2;
        private static final int MIN_IPV4_HEADER_SIZE = 20;
        private static final int OPTIONS_OFFSET = 20;
        private static final int PROTOCOL_OFFSET = 9;
        private static final int PROTOCOL_SIZE = 1;
        private static final int SRC_ADDR_OFFSET = 12;
        private static final int SRC_ADDR_SIZE = 4;
        private static final int TOS_OFFSET = 1;
        private static final int TOS_SIZE = 1;
        private static final int TOTAL_LENGTH_OFFSET = 2;
        private static final int TOTAL_LENGTH_SIZE = 2;
        private static final int TTL_OFFSET = 8;
        private static final int TTL_SIZE = 1;
        private static final int VERSION_AND_IHL_OFFSET = 0;
        private static final int VERSION_AND_IHL_SIZE = 1;
        private static final Logger logger = LoggerFactory.getLogger((Class<?>) IpV4Header.class);
        private static final long serialVersionUID = -7583326842445453539L;
        private final boolean dontFragmentFlag;
        private final Inet4Address dstAddr;
        private final short fragmentOffset;
        private final short headerChecksum;
        private final short identification;
        private final byte ihl;
        private final boolean moreFragmentFlag;
        private final List<IpV4Option> options;
        private final byte[] padding;
        private final IpNumber protocol;
        private final boolean reservedFlag;
        private final Inet4Address srcAddr;
        private final IpV4Tos tos;
        private final short totalLength;
        private final byte ttl;
        private final IpVersion version;

        private byte[] buildRawData(boolean z) {
            return ByteArrays.concatenate(getRawFields(z));
        }

        private short calcHeaderChecksum(boolean z) {
            return ByteArrays.calcChecksum(buildRawData(z));
        }

        private int measureLengthWithoutPadding() {
            Iterator<IpV4Option> it = this.options.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length + 20;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[IPv4 Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Version: ");
            sb.append(this.version);
            sb.append(property);
            sb.append("  IHL: ");
            sb.append((int) this.ihl);
            sb.append(" (");
            sb.append(this.ihl * 4);
            sb.append(" [bytes])");
            sb.append(property);
            sb.append("  TOS: ");
            sb.append(this.tos);
            sb.append(property);
            sb.append("  Total length: ");
            sb.append(getTotalLengthAsInt());
            sb.append(" [bytes]");
            sb.append(property);
            sb.append("  Identification: ");
            sb.append(getIdentificationAsInt());
            sb.append(property);
            sb.append("  Flags: (Reserved, Don't Fragment, More Fragment) = (");
            sb.append(getReservedFlag());
            sb.append(", ");
            sb.append(getDontFragmentFlag());
            sb.append(", ");
            sb.append(getMoreFragmentFlag());
            sb.append(")");
            sb.append(property);
            sb.append("  Fragment offset: ");
            sb.append((int) this.fragmentOffset);
            sb.append(" (");
            sb.append(this.fragmentOffset * 8);
            sb.append(" [bytes])");
            sb.append(property);
            sb.append("  TTL: ");
            sb.append(getTtlAsInt());
            sb.append(property);
            sb.append("  Protocol: ");
            sb.append(this.protocol);
            sb.append(property);
            sb.append("  Header checksum: 0x");
            sb.append(ByteArrays.toHexString(this.headerChecksum, ""));
            sb.append(property);
            sb.append("  Source address: ");
            sb.append(this.srcAddr);
            sb.append(property);
            sb.append("  Destination address: ");
            sb.append(this.dstAddr);
            sb.append(property);
            for (IpV4Option ipV4Option : this.options) {
                sb.append("  Option: ");
                sb.append(ipV4Option);
                sb.append(property);
            }
            if (this.padding.length != 0) {
                sb.append("  Padding: 0x");
                sb.append(ByteArrays.toHexString(this.padding, " "));
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.options.hashCode() + ((Arrays.hashCode(this.padding) + ((this.dstAddr.hashCode() + ((this.srcAddr.hashCode() + ((((this.protocol.hashCode() + ((((((((((((((((this.tos.hashCode() + ((((this.version.hashCode() + 527) * 31) + this.ihl) * 31)) * 31) + this.totalLength) * 31) + this.identification) * 31) + (this.reservedFlag ? 1231 : 1237)) * 31) + (this.dontFragmentFlag ? 1231 : 1237)) * 31) + (this.moreFragmentFlag ? 1231 : 1237)) * 31) + this.fragmentOffset) * 31) + this.ttl) * 31)) * 31) + this.headerChecksum) * 31)) * 31)) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return measureLengthWithoutPadding() + this.padding.length;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IpV4Header.class.isInstance(obj)) {
                return false;
            }
            IpV4Header ipV4Header = (IpV4Header) obj;
            return this.identification == ipV4Header.identification && this.headerChecksum == ipV4Header.headerChecksum && this.srcAddr.equals(ipV4Header.srcAddr) && this.dstAddr.equals(ipV4Header.dstAddr) && this.totalLength == ipV4Header.totalLength && this.protocol.equals(ipV4Header.protocol) && this.ttl == ipV4Header.ttl && this.fragmentOffset == ipV4Header.fragmentOffset && this.reservedFlag == ipV4Header.reservedFlag && this.dontFragmentFlag == ipV4Header.dontFragmentFlag && this.moreFragmentFlag == ipV4Header.moreFragmentFlag && this.tos.equals(ipV4Header.tos) && this.ihl == ipV4Header.ihl && this.version.equals(ipV4Header.version) && this.options.equals(ipV4Header.options) && Arrays.equals(this.padding, ipV4Header.padding);
        }

        public boolean getDontFragmentFlag() {
            return this.dontFragmentFlag;
        }

        public short getFragmentOffset() {
            return this.fragmentOffset;
        }

        public short getHeaderChecksum() {
            return this.headerChecksum;
        }

        public short getIdentification() {
            return this.identification;
        }

        public int getIdentificationAsInt() {
            return 65535 & this.identification;
        }

        public byte getIhl() {
            return this.ihl;
        }

        public int getIhlAsInt() {
            return this.ihl & 255;
        }

        public boolean getMoreFragmentFlag() {
            return this.moreFragmentFlag;
        }

        public List<IpV4Option> getOptions() {
            return new ArrayList(this.options);
        }

        public byte[] getPadding() {
            byte[] bArr = this.padding;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpNumber getProtocol() {
            return this.protocol;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        public boolean getReservedFlag() {
            return this.reservedFlag;
        }

        public IpV4Tos getTos() {
            return this.tos;
        }

        public short getTotalLength() {
            return this.totalLength;
        }

        public int getTotalLengthAsInt() {
            return 65535 & this.totalLength;
        }

        public byte getTtl() {
            return this.ttl;
        }

        public int getTtlAsInt() {
            return this.ttl & 255;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpVersion getVersion() {
            return this.version;
        }

        public boolean hasValidChecksum(boolean z) {
            if (calcHeaderChecksum(false) == 0) {
                return true;
            }
            return this.headerChecksum == 0 && z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v24 */
        /* JADX WARN: Type inference failed for: r0v25 */
        private List<byte[]> getRawFields(boolean z) {
            ?? r0 = this.moreFragmentFlag;
            ?? r02 = r0;
            if (this.dontFragmentFlag) {
                r02 = (byte) (r0 | 2);
            }
            ?? r03 = r02;
            if (this.reservedFlag) {
                r03 = (byte) (r02 | 4);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((byte) ((this.version.value().byteValue() << 4) | this.ihl)));
            arrayList.add(new byte[]{this.tos.value()});
            arrayList.add(ByteArrays.toByteArray(this.totalLength));
            arrayList.add(ByteArrays.toByteArray(this.identification));
            arrayList.add(ByteArrays.toByteArray((short) ((r03 << 13) | this.fragmentOffset)));
            arrayList.add(ByteArrays.toByteArray(this.ttl));
            arrayList.add(ByteArrays.toByteArray(this.protocol.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(z ? (short) 0 : this.headerChecksum));
            arrayList.add(ByteArrays.toByteArray(this.srcAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstAddr));
            Iterator<IpV4Option> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            arrayList.add(this.padding);
            return arrayList;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet4Address getDstAddr() {
            return this.dstAddr;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet4Address getSrcAddr() {
            return this.srcAddr;
        }

        private IpV4Header(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 20;
            if (i2 >= 20) {
                byte b = ByteArrays.getByte(bArr, i);
                this.version = IpVersion.getInstance(Byte.valueOf((byte) ((b & 240) >> 4)));
                this.ihl = (byte) (b & 15);
                this.tos = (IpV4Tos) PacketFactories.getFactory(IpV4Tos.class, NotApplicable.class).newInstance(bArr, i + 1, 1);
                this.totalLength = ByteArrays.getShort(bArr, i + 2);
                this.identification = ByteArrays.getShort(bArr, i + 4);
                short s = ByteArrays.getShort(bArr, i + 6);
                this.reservedFlag = (Short.MIN_VALUE & s) != 0;
                this.dontFragmentFlag = (s & 16384) != 0;
                this.moreFragmentFlag = (s & 8192) != 0;
                this.fragmentOffset = (short) (s & 8191);
                this.ttl = ByteArrays.getByte(bArr, i + 8);
                this.protocol = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i + 9)));
                this.headerChecksum = ByteArrays.getShort(bArr, i + 10);
                this.srcAddr = ByteArrays.getInet4Address(bArr, i + 12);
                this.dstAddr = ByteArrays.getInet4Address(bArr, i + 16);
                int ihlAsInt = getIhlAsInt() * 4;
                if (i2 < ihlAsInt) {
                    StringBuilder sb = new StringBuilder(110);
                    sb.append("The data is too short to build an IPv4 header(");
                    sb.append(ihlAsInt);
                    sb.append(" bytes). data: ");
                    t61.t(i, " ", ", offset: ", sb, bArr);
                    sb.append(", length: ");
                    sb.append(i2);
                    throw new IllegalRawDataException(sb.toString());
                }
                if (ihlAsInt >= 20) {
                    this.options = new ArrayList();
                    while (length < ihlAsInt) {
                        int i3 = length + i;
                        try {
                            IpV4Option ipV4Option = (IpV4Option) PacketFactories.getFactory(IpV4Option.class, IpV4OptionType.class).newInstance(bArr, i3, ihlAsInt - length, IpV4OptionType.getInstance(Byte.valueOf(bArr[i3])));
                            this.options.add(ipV4Option);
                            length += ipV4Option.length();
                            if (ipV4Option.getType().equals(IpV4OptionType.END_OF_OPTION_LIST)) {
                                break;
                            }
                        } catch (Exception e) {
                            logger.error("Exception occurred during analyzing IPv4 options: ", (Throwable) e);
                        }
                    }
                    int i4 = ihlAsInt - length;
                    if (i4 != 0) {
                        this.padding = ByteArrays.getSubArray(bArr, length + i, i4);
                        return;
                    } else {
                        this.padding = new byte[0];
                        return;
                    }
                }
                StringBuilder sbA = o40.A(100, "The ihl must be equal or more than5but it is: ");
                sbA.append(getIhlAsInt());
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(110, "The data is too short to build an IPv4 header. It must be at least 20 bytes. data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private IpV4Header(Builder builder, Packet packet) {
            if ((builder.fragmentOffset & 57344) == 0) {
                this.version = builder.version;
                this.tos = builder.tos;
                this.identification = builder.identification;
                this.reservedFlag = builder.reservedFlag;
                this.dontFragmentFlag = builder.dontFragmentFlag;
                this.moreFragmentFlag = builder.moreFragmentFlag;
                this.fragmentOffset = builder.fragmentOffset;
                this.ttl = builder.ttl;
                this.protocol = builder.protocol;
                this.srcAddr = builder.srcAddr;
                this.dstAddr = builder.dstAddr;
                if (builder.options != null) {
                    this.options = new ArrayList(builder.options);
                } else {
                    this.options = new ArrayList(0);
                }
                if (!builder.paddingAtBuild) {
                    if (builder.padding != null) {
                        byte[] bArr = new byte[builder.padding.length];
                        this.padding = bArr;
                        System.arraycopy(builder.padding, 0, bArr, 0, bArr.length);
                    } else {
                        this.padding = new byte[0];
                    }
                } else {
                    int iMeasureLengthWithoutPadding = measureLengthWithoutPadding() % 4;
                    if (iMeasureLengthWithoutPadding != 0) {
                        this.padding = new byte[4 - iMeasureLengthWithoutPadding];
                    } else {
                        this.padding = new byte[0];
                    }
                }
                if (!builder.correctLengthAtBuild) {
                    if ((builder.ihl & 240) == 0) {
                        this.ihl = builder.ihl;
                        this.totalLength = builder.totalLength;
                    } else {
                        throw new IllegalArgumentException("Invalid ihl: " + ((int) builder.ihl));
                    }
                } else {
                    this.ihl = (byte) (length() / 4);
                    if (packet != null) {
                        this.totalLength = (short) (length() + packet.length());
                    } else {
                        this.totalLength = (short) length();
                    }
                }
                if (!builder.correctChecksumAtBuild) {
                    this.headerChecksum = builder.headerChecksum;
                    return;
                } else if (PacketPropertiesLoader.getInstance().ipV4CalcChecksum()) {
                    this.headerChecksum = calcHeaderChecksum(true);
                    return;
                } else {
                    this.headerChecksum = (short) 0;
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid fragmentOffset: " + ((int) builder.fragmentOffset));
        }
    }

    public interface IpV4Option extends Serializable {
        byte[] getRawData();

        IpV4OptionType getType();

        int length();
    }

    public interface IpV4Tos extends Serializable {
        byte value();
    }

    public static IpV4Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV4Packet(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    private IpV4Packet(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        IpV4Header ipV4Header = new IpV4Header(bArr, i, i2);
        this.header = ipV4Header;
        int length = i2 - ipV4Header.length();
        int totalLengthAsInt = ipV4Header.getTotalLengthAsInt();
        if (totalLengthAsInt == 0) {
            logger.debug("Total Length is 0. Assuming segmentation offload to be working.");
        } else {
            int length2 = totalLengthAsInt - ipV4Header.length();
            if (length2 < 0) {
                throw new IllegalRawDataException(rm7.n(totalLengthAsInt, "The value of total length field seems to be wrong: "));
            }
            if (length2 <= length) {
                length = length2;
            }
        }
        if (length == 0) {
            this.payload = null;
        } else if (ipV4Header.getMoreFragmentFlag() || ipV4Header.getFragmentOffset() != 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV4Header.length() + i, length, NotApplicable.FRAGMENTED);
        } else {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, IpNumber.class).newInstance(bArr, ipV4Header.length() + i, length, ipV4Header.getProtocol());
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV4Header getHeader() {
        return this.header;
    }

    private IpV4Packet(Builder builder) {
        if (builder != null && builder.version != null && builder.tos != null && builder.protocol != null && builder.srcAddr != null && builder.dstAddr != null) {
            Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = packetBuild;
            this.header = new IpV4Header(builder, packetBuild);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.version: " + builder.version + " builder.tos: " + builder.tos + " builder.protocol: " + builder.protocol + " builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
    }
}
