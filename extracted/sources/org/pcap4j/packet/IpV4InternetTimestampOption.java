package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import java.io.Serializable;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV4InternetTimestampOptionFlag;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4InternetTimestampOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -7218329498227977405L;
    private final IpV4InternetTimestampOptionData data;
    private final IpV4InternetTimestampOptionFlag flag;
    private final byte length;
    private final byte overflow;
    private final byte pointer;
    private final IpV4OptionType type;

    public static final class Builder implements LengthBuilder<IpV4InternetTimestampOption> {
        private boolean correctLengthAtBuild;
        private IpV4InternetTimestampOptionData data;
        private IpV4InternetTimestampOptionFlag flag;
        private byte length;
        private byte overflow;
        private byte pointer;

        public Builder data(IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData) {
            this.data = ipV4InternetTimestampOptionData;
            return this;
        }

        public Builder flag(IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag) {
            this.flag = ipV4InternetTimestampOptionFlag;
            return this;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder overflow(byte b) {
            this.overflow = b;
            return this;
        }

        public Builder pointer(byte b) {
            this.pointer = b;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV4InternetTimestampOption build() {
            return new IpV4InternetTimestampOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV4InternetTimestampOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV4InternetTimestampOption ipV4InternetTimestampOption) {
            this.length = ipV4InternetTimestampOption.length;
            this.pointer = ipV4InternetTimestampOption.pointer;
            this.overflow = ipV4InternetTimestampOption.overflow;
            this.flag = ipV4InternetTimestampOption.flag;
            this.data = ipV4InternetTimestampOption.data;
        }
    }

    public interface IpV4InternetTimestampOptionData extends Serializable {
        byte[] getRawData();

        int length();
    }

    public static IpV4InternetTimestampOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV4InternetTimestampOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV4InternetTimestampOption.class.isInstance(obj)) {
            return false;
        }
        IpV4InternetTimestampOption ipV4InternetTimestampOption = (IpV4InternetTimestampOption) obj;
        if (this.length != ipV4InternetTimestampOption.length || this.pointer != ipV4InternetTimestampOption.pointer || this.overflow != ipV4InternetTimestampOption.overflow || !this.flag.equals(ipV4InternetTimestampOption.flag)) {
            return false;
        }
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        return ipV4InternetTimestampOptionData == null ? ipV4InternetTimestampOption.data == null : ipV4InternetTimestampOptionData.equals(ipV4InternetTimestampOption.data);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public IpV4InternetTimestampOptionData getData() {
        return this.data;
    }

    public IpV4InternetTimestampOptionFlag getFlag() {
        return this.flag;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public byte getOverflow() {
        return this.overflow;
    }

    public int getOverflowAsInt() {
        return this.overflow & 255;
    }

    public byte getPointer() {
        return this.pointer;
    }

    public int getPointerAsInt() {
        return this.pointer & 255;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.pointer;
        byte bByteValue = this.flag.value().byteValue();
        bArr[3] = bByteValue;
        bArr[3] = (byte) (bByteValue | (this.overflow << 4));
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        if (ipV4InternetTimestampOptionData != null) {
            System.arraycopy(ipV4InternetTimestampOptionData.getRawData(), 0, bArr, 4, this.data.length());
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.flag.hashCode() + ((((((527 + this.length) * 31) + this.pointer) * 31) + this.overflow) * 31);
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        if (ipV4InternetTimestampOptionData == null) {
            return iHashCode;
        }
        return ipV4InternetTimestampOptionData.hashCode() + (iHashCode * 31);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        return (ipV4InternetTimestampOptionData != null ? ipV4InternetTimestampOptionData.length() : 0) + 4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[option-type: ");
        sb.append(getType());
        sb.append("] [option-length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes] [pointer: ");
        sb.append(getPointerAsInt());
        sb.append("] [overflow: ");
        sb.append(getOverflowAsInt());
        sb.append("] [flag: ");
        sb.append(this.flag);
        sb.append("]");
        if (this.data != null) {
            sb.append(" [data: ");
            sb.append(this.data);
            sb.append("]");
        }
        return sb.toString();
    }

    private IpV4InternetTimestampOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.type = IpV4OptionType.INTERNET_TIMESTAMP;
        if (i2 < 4) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 3. rawData: ");
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
        if (i2 < lengthAsInt) {
            StringBuilder sbA3 = o40.A(100, "The raw data is too short to build this option(");
            sbA3.append(getLengthAsInt());
            sbA3.append("). data: ");
            sbA3.append(ByteArrays.toHexString(bArr, " "));
            sbA3.append(", offset: ");
            sbA3.append(i);
            sbA3.append(", length: ");
            sbA3.append(i2);
            throw new IllegalRawDataException(sbA3.toString());
        }
        if (lengthAsInt < 4) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("The length field value must be equal or more than 4 but it is: ");
            sb.append(lengthAsInt);
            throw new IllegalRawDataException(sb.toString());
        }
        if (lengthAsInt % 4 != 0) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "Invalid length for this option: "));
        }
        this.pointer = bArr[i + 2];
        byte b = bArr[i + 3];
        this.overflow = (byte) ((b & 240) >> 4);
        IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag = IpV4InternetTimestampOptionFlag.getInstance(Byte.valueOf((byte) (b & 15)));
        this.flag = ipV4InternetTimestampOptionFlag;
        if (lengthAsInt > 4) {
            this.data = (IpV4InternetTimestampOptionData) PacketFactories.getFactory(IpV4InternetTimestampOptionData.class, IpV4InternetTimestampOptionFlag.class).newInstance(bArr, i + 4, lengthAsInt - 4, ipV4InternetTimestampOptionFlag);
        } else {
            this.data = null;
        }
    }

    private IpV4InternetTimestampOption(Builder builder) {
        this.type = IpV4OptionType.INTERNET_TIMESTAMP;
        if (builder != null && builder.flag != null) {
            this.pointer = builder.pointer;
            this.overflow = builder.overflow;
            this.flag = builder.flag;
            this.data = builder.data;
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else {
                this.length = (byte) length();
                return;
            }
        }
        throw new NullPointerException("builder: " + builder + " builder.flag: " + builder.flag);
    }
}
