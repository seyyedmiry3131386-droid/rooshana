package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpMaximumSegmentSizeOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = 7552907605220130850L;
    private final TcpOptionKind kind;
    private final byte length;
    private final short maxSegSize;

    public static final class Builder implements LengthBuilder<TcpMaximumSegmentSizeOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private short maxSegSize;

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder maxSegSize(short s) {
            this.maxSegSize = s;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpMaximumSegmentSizeOption build() {
            return new TcpMaximumSegmentSizeOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpMaximumSegmentSizeOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption) {
            this.length = tcpMaximumSegmentSizeOption.length;
            this.maxSegSize = tcpMaximumSegmentSizeOption.maxSegSize;
        }
    }

    public static TcpMaximumSegmentSizeOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new TcpMaximumSegmentSizeOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!TcpMaximumSegmentSizeOption.class.isInstance(obj)) {
            return false;
        }
        TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption = (TcpMaximumSegmentSizeOption) obj;
        return this.length == tcpMaximumSegmentSizeOption.length && this.maxSegSize == tcpMaximumSegmentSizeOption.maxSegSize;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return this.kind;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public short getMaxSegSize() {
        return this.maxSegSize;
    }

    public int getMaxSegSizeAsInt() {
        return 65535 & this.maxSegSize;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.kind.value().byteValue();
        bArr[1] = this.length;
        short s = this.maxSegSize;
        bArr[2] = (byte) (s >> 8);
        bArr[3] = (byte) s;
        return bArr;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.maxSegSize;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 4;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Length: " + getLengthAsInt() + " bytes] [Maximum Segment Size: " + getMaxSegSizeAsInt() + " bytes]";
    }

    private TcpMaximumSegmentSizeOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        TcpOptionKind tcpOptionKind = TcpOptionKind.MAXIMUM_SEGMENT_SIZE;
        this.kind = tcpOptionKind;
        if (i2 < 4) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 3. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] == tcpOptionKind.value().byteValue()) {
            byte b = bArr[i + 1];
            this.length = b;
            if (b != 4) {
                throw new IllegalRawDataException(rm7.n(b, "Invalid value of length field: "));
            }
            this.maxSegSize = ByteArrays.getShort(bArr, i + 2);
            return;
        }
        StringBuilder sbA2 = o40.A(100, "The kind must be: ");
        sbA2.append(tcpOptionKind.valueAsString());
        sbA2.append(" rawData: ");
        sbA2.append(ByteArrays.toHexString(bArr, " "));
        sbA2.append(", offset: ");
        sbA2.append(i);
        sbA2.append(", length: ");
        sbA2.append(i2);
        throw new IllegalRawDataException(sbA2.toString());
    }

    private TcpMaximumSegmentSizeOption(Builder builder) {
        this.kind = TcpOptionKind.MAXIMUM_SEGMENT_SIZE;
        if (builder != null) {
            this.maxSegSize = builder.maxSegSize;
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
