package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalIpV4Option implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -5887663161675479542L;
    private final byte[] rawData;
    private final IpV4OptionType type;

    public static final class Builder {
        private byte[] rawData;
        private IpV4OptionType type;

        public IllegalIpV4Option build() {
            return new IllegalIpV4Option(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder type(IpV4OptionType ipV4OptionType) {
            this.type = ipV4OptionType;
            return this;
        }

        public Builder() {
        }

        private Builder(IllegalIpV4Option illegalIpV4Option) {
            this.type = illegalIpV4Option.type;
            this.rawData = illegalIpV4Option.rawData;
        }
    }

    public static IllegalIpV4Option newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IllegalIpV4Option(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IllegalIpV4Option.class.isInstance(obj)) {
            return false;
        }
        IllegalIpV4Option illegalIpV4Option = (IllegalIpV4Option) obj;
        return this.type.equals(illegalIpV4Option.type) && Arrays.equals(illegalIpV4Option.rawData, this.rawData);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData) + ((this.type.hashCode() + 527) * 31);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[option-type: ");
        sb.append(this.type);
        sb.append("] [Illegal Raw Data: 0x");
        return t61.m(this.rawData, "", sb, "]");
    }

    private IllegalIpV4Option(byte[] bArr, int i, int i2) {
        this.type = IpV4OptionType.getInstance(Byte.valueOf(bArr[i]));
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    private IllegalIpV4Option(Builder builder) {
        if (builder != null && builder.type != null && builder.rawData != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.rawData: " + builder.rawData);
    }
}
