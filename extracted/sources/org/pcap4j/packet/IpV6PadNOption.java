package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6PadNOption implements IpV6ExtOptionsPacket.IpV6Option {
    private static final long serialVersionUID = 2182260121605325195L;
    private static final IpV6OptionType type = IpV6OptionType.getInstance((byte) 1);
    private final byte[] data;
    private final byte dataLen;

    public static final class Builder implements LengthBuilder<IpV6PadNOption> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte dataLen;

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder dataLen(byte b) {
            this.dataLen = b;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6PadNOption build() {
            return new IpV6PadNOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6PadNOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV6PadNOption ipV6PadNOption) {
            this.dataLen = ipV6PadNOption.dataLen;
            this.data = ipV6PadNOption.data;
        }
    }

    public static IpV6PadNOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6PadNOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV6PadNOption.class.isInstance(obj)) {
            return false;
        }
        IpV6PadNOption ipV6PadNOption = (IpV6PadNOption) obj;
        return this.dataLen == ipV6PadNOption.dataLen && Arrays.equals(this.data, ipV6PadNOption.data);
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
        bArr[0] = type.value().byteValue();
        bArr[1] = this.dataLen;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public IpV6OptionType getType() {
        return type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) * 31;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Option Type: ");
        sb.append(type);
        sb.append("] [Option Data Len: ");
        sb.append(getDataLenAsInt());
        sb.append(" bytes] [Option Data: 0x");
        return t61.m(this.data, "", sb, "]");
    }

    private IpV6PadNOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        IpV6OptionType ipV6OptionType = type;
        if (b != ipV6OptionType.value().byteValue()) {
            StringBuilder sbA2 = o40.A(100, "The type must be: ");
            sbA2.append(ipV6OptionType.valueAsString());
            sbA2.append(" rawData: ");
            sbA2.append(ByteArrays.toHexString(bArr, " "));
            sbA2.append(", offset: ");
            sbA2.append(i);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        this.dataLen = bArr[i + 1];
        int dataLenAsInt = getDataLenAsInt();
        if (dataLenAsInt <= i2 - 2) {
            this.data = ByteArrays.getSubArray(bArr, i + 2, dataLenAsInt);
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("rawData is too short. dataLen field: ");
        sb.append(dataLenAsInt);
        sb.append(", rawData: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        throw new IllegalRawDataException(sb.toString());
    }

    private IpV6PadNOption(Builder builder) {
        if (builder != null && builder.data != null) {
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
        throw new NullPointerException("builder: " + builder + " builder.data: " + builder.data);
    }
}
