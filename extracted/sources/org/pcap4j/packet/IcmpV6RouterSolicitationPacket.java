package org.pcap4j.packet;

import defpackage.o40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV6RouterSolicitationPacket extends AbstractPacket {
    private static final long serialVersionUID = -8012525256314872386L;
    private final IcmpV6RouterSolicitationHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private int reserved;

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder reserved(int i) {
            this.reserved = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6RouterSolicitationPacket build() {
            return new IcmpV6RouterSolicitationPacket(this);
        }

        private Builder(IcmpV6RouterSolicitationPacket icmpV6RouterSolicitationPacket) {
            this.reserved = icmpV6RouterSolicitationPacket.header.reserved;
            this.options = icmpV6RouterSolicitationPacket.header.options;
        }
    }

    public static IcmpV6RouterSolicitationPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV6RouterSolicitationPacket(bArr, i, i2);
    }

    public static final class IcmpV6RouterSolicitationHeader extends AbstractPacket.AbstractHeader {
        private static final int OPTIONS_OFFSET = 4;
        private static final int RESERVED_OFFSET = 0;
        private static final int RESERVED_SIZE = 4;
        private static final long serialVersionUID = -6091118158605916309L;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final int reserved;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Router Solicitation Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Reserved: ");
            sb.append(this.reserved);
            sb.append(property);
            for (IcmpV6CommonPacket.IpV6NeighborDiscoveryOption ipV6NeighborDiscoveryOption : this.options) {
                sb.append("  Option: ");
                sb.append(ipV6NeighborDiscoveryOption);
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.options.hashCode() + ((527 + this.reserved) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length + 4;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IcmpV6RouterSolicitationHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6RouterSolicitationHeader icmpV6RouterSolicitationHeader = (IcmpV6RouterSolicitationHeader) obj;
            return this.reserved == icmpV6RouterSolicitationHeader.reserved && this.options.equals(icmpV6RouterSolicitationHeader.options);
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getReserved() {
            return this.reserved;
        }

        private IcmpV6RouterSolicitationHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 4;
            if (i2 >= 4) {
                this.reserved = ByteArrays.getInt(bArr, i);
                this.options = new ArrayList();
                while (length < i2) {
                    int i3 = length + i;
                    try {
                        IcmpV6CommonPacket.IpV6NeighborDiscoveryOption ipV6NeighborDiscoveryOption = (IcmpV6CommonPacket.IpV6NeighborDiscoveryOption) PacketFactories.getFactory(IcmpV6CommonPacket.IpV6NeighborDiscoveryOption.class, IpV6NeighborDiscoveryOptionType.class).newInstance(bArr, i3, i2 - length, IpV6NeighborDiscoveryOptionType.getInstance(Byte.valueOf(bArr[i3])));
                        this.options.add(ipV6NeighborDiscoveryOption);
                        length += ipV6NeighborDiscoveryOption.length();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            StringBuilder sbA = o40.A(120, "The raw data must be more than 3bytes to build this header. raw data: ");
            sbA.append(ByteArrays.toHexString(bArr, " "));
            sbA.append(", offset: ");
            sbA.append(i);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV6RouterSolicitationHeader(Builder builder) {
            this.reserved = builder.reserved;
            this.options = new ArrayList(builder.options);
        }
    }

    private IcmpV6RouterSolicitationPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV6RouterSolicitationHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6RouterSolicitationHeader getHeader() {
        return this.header;
    }

    private IcmpV6RouterSolicitationPacket(Builder builder) {
        if (builder != null && builder.options != null) {
            this.header = new IcmpV6RouterSolicitationHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.options: " + builder.options);
    }
}
