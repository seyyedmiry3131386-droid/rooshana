package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataFhss implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = 132223820938643993L;
    private final byte hopPattern;
    private final byte hopSet;

    public static final class Builder {
        private byte hopPattern;
        private byte hopSet;

        public RadiotapDataFhss build() {
            return new RadiotapDataFhss(this);
        }

        public Builder hopPattern(byte b) {
            this.hopPattern = b;
            return this;
        }

        public Builder hopSet(byte b) {
            this.hopSet = b;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataFhss radiotapDataFhss) {
            this.hopSet = radiotapDataFhss.hopSet;
            this.hopPattern = radiotapDataFhss.hopPattern;
        }
    }

    public static RadiotapDataFhss newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataFhss(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataFhss.class != obj.getClass()) {
            return false;
        }
        RadiotapDataFhss radiotapDataFhss = (RadiotapDataFhss) obj;
        return this.hopPattern == radiotapDataFhss.hopPattern && this.hopSet == radiotapDataFhss.hopSet;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getHopPattern() {
        return this.hopPattern;
    }

    public int getHopPatternAsInt() {
        return this.hopPattern & 255;
    }

    public byte getHopSet() {
        return this.hopSet;
    }

    public int getHopSetAsInt() {
        return this.hopSet & 255;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return new byte[]{this.hopSet, this.hopPattern};
    }

    public int hashCode() {
        return ((this.hopPattern + 31) * 31) + this.hopSet;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 2;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataFhss(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 2) {
            this.hopSet = ByteArrays.getByte(bArr, i);
            this.hopPattern = ByteArrays.getByte(bArr, i + 1);
        } else {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapFhss (2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "FHSS: ", str, sb);
        sb.append("  Hop set: ");
        sb.append(getHopSetAsInt());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Hop pattern: ");
        sb.append(getHopPatternAsInt());
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataFhss(Builder builder) {
        if (builder != null) {
            this.hopSet = builder.hopSet;
            this.hopPattern = builder.hopPattern;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
