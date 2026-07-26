package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpTimestampsOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -7134215148170658739L;
    private final TcpOptionKind kind;
    private final byte length;
    private final int tsEchoReply;
    private final int tsValue;

    public static final class Builder implements LengthBuilder<TcpTimestampsOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private int tsEchoReply;
        private int tsValue;

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder tsEchoReply(int i) {
            this.tsEchoReply = i;
            return this;
        }

        public Builder tsValue(int i) {
            this.tsValue = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpTimestampsOption build() {
            return new TcpTimestampsOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpTimestampsOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(TcpTimestampsOption tcpTimestampsOption) {
            this.length = tcpTimestampsOption.length;
        }
    }

    public static TcpTimestampsOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new TcpTimestampsOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!TcpTimestampsOption.class.isInstance(obj)) {
            return false;
        }
        TcpTimestampsOption tcpTimestampsOption = (TcpTimestampsOption) obj;
        return this.length == tcpTimestampsOption.length && this.tsValue == tcpTimestampsOption.tsValue && this.tsEchoReply == tcpTimestampsOption.tsEchoReply;
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
        System.arraycopy(ByteArrays.toByteArray(this.tsValue), 0, bArr, 2, 4);
        System.arraycopy(ByteArrays.toByteArray(this.tsEchoReply), 0, bArr, 6, 4);
        return bArr;
    }

    public int getTsEchoReply() {
        return this.tsEchoReply;
    }

    public long getTsEchoReplyAsLong() {
        return ((long) this.tsEchoReply) & 4294967295L;
    }

    public int getTsValue() {
        return this.tsValue;
    }

    public long getTsValueAsLong() {
        return ((long) this.tsValue) & 4294967295L;
    }

    public int hashCode() {
        return ((((527 + this.length) * 31) + this.tsValue) * 31) + this.tsEchoReply;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 10;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Length: " + getLengthAsInt() + " bytes] [TS Value: " + getTsValueAsLong() + "] [TS Echo Reply: " + getTsEchoReplyAsLong() + "]";
    }

    private TcpTimestampsOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        TcpOptionKind tcpOptionKind = TcpOptionKind.TIMESTAMPS;
        this.kind = tcpOptionKind;
        if (i2 < 10) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 9. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] == tcpOptionKind.value().byteValue()) {
            byte b = bArr[i + 1];
            this.length = b;
            if (b != 10) {
                throw new IllegalRawDataException(rm7.n(b, "The value of length field must be 10 but: "));
            }
            this.tsValue = ByteArrays.getInt(bArr, i + 2);
            this.tsEchoReply = ByteArrays.getInt(bArr, i + 6);
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

    private TcpTimestampsOption(Builder builder) {
        this.kind = TcpOptionKind.TIMESTAMPS;
        if (builder != null) {
            this.tsValue = builder.tsValue;
            this.tsEchoReply = builder.tsEchoReply;
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
