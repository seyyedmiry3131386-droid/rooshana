package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalIpV6Option implements IpV6ExtOptionsPacket.IpV6Option {
    private static final long serialVersionUID = -1186786850549984010L;
    private final byte[] rawData;
    private final IpV6OptionType type;

    public static final class Builder {
        private byte[] rawData;
        private IpV6OptionType type;

        public IllegalIpV6Option build() {
            return new IllegalIpV6Option(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder type(IpV6OptionType ipV6OptionType) {
            this.type = ipV6OptionType;
            return this;
        }

        public Builder() {
        }

        private Builder(IllegalIpV6Option illegalIpV6Option) {
            this.type = illegalIpV6Option.type;
            this.rawData = illegalIpV6Option.rawData;
        }
    }

    public static IllegalIpV6Option newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IllegalIpV6Option(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IllegalIpV6Option.class.isInstance(obj)) {
            return false;
        }
        IllegalIpV6Option illegalIpV6Option = (IllegalIpV6Option) obj;
        return this.type.equals(illegalIpV6Option.type) && Arrays.equals(illegalIpV6Option.rawData, this.rawData);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public IpV6OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData) + ((this.type.hashCode() + 527) * 31);
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Option Type: ");
        sb.append(this.type);
        sb.append("] [Illegal Raw Data: 0x");
        return t61.m(this.rawData, "", sb, "]");
    }

    private IllegalIpV6Option(byte[] bArr, int i, int i2) {
        this.type = IpV6OptionType.getInstance(Byte.valueOf(bArr[i]));
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    private IllegalIpV6Option(Builder builder) {
        if (builder != null && builder.type != null && builder.rawData != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.optionType: " + builder.type + " builder.rawData: " + builder.rawData);
    }
}
