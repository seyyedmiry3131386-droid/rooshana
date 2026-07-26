package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6NeighborDiscoverySourceLinkLayerAddressOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int LINK_LAYER_ADDRESS_OFFSET = 2;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final long serialVersionUID = 6088528399845741741L;
    private final byte length;
    private final byte[] linkLayerAddress;
    private final IpV6NeighborDiscoveryOptionType type;

    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoverySourceLinkLayerAddressOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private byte[] linkLayerAddress;

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder linkLayerAddress(byte[] bArr) {
            this.linkLayerAddress = bArr;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoverySourceLinkLayerAddressOption build() {
            return new IpV6NeighborDiscoverySourceLinkLayerAddressOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoverySourceLinkLayerAddressOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV6NeighborDiscoverySourceLinkLayerAddressOption ipV6NeighborDiscoverySourceLinkLayerAddressOption) {
            this.length = ipV6NeighborDiscoverySourceLinkLayerAddressOption.length;
            this.linkLayerAddress = ipV6NeighborDiscoverySourceLinkLayerAddressOption.linkLayerAddress;
        }
    }

    public static IpV6NeighborDiscoverySourceLinkLayerAddressOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6NeighborDiscoverySourceLinkLayerAddressOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoverySourceLinkLayerAddressOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoverySourceLinkLayerAddressOption ipV6NeighborDiscoverySourceLinkLayerAddressOption = (IpV6NeighborDiscoverySourceLinkLayerAddressOption) obj;
        return this.length == ipV6NeighborDiscoverySourceLinkLayerAddressOption.length && Arrays.equals(this.linkLayerAddress, ipV6NeighborDiscoverySourceLinkLayerAddressOption.linkLayerAddress);
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

    public byte[] getLinkLayerAddress() {
        byte[] bArr = this.linkLayerAddress;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public MacAddress getLinkLayerAddressAsMacAddress() {
        return MacAddress.getByAddress(this.linkLayerAddress);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        byte[] bArr2 = this.linkLayerAddress;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.linkLayerAddress) + ((527 + this.length) * 31);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return this.linkLayerAddress.length + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Type: ");
        sb.append(getType());
        sb.append("] [Length: ");
        sb.append(getLengthAsInt());
        sb.append(" (");
        sb.append(getLengthAsInt() * 8);
        sb.append(" bytes)] [linkLayerAddress: ");
        return t61.m(this.linkLayerAddress, " ", sb, "]");
    }

    private IpV6NeighborDiscoverySourceLinkLayerAddressOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.type = IpV6NeighborDiscoveryOptionType.SOURCE_LINK_LAYER_ADDRESS;
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
        byte b = bArr[i + 1];
        this.length = b;
        int lengthAsInt = getLengthAsInt() * 8;
        if (i2 >= lengthAsInt) {
            if (b == 0) {
                throw new IllegalRawDataException("The length field value must not be zero.");
            }
            this.linkLayerAddress = ByteArrays.getSubArray(bArr, i + 2, lengthAsInt - 2);
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("The raw data is too short to build this option. ");
        sb.append(lengthAsInt);
        sb.append(" bytes data is needed. data: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        throw new IllegalRawDataException(sb.toString());
    }

    private IpV6NeighborDiscoverySourceLinkLayerAddressOption(Builder builder) {
        this.type = IpV6NeighborDiscoveryOptionType.SOURCE_LINK_LAYER_ADDRESS;
        if (builder != null && builder.linkLayerAddress != null) {
            byte[] bArr = new byte[builder.linkLayerAddress.length];
            this.linkLayerAddress = bArr;
            System.arraycopy(builder.linkLayerAddress, 0, bArr, 0, builder.linkLayerAddress.length);
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else if (length() % 8 == 0) {
                this.length = (byte) (length() / 8);
                return;
            } else {
                throw new IllegalArgumentException("linkLayerAddress's length is invalid. linkLayerAddress: " + ByteArrays.toHexString(bArr, " "));
            }
        }
        throw new NullPointerException("builder: " + builder + " builder.linkLayerAddress: " + builder.linkLayerAddress);
    }
}
