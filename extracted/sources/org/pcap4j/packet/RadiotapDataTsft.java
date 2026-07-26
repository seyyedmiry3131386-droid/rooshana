package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.math.BigInteger;
import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataTsft implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 8;
    private static final long serialVersionUID = -6492811566937170319L;
    private final BigInteger macTimestamp;

    public static final class Builder {
        private BigInteger macTimestamp;

        public RadiotapDataTsft build() {
            return new RadiotapDataTsft(this);
        }

        public Builder macTimestamp(BigInteger bigInteger) {
            this.macTimestamp = bigInteger;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataTsft radiotapDataTsft) {
            this.macTimestamp = radiotapDataTsft.macTimestamp;
        }
    }

    public static RadiotapDataTsft newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataTsft(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (RadiotapDataTsft.class.isInstance(obj)) {
            return this.macTimestamp.equals(((RadiotapDataTsft) obj).macTimestamp);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public BigInteger getMacTimestamp() {
        return this.macTimestamp;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.macTimestamp.longValue(), ByteOrder.LITTLE_ENDIAN);
    }

    public int hashCode() {
        return this.macTimestamp.hashCode();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 8;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataTsft(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 8) {
            this.macTimestamp = new BigInteger(new byte[]{0, bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]});
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapTsft (8 bytes). data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "TSFT: ", str, sb);
        sb.append("  MAC timestamp: ");
        sb.append(this.macTimestamp);
        sb.append(" microseconds");
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataTsft(Builder builder) {
        if (builder != null && builder.macTimestamp != null) {
            if (builder.macTimestamp.signum() != -1) {
                if (builder.macTimestamp.bitLength() <= 64) {
                    this.macTimestamp = builder.macTimestamp;
                    return;
                }
                throw new IllegalArgumentException("macTimestamp must be less than 18446744073709551616.");
            }
            throw new IllegalArgumentException("macTimestamp must be positive.");
        }
        throw new NullPointerException("builder: " + builder + " builder.macTimestamp: " + builder.macTimestamp);
    }
}
