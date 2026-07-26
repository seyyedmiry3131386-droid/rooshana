package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV6RouterAdvertisementPacket extends AbstractPacket {
    private static final long serialVersionUID = -537286641023282344L;
    private final IcmpV6RouterAdvertisementHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private byte curHopLimit;
        private boolean managedAddressConfigurationFlag;
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private boolean otherConfigurationFlag;
        private int reachableTime;
        private byte reserved;
        private int retransTimer;
        private short routerLifetime;

        public Builder curHopLimit(byte b) {
            this.curHopLimit = b;
            return this;
        }

        public Builder managedAddressConfigurationFlag(boolean z) {
            this.managedAddressConfigurationFlag = z;
            return this;
        }

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder otherConfigurationFlag(boolean z) {
            this.otherConfigurationFlag = z;
            return this;
        }

        public Builder reachableTime(int i) {
            this.reachableTime = i;
            return this;
        }

        public Builder reserved(byte b) {
            this.reserved = b;
            return this;
        }

        public Builder retransTimer(int i) {
            this.retransTimer = i;
            return this;
        }

        public Builder routerLifetime(short s) {
            this.routerLifetime = s;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6RouterAdvertisementPacket build() {
            return new IcmpV6RouterAdvertisementPacket(this);
        }

        private Builder(IcmpV6RouterAdvertisementPacket icmpV6RouterAdvertisementPacket) {
            this.curHopLimit = icmpV6RouterAdvertisementPacket.header.curHopLimit;
            this.managedAddressConfigurationFlag = icmpV6RouterAdvertisementPacket.header.managedAddressConfigurationFlag;
            this.otherConfigurationFlag = icmpV6RouterAdvertisementPacket.header.otherConfigurationFlag;
            this.reserved = icmpV6RouterAdvertisementPacket.header.reserved;
            this.routerLifetime = icmpV6RouterAdvertisementPacket.header.routerLifetime;
            this.reachableTime = icmpV6RouterAdvertisementPacket.header.reachableTime;
            this.retransTimer = icmpV6RouterAdvertisementPacket.header.retransTimer;
            this.options = icmpV6RouterAdvertisementPacket.header.options;
        }
    }

    public static IcmpV6RouterAdvertisementPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV6RouterAdvertisementPacket(bArr, i, i2);
    }

    public static final class IcmpV6RouterAdvertisementHeader extends AbstractPacket.AbstractHeader {
        private static final int CUR_HOP_LIMIT_OFFSET = 0;
        private static final int CUR_HOP_LIMIT_SIZE = 1;
        private static final int M_O_RESERVED_OFFSET = 1;
        private static final int M_O_RESERVED_SIZE = 1;
        private static final int OPTIONS_OFFSET = 12;
        private static final int REACHABLE_TIME_OFFSET = 4;
        private static final int REACHABLE_TIME_SIZE = 4;
        private static final int RETRANS_TIMER_OFFSET = 8;
        private static final int RETRANS_TIMER_SIZE = 4;
        private static final int ROUTER_LIFETIME_OFFSET = 2;
        private static final int ROUTER_LIFETIME_SIZE = 2;
        private static final long serialVersionUID = -3300835116087515662L;
        private final byte curHopLimit;
        private final boolean managedAddressConfigurationFlag;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final boolean otherConfigurationFlag;
        private final int reachableTime;
        private final byte reserved;
        private final int retransTimer;
        private final short routerLifetime;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Router Advertisement Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Cur Hop Limit: ");
            sb.append(getCurHopLimitAsInt());
            sb.append(property);
            sb.append("  Managed address configuration flag: ");
            o40.K(sb, this.managedAddressConfigurationFlag, property, "  Other configuration flag: ");
            o40.K(sb, this.otherConfigurationFlag, property, "  Reserved: ");
            sb.append((int) this.reserved);
            sb.append(property);
            sb.append("  Router Lifetime: ");
            sb.append(getRouterLifetimeAsInt());
            sb.append(property);
            sb.append("  Reachable Time: ");
            sb.append(getReachableTimeAsLong());
            sb.append(property);
            sb.append("  Retrans Timer: ");
            sb.append(getRetransTimerAsLong());
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
            return this.options.hashCode() + ((((((((((((((527 + this.curHopLimit) * 31) + (this.managedAddressConfigurationFlag ? 1231 : 1237)) * 31) + (this.otherConfigurationFlag ? 1231 : 1237)) * 31) + this.reserved) * 31) + this.routerLifetime) * 31) + this.reachableTime) * 31) + this.retransTimer) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length + 12;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IcmpV6RouterAdvertisementHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6RouterAdvertisementHeader icmpV6RouterAdvertisementHeader = (IcmpV6RouterAdvertisementHeader) obj;
            return this.routerLifetime == icmpV6RouterAdvertisementHeader.routerLifetime && this.reachableTime == icmpV6RouterAdvertisementHeader.reachableTime && this.retransTimer == icmpV6RouterAdvertisementHeader.retransTimer && this.curHopLimit == icmpV6RouterAdvertisementHeader.curHopLimit && this.managedAddressConfigurationFlag == icmpV6RouterAdvertisementHeader.managedAddressConfigurationFlag && this.otherConfigurationFlag == icmpV6RouterAdvertisementHeader.otherConfigurationFlag && this.reserved == icmpV6RouterAdvertisementHeader.reserved && this.options.equals(icmpV6RouterAdvertisementHeader.options);
        }

        public byte getCurHopLimit() {
            return this.curHopLimit;
        }

        public int getCurHopLimitAsInt() {
            return this.curHopLimit & 255;
        }

        public boolean getManagedAddressConfigurationFlag() {
            return this.managedAddressConfigurationFlag;
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        public boolean getOtherConfigurationFlag() {
            return this.otherConfigurationFlag;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.curHopLimit));
            byte b = (byte) (this.reserved & 63);
            if (this.managedAddressConfigurationFlag) {
                b = (byte) (b | 128);
            }
            if (this.otherConfigurationFlag) {
                b = (byte) (b | 64);
            }
            arrayList.add(new byte[]{b});
            arrayList.add(ByteArrays.toByteArray(this.routerLifetime));
            arrayList.add(ByteArrays.toByteArray(this.reachableTime));
            arrayList.add(ByteArrays.toByteArray(this.retransTimer));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getReachableTime() {
            return this.reachableTime;
        }

        public long getReachableTimeAsLong() {
            return ((long) this.reachableTime) & 4294967295L;
        }

        public int getReserved() {
            return this.reserved;
        }

        public int getRetransTimer() {
            return this.retransTimer;
        }

        public long getRetransTimerAsLong() {
            return ((long) this.retransTimer) & 4294967295L;
        }

        public short getRouterLifetime() {
            return this.routerLifetime;
        }

        public int getRouterLifetimeAsInt() {
            return this.routerLifetime & 65535;
        }

        private IcmpV6RouterAdvertisementHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 12;
            if (i2 >= 12) {
                this.curHopLimit = ByteArrays.getByte(bArr, i);
                byte b = ByteArrays.getByte(bArr, i + 1);
                this.managedAddressConfigurationFlag = (b & 128) != 0;
                this.otherConfigurationFlag = (b & 64) != 0;
                this.reserved = (byte) (b & 63);
                this.routerLifetime = ByteArrays.getShort(bArr, i + 2);
                this.reachableTime = ByteArrays.getInt(bArr, i + 4);
                this.retransTimer = ByteArrays.getInt(bArr, i + 8);
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
            StringBuilder sbA = o40.A(120, "The raw data must be more than 11bytes to build this header. raw data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV6RouterAdvertisementHeader(Builder builder) {
            if ((builder.reserved & 192) == 0) {
                this.curHopLimit = builder.curHopLimit;
                this.managedAddressConfigurationFlag = builder.managedAddressConfigurationFlag;
                this.otherConfigurationFlag = builder.otherConfigurationFlag;
                this.reserved = builder.reserved;
                this.routerLifetime = builder.routerLifetime;
                this.reachableTime = builder.reachableTime;
                this.retransTimer = builder.retransTimer;
                this.options = new ArrayList(builder.options);
                return;
            }
            throw new IllegalArgumentException("Invalid reserved: " + ((int) builder.reserved));
        }
    }

    private IcmpV6RouterAdvertisementPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV6RouterAdvertisementHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6RouterAdvertisementHeader getHeader() {
        return this.header;
    }

    private IcmpV6RouterAdvertisementPacket(Builder builder) {
        if (builder != null && builder.options != null) {
            this.header = new IcmpV6RouterAdvertisementHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.options: " + builder.options);
    }
}
