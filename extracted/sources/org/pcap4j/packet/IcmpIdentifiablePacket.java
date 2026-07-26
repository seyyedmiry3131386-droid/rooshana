package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
abstract class IcmpIdentifiablePacket extends AbstractPacket {
    private static final long serialVersionUID = -424401780940103043L;

    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private short identifier;
        private short sequenceNumber;

        public Builder() {
        }

        public Builder identifier(short s) {
            this.identifier = s;
            return this;
        }

        public Builder sequenceNumber(short s) {
            this.sequenceNumber = s;
            return this;
        }

        public Builder(IcmpIdentifiablePacket icmpIdentifiablePacket) {
            this.identifier = icmpIdentifiablePacket.getHeader().identifier;
            this.sequenceNumber = icmpIdentifiablePacket.getHeader().sequenceNumber;
        }
    }

    public IcmpIdentifiablePacket() {
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract IcmpIdentifiableHeader getHeader();

    public IcmpIdentifiablePacket(Builder builder) {
        if (builder != null) {
            return;
        }
        throw new NullPointerException("builder: " + builder);
    }

    public static abstract class IcmpIdentifiableHeader extends AbstractPacket.AbstractHeader {
        protected static final int ICMP_IDENTIFIABLE_HEADER_SIZE = 4;
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int SEQUENCE_NUMBER_OFFSET = 2;
        private static final int SEQUENCE_NUMBER_SIZE = 2;
        private static final long serialVersionUID = 8141956422232700L;
        private final short identifier;
        private final short sequenceNumber;

        public IcmpIdentifiableHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.identifier = ByteArrays.getShort(bArr, i);
                this.sequenceNumber = ByteArrays.getShort(bArr, i + 2);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ");
            sbA.append(getHeaderName());
            sbA.append("(4 bytes). data: ");
            sbA.append(ByteArrays.toHexString(bArr, " "));
            sbA.append(", offset: ");
            sbA.append(i);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[");
            String property = System.getProperty("line.separator");
            sb.append(getHeaderName());
            sb.append(" (");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Identifier: ");
            sb.append(getIdentifierAsInt());
            sb.append(property);
            sb.append("  SequenceNumber: ");
            return dw1.k(getSequenceNumberAsInt(), property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.identifier) * 31) + this.sequenceNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!getClass().isInstance(obj)) {
                return false;
            }
            IcmpIdentifiableHeader icmpIdentifiableHeader = (IcmpIdentifiableHeader) obj;
            return this.identifier == icmpIdentifiableHeader.identifier && this.sequenceNumber == icmpIdentifiableHeader.sequenceNumber;
        }

        public abstract String getHeaderName();

        public short getIdentifier() {
            return this.identifier;
        }

        public int getIdentifierAsInt() {
            return this.identifier & 65535;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.identifier));
            arrayList.add(ByteArrays.toByteArray(this.sequenceNumber));
            return arrayList;
        }

        public short getSequenceNumber() {
            return this.sequenceNumber;
        }

        public int getSequenceNumberAsInt() {
            return this.sequenceNumber & 65535;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        public IcmpIdentifiableHeader(Builder builder) {
            this.identifier = builder.identifier;
            this.sequenceNumber = builder.sequenceNumber;
        }
    }
}
