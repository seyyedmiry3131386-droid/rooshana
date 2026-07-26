package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataChannel implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 4;
    private static final long serialVersionUID = 3645927613193110605L;
    private final boolean cck;
    private final boolean dynamicCckOfdm;
    private final boolean fiveGhzSpectrum;
    private final boolean fourthLsbOfFlags;
    private final short frequency;
    private final boolean gfsk;
    private final boolean gsm;
    private final boolean halfRate;
    private final boolean lsbOfFlags;
    private final boolean ofdm;
    private final boolean onlyPassiveScan;
    private final boolean quarterRate;
    private final boolean secondLsbOfFlags;
    private final boolean staticTurbo;
    private final boolean thirdLsbOfFlags;
    private final boolean turbo;
    private final boolean twoGhzSpectrum;

    public static final class Builder {
        private boolean cck;
        private boolean dynamicCckOfdm;
        private boolean fiveGhzSpectrum;
        private boolean fourthLsbOfFlags;
        private short frequency;
        private boolean gfsk;
        private boolean gsm;
        private boolean halfRate;
        private boolean lsbOfFlags;
        private boolean ofdm;
        private boolean onlyPassiveScan;
        private boolean quarterRate;
        private boolean secondLsbOfFlags;
        private boolean staticTurbo;
        private boolean thirdLsbOfFlags;
        private boolean turbo;
        private boolean twoGhzSpectrum;

        public RadiotapDataChannel build() {
            return new RadiotapDataChannel(this);
        }

        public Builder cck(boolean z) {
            this.cck = z;
            return this;
        }

        public Builder dynamicCckOfdm(boolean z) {
            this.dynamicCckOfdm = z;
            return this;
        }

        public Builder fiveGhzSpectrum(boolean z) {
            this.fiveGhzSpectrum = z;
            return this;
        }

        public Builder fourthLsbOfFlags(boolean z) {
            this.fourthLsbOfFlags = z;
            return this;
        }

        public Builder frequency(short s) {
            this.frequency = s;
            return this;
        }

        public Builder gfsk(boolean z) {
            this.gfsk = z;
            return this;
        }

        public Builder gsm(boolean z) {
            this.gsm = z;
            return this;
        }

        public Builder halfRate(boolean z) {
            this.halfRate = z;
            return this;
        }

        public Builder lsbOfFlags(boolean z) {
            this.lsbOfFlags = z;
            return this;
        }

        public Builder ofdm(boolean z) {
            this.ofdm = z;
            return this;
        }

        public Builder onlyPassiveScan(boolean z) {
            this.onlyPassiveScan = z;
            return this;
        }

        public Builder quarterRate(boolean z) {
            this.quarterRate = z;
            return this;
        }

        public Builder secondLsbOfFlags(boolean z) {
            this.secondLsbOfFlags = z;
            return this;
        }

        public Builder staticTurbo(boolean z) {
            this.staticTurbo = z;
            return this;
        }

        public Builder thirdLsbOfFlags(boolean z) {
            this.thirdLsbOfFlags = z;
            return this;
        }

        public Builder turbo(boolean z) {
            this.turbo = z;
            return this;
        }

        public Builder twoGhzSpectrum(boolean z) {
            this.twoGhzSpectrum = z;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataChannel radiotapDataChannel) {
            this.frequency = radiotapDataChannel.frequency;
            this.lsbOfFlags = radiotapDataChannel.lsbOfFlags;
            this.secondLsbOfFlags = radiotapDataChannel.secondLsbOfFlags;
            this.thirdLsbOfFlags = radiotapDataChannel.thirdLsbOfFlags;
            this.fourthLsbOfFlags = radiotapDataChannel.fourthLsbOfFlags;
            this.turbo = radiotapDataChannel.turbo;
            this.cck = radiotapDataChannel.cck;
            this.ofdm = radiotapDataChannel.ofdm;
            this.twoGhzSpectrum = radiotapDataChannel.twoGhzSpectrum;
            this.fiveGhzSpectrum = radiotapDataChannel.fiveGhzSpectrum;
            this.onlyPassiveScan = radiotapDataChannel.onlyPassiveScan;
            this.dynamicCckOfdm = radiotapDataChannel.dynamicCckOfdm;
            this.gfsk = radiotapDataChannel.gfsk;
            this.gsm = radiotapDataChannel.gsm;
            this.staticTurbo = radiotapDataChannel.staticTurbo;
            this.halfRate = radiotapDataChannel.halfRate;
            this.quarterRate = radiotapDataChannel.quarterRate;
        }
    }

    public static RadiotapDataChannel newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataChannel(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataChannel.class != obj.getClass()) {
            return false;
        }
        RadiotapDataChannel radiotapDataChannel = (RadiotapDataChannel) obj;
        return this.cck == radiotapDataChannel.cck && this.dynamicCckOfdm == radiotapDataChannel.dynamicCckOfdm && this.fiveGhzSpectrum == radiotapDataChannel.fiveGhzSpectrum && this.fourthLsbOfFlags == radiotapDataChannel.fourthLsbOfFlags && this.frequency == radiotapDataChannel.frequency && this.gfsk == radiotapDataChannel.gfsk && this.gsm == radiotapDataChannel.gsm && this.halfRate == radiotapDataChannel.halfRate && this.lsbOfFlags == radiotapDataChannel.lsbOfFlags && this.ofdm == radiotapDataChannel.ofdm && this.onlyPassiveScan == radiotapDataChannel.onlyPassiveScan && this.quarterRate == radiotapDataChannel.quarterRate && this.secondLsbOfFlags == radiotapDataChannel.secondLsbOfFlags && this.staticTurbo == radiotapDataChannel.staticTurbo && this.thirdLsbOfFlags == radiotapDataChannel.thirdLsbOfFlags && this.turbo == radiotapDataChannel.turbo && this.twoGhzSpectrum == radiotapDataChannel.twoGhzSpectrum;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public boolean getFourthLsbOfFlags() {
        return this.fourthLsbOfFlags;
    }

    public short getFrequency() {
        return this.frequency;
    }

    public int getFrequencyAsInt() {
        return this.frequency & 65535;
    }

    public boolean getLsbOfFlags() {
        return this.lsbOfFlags;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[4];
        System.arraycopy(ByteArrays.toByteArray(this.frequency, ByteOrder.LITTLE_ENDIAN), 0, bArr, 0, 2);
        if (this.lsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 1);
        }
        if (this.secondLsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.thirdLsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        if (this.fourthLsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        if (this.turbo) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.cck) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.ofdm) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.twoGhzSpectrum) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        if (this.fiveGhzSpectrum) {
            bArr[3] = (byte) (bArr[3] | 1);
        }
        if (this.onlyPassiveScan) {
            bArr[3] = (byte) (bArr[3] | 2);
        }
        if (this.dynamicCckOfdm) {
            bArr[3] = (byte) (4 | bArr[3]);
        }
        if (this.gfsk) {
            bArr[3] = (byte) (bArr[3] | 8);
        }
        if (this.gsm) {
            bArr[3] = (byte) (bArr[3] | 16);
        }
        if (this.staticTurbo) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.halfRate) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (this.quarterRate) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        return bArr;
    }

    public boolean getSecondLsbOfFlags() {
        return this.secondLsbOfFlags;
    }

    public boolean getThirdLsbOfFlags() {
        return this.thirdLsbOfFlags;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.cck ? 1231 : 1237) + 31) * 31) + (this.dynamicCckOfdm ? 1231 : 1237)) * 31) + (this.fiveGhzSpectrum ? 1231 : 1237)) * 31) + (this.fourthLsbOfFlags ? 1231 : 1237)) * 31) + this.frequency) * 31) + (this.gfsk ? 1231 : 1237)) * 31) + (this.gsm ? 1231 : 1237)) * 31) + (this.halfRate ? 1231 : 1237)) * 31) + (this.lsbOfFlags ? 1231 : 1237)) * 31) + (this.ofdm ? 1231 : 1237)) * 31) + (this.onlyPassiveScan ? 1231 : 1237)) * 31) + (this.quarterRate ? 1231 : 1237)) * 31) + (this.secondLsbOfFlags ? 1231 : 1237)) * 31) + (this.staticTurbo ? 1231 : 1237)) * 31) + (this.thirdLsbOfFlags ? 1231 : 1237)) * 31) + (this.turbo ? 1231 : 1237)) * 31) + (this.twoGhzSpectrum ? 1231 : 1237);
    }

    public boolean isCck() {
        return this.cck;
    }

    public boolean isDynamicCckOfdm() {
        return this.dynamicCckOfdm;
    }

    public boolean isFiveGhzSpectrum() {
        return this.fiveGhzSpectrum;
    }

    public boolean isGfsk() {
        return this.gfsk;
    }

    public boolean isGsm() {
        return this.gsm;
    }

    public boolean isHalfRate() {
        return this.halfRate;
    }

    public boolean isOfdm() {
        return this.ofdm;
    }

    public boolean isOnlyPassiveScan() {
        return this.onlyPassiveScan;
    }

    public boolean isQuarterRate() {
        return this.quarterRate;
    }

    public boolean isStaticTurbo() {
        return this.staticTurbo;
    }

    public boolean isTurbo() {
        return this.turbo;
    }

    public boolean isTwoGhzSpectrum() {
        return this.twoGhzSpectrum;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 4;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataChannel(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 4) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapChannel (4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.frequency = ByteArrays.getShort(bArr, i, ByteOrder.LITTLE_ENDIAN);
        byte b = bArr[i + 2];
        this.lsbOfFlags = (b & 1) != 0;
        this.secondLsbOfFlags = (b & 2) != 0;
        this.thirdLsbOfFlags = (b & 4) != 0;
        this.fourthLsbOfFlags = (b & 8) != 0;
        this.turbo = (b & 16) != 0;
        this.cck = (b & 32) != 0;
        this.ofdm = (b & 64) != 0;
        this.twoGhzSpectrum = (b & 128) != 0;
        byte b2 = bArr[i + 3];
        this.fiveGhzSpectrum = (b2 & 1) != 0;
        this.onlyPassiveScan = (b2 & 2) != 0;
        this.dynamicCckOfdm = (b2 & 4) != 0;
        this.gfsk = (b2 & 8) != 0;
        this.gsm = (b2 & 16) != 0;
        this.staticTurbo = (b2 & 32) != 0;
        this.halfRate = (b2 & 64) != 0;
        this.quarterRate = (b2 & 128) != 0;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Channel: ", str, sb);
        sb.append("  Frequency: ");
        sb.append(getFrequencyAsInt());
        sb.append(" MHz");
        sb.append(strZ);
        sb.append(str);
        sb.append("  LSB of flags: ");
        t61.z(sb, this.lsbOfFlags, strZ, str, "  2nd LSB of flags: ");
        t61.z(sb, this.secondLsbOfFlags, strZ, str, "  3rd LSB of flags: ");
        t61.z(sb, this.thirdLsbOfFlags, strZ, str, "  4th LSB of flags: ");
        t61.z(sb, this.fourthLsbOfFlags, strZ, str, "  Turbo: ");
        t61.z(sb, this.turbo, strZ, str, "  CCK: ");
        t61.z(sb, this.cck, strZ, str, "  OFDM: ");
        t61.z(sb, this.ofdm, strZ, str, "  2 GHz spectrum: ");
        t61.z(sb, this.twoGhzSpectrum, strZ, str, "  5 GHz spectrum: ");
        t61.z(sb, this.fiveGhzSpectrum, strZ, str, "  Only passive scan: ");
        t61.z(sb, this.onlyPassiveScan, strZ, str, "  Dynamic CCK-OFDM: ");
        t61.z(sb, this.dynamicCckOfdm, strZ, str, "  GFSK: ");
        t61.z(sb, this.gfsk, strZ, str, "  GSM: ");
        t61.z(sb, this.gsm, strZ, str, "  Static Turbo: ");
        t61.z(sb, this.staticTurbo, strZ, str, "  Half rate: ");
        t61.z(sb, this.halfRate, strZ, str, "  Quarter rate: ");
        return t61.l(sb, this.quarterRate, strZ);
    }

    private RadiotapDataChannel(Builder builder) {
        if (builder != null) {
            this.frequency = builder.frequency;
            this.lsbOfFlags = builder.lsbOfFlags;
            this.secondLsbOfFlags = builder.secondLsbOfFlags;
            this.thirdLsbOfFlags = builder.thirdLsbOfFlags;
            this.fourthLsbOfFlags = builder.fourthLsbOfFlags;
            this.turbo = builder.turbo;
            this.cck = builder.cck;
            this.ofdm = builder.ofdm;
            this.twoGhzSpectrum = builder.twoGhzSpectrum;
            this.fiveGhzSpectrum = builder.fiveGhzSpectrum;
            this.onlyPassiveScan = builder.onlyPassiveScan;
            this.dynamicCckOfdm = builder.dynamicCckOfdm;
            this.gfsk = builder.gfsk;
            this.gsm = builder.gsm;
            this.staticTurbo = builder.staticTurbo;
            this.halfRate = builder.halfRate;
            this.quarterRate = builder.quarterRate;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
