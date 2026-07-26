package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.namednumber.SctpChunkType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalSctpChunk implements SctpPacket.SctpChunk {
    private static final long serialVersionUID = 7163848436153227901L;
    private final byte[] rawData;
    private final SctpChunkType type;

    public static final class Builder {
        private byte[] rawData;
        private SctpChunkType type;

        public IllegalSctpChunk build() {
            return new IllegalSctpChunk(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder type(SctpChunkType sctpChunkType) {
            this.type = sctpChunkType;
            return this;
        }

        public Builder() {
        }

        private Builder(IllegalSctpChunk illegalSctpChunk) {
            this.type = illegalSctpChunk.type;
            this.rawData = illegalSctpChunk.rawData;
        }
    }

    public static IllegalSctpChunk newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IllegalSctpChunk(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IllegalSctpChunk.class != obj.getClass()) {
            return false;
        }
        IllegalSctpChunk illegalSctpChunk = (IllegalSctpChunk) obj;
        return Arrays.equals(this.rawData, illegalSctpChunk.rawData) && this.type.equals(illegalSctpChunk.type);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public SctpChunkType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + ((Arrays.hashCode(this.rawData) + 31) * 31);
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Type: ");
        sb.append(this.type);
        sb.append(", Illegal Raw Data: 0x");
        return t61.m(this.rawData, "", sb, "]");
    }

    private IllegalSctpChunk(byte[] bArr, int i, int i2) {
        this.type = SctpChunkType.getInstance(Byte.valueOf(bArr[i]));
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    private IllegalSctpChunk(Builder builder) {
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
