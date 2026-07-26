package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownIpV6NeighborDiscoveryOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final long serialVersionUID = -5097068268518944469L;
    private final byte[] data;
    private final byte length;
    private final IpV6NeighborDiscoveryOptionType type;

    public static final class Builder implements LengthBuilder<UnknownIpV6NeighborDiscoveryOption> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte length;
        private IpV6NeighborDiscoveryOptionType type;

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder type(IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType) {
            this.type = ipV6NeighborDiscoveryOptionType;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownIpV6NeighborDiscoveryOption build() {
            return new UnknownIpV6NeighborDiscoveryOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownIpV6NeighborDiscoveryOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(UnknownIpV6NeighborDiscoveryOption unknownIpV6NeighborDiscoveryOption) {
            this.type = unknownIpV6NeighborDiscoveryOption.type;
            this.length = unknownIpV6NeighborDiscoveryOption.length;
            this.data = unknownIpV6NeighborDiscoveryOption.data;
        }
    }

    public static UnknownIpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownIpV6NeighborDiscoveryOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!UnknownIpV6NeighborDiscoveryOption.class.isInstance(obj)) {
            return false;
        }
        UnknownIpV6NeighborDiscoveryOption unknownIpV6NeighborDiscoveryOption = (UnknownIpV6NeighborDiscoveryOption) obj;
        return this.type.equals(unknownIpV6NeighborDiscoveryOption.type) && this.length == unknownIpV6NeighborDiscoveryOption.length && Arrays.equals(this.data, unknownIpV6NeighborDiscoveryOption.data);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getData() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.length;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + ((((this.type.hashCode() + 527) * 31) + this.length) * 31);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Type: ");
        sb.append(this.type);
        sb.append("] [Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes] [Data: 0x");
        return t61.m(this.data, "", sb, "]");
    }

    private UnknownIpV6NeighborDiscoveryOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.type = IpV6NeighborDiscoveryOptionType.getInstance(Byte.valueOf(bArr[i]));
        byte b = bArr[i + 1];
        this.length = b;
        if (i2 >= b * 8) {
            this.data = ByteArrays.getSubArray(bArr, i + 2, (b * 8) - 2);
            return;
        }
        StringBuilder sbA2 = o40.A(100, "The raw data is too short to build this option(");
        sbA2.append(b * 8);
        sbA2.append("). data: ");
        t61.t(i, " ", ", offset: ", sbA2, bArr);
        sbA2.append(", length: ");
        sbA2.append(i2);
        throw new IllegalRawDataException(sbA2.toString());
    }

    private UnknownIpV6NeighborDiscoveryOption(Builder builder) {
        if (builder != null && builder.type != null && builder.data != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.data.length];
            this.data = bArr;
            System.arraycopy(builder.data, 0, bArr, 0, builder.data.length);
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else {
                this.length = (byte) length();
                return;
            }
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.data: " + builder.data);
    }
}
