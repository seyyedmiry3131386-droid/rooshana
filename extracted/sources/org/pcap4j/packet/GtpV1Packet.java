package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.GtpV1ExtensionHeaderType;
import org.pcap4j.packet.namednumber.GtpV1MessageType;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class GtpV1Packet extends AbstractPacket {
    private static final long serialVersionUID = 4638029542367352625L;
    private final GtpV1Header header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<GtpV1Packet> {
        private boolean correctLengthAtBuild;
        private boolean extensionHeaderFlag;
        private short length;
        private GtpV1MessageType messageType;
        private Byte nPduNumber;
        private boolean nPduNumberFlag;
        private GtpV1ExtensionHeaderType nextExtensionHeaderType;
        private Packet.Builder payloadBuilder;
        private ProtocolType protocolType;
        private boolean reserved;
        private Short sequenceNumber;
        private boolean sequenceNumberFlag;
        private int teid;
        private GtpVersion version;

        public Builder() {
        }

        public Builder extensionHeaderFlag(boolean z) {
            this.extensionHeaderFlag = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder length(short s) {
            this.length = s;
            return this;
        }

        public Builder messageType(GtpV1MessageType gtpV1MessageType) {
            this.messageType = gtpV1MessageType;
            return this;
        }

        public Builder nPduNumber(Byte b) {
            this.nPduNumber = b;
            return this;
        }

        public Builder nPduNumberFlag(boolean z) {
            this.nPduNumberFlag = z;
            return this;
        }

        public Builder nextExtensionHeaderType(GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType) {
            this.nextExtensionHeaderType = gtpV1ExtensionHeaderType;
            return this;
        }

        public Builder protocolType(ProtocolType protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        public Builder reserved(boolean z) {
            this.reserved = z;
            return this;
        }

        public Builder sequenceNumber(Short sh) {
            this.sequenceNumber = sh;
            return this;
        }

        public Builder sequenceNumberFlag(boolean z) {
            this.sequenceNumberFlag = z;
            return this;
        }

        public Builder teid(int i) {
            this.teid = i;
            return this;
        }

        public Builder version(GtpVersion gtpVersion) {
            this.version = gtpVersion;
            return this;
        }

        public Builder(GtpV1Packet gtpV1Packet) {
            this.protocolType = gtpV1Packet.header.protocolType;
            this.version = gtpV1Packet.header.version;
            this.reserved = gtpV1Packet.header.reserved;
            this.length = gtpV1Packet.header.length;
            this.messageType = gtpV1Packet.header.messageType;
            this.nPduNumberFlag = gtpV1Packet.header.nPduNumberFlag;
            this.sequenceNumber = gtpV1Packet.header.sequenceNumber;
            this.nPduNumber = gtpV1Packet.header.nPduNumber;
            this.nextExtensionHeaderType = gtpV1Packet.header.nextExtensionHeaderType;
            this.sequenceNumberFlag = gtpV1Packet.header.sequenceNumberFlag;
            this.teid = gtpV1Packet.header.teid;
            this.extensionHeaderFlag = gtpV1Packet.header.extensionHeaderFlag;
            this.payloadBuilder = gtpV1Packet.payload != null ? gtpV1Packet.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<GtpV1Packet> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public GtpV1Packet build() {
            return new GtpV1Packet(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public enum ProtocolType {
        GTP_PRIME(false),
        GTP(true);

        private final boolean value;

        ProtocolType(boolean z) {
            this.value = z;
        }

        public static ProtocolType getInstance(boolean z) {
            for (ProtocolType protocolType : values()) {
                if (protocolType.value == z) {
                    return protocolType;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + z);
        }

        public boolean getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value ? "GTP" : "GTP'";
        }
    }

    public static GtpV1Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new GtpV1Packet(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class GtpV1Header extends AbstractPacket.AbstractHeader {
        private static final int FIRST_OCTET_OFFSET = 0;
        private static final int FIRST_OCTET_SIZE = 1;
        private static final int GTP_V1_HEADER_MAX_SIZE = 12;
        private static final int GTP_V1_HEADER_MIM_SIZE = 8;
        private static final int LENGTH_OFFSET = 2;
        private static final int LENGTH_SIZE = 2;
        private static final int MSG_TYPE_OFFSET = 1;
        private static final int MSG_TYPE_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 11;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int NPDU_OFFSET = 10;
        private static final int NPDU_SIZE = 1;
        private static final int SEQ_OFFSET = 8;
        private static final int SEQ_SIZE = 2;
        private static final int TUNNEL_ID_OFFSET = 4;
        private static final int TUNNEL_ID_SIZE = 4;
        private static final long serialVersionUID = -1746545325551976324L;
        private final boolean extensionHeaderFlag;
        private final short length;
        private final GtpV1MessageType messageType;
        private final Byte nPduNumber;
        private final boolean nPduNumberFlag;
        private final GtpV1ExtensionHeaderType nextExtensionHeaderType;
        private final ProtocolType protocolType;
        private final boolean reserved;
        private final Short sequenceNumber;
        private final boolean sequenceNumberFlag;
        private final int teid;
        private final GtpVersion version;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[GTPv1 Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Version: ");
            sb.append(this.version);
            sb.append(property);
            sb.append("  Protocol Type: ");
            sb.append(this.protocolType);
            sb.append(property);
            sb.append("  Reserved Flag: ");
            o40.K(sb, this.reserved, property, "  Extension Flag: ");
            o40.K(sb, this.extensionHeaderFlag, property, "  Sequence Flag: ");
            o40.K(sb, this.sequenceNumberFlag, property, "  NPDU Flag: ");
            o40.K(sb, this.nPduNumberFlag, property, "  Message Type: ");
            sb.append(this.messageType);
            sb.append(property);
            sb.append("  Length: ");
            sb.append(getLengthAsInt());
            sb.append(" [bytes]");
            sb.append(property);
            sb.append("  Tunnel ID: ");
            sb.append(getTeidAsLong());
            sb.append(property);
            if (this.sequenceNumber != null) {
                sb.append("  Sequence Number: ");
                sb.append(getSequenceNumberAsInt());
                sb.append(property);
            }
            if (this.nPduNumber != null) {
                sb.append("  NPDU Number: ");
                sb.append(getNPduNumberAsInt());
                sb.append(property);
            }
            if (this.nextExtensionHeaderType != null) {
                sb.append("  Next Extension Header: ");
                sb.append(getNextExtensionHeaderType());
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int iHashCode = (this.messageType.hashCode() + ((((527 + (this.extensionHeaderFlag ? 1231 : 1237)) * 31) + this.length) * 31)) * 31;
            Byte b = this.nPduNumber;
            int iHashCode2 = (((iHashCode + (b == null ? 0 : b.hashCode())) * 31) + (this.nPduNumberFlag ? 1231 : 1237)) * 31;
            GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType = this.nextExtensionHeaderType;
            int iHashCode3 = (((this.protocolType.hashCode() + ((iHashCode2 + (gtpV1ExtensionHeaderType == null ? 0 : gtpV1ExtensionHeaderType.hashCode())) * 31)) * 31) + (this.reserved ? 1231 : 1237)) * 31;
            Short sh = this.sequenceNumber;
            return this.version.hashCode() + ((((((iHashCode3 + (sh != null ? sh.hashCode() : 0)) * 31) + (this.sequenceNumberFlag ? 1231 : 1237)) * 31) + this.teid) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            int i = this.sequenceNumber != null ? 10 : 8;
            if (this.nPduNumber != null) {
                i++;
            }
            return this.nextExtensionHeaderType != null ? i + 1 : i;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!GtpV1Header.class.isInstance(obj)) {
                return false;
            }
            GtpV1Header gtpV1Header = (GtpV1Header) obj;
            if (this.extensionHeaderFlag != gtpV1Header.extensionHeaderFlag || this.length != gtpV1Header.length || !this.messageType.equals(gtpV1Header.messageType)) {
                return false;
            }
            Byte b = this.nPduNumber;
            if (b == null) {
                if (gtpV1Header.nPduNumber != null) {
                    return false;
                }
            } else if (!b.equals(gtpV1Header.nPduNumber)) {
                return false;
            }
            if (this.nPduNumberFlag != gtpV1Header.nPduNumberFlag) {
                return false;
            }
            GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType = this.nextExtensionHeaderType;
            if (gtpV1ExtensionHeaderType == null) {
                if (gtpV1Header.nextExtensionHeaderType != null) {
                    return false;
                }
            } else if (!gtpV1ExtensionHeaderType.equals(gtpV1Header.nextExtensionHeaderType)) {
                return false;
            }
            if (this.protocolType != gtpV1Header.protocolType || this.reserved != gtpV1Header.reserved) {
                return false;
            }
            Short sh = this.sequenceNumber;
            if (sh == null) {
                if (gtpV1Header.sequenceNumber != null) {
                    return false;
                }
            } else if (!sh.equals(gtpV1Header.sequenceNumber)) {
                return false;
            }
            return this.sequenceNumberFlag == gtpV1Header.sequenceNumberFlag && this.teid == gtpV1Header.teid && this.version == gtpV1Header.version;
        }

        public short getLength() {
            return this.length;
        }

        public int getLengthAsInt() {
            return 65535 & this.length;
        }

        public GtpV1MessageType getMessageType() {
            return this.messageType;
        }

        public Byte getNPduNumber() {
            return this.nPduNumber;
        }

        public Integer getNPduNumberAsInt() {
            Byte b = this.nPduNumber;
            if (b == null) {
                return null;
            }
            return Integer.valueOf(b.byteValue() & 255);
        }

        public GtpV1ExtensionHeaderType getNextExtensionHeaderType() {
            return this.nextExtensionHeaderType;
        }

        public ProtocolType getProtocolType() {
            return this.protocolType;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            byte value = (byte) (this.version.getValue() << 5);
            if (this.protocolType.getValue()) {
                value = (byte) (value | 16);
            }
            if (this.reserved) {
                value = (byte) (value | 8);
            }
            if (this.extensionHeaderFlag) {
                value = (byte) (value | 4);
            }
            if (this.sequenceNumberFlag) {
                value = (byte) (value | 2);
            }
            if (this.nPduNumberFlag) {
                value = (byte) (value | 1);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(value));
            arrayList.add(ByteArrays.toByteArray(this.messageType.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.length));
            arrayList.add(ByteArrays.toByteArray(this.teid));
            Short sh = this.sequenceNumber;
            if (sh != null) {
                arrayList.add(ByteArrays.toByteArray(sh.shortValue()));
            }
            Byte b = this.nPduNumber;
            if (b != null) {
                arrayList.add(ByteArrays.toByteArray(b.byteValue()));
            }
            GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType = this.nextExtensionHeaderType;
            if (gtpV1ExtensionHeaderType != null) {
                arrayList.add(ByteArrays.toByteArray(gtpV1ExtensionHeaderType.value().byteValue()));
            }
            return arrayList;
        }

        public boolean getReserved() {
            return this.reserved;
        }

        public Short getSequenceNumber() {
            return this.sequenceNumber;
        }

        public Integer getSequenceNumberAsInt() {
            Short sh = this.sequenceNumber;
            if (sh == null) {
                return null;
            }
            return Integer.valueOf(sh.shortValue() & 65535);
        }

        public int getTeid() {
            return this.teid;
        }

        public long getTeidAsLong() {
            return ((long) this.teid) & 4294967295L;
        }

        public GtpVersion getVersion() {
            return this.version;
        }

        public boolean isExtensionHeaderFieldPresent() {
            return this.extensionHeaderFlag;
        }

        public boolean isNPduNumberFieldPresent() {
            return this.nPduNumberFlag;
        }

        public boolean isSequenceNumberFieldPresent() {
            return this.sequenceNumberFlag;
        }

        private GtpV1Header(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 8) {
                byte b = ByteArrays.getByte(bArr, i);
                this.version = GtpVersion.getInstance((b >> 5) & 7);
                this.protocolType = ProtocolType.getInstance((b & 16) != 0);
                this.reserved = ((b & 8) >> 3) != 0;
                boolean z = ((b & 4) >> 2) != 0;
                this.extensionHeaderFlag = z;
                boolean z2 = ((b & 2) >> 1) != 0;
                this.sequenceNumberFlag = z2;
                boolean z3 = (b & 1) != 0;
                this.nPduNumberFlag = z3;
                this.messageType = GtpV1MessageType.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i + 1)));
                this.length = ByteArrays.getShort(bArr, i + 2);
                this.teid = ByteArrays.getInt(bArr, i + 4);
                if (!(z2 | z3) && !z) {
                    this.sequenceNumber = null;
                    this.nPduNumber = null;
                    this.nextExtensionHeaderType = null;
                    return;
                } else if (i2 >= 12) {
                    this.sequenceNumber = Short.valueOf(ByteArrays.getShort(bArr, i + 8));
                    this.nPduNumber = Byte.valueOf(ByteArrays.getByte(bArr, i + 10));
                    this.nextExtensionHeaderType = GtpV1ExtensionHeaderType.getInstance(Byte.valueOf(bArr[i + 11]));
                    return;
                } else {
                    StringBuilder sbA = o40.A(80, "The data is too short to build a GTPv1 header(12 bytes). data: ");
                    t61.t(i, " ", ", offset: ", sbA, bArr);
                    sbA.append(", length: ");
                    sbA.append(i2);
                    throw new IllegalRawDataException(sbA.toString());
                }
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build a GTPv1 header(8 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private GtpV1Header(Builder builder, int i) {
            this.protocolType = builder.protocolType;
            this.version = builder.version;
            this.reserved = builder.reserved;
            this.messageType = builder.messageType;
            boolean z = builder.nPduNumberFlag;
            this.nPduNumberFlag = z;
            this.sequenceNumber = builder.sequenceNumber;
            this.nPduNumber = builder.nPduNumber;
            this.nextExtensionHeaderType = builder.nextExtensionHeaderType;
            boolean z2 = builder.sequenceNumberFlag;
            this.sequenceNumberFlag = z2;
            this.teid = builder.teid;
            boolean z3 = builder.extensionHeaderFlag;
            this.extensionHeaderFlag = z3;
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
            } else if (z2 | z | z3) {
                this.length = (short) (i + 4);
            } else {
                this.length = (short) i;
            }
        }
    }

    private GtpV1Packet(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        GtpV1Header gtpV1Header = new GtpV1Header(bArr, i, i2);
        this.header = gtpV1Header;
        int lengthAsInt = gtpV1Header.getLengthAsInt();
        lengthAsInt = (gtpV1Header.isExtensionHeaderFieldPresent() || gtpV1Header.isSequenceNumberFieldPresent() || gtpV1Header.isNPduNumberFieldPresent()) ? lengthAsInt - 4 : lengthAsInt;
        if (lengthAsInt < 0) {
            throw new IllegalRawDataException("The value of length field seems to be wrong: " + gtpV1Header.getLengthAsInt());
        }
        if (lengthAsInt == 0) {
            this.payload = null;
            return;
        }
        GtpV1ExtensionHeaderType nextExtensionHeaderType = gtpV1Header.getNextExtensionHeaderType();
        if (nextExtensionHeaderType != null) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, GtpV1ExtensionHeaderType.class).newInstance(bArr, gtpV1Header.length() + i, lengthAsInt, nextExtensionHeaderType);
        } else {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, gtpV1Header.length() + i, lengthAsInt, NotApplicable.UNKNOWN);
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public GtpV1Header getHeader() {
        return this.header;
    }

    private GtpV1Packet(Builder builder) {
        if (builder != null && builder.version != null && builder.protocolType != null && builder.messageType != null) {
            Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = packetBuild;
            this.header = new GtpV1Header(builder, packetBuild != null ? packetBuild.length() : 0);
            return;
        }
        throw new NullPointerException("builder: " + builder + ", builder.version: " + builder.version + ", builder.protocolType: " + builder.protocolType + ", builder.messageType: " + builder.messageType);
    }
}
