package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import java.util.List;
import org.pcap4j.packet.IcmpIdentifiablePacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV4TimestampPacket extends IcmpIdentifiablePacket {
    private static final long serialVersionUID = -122451430580609855L;
    private final IcmpV4TimestampHeader header;

    public static final class Builder extends IcmpIdentifiablePacket.Builder {
        private int originateTimestamp;
        private int receiveTimestamp;
        private int transmitTimestamp;

        public Builder originateTimestamp(int i) {
            this.originateTimestamp = i;
            return this;
        }

        public Builder receiveTimestamp(int i) {
            this.receiveTimestamp = i;
            return this;
        }

        public Builder transmitTimestamp(int i) {
            this.transmitTimestamp = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4TimestampPacket build() {
            return new IcmpV4TimestampPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder identifier(short s) {
            super.identifier(s);
            return this;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder sequenceNumber(short s) {
            super.sequenceNumber(s);
            return this;
        }

        private Builder(IcmpV4TimestampPacket icmpV4TimestampPacket) {
            super(icmpV4TimestampPacket);
            this.originateTimestamp = icmpV4TimestampPacket.header.originateTimestamp;
            this.receiveTimestamp = icmpV4TimestampPacket.header.receiveTimestamp;
            this.transmitTimestamp = icmpV4TimestampPacket.header.transmitTimestamp;
        }
    }

    public static IcmpV4TimestampPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV4TimestampPacket(bArr, i, i2);
    }

    public static final class IcmpV4TimestampHeader extends IcmpIdentifiablePacket.IcmpIdentifiableHeader {
        private static final int ICMPV4_TIMESTAMP_HEADER_SIZE = 16;
        private static final int ORIGINATE_TIMESTAMP_OFFSET = 4;
        private static final int ORIGINATE_TIMESTAMP_SIZE = 4;
        private static final int RECEIVE_TIMESTAMP_OFFSET = 8;
        private static final int RECEIVE_TIMESTAMP_SIZE = 4;
        private static final int TRANSMIT_TIMESTAMP_OFFSET = 12;
        private static final int TRANSMIT_TIMESTAMP_SIZE = 4;
        private static final long serialVersionUID = -5997732668989705976L;
        private final int originateTimestamp;
        private final int receiveTimestamp;
        private final int transmitTimestamp;

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb.append(super.buildString());
            sb.append("  Originate Timestamp: ");
            sb.append(this.originateTimestamp);
            sb.append(property);
            sb.append("  Receive Timestamp: ");
            sb.append(this.receiveTimestamp);
            sb.append(property);
            sb.append("  Transmit Timestamp: ");
            return dw1.k(this.transmitTimestamp, property, sb);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return (((((super.calcHashCode() * 31) + this.originateTimestamp) * 31) + this.receiveTimestamp) * 31) + this.transmitTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            IcmpV4TimestampHeader icmpV4TimestampHeader = (IcmpV4TimestampHeader) obj;
            return this.originateTimestamp == icmpV4TimestampHeader.originateTimestamp && this.receiveTimestamp == icmpV4TimestampHeader.receiveTimestamp && this.transmitTimestamp == icmpV4TimestampHeader.transmitTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public String getHeaderName() {
            return "ICMPv4 Timestamp Header";
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getIdentifier() {
            return super.getIdentifier();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getIdentifierAsInt() {
            return super.getIdentifierAsInt();
        }

        public int getOriginateTimestamp() {
            return this.originateTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            List<byte[]> rawFields = super.getRawFields();
            rawFields.add(ByteArrays.toByteArray(this.originateTimestamp));
            rawFields.add(ByteArrays.toByteArray(this.receiveTimestamp));
            rawFields.add(ByteArrays.toByteArray(this.transmitTimestamp));
            return rawFields;
        }

        public int getReceiveTimestamp() {
            return this.receiveTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getSequenceNumber() {
            return super.getSequenceNumber();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getSequenceNumberAsInt() {
            return super.getSequenceNumberAsInt();
        }

        public int getTransmitTimestamp() {
            return this.transmitTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 16;
        }

        private IcmpV4TimestampHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            super(bArr, i, i2);
            if (i2 >= 16) {
                this.originateTimestamp = ByteArrays.getInt(bArr, i + 4);
                this.receiveTimestamp = ByteArrays.getInt(bArr, i + 8);
                this.transmitTimestamp = ByteArrays.getInt(bArr, i + 12);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ");
            sbA.append(getHeaderName());
            sbA.append("(16 bytes). data: ");
            sbA.append(ByteArrays.toHexString(bArr, " "));
            sbA.append(", offset: ");
            sbA.append(i);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV4TimestampHeader(Builder builder) {
            super(builder);
            this.originateTimestamp = builder.originateTimestamp;
            this.receiveTimestamp = builder.receiveTimestamp;
            this.transmitTimestamp = builder.transmitTimestamp;
        }
    }

    private IcmpV4TimestampPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV4TimestampHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpIdentifiablePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4TimestampHeader getHeader() {
        return this.header;
    }

    private IcmpV4TimestampPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4TimestampHeader(builder);
    }
}
