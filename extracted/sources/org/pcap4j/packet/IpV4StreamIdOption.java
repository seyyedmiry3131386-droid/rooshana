package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4StreamIdOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -2067863811913941432L;
    private final byte length;
    private final short streamId;
    private final IpV4OptionType type;

    public static final class Builder implements LengthBuilder<IpV4StreamIdOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private short streamId;

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder streamId(short s) {
            this.streamId = s;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV4StreamIdOption build() {
            return new IpV4StreamIdOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV4StreamIdOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV4StreamIdOption ipV4StreamIdOption) {
            this.length = ipV4StreamIdOption.length;
            this.streamId = ipV4StreamIdOption.streamId;
        }
    }

    public static IpV4StreamIdOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV4StreamIdOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV4StreamIdOption.class.isInstance(obj)) {
            return false;
        }
        IpV4StreamIdOption ipV4StreamIdOption = (IpV4StreamIdOption) obj;
        return this.streamId == ipV4StreamIdOption.streamId && this.length == ipV4StreamIdOption.length;
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

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        short s = this.streamId;
        bArr[2] = (byte) (s >> 8);
        bArr[3] = (byte) s;
        return bArr;
    }

    public short getStreamId() {
        return this.streamId;
    }

    public int getStreamIdAsInt() {
        return 65535 & this.streamId;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.streamId;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return 4;
    }

    public String toString() {
        return "[option-type: " + getType() + "] [option-length: " + getLengthAsInt() + " bytes] [streamId: " + getStreamIdAsInt() + "]";
    }

    private IpV4StreamIdOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.type = IpV4OptionType.STREAM_ID;
        if (i2 < 4) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 3. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] == getType().value().byteValue()) {
            int i3 = i + 1;
            byte b = bArr[i3];
            if (b == 4) {
                this.length = b;
                this.streamId = ByteArrays.getShort(bArr, i + 2);
                return;
            } else {
                throw new IllegalRawDataException("Invalid value of length field: " + ((int) bArr[i3]));
            }
        }
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

    private IpV4StreamIdOption(Builder builder) {
        this.type = IpV4OptionType.STREAM_ID;
        if (builder != null) {
            this.streamId = builder.streamId;
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else {
                this.length = (byte) length();
                return;
            }
        }
        throw new NullPointerException("builder: " + builder);
    }
}
