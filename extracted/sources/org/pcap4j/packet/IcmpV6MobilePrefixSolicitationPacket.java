package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public class IcmpV6MobilePrefixSolicitationPacket extends AbstractPacket {
    private static final long serialVersionUID = -6996114480884459960L;
    private final IcmpV6MobilePrefixSolicitationHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private short identifier;
        private short reserved;

        public Builder identifier(short s) {
            this.identifier = s;
            return this;
        }

        public Builder reserved(short s) {
            this.reserved = s;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6MobilePrefixSolicitationPacket build() {
            return new IcmpV6MobilePrefixSolicitationPacket(this);
        }

        private Builder(IcmpV6MobilePrefixSolicitationPacket icmpV6MobilePrefixSolicitationPacket) {
            this.identifier = icmpV6MobilePrefixSolicitationPacket.header.identifier;
            this.reserved = icmpV6MobilePrefixSolicitationPacket.header.reserved;
        }
    }

    public static IcmpV6MobilePrefixSolicitationPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV6MobilePrefixSolicitationPacket(bArr, i, i2);
    }

    public static final class IcmpV6MobilePrefixSolicitationHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_MOBILE_PREFIX_SOLICITATION_HEADER_SIZE = 4;
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int RESERVED_OFFSET = 2;
        private static final int RESERVED_SIZE = 2;
        private static final long serialVersionUID = -2991706817314703570L;
        private final short identifier;
        private final short reserved;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Mobile Prefix Solicitation Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Identifier: ");
            sb.append(getIdentifierAsInt());
            sb.append(property);
            sb.append("  Reserved: ");
            return dw1.k(this.reserved, property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.identifier) * 31) + this.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !IcmpV6MobilePrefixSolicitationHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6MobilePrefixSolicitationHeader icmpV6MobilePrefixSolicitationHeader = (IcmpV6MobilePrefixSolicitationHeader) obj;
            return this.identifier == icmpV6MobilePrefixSolicitationHeader.identifier && this.reserved == icmpV6MobilePrefixSolicitationHeader.reserved;
        }

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
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            return arrayList;
        }

        public short getReserved() {
            return this.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private IcmpV6MobilePrefixSolicitationHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.identifier = ByteArrays.getShort(bArr, i);
                this.reserved = ByteArrays.getShort(bArr, i + 2);
            } else {
                StringBuilder sb = new StringBuilder("The data is too short to build an ICMPv6 Mobile Prefix Solicitation Header(4 bytes). data: ");
                t61.t(i, " ", ", offset: ", sb, bArr);
                sb.append(", length: ");
                sb.append(i2);
                throw new IllegalRawDataException(sb.toString());
            }
        }

        private IcmpV6MobilePrefixSolicitationHeader(Builder builder) {
            this.identifier = builder.identifier;
            this.reserved = builder.reserved;
        }
    }

    private IcmpV6MobilePrefixSolicitationPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV6MobilePrefixSolicitationHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6MobilePrefixSolicitationHeader getHeader() {
        return this.header;
    }

    private IcmpV6MobilePrefixSolicitationPacket(Builder builder) {
        this.header = new IcmpV6MobilePrefixSolicitationHeader(builder);
    }
}
