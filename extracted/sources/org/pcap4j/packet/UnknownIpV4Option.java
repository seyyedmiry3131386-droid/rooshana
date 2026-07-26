package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownIpV4Option implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = 5843622351774970021L;
    private final byte[] data;
    private final byte length;
    private final IpV4OptionType type;

    public static final class Builder implements LengthBuilder<UnknownIpV4Option> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte length;
        private IpV4OptionType type;

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder type(IpV4OptionType ipV4OptionType) {
            this.type = ipV4OptionType;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownIpV4Option build() {
            return new UnknownIpV4Option(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownIpV4Option> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(UnknownIpV4Option unknownIpV4Option) {
            this.type = unknownIpV4Option.type;
            this.length = unknownIpV4Option.length;
            this.data = unknownIpV4Option.data;
        }
    }

    public static UnknownIpV4Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownIpV4Option(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!UnknownIpV4Option.class.isInstance(obj)) {
            return false;
        }
        UnknownIpV4Option unknownIpV4Option = (UnknownIpV4Option) obj;
        return this.type.equals(unknownIpV4Option.type) && this.length == unknownIpV4Option.length && Arrays.equals(this.data, unknownIpV4Option.data);
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

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.length;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + ((((this.type.hashCode() + 527) * 31) + this.length) * 31);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[option-type: ");
        sb.append(this.type);
        sb.append("] [option-length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes] [option-data: 0x");
        return t61.m(this.data, "", sb, "]");
    }

    private UnknownIpV4Option(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.type = IpV4OptionType.getInstance(Byte.valueOf(bArr[i]));
        this.length = bArr[i + 1];
        int lengthAsInt = getLengthAsInt();
        if (i2 >= lengthAsInt) {
            this.data = ByteArrays.getSubArray(bArr, i + 2, lengthAsInt - 2);
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("The raw data is too short to build this option (");
        sb.append(lengthAsInt);
        sb.append("). data: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        throw new IllegalRawDataException(sb.toString());
    }

    private UnknownIpV4Option(Builder builder) {
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
