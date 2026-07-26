package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownIpV6Option implements IpV6ExtOptionsPacket.IpV6Option {
    private static final long serialVersionUID = -2090004757469984967L;
    private final byte[] data;
    private final byte dataLen;
    private final IpV6OptionType type;

    public static final class Builder implements LengthBuilder<UnknownIpV6Option> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte dataLen;
        private IpV6OptionType type;

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder dataLen(byte b) {
            this.dataLen = b;
            return this;
        }

        public Builder type(IpV6OptionType ipV6OptionType) {
            this.type = ipV6OptionType;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownIpV6Option build() {
            return new UnknownIpV6Option(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownIpV6Option> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(UnknownIpV6Option unknownIpV6Option) {
            this.type = unknownIpV6Option.type;
            this.dataLen = unknownIpV6Option.dataLen;
            this.data = unknownIpV6Option.data;
        }
    }

    public static UnknownIpV6Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownIpV6Option(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!UnknownIpV6Option.class.isInstance(obj)) {
            return false;
        }
        UnknownIpV6Option unknownIpV6Option = (UnknownIpV6Option) obj;
        return this.type.equals(unknownIpV6Option.type) && this.dataLen == unknownIpV6Option.dataLen && Arrays.equals(this.data, unknownIpV6Option.data);
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

    public byte getDataLen() {
        return this.dataLen;
    }

    public int getDataLenAsInt() {
        return this.dataLen & 255;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.dataLen;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public IpV6OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + ((((this.type.hashCode() + 527) * 31) + this.dataLen) * 31);
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Option Type: ");
        sb.append(this.type);
        sb.append("] [Option Data Len: ");
        sb.append(getDataLenAsInt());
        sb.append(" bytes] [Option Data: 0x");
        return t61.m(this.data, "", sb, "]");
    }

    private UnknownIpV6Option(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.type = IpV6OptionType.getInstance(Byte.valueOf(bArr[i]));
        byte b = bArr[i + 1];
        this.dataLen = b;
        if (i2 - 2 >= b) {
            this.data = ByteArrays.getSubArray(bArr, i + 2, b);
            return;
        }
        StringBuilder sbA2 = o40.A(100, "The raw data is too short to build this option(");
        sbA2.append(b + 2);
        sbA2.append("). data: ");
        t61.t(i, " ", ", offset: ", sbA2, bArr);
        sbA2.append(", length: ");
        sbA2.append(i2);
        throw new IllegalRawDataException(sbA2.toString());
    }

    private UnknownIpV6Option(Builder builder) {
        if (builder != null && builder.type != null && builder.data != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.data.length];
            this.data = bArr;
            System.arraycopy(builder.data, 0, bArr, 0, builder.data.length);
            if (!builder.correctLengthAtBuild) {
                this.dataLen = builder.dataLen;
                return;
            } else {
                this.dataLen = (byte) bArr.length;
                return;
            }
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.data: " + builder.data);
    }
}
