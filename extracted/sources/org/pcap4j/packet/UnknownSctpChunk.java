package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.namednumber.SctpChunkType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownSctpChunk implements SctpPacket.SctpChunk {
    private static final long serialVersionUID = 2870805088630768174L;
    private final byte flags;
    private final short length;
    private final byte[] padding;
    private final SctpChunkType type;
    private final byte[] value;

    public static final class Builder implements LengthBuilder<UnknownSctpChunk> {
        private boolean correctLengthAtBuild;
        private byte flags;
        private short length;
        private byte[] padding;
        private boolean paddingAtBuild;
        private SctpChunkType type;
        private byte[] value;

        public Builder flags(byte b) {
            this.flags = b;
            return this;
        }

        public Builder length(short s) {
            this.length = s;
            return this;
        }

        public Builder padding(byte[] bArr) {
            this.padding = bArr;
            return this;
        }

        public Builder paddingAtBuild(boolean z) {
            this.paddingAtBuild = z;
            return this;
        }

        public Builder type(SctpChunkType sctpChunkType) {
            this.type = sctpChunkType;
            return this;
        }

        public Builder value(byte[] bArr) {
            this.value = bArr;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownSctpChunk build() {
            return new UnknownSctpChunk(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownSctpChunk> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(UnknownSctpChunk unknownSctpChunk) {
            this.type = unknownSctpChunk.type;
            this.flags = unknownSctpChunk.flags;
            this.length = unknownSctpChunk.length;
            this.value = unknownSctpChunk.value;
            this.padding = unknownSctpChunk.padding;
        }
    }

    public static UnknownSctpChunk newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownSctpChunk(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UnknownSctpChunk.class != obj.getClass()) {
            return false;
        }
        UnknownSctpChunk unknownSctpChunk = (UnknownSctpChunk) obj;
        return this.flags == unknownSctpChunk.flags && this.length == unknownSctpChunk.length && Arrays.equals(this.padding, unknownSctpChunk.padding) && this.type.equals(unknownSctpChunk.type) && Arrays.equals(this.value, unknownSctpChunk.value);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getFlags() {
        return this.flags;
    }

    public short getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return 65535 & this.length;
    }

    public byte[] getPadding() {
        return ByteArrays.clone(this.padding);
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.flags;
        short s = this.length;
        bArr[2] = (byte) (s >> 8);
        bArr[3] = (byte) s;
        byte[] bArr2 = this.value;
        if (bArr2.length != 0) {
            System.arraycopy(bArr2, 0, bArr, 4, bArr2.length);
        }
        byte[] bArr3 = this.padding;
        if (bArr3.length != 0) {
            System.arraycopy(bArr3, 0, bArr, this.value.length + 4, bArr3.length);
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public SctpChunkType getType() {
        return this.type;
    }

    public byte[] getValue() {
        return ByteArrays.clone(this.value);
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + ((this.type.hashCode() + ((Arrays.hashCode(this.padding) + ((((this.flags + 31) * 31) + this.length) * 31)) * 31)) * 31);
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public int length() {
        return this.value.length + 4 + this.padding.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Type: ");
        sb.append(this.type);
        sb.append(", Flags: 0x");
        sb.append(ByteArrays.toHexString(this.flags, " "));
        sb.append(", Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        if (this.value.length != 0) {
            sb.append(", Value: 0x");
            sb.append(ByteArrays.toHexString(this.value, ""));
        }
        if (this.padding.length != 0) {
            sb.append(", Padding: 0x");
            sb.append(ByteArrays.toHexString(this.padding, ""));
        }
        sb.append("]");
        return sb.toString();
    }

    private UnknownSctpChunk(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 4) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 3. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.type = SctpChunkType.getInstance(Byte.valueOf(bArr[i]));
        this.flags = bArr[i + 1];
        this.length = ByteArrays.getShort(bArr, i + 2);
        int lengthAsInt = getLengthAsInt();
        if (i2 < lengthAsInt) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("The raw data is too short to build this option (");
            sb.append(lengthAsInt);
            sb.append("). data: ");
            t61.t(i, " ", ", offset: ", sb, bArr);
            sb.append(", length: ");
            sb.append(i2);
            throw new IllegalRawDataException(sb.toString());
        }
        if (lengthAsInt < 4) {
            StringBuilder sbA2 = o40.A(100, "The value of the length field must be more than 3. data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        if (lengthAsInt <= 4) {
            this.value = new byte[0];
            this.padding = new byte[0];
            return;
        }
        this.value = ByteArrays.getSubArray(bArr, i + 4, lengthAsInt - 4);
        int i3 = 4 - (lengthAsInt % 4);
        if (i3 == 0 || i3 == 4 || i2 < lengthAsInt + i3) {
            this.padding = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[i3];
        this.padding = bArr2;
        System.arraycopy(bArr, lengthAsInt + i, bArr2, 0, i3);
    }

    private UnknownSctpChunk(Builder builder) {
        if (builder != null && builder.type != null) {
            if (builder.value.length + 4 <= 65535) {
                this.type = builder.type;
                this.flags = builder.flags;
                if (builder.value != null) {
                    this.value = ByteArrays.clone(builder.value);
                } else {
                    this.value = new byte[0];
                }
                if (!builder.correctLengthAtBuild) {
                    this.length = builder.length;
                } else {
                    this.length = (short) (this.value.length + 4);
                }
                if (!builder.paddingAtBuild) {
                    if (builder.padding != null) {
                        this.padding = ByteArrays.clone(builder.padding);
                        return;
                    } else {
                        this.padding = new byte[0];
                        return;
                    }
                }
                int length = 4 - ((this.value.length + 4) % 4);
                if (length != 0 && length != 4) {
                    this.padding = new byte[length];
                    return;
                } else {
                    this.padding = new byte[0];
                    return;
                }
            }
            throw new IllegalArgumentException("(value.length + 4) must be less than or equal to 0xFFFF. builder.value: " + ByteArrays.toHexString(builder.value, " "));
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type);
    }
}
