package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownTcpOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -893085251311518110L;
    private final byte[] data;
    private final TcpOptionKind kind;
    private final byte length;

    public static final class Builder implements LengthBuilder<UnknownTcpOption> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private TcpOptionKind kind;
        private byte length;

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder kind(TcpOptionKind tcpOptionKind) {
            this.kind = tcpOptionKind;
            return this;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownTcpOption build() {
            return new UnknownTcpOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownTcpOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(UnknownTcpOption unknownTcpOption) {
            this.kind = unknownTcpOption.kind;
            this.length = unknownTcpOption.length;
            this.data = unknownTcpOption.data;
        }
    }

    public static UnknownTcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownTcpOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!UnknownTcpOption.class.isInstance(obj)) {
            return false;
        }
        UnknownTcpOption unknownTcpOption = (UnknownTcpOption) obj;
        return this.kind.equals(unknownTcpOption.kind) && this.length == unknownTcpOption.length && Arrays.equals(this.data, unknownTcpOption.data);
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
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + ((((this.kind.hashCode() + 527) * 31) + this.length) * 31);
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Kind: ");
        sb.append(this.kind);
        sb.append("] [Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes] [Data: 0x");
        return t61.m(this.data, "", sb, "]");
    }

    private UnknownTcpOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.kind = TcpOptionKind.getInstance(Byte.valueOf(bArr[i]));
        byte b = bArr[i + 1];
        this.length = b;
        if (i2 >= b) {
            if (b > 2) {
                this.data = ByteArrays.getSubArray(bArr, i + 2, b - 2);
                return;
            } else {
                this.data = new byte[0];
                return;
            }
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("The raw data is too short to build this option(");
        sb.append((int) b);
        sb.append("). data: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        throw new IllegalRawDataException(sb.toString());
    }

    private UnknownTcpOption(Builder builder) {
        if (builder != null && builder.kind != null && builder.data != null) {
            this.kind = builder.kind;
            byte[] bArr = new byte[builder.data.length];
            this.data = bArr;
            System.arraycopy(builder.data, 0, bArr, 0, builder.data.length);
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else {
                this.length = (byte) length();
                return;
            }
        }
        throw new NullPointerException("builder: " + builder + " builder.kind: " + builder.kind + " builder.data: " + builder.data);
    }
}
