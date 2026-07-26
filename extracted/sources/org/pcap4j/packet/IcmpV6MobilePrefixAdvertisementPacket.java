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
public class IcmpV6MobilePrefixAdvertisementPacket extends AbstractPacket {
    private static final long serialVersionUID = 7088081805293115326L;
    private final IcmpV6MobilePrefixAdvertisementHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private short identifier;
        private boolean managedAddressConfigurationFlag;
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private boolean otherStatefulConfigurationFlag;
        private short reserved;

        public Builder identifier(short s) {
            this.identifier = s;
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

        public Builder otherStatefulConfigurationFlag(boolean z) {
            this.otherStatefulConfigurationFlag = z;
            return this;
        }

        public Builder reserved(short s) {
            this.reserved = s;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6MobilePrefixAdvertisementPacket build() {
            return new IcmpV6MobilePrefixAdvertisementPacket(this);
        }

        private Builder(IcmpV6MobilePrefixAdvertisementPacket icmpV6MobilePrefixAdvertisementPacket) {
            this.identifier = icmpV6MobilePrefixAdvertisementPacket.header.identifier;
            this.managedAddressConfigurationFlag = icmpV6MobilePrefixAdvertisementPacket.header.managedAddressConfigurationFlag;
            this.otherStatefulConfigurationFlag = icmpV6MobilePrefixAdvertisementPacket.header.otherStatefulConfigurationFlag;
            this.reserved = icmpV6MobilePrefixAdvertisementPacket.header.reserved;
            this.options = icmpV6MobilePrefixAdvertisementPacket.header.options;
        }
    }

    public static IcmpV6MobilePrefixAdvertisementPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV6MobilePrefixAdvertisementPacket(bArr, i, i2);
    }

    public static final class IcmpV6MobilePrefixAdvertisementHeader extends AbstractPacket.AbstractHeader {
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int M_O_RESERVED_OFFSET = 2;
        private static final int M_O_RESERVED_SIZE = 2;
        private static final int OPTIONS_OFFSET = 4;
        private static final long serialVersionUID = -7395581536162987036L;
        private final short identifier;
        private final boolean managedAddressConfigurationFlag;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final boolean otherStatefulConfigurationFlag;
        private final short reserved;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Mobile Prefix Advertisement Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Identifier: ");
            sb.append(getIdentifierAsInt());
            sb.append(property);
            sb.append("  ManagedAddressConfigurationFlag: ");
            o40.K(sb, this.managedAddressConfigurationFlag, property, "  OtherStatefulConfigurationFlag: ");
            o40.K(sb, this.otherStatefulConfigurationFlag, property, "  Reserved: ");
            sb.append((int) this.reserved);
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
            return this.options.hashCode() + ((((((((527 + this.identifier) * 31) + (this.managedAddressConfigurationFlag ? 1231 : 1237)) * 31) + (this.otherStatefulConfigurationFlag ? 1231 : 1237)) * 31) + this.reserved) * 31);
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
            if (obj == null || !IcmpV6MobilePrefixAdvertisementHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6MobilePrefixAdvertisementHeader icmpV6MobilePrefixAdvertisementHeader = (IcmpV6MobilePrefixAdvertisementHeader) obj;
            return this.identifier == icmpV6MobilePrefixAdvertisementHeader.identifier && this.managedAddressConfigurationFlag == icmpV6MobilePrefixAdvertisementHeader.managedAddressConfigurationFlag && this.otherStatefulConfigurationFlag == icmpV6MobilePrefixAdvertisementHeader.otherStatefulConfigurationFlag && this.reserved == icmpV6MobilePrefixAdvertisementHeader.reserved && this.options.equals(icmpV6MobilePrefixAdvertisementHeader.options);
        }

        public short getIdentifier() {
            return this.identifier;
        }

        public int getIdentifierAsInt() {
            return this.identifier & 65535;
        }

        public boolean getManagedAddressConfigurationFlag() {
            return this.managedAddressConfigurationFlag;
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        public boolean getOtherStatefulConfigurationFlag() {
            return this.otherStatefulConfigurationFlag;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.identifier));
            short s = (short) (this.reserved & 16383);
            if (this.managedAddressConfigurationFlag) {
                s = (short) (s | Short.MIN_VALUE);
            }
            if (this.otherStatefulConfigurationFlag) {
                s = (short) (s | 16384);
            }
            arrayList.add(ByteArrays.toByteArray(s));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public short getReserved() {
            return this.reserved;
        }

        private IcmpV6MobilePrefixAdvertisementHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 4;
            if (i2 >= 4) {
                this.identifier = ByteArrays.getShort(bArr, i);
                short s = ByteArrays.getShort(bArr, i + 2);
                this.managedAddressConfigurationFlag = (Short.MIN_VALUE & s) != 0;
                this.otherStatefulConfigurationFlag = (s & 16384) != 0;
                this.reserved = (short) (s & 16383);
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
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV6MobilePrefixAdvertisementHeader(Builder builder) {
            if ((builder.reserved & 49152) == 0) {
                this.identifier = builder.identifier;
                this.managedAddressConfigurationFlag = builder.managedAddressConfigurationFlag;
                this.otherStatefulConfigurationFlag = builder.otherStatefulConfigurationFlag;
                this.reserved = builder.reserved;
                if (builder.options != null) {
                    this.options = new ArrayList(builder.options);
                    return;
                } else {
                    this.options = new ArrayList(0);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid reserved: " + ((int) builder.reserved));
        }
    }

    private IcmpV6MobilePrefixAdvertisementPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV6MobilePrefixAdvertisementHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6MobilePrefixAdvertisementHeader getHeader() {
        return this.header;
    }

    private IcmpV6MobilePrefixAdvertisementPacket(Builder builder) {
        this.header = new IcmpV6MobilePrefixAdvertisementHeader(builder);
    }
}
