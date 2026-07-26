package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import java.net.Inet6Address;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6NeighborDiscoveryPrefixInformationOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int IPV6_NEIGHBOR_DISCOVERY_PREFIX_INFORMATION_OPTION_SIZE = 32;
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int L_A_RESERVED1_OFFSET = 3;
    private static final int L_A_RESERVED1_SIZE = 1;
    private static final int PREFERRED_LIFETIME_OFFSET = 8;
    private static final int PREFERRED_LIFETIME_SIZE = 4;
    private static final int PREFIX_LENGTH_OFFSET = 2;
    private static final int PREFIX_LENGTH_SIZE = 1;
    private static final int PREFIX_OFFSET = 16;
    private static final int PREFIX_SIZE = 16;
    private static final int RESERVED2_OFFSET = 12;
    private static final int RESERVED2_SIZE = 4;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final int VALID_LIFETIME_OFFSET = 4;
    private static final int VALID_LIFETIME_SIZE = 4;
    private static final long serialVersionUID = -1397830548673996516L;
    private final boolean addressConfigurationFlag;
    private final byte length;
    private final boolean onLinkFlag;
    private final int preferredLifetime;
    private final Inet6Address prefix;
    private final byte prefixLength;
    private final byte reserved1;
    private final int reserved2;
    private final IpV6NeighborDiscoveryOptionType type;
    private final int validLifetime;

    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoveryPrefixInformationOption> {
        private boolean addressConfigurationFlag;
        private boolean correctLengthAtBuild;
        private byte length;
        private boolean onLinkFlag;
        private int preferredLifetime;
        private Inet6Address prefix;
        private byte prefixLength;
        private byte reserved1;
        private int reserved2;
        private int validLifetime;

        public Builder addressConfigurationFlag(boolean z) {
            this.addressConfigurationFlag = z;
            return this;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder onLinkFlag(boolean z) {
            this.onLinkFlag = z;
            return this;
        }

        public Builder preferredLifetime(int i) {
            this.preferredLifetime = i;
            return this;
        }

        public Builder prefix(Inet6Address inet6Address) {
            this.prefix = inet6Address;
            return this;
        }

        public Builder prefixLength(byte b) {
            this.prefixLength = b;
            return this;
        }

        public Builder reserved1(byte b) {
            this.reserved1 = b;
            return this;
        }

        public Builder reserved2(int i) {
            this.reserved2 = i;
            return this;
        }

        public Builder validLifetime(int i) {
            this.validLifetime = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoveryPrefixInformationOption build() {
            return new IpV6NeighborDiscoveryPrefixInformationOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoveryPrefixInformationOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV6NeighborDiscoveryPrefixInformationOption ipV6NeighborDiscoveryPrefixInformationOption) {
            this.length = ipV6NeighborDiscoveryPrefixInformationOption.length;
            this.prefixLength = ipV6NeighborDiscoveryPrefixInformationOption.prefixLength;
            this.onLinkFlag = ipV6NeighborDiscoveryPrefixInformationOption.onLinkFlag;
            this.addressConfigurationFlag = ipV6NeighborDiscoveryPrefixInformationOption.addressConfigurationFlag;
            this.reserved1 = ipV6NeighborDiscoveryPrefixInformationOption.reserved1;
            this.validLifetime = ipV6NeighborDiscoveryPrefixInformationOption.validLifetime;
            this.preferredLifetime = ipV6NeighborDiscoveryPrefixInformationOption.preferredLifetime;
            this.reserved2 = ipV6NeighborDiscoveryPrefixInformationOption.reserved2;
            this.prefix = ipV6NeighborDiscoveryPrefixInformationOption.prefix;
        }
    }

    public static IpV6NeighborDiscoveryPrefixInformationOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6NeighborDiscoveryPrefixInformationOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoveryPrefixInformationOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoveryPrefixInformationOption ipV6NeighborDiscoveryPrefixInformationOption = (IpV6NeighborDiscoveryPrefixInformationOption) obj;
        return this.prefix.equals(ipV6NeighborDiscoveryPrefixInformationOption.prefix) && this.prefixLength == ipV6NeighborDiscoveryPrefixInformationOption.prefixLength && this.validLifetime == ipV6NeighborDiscoveryPrefixInformationOption.validLifetime && this.preferredLifetime == ipV6NeighborDiscoveryPrefixInformationOption.preferredLifetime && this.onLinkFlag == ipV6NeighborDiscoveryPrefixInformationOption.onLinkFlag && this.addressConfigurationFlag == ipV6NeighborDiscoveryPrefixInformationOption.addressConfigurationFlag && this.reserved1 == ipV6NeighborDiscoveryPrefixInformationOption.reserved1 && this.reserved2 == ipV6NeighborDiscoveryPrefixInformationOption.reserved2 && this.length == ipV6NeighborDiscoveryPrefixInformationOption.length;
    }

    public boolean getAddressConfigurationFlag() {
        return this.addressConfigurationFlag;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public boolean getOnLinkFlag() {
        return this.onLinkFlag;
    }

    public int getPreferredLifetime() {
        return this.preferredLifetime;
    }

    public long getPreferredLifetimeAsLong() {
        return ((long) this.preferredLifetime) & 4294967295L;
    }

    public Inet6Address getPrefix() {
        return this.prefix;
    }

    public byte getPrefixLength() {
        return this.prefixLength;
    }

    public int getPrefixLengthAsInt() {
        return this.prefixLength & 255;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.prefixLength;
        byte b = (byte) (this.reserved1 & 63);
        bArr[3] = b;
        if (this.onLinkFlag) {
            bArr[3] = (byte) (b | 128);
        }
        if (this.addressConfigurationFlag) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        System.arraycopy(ByteArrays.toByteArray(this.validLifetime), 0, bArr, 4, 4);
        System.arraycopy(ByteArrays.toByteArray(this.preferredLifetime), 0, bArr, 8, 4);
        System.arraycopy(ByteArrays.toByteArray(this.reserved2), 0, bArr, 12, 4);
        System.arraycopy(ByteArrays.toByteArray(this.prefix), 0, bArr, 16, 16);
        return bArr;
    }

    public byte getReserved1() {
        return this.reserved1;
    }

    public int getReserved2() {
        return this.reserved2;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int getValidLifetime() {
        return this.validLifetime;
    }

    public long getValidLifetimeAsLong() {
        return ((long) this.validLifetime) & 4294967295L;
    }

    public int hashCode() {
        return this.prefix.hashCode() + ((((((((((((((((527 + this.length) * 31) + this.prefixLength) * 31) + (this.onLinkFlag ? 1231 : 1237)) * 31) + (this.addressConfigurationFlag ? 1231 : 1237)) * 31) + this.reserved1) * 31) + this.validLifetime) * 31) + this.preferredLifetime) * 31) + this.reserved2) * 31);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return 32;
    }

    public String toString() {
        return "[Type: " + getType() + "] [Length: " + getLengthAsInt() + " (" + (getLengthAsInt() * 8) + " bytes)] [Prefix Length: " + getPrefixLengthAsInt() + "] [on-link flag: " + getOnLinkFlag() + "] [address-configuration flag: " + getAddressConfigurationFlag() + "] [Reserved1: " + ((int) getReserved1()) + "] [Valid Lifetime: " + getValidLifetimeAsLong() + "] [Preferred Lifetime: " + getPreferredLifetimeAsLong() + "] [Reserved2: " + getReserved2() + "] [Prefix: " + getPrefix() + "]";
    }

    private IpV6NeighborDiscoveryPrefixInformationOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.type = IpV6NeighborDiscoveryOptionType.PREFIX_INFORMATION;
        if (i2 < 32) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 31. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] != getType().value().byteValue()) {
            StringBuilder sbA2 = o40.A(100, "The type must be: ");
            sbA2.append(getType().valueAsString());
            sbA2.append(" rawData: ");
            sbA2.append(ByteArrays.toHexString(bArr, " "));
            sbA2.append(", offset: ");
            sbA2.append(i);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        this.length = bArr[i + 1];
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt * 8 != 32) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "Invalid value of length field: "));
        }
        this.prefixLength = ByteArrays.getByte(bArr, i + 2);
        byte b = ByteArrays.getByte(bArr, i + 3);
        this.onLinkFlag = (b & 128) != 0;
        this.addressConfigurationFlag = (b & 64) != 0;
        this.reserved1 = (byte) (b & 63);
        this.validLifetime = ByteArrays.getInt(bArr, i + 4);
        this.preferredLifetime = ByteArrays.getInt(bArr, i + 8);
        this.reserved2 = ByteArrays.getInt(bArr, i + 12);
        this.prefix = ByteArrays.getInet6Address(bArr, i + 16);
    }

    private IpV6NeighborDiscoveryPrefixInformationOption(Builder builder) {
        this.type = IpV6NeighborDiscoveryOptionType.PREFIX_INFORMATION;
        if (builder != null && builder.prefix != null) {
            if ((builder.reserved1 & 192) == 0) {
                this.prefixLength = builder.prefixLength;
                this.onLinkFlag = builder.onLinkFlag;
                this.addressConfigurationFlag = builder.addressConfigurationFlag;
                this.reserved1 = builder.reserved1;
                this.validLifetime = builder.validLifetime;
                this.preferredLifetime = builder.preferredLifetime;
                this.reserved2 = builder.reserved2;
                this.prefix = builder.prefix;
                if (!builder.correctLengthAtBuild) {
                    this.length = builder.length;
                    return;
                } else {
                    this.length = (byte) (length() / 8);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid reserved1: " + ((int) builder.reserved1));
        }
        throw new NullPointerException("builder: " + builder + " builder.prefix: " + builder.prefix);
    }
}
