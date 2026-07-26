package org.pcap4j.packet;

import defpackage.t61;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public class IcmpV6HomeAgentAddressDiscoveryReplyPacket extends AbstractPacket {
    private static final long serialVersionUID = 8080366373921919970L;
    private final IcmpV6HomeAgentAddressDiscoveryReplyHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<Inet6Address> homeAgentAddresses;
        private short identifier;
        private short reserved;

        public Builder homeAgentAddresses(List<Inet6Address> list) {
            this.homeAgentAddresses = list;
            return this;
        }

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
        public IcmpV6HomeAgentAddressDiscoveryReplyPacket build() {
            return new IcmpV6HomeAgentAddressDiscoveryReplyPacket(this);
        }

        private Builder(IcmpV6HomeAgentAddressDiscoveryReplyPacket icmpV6HomeAgentAddressDiscoveryReplyPacket) {
            this.identifier = icmpV6HomeAgentAddressDiscoveryReplyPacket.header.identifier;
            this.reserved = icmpV6HomeAgentAddressDiscoveryReplyPacket.header.reserved;
            this.homeAgentAddresses = icmpV6HomeAgentAddressDiscoveryReplyPacket.header.homeAgentAddresses;
        }
    }

    public static IcmpV6HomeAgentAddressDiscoveryReplyPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV6HomeAgentAddressDiscoveryReplyPacket(bArr, i, i2);
    }

    public static final class IcmpV6HomeAgentAddressDiscoveryReplyHeader extends AbstractPacket.AbstractHeader {
        private static final int HOME_AGENT_ADDRESSES_OFFSET = 4;
        private static final int HOME_AGENT_ADDRESSES_SIZE = 16;
        private static final int ICMPV6_HOME_AGENT_ADDRESS_DISCOVERY_REPLY_HEADER_MIN_SIZE = 20;
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int RESERVED_OFFSET = 2;
        private static final int RESERVED_SIZE = 2;
        private static final long serialVersionUID = 7184228144196703852L;
        private final List<Inet6Address> homeAgentAddresses;
        private final short identifier;
        private final short reserved;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Home Agent Address Discovery Reply Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Identifier: ");
            sb.append(getIdentifierAsInt());
            sb.append(property);
            sb.append("  Reserved: ");
            sb.append((int) this.reserved);
            sb.append(property);
            for (Inet6Address inet6Address : this.homeAgentAddresses) {
                sb.append("  HomeAgentAddress: ");
                sb.append(inet6Address);
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.homeAgentAddresses.hashCode() + ((((527 + this.identifier) * 31) + this.reserved) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return (this.homeAgentAddresses.size() * 16) + 4;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !IcmpV6HomeAgentAddressDiscoveryReplyHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6HomeAgentAddressDiscoveryReplyHeader icmpV6HomeAgentAddressDiscoveryReplyHeader = (IcmpV6HomeAgentAddressDiscoveryReplyHeader) obj;
            return this.identifier == icmpV6HomeAgentAddressDiscoveryReplyHeader.identifier && this.reserved == icmpV6HomeAgentAddressDiscoveryReplyHeader.reserved && this.homeAgentAddresses.equals(icmpV6HomeAgentAddressDiscoveryReplyHeader.homeAgentAddresses);
        }

        public List<Inet6Address> getHomeAgentAddresses() {
            return new ArrayList(this.homeAgentAddresses);
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
            Iterator<Inet6Address> it = this.homeAgentAddresses.iterator();
            while (it.hasNext()) {
                arrayList.add(ByteArrays.toByteArray(it.next()));
            }
            return arrayList;
        }

        public short getReserved() {
            return this.reserved;
        }

        private IcmpV6HomeAgentAddressDiscoveryReplyHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 20) {
                this.identifier = ByteArrays.getShort(bArr, i);
                this.reserved = ByteArrays.getShort(bArr, i + 2);
                this.homeAgentAddresses = new ArrayList();
                for (int i3 = 4; i3 < i2; i3 += 16) {
                    this.homeAgentAddresses.add(ByteArrays.getInet6Address(bArr, i3 + i));
                }
                return;
            }
            StringBuilder sb = new StringBuilder("The data is too short to build an ICMPv6 Home Agent Address Discovery Reply Header(20 bytes). data: ");
            t61.t(i, " ", ", offset: ", sb, bArr);
            sb.append(", length: ");
            sb.append(i2);
            throw new IllegalRawDataException(sb.toString());
        }

        private IcmpV6HomeAgentAddressDiscoveryReplyHeader(Builder builder) {
            this.identifier = builder.identifier;
            this.reserved = builder.reserved;
            if (builder.homeAgentAddresses != null) {
                this.homeAgentAddresses = new ArrayList(builder.homeAgentAddresses);
            } else {
                this.homeAgentAddresses = new ArrayList(0);
            }
        }
    }

    private IcmpV6HomeAgentAddressDiscoveryReplyPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV6HomeAgentAddressDiscoveryReplyHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6HomeAgentAddressDiscoveryReplyHeader getHeader() {
        return this.header;
    }

    private IcmpV6HomeAgentAddressDiscoveryReplyPacket(Builder builder) {
        this.header = new IcmpV6HomeAgentAddressDiscoveryReplyHeader(builder);
    }
}
