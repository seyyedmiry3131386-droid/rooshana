package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV6NeighborSolicitationPacket extends AbstractPacket {
    private static final long serialVersionUID = 1178892836174110046L;
    private final IcmpV6NeighborSolicitationHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private int reserved;
        private Inet6Address targetAddress;

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder reserved(int i) {
            this.reserved = i;
            return this;
        }

        public Builder targetAddress(Inet6Address inet6Address) {
            this.targetAddress = inet6Address;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6NeighborSolicitationPacket build() {
            return new IcmpV6NeighborSolicitationPacket(this);
        }

        private Builder(IcmpV6NeighborSolicitationPacket icmpV6NeighborSolicitationPacket) {
            this.reserved = icmpV6NeighborSolicitationPacket.header.reserved;
            this.targetAddress = icmpV6NeighborSolicitationPacket.header.targetAddress;
            this.options = icmpV6NeighborSolicitationPacket.header.options;
        }
    }

    public static IcmpV6NeighborSolicitationPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV6NeighborSolicitationPacket(bArr, i, i2);
    }

    public static final class IcmpV6NeighborSolicitationHeader extends AbstractPacket.AbstractHeader {
        private static final int OPTIONS_OFFSET = 20;
        private static final int RESERVED_OFFSET = 0;
        private static final int RESERVED_SIZE = 4;
        private static final int TARGET_ADDRESS_OFFSET = 4;
        private static final int TARGET_ADDRESS_SIZE = 16;
        private static final long serialVersionUID = -2707375708511831386L;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final int reserved;
        private final Inet6Address targetAddress;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Neighbor Solicitation Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Reserved: ");
            sb.append(this.reserved);
            sb.append(property);
            sb.append("  Target Address: ");
            sb.append(this.targetAddress);
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
            return this.options.hashCode() + ((this.targetAddress.hashCode() + ((527 + this.reserved) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length + 20;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IcmpV6NeighborSolicitationHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6NeighborSolicitationHeader icmpV6NeighborSolicitationHeader = (IcmpV6NeighborSolicitationHeader) obj;
            return this.targetAddress.equals(icmpV6NeighborSolicitationHeader.targetAddress) && this.reserved == icmpV6NeighborSolicitationHeader.reserved && this.options.equals(icmpV6NeighborSolicitationHeader.options);
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            arrayList.add(ByteArrays.toByteArray(this.targetAddress));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getReserved() {
            return this.reserved;
        }

        public Inet6Address getTargetAddress() {
            return this.targetAddress;
        }

        private IcmpV6NeighborSolicitationHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 20;
            if (i2 >= 20) {
                this.reserved = ByteArrays.getInt(bArr, i);
                this.targetAddress = ByteArrays.getInet6Address(bArr, i + 4);
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
            StringBuilder sbA = o40.A(120, "The raw data must be more than 19bytes to build this header. raw data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV6NeighborSolicitationHeader(Builder builder) {
            this.reserved = builder.reserved;
            this.targetAddress = builder.targetAddress;
            this.options = new ArrayList(builder.options);
        }
    }

    private IcmpV6NeighborSolicitationPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV6NeighborSolicitationHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6NeighborSolicitationHeader getHeader() {
        return this.header;
    }

    private IcmpV6NeighborSolicitationPacket(Builder builder) {
        if (builder != null && builder.targetAddress != null && builder.options != null) {
            this.header = new IcmpV6NeighborSolicitationHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.targetAddress: " + builder.targetAddress + " builder.options: " + builder.options);
    }
}
