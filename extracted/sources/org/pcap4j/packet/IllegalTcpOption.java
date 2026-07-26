package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalTcpOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = 4128600756828920489L;
    private final TcpOptionKind kind;
    private final byte[] rawData;

    public static final class Builder {
        private TcpOptionKind kind;
        private byte[] rawData;

        public IllegalTcpOption build() {
            return new IllegalTcpOption(this);
        }

        public Builder kind(TcpOptionKind tcpOptionKind) {
            this.kind = tcpOptionKind;
            return this;
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder() {
        }

        private Builder(IllegalTcpOption illegalTcpOption) {
            this.kind = illegalTcpOption.kind;
            this.rawData = illegalTcpOption.rawData;
        }
    }

    public static IllegalTcpOption newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IllegalTcpOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IllegalTcpOption.class.isInstance(obj)) {
            return false;
        }
        IllegalTcpOption illegalTcpOption = (IllegalTcpOption) obj;
        return this.kind.equals(illegalTcpOption.kind) && Arrays.equals(illegalTcpOption.rawData, this.rawData);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return this.kind;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData) + ((this.kind.hashCode() + 527) * 31);
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Kind: ");
        sb.append(this.kind);
        sb.append("] [Illegal Raw Data: 0x");
        return t61.m(this.rawData, "", sb, "]");
    }

    private IllegalTcpOption(byte[] bArr, int i, int i2) {
        this.kind = TcpOptionKind.getInstance(Byte.valueOf(bArr[i]));
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    private IllegalTcpOption(Builder builder) {
        if (builder != null && builder.kind != null && builder.rawData != null) {
            this.kind = builder.kind;
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.kind: " + builder.kind + " builder.rawData: " + builder.rawData);
    }
}
