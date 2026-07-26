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
public final class IcmpV6NeighborAdvertisementPacket extends AbstractPacket {
    private static final long serialVersionUID = 2928161747361401145L;
    private final IcmpV6NeighborAdvertisementHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private boolean overrideFlag;
        private int reserved;
        private boolean routerFlag;
        private boolean solicitedFlag;
        private Inet6Address targetAddress;

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder overrideFlag(boolean z) {
            this.overrideFlag = z;
            return this;
        }

        public Builder reserved(int i) {
            this.reserved = i;
            return this;
        }

        public Builder routerFlag(boolean z) {
            this.routerFlag = z;
            return this;
        }

        public Builder solicitedFlag(boolean z) {
            this.solicitedFlag = z;
            return this;
        }

        public Builder targetAddress(Inet6Address inet6Address) {
            this.targetAddress = inet6Address;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6NeighborAdvertisementPacket build() {
            return new IcmpV6NeighborAdvertisementPacket(this);
        }

        private Builder(IcmpV6NeighborAdvertisementPacket icmpV6NeighborAdvertisementPacket) {
            this.routerFlag = icmpV6NeighborAdvertisementPacket.header.routerFlag;
            this.solicitedFlag = icmpV6NeighborAdvertisementPacket.header.solicitedFlag;
            this.overrideFlag = icmpV6NeighborAdvertisementPacket.header.overrideFlag;
            this.reserved = icmpV6NeighborAdvertisementPacket.header.reserved;
            this.targetAddress = icmpV6NeighborAdvertisementPacket.header.targetAddress;
            this.options = icmpV6NeighborAdvertisementPacket.header.options;
        }
    }

    public static IcmpV6NeighborAdvertisementPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV6NeighborAdvertisementPacket(bArr, i, i2);
    }

    public static final class IcmpV6NeighborAdvertisementHeader extends AbstractPacket.AbstractHeader {
        private static final int OPTIONS_OFFSET = 20;
        private static final int R_S_O_RESERVED_OFFSET = 0;
        private static final int R_S_O_RESERVED_SIZE = 4;
        private static final int TARGET_ADDRESS_OFFSET = 4;
        private static final int TARGET_ADDRESS_SIZE = 16;
        private static final long serialVersionUID = 2755611686067943647L;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final boolean overrideFlag;
        private final int reserved;
        private final boolean routerFlag;
        private final boolean solicitedFlag;
        private final Inet6Address targetAddress;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Neighbor Advertisement Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Router flag: ");
            o40.K(sb, this.routerFlag, property, "  Solicited flag: ");
            o40.K(sb, this.solicitedFlag, property, "  Override flag: ");
            o40.K(sb, this.overrideFlag, property, "  Reserved: ");
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
            return this.options.hashCode() + ((this.targetAddress.hashCode() + ((((((((527 + (this.routerFlag ? 1231 : 1237)) * 31) + (this.solicitedFlag ? 1231 : 1237)) * 31) + (this.overrideFlag ? 1231 : 1237)) * 31) + this.reserved) * 31)) * 31);
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
            if (!IcmpV6NeighborAdvertisementHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6NeighborAdvertisementHeader icmpV6NeighborAdvertisementHeader = (IcmpV6NeighborAdvertisementHeader) obj;
            return this.targetAddress.equals(icmpV6NeighborAdvertisementHeader.targetAddress) && this.routerFlag == icmpV6NeighborAdvertisementHeader.routerFlag && this.solicitedFlag == icmpV6NeighborAdvertisementHeader.solicitedFlag && this.overrideFlag == icmpV6NeighborAdvertisementHeader.overrideFlag && this.reserved == icmpV6NeighborAdvertisementHeader.reserved && this.options.equals(icmpV6NeighborAdvertisementHeader.options);
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        public boolean getOverrideFlag() {
            return this.overrideFlag;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            int i = 536870911 & this.reserved;
            if (this.routerFlag) {
                i |= Integer.MIN_VALUE;
            }
            if (this.solicitedFlag) {
                i |= 1073741824;
            }
            if (this.overrideFlag) {
                i |= 536870912;
            }
            arrayList.add(ByteArrays.toByteArray(i));
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

        public boolean getRouterFlag() {
            return this.routerFlag;
        }

        public boolean getSolicitedFlag() {
            return this.solicitedFlag;
        }

        public Inet6Address getTargetAddress() {
            return this.targetAddress;
        }

        private IcmpV6NeighborAdvertisementHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 20;
            if (i2 >= 20) {
                int i3 = ByteArrays.getInt(bArr, i);
                this.routerFlag = (Integer.MIN_VALUE & i3) != 0;
                this.solicitedFlag = (1073741824 & i3) != 0;
                this.overrideFlag = (536870912 & i3) != 0;
                this.reserved = i3 & 536870911;
                this.targetAddress = ByteArrays.getInet6Address(bArr, i + 4);
                this.options = new ArrayList();
                while (length < i2) {
                    int i4 = length + i;
                    try {
                        IcmpV6CommonPacket.IpV6NeighborDiscoveryOption ipV6NeighborDiscoveryOption = (IcmpV6CommonPacket.IpV6NeighborDiscoveryOption) PacketFactories.getFactory(IcmpV6CommonPacket.IpV6NeighborDiscoveryOption.class, IpV6NeighborDiscoveryOptionType.class).newInstance(bArr, i4, i2 - length, IpV6NeighborDiscoveryOptionType.getInstance(Byte.valueOf(bArr[i4])));
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

        private IcmpV6NeighborAdvertisementHeader(Builder builder) {
            if ((builder.reserved & (-536870912)) == 0) {
                this.routerFlag = builder.routerFlag;
                this.solicitedFlag = builder.solicitedFlag;
                this.overrideFlag = builder.overrideFlag;
                this.reserved = builder.reserved;
                this.targetAddress = builder.targetAddress;
                this.options = new ArrayList(builder.options);
                return;
            }
            throw new IllegalArgumentException("Invalid reserved: " + builder.reserved);
        }
    }

    private IcmpV6NeighborAdvertisementPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV6NeighborAdvertisementHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6NeighborAdvertisementHeader getHeader() {
        return this.header;
    }

    private IcmpV6NeighborAdvertisementPacket(Builder builder) {
        if (builder != null && builder.targetAddress != null && builder.options != null) {
            this.header = new IcmpV6NeighborAdvertisementHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.targetAddress: " + builder.targetAddress + " builder.options: " + builder.options);
    }
}
