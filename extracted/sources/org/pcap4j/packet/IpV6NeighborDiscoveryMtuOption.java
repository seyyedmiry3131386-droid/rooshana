package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6NeighborDiscoveryMtuOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int IPV6_NEIGHBOR_DISCOVERY_MTU_OPTION_SIZE = 8;
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int MTU_OFFSET = 4;
    private static final int MTU_SIZE = 4;
    private static final int RESERVED_OFFSET = 2;
    private static final int RESERVED_SIZE = 2;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final long serialVersionUID = 4145831782727036195L;
    private final byte length;
    private final int mtu;
    private final short reserved;
    private final IpV6NeighborDiscoveryOptionType type;

    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoveryMtuOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private int mtu;
        private short reserved;

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder mtu(int i) {
            this.mtu = i;
            return this;
        }

        public Builder reserved(short s) {
            this.reserved = s;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoveryMtuOption build() {
            return new IpV6NeighborDiscoveryMtuOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoveryMtuOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV6NeighborDiscoveryMtuOption ipV6NeighborDiscoveryMtuOption) {
            this.length = ipV6NeighborDiscoveryMtuOption.length;
            this.reserved = ipV6NeighborDiscoveryMtuOption.reserved;
            this.mtu = ipV6NeighborDiscoveryMtuOption.mtu;
        }
    }

    public static IpV6NeighborDiscoveryMtuOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6NeighborDiscoveryMtuOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoveryMtuOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoveryMtuOption ipV6NeighborDiscoveryMtuOption = (IpV6NeighborDiscoveryMtuOption) obj;
        return this.mtu == ipV6NeighborDiscoveryMtuOption.mtu && this.length == ipV6NeighborDiscoveryMtuOption.length && this.reserved == ipV6NeighborDiscoveryMtuOption.reserved;
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

    public int getMtu() {
        return this.mtu;
    }

    public long getMtuAsLong() {
        return ((long) this.mtu) & 4294967295L;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        System.arraycopy(ByteArrays.toByteArray(this.reserved), 0, bArr, 2, 2);
        System.arraycopy(ByteArrays.toByteArray(this.mtu), 0, bArr, 4, 4);
        return bArr;
    }

    public short getReserved() {
        return this.reserved;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((527 + this.length) * 31) + this.reserved) * 31) + this.mtu;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return 8;
    }

    public String toString() {
        return "[Type: " + getType() + "] [Length: " + getLengthAsInt() + " (" + (getLengthAsInt() * 8) + " bytes)] [Reserved: " + ((int) this.reserved) + "] [MTU: " + getMtuAsLong() + "]";
    }

    private IpV6NeighborDiscoveryMtuOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.type = IpV6NeighborDiscoveryOptionType.MTU;
        if (i2 < 8) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 7. rawData: ");
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
        if (lengthAsInt * 8 == 8) {
            this.reserved = ByteArrays.getShort(bArr, i + 2);
            this.mtu = ByteArrays.getInt(bArr, i + 4);
        } else {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Illegal value in the length field: ");
            sb.append(lengthAsInt);
            throw new IllegalRawDataException(sb.toString());
        }
    }

    private IpV6NeighborDiscoveryMtuOption(Builder builder) {
        this.type = IpV6NeighborDiscoveryOptionType.MTU;
        if (builder != null) {
            this.reserved = builder.reserved;
            this.mtu = builder.mtu;
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else {
                this.length = (byte) (length() / 8);
                return;
            }
        }
        throw new NullPointerException("builder: " + builder);
    }
}
