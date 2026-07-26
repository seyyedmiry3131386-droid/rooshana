package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpSackOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -3308738405807657257L;
    private final TcpOptionKind kind;
    private final byte length;
    private final List<Sack> sacks;

    public static final class Builder implements LengthBuilder<TcpSackOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private List<Sack> sacks;

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder sacks(List<Sack> list) {
            this.sacks = list;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpSackOption build() {
            return new TcpSackOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpSackOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(TcpSackOption tcpSackOption) {
            this.length = tcpSackOption.length;
        }
    }

    public static final class Sack implements Serializable {
        private static final long serialVersionUID = 1218420566089129438L;
        private final int leftEdge;
        private final int rightEdge;

        public Sack(int i, int i2) {
            this.leftEdge = i;
            this.rightEdge = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!Sack.class.isInstance(obj)) {
                return false;
            }
            Sack sack = (Sack) obj;
            return this.leftEdge == sack.leftEdge && this.rightEdge == sack.rightEdge;
        }

        public int getLeftEdge() {
            return this.leftEdge;
        }

        public long getLeftEdgeAsLong() {
            return ((long) this.leftEdge) & 4294967295L;
        }

        public int getRightEdge() {
            return this.rightEdge;
        }

        public long getRightEdgeAsLong() {
            return ((long) this.rightEdge) & 4294967295L;
        }

        public int hashCode() {
            return ((527 + this.leftEdge) * 31) + this.rightEdge;
        }
    }

    public static TcpSackOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new TcpSackOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!TcpSackOption.class.isInstance(obj)) {
            return false;
        }
        TcpSackOption tcpSackOption = (TcpSackOption) obj;
        return this.length == tcpSackOption.length && this.sacks.equals(tcpSackOption.sacks);
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
        int i = 2;
        for (Sack sack : this.sacks) {
            System.arraycopy(ByteArrays.toByteArray(sack.leftEdge), 0, bArr, i, 4);
            System.arraycopy(ByteArrays.toByteArray(sack.rightEdge), 0, bArr, i + 4, 4);
            i += 8;
        }
        return bArr;
    }

    public int hashCode() {
        return this.sacks.hashCode() + ((527 + this.length) * 31);
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return (this.sacks.size() * 8) + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Kind: ");
        sb.append(this.kind);
        sb.append("] [Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes]");
        for (Sack sack : this.sacks) {
            sb.append(" [LE: ");
            sb.append(sack.getLeftEdgeAsLong());
            sb.append(" RE: ");
            sb.append(sack.getRightEdgeAsLong());
            sb.append("]");
        }
        return sb.toString();
    }

    private TcpSackOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        TcpOptionKind tcpOptionKind = TcpOptionKind.SACK;
        this.kind = tcpOptionKind;
        this.sacks = new ArrayList();
        if (i2 < 2) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] != tcpOptionKind.value().byteValue()) {
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
        this.length = bArr[i + 1];
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt < 2) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "The value of length field must be  more than 1 but: "));
        }
        if ((lengthAsInt - 2) % 8 != 0) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("The value of length field must be an integer multiple of 8 octets long but: ");
            sb.append(lengthAsInt);
            throw new IllegalRawDataException(sb.toString());
        }
        if (i2 >= lengthAsInt) {
            for (int i3 = 2; i3 < lengthAsInt; i3 += 8) {
                this.sacks.add(new Sack(ByteArrays.getInt(bArr, i3 + i), ByteArrays.getInt(bArr, i3 + 4 + i)));
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("rawData is too short. length field: ");
        sb2.append(lengthAsInt);
        sb2.append(", rawData: ");
        t61.t(i, " ", ", offset: ", sb2, bArr);
        sb2.append(", length: ");
        sb2.append(i2);
        throw new IllegalRawDataException(sb2.toString());
    }

    private TcpSackOption(Builder builder) {
        this.kind = TcpOptionKind.SACK;
        ArrayList arrayList = new ArrayList();
        this.sacks = arrayList;
        if (builder != null && builder.sacks != null) {
            arrayList.addAll(builder.sacks);
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else {
                this.length = (byte) length();
                return;
            }
        }
        throw new NullPointerException("builder: " + builder + " builder.sacks: " + builder.sacks);
    }
}
