package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpWindowScaleOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -1755743386204601523L;
    private final TcpOptionKind kind;
    private final byte length;
    private final byte shiftCount;

    public static final class Builder implements LengthBuilder<TcpWindowScaleOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private byte shiftCount;

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder shiftCount(byte b) {
            this.shiftCount = b;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpWindowScaleOption build() {
            return new TcpWindowScaleOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpWindowScaleOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(TcpWindowScaleOption tcpWindowScaleOption) {
            this.length = tcpWindowScaleOption.length;
            this.shiftCount = tcpWindowScaleOption.shiftCount;
        }
    }

    public static TcpWindowScaleOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new TcpWindowScaleOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!TcpWindowScaleOption.class.isInstance(obj)) {
            return false;
        }
        TcpWindowScaleOption tcpWindowScaleOption = (TcpWindowScaleOption) obj;
        return this.length == tcpWindowScaleOption.length && this.shiftCount == tcpWindowScaleOption.shiftCount;
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

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.kind.value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.shiftCount;
        return bArr;
    }

    public byte getShiftCount() {
        return this.shiftCount;
    }

    public int getShiftCountAsInt() {
        return this.shiftCount & 255;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.shiftCount;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 3;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Length: " + getLengthAsInt() + " bytes] [Shift Count: " + getShiftCountAsInt() + "]";
    }

    private TcpWindowScaleOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        TcpOptionKind tcpOptionKind = TcpOptionKind.WINDOW_SCALE;
        this.kind = tcpOptionKind;
        if (i2 < 3) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 2. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] == tcpOptionKind.value().byteValue()) {
            byte b = bArr[i + 1];
            this.length = b;
            if (b != 3) {
                throw new IllegalRawDataException(rm7.n(b, "The value of length field must be 3 but: "));
            }
            this.shiftCount = bArr[i + 2];
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

    private TcpWindowScaleOption(Builder builder) {
        this.kind = TcpOptionKind.WINDOW_SCALE;
        if (builder != null) {
            this.shiftCount = builder.shiftCount;
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
