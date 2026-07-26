package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataRxFlags implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = -1269108995049803687L;
    private final boolean badPlcpCrc;
    private final boolean eighthLsb;
    private final boolean eleventhLsb;
    private final boolean fifteenthLsb;
    private final boolean fifthLsb;
    private final boolean fourteenthLsb;
    private final boolean fourthLsb;
    private final boolean lsb;
    private final boolean ninthLsb;
    private final boolean seventhLsb;
    private final boolean sixteenthLsb;
    private final boolean sixthLsb;
    private final boolean tenthLsb;
    private final boolean thirdLsb;
    private final boolean thirteenthLsb;
    private final boolean twelvethLsb;

    public static final class Builder {
        private boolean badPlcpCrc;
        private boolean eighthLsb;
        private boolean eleventhLsb;
        private boolean fifteenthLsb;
        private boolean fifthLsb;
        private boolean fourteenthLsb;
        private boolean fourthLsb;
        private boolean lsb;
        private boolean ninthLsb;
        private boolean seventhLsb;
        private boolean sixteenthLsb;
        private boolean sixthLsb;
        private boolean tenthLsb;
        private boolean thirdLsb;
        private boolean thirteenthLsb;
        private boolean twelvethLsb;

        public Builder badPlcpCrc(boolean z) {
            this.badPlcpCrc = z;
            return this;
        }

        public RadiotapDataRxFlags build() {
            return new RadiotapDataRxFlags(this);
        }

        public Builder eighthLsb(boolean z) {
            this.eighthLsb = z;
            return this;
        }

        public Builder eleventhLsb(boolean z) {
            this.eleventhLsb = z;
            return this;
        }

        public Builder fifteenthLsb(boolean z) {
            this.fifteenthLsb = z;
            return this;
        }

        public Builder fifthLsb(boolean z) {
            this.fifthLsb = z;
            return this;
        }

        public Builder fourteenthLsb(boolean z) {
            this.fourteenthLsb = z;
            return this;
        }

        public Builder fourthLsb(boolean z) {
            this.fourthLsb = z;
            return this;
        }

        public Builder lsb(boolean z) {
            this.lsb = z;
            return this;
        }

        public Builder ninthLsb(boolean z) {
            this.ninthLsb = z;
            return this;
        }

        public Builder seventhLsb(boolean z) {
            this.seventhLsb = z;
            return this;
        }

        public Builder sixteenthLsb(boolean z) {
            this.sixteenthLsb = z;
            return this;
        }

        public Builder sixthLsb(boolean z) {
            this.sixthLsb = z;
            return this;
        }

        public Builder tenthLsb(boolean z) {
            this.tenthLsb = z;
            return this;
        }

        public Builder thirdLsb(boolean z) {
            this.thirdLsb = z;
            return this;
        }

        public Builder thirteenthLsb(boolean z) {
            this.thirteenthLsb = z;
            return this;
        }

        public Builder twelvethLsb(boolean z) {
            this.twelvethLsb = z;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataRxFlags radiotapDataRxFlags) {
            this.lsb = radiotapDataRxFlags.lsb;
            this.badPlcpCrc = radiotapDataRxFlags.badPlcpCrc;
            this.thirdLsb = radiotapDataRxFlags.thirdLsb;
            this.fourthLsb = radiotapDataRxFlags.fourthLsb;
            this.fifthLsb = radiotapDataRxFlags.fifthLsb;
            this.sixthLsb = radiotapDataRxFlags.sixthLsb;
            this.seventhLsb = radiotapDataRxFlags.seventhLsb;
            this.eighthLsb = radiotapDataRxFlags.eighthLsb;
            this.ninthLsb = radiotapDataRxFlags.ninthLsb;
            this.tenthLsb = radiotapDataRxFlags.tenthLsb;
            this.eleventhLsb = radiotapDataRxFlags.eleventhLsb;
            this.twelvethLsb = radiotapDataRxFlags.twelvethLsb;
            this.thirteenthLsb = radiotapDataRxFlags.thirteenthLsb;
            this.fourteenthLsb = radiotapDataRxFlags.fourteenthLsb;
            this.fifteenthLsb = radiotapDataRxFlags.fifteenthLsb;
            this.sixteenthLsb = radiotapDataRxFlags.sixteenthLsb;
        }
    }

    public static RadiotapDataRxFlags newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataRxFlags(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataRxFlags.class != obj.getClass()) {
            return false;
        }
        RadiotapDataRxFlags radiotapDataRxFlags = (RadiotapDataRxFlags) obj;
        return this.sixthLsb == radiotapDataRxFlags.sixthLsb && this.eleventhLsb == radiotapDataRxFlags.eleventhLsb && this.ninthLsb == radiotapDataRxFlags.ninthLsb && this.fourthLsb == radiotapDataRxFlags.fourthLsb && this.twelvethLsb == radiotapDataRxFlags.twelvethLsb && this.thirteenthLsb == radiotapDataRxFlags.thirteenthLsb && this.fifteenthLsb == radiotapDataRxFlags.fifteenthLsb && this.lsb == radiotapDataRxFlags.lsb && this.seventhLsb == radiotapDataRxFlags.seventhLsb && this.tenthLsb == radiotapDataRxFlags.tenthLsb && this.sixteenthLsb == radiotapDataRxFlags.sixteenthLsb && this.badPlcpCrc == radiotapDataRxFlags.badPlcpCrc && this.fourteenthLsb == radiotapDataRxFlags.fourteenthLsb && this.thirdLsb == radiotapDataRxFlags.thirdLsb && this.fifthLsb == radiotapDataRxFlags.fifthLsb && this.eighthLsb == radiotapDataRxFlags.eighthLsb;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public boolean getEighthLsb() {
        return this.eighthLsb;
    }

    public boolean getEleventhLsb() {
        return this.eleventhLsb;
    }

    public boolean getFifteenthLsb() {
        return this.fifteenthLsb;
    }

    public boolean getFifthLsb() {
        return this.fifthLsb;
    }

    public boolean getFourteenthLsb() {
        return this.fourteenthLsb;
    }

    public boolean getFourthLsb() {
        return this.fourthLsb;
    }

    public boolean getLsb() {
        return this.lsb;
    }

    public boolean getNinthLsb() {
        return this.ninthLsb;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[2];
        if (this.lsb) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        if (this.badPlcpCrc) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.thirdLsb) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.fourthLsb) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.fifthLsb) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.sixthLsb) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.seventhLsb) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.eighthLsb) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        if (this.ninthLsb) {
            bArr[1] = (byte) (bArr[1] | 1);
        }
        if (this.tenthLsb) {
            bArr[1] = (byte) (2 | bArr[1]);
        }
        if (this.eleventhLsb) {
            bArr[1] = (byte) (bArr[1] | 4);
        }
        if (this.twelvethLsb) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.thirteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        if (this.fourteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 32);
        }
        if (this.fifteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 64);
        }
        if (this.sixteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 128);
        }
        return bArr;
    }

    public boolean getSeventhLsb() {
        return this.seventhLsb;
    }

    public boolean getSixteenthLsb() {
        return this.sixteenthLsb;
    }

    public boolean getSixthLsb() {
        return this.sixthLsb;
    }

    public boolean getTenthLsb() {
        return this.tenthLsb;
    }

    public boolean getThirdLsb() {
        return this.thirdLsb;
    }

    public boolean getThirteenthLsb() {
        return this.thirteenthLsb;
    }

    public boolean getTwelvethLsb() {
        return this.twelvethLsb;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.sixthLsb ? 1231 : 1237) + 31) * 31) + (this.eleventhLsb ? 1231 : 1237)) * 31) + (this.ninthLsb ? 1231 : 1237)) * 31) + (this.fourthLsb ? 1231 : 1237)) * 31) + (this.twelvethLsb ? 1231 : 1237)) * 31) + (this.thirteenthLsb ? 1231 : 1237)) * 31) + (this.fifteenthLsb ? 1231 : 1237)) * 31) + (this.lsb ? 1231 : 1237)) * 31) + (this.seventhLsb ? 1231 : 1237)) * 31) + (this.tenthLsb ? 1231 : 1237)) * 31) + (this.sixteenthLsb ? 1231 : 1237)) * 31) + (this.badPlcpCrc ? 1231 : 1237)) * 31) + (this.fourteenthLsb ? 1231 : 1237)) * 31) + (this.thirdLsb ? 1231 : 1237)) * 31) + (this.fifthLsb ? 1231 : 1237)) * 31) + (this.eighthLsb ? 1231 : 1237);
    }

    public boolean isBadPlcpCrc() {
        return this.badPlcpCrc;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 2;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataRxFlags(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapRxFlags (2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        this.lsb = (b & 1) != 0;
        this.badPlcpCrc = (b & 2) != 0;
        this.thirdLsb = (b & 4) != 0;
        this.fourthLsb = (b & 8) != 0;
        this.fifthLsb = (b & 16) != 0;
        this.sixthLsb = (b & 32) != 0;
        this.seventhLsb = (b & 64) != 0;
        this.eighthLsb = (b & 128) != 0;
        byte b2 = bArr[i + 1];
        this.ninthLsb = (b2 & 1) != 0;
        this.tenthLsb = (b2 & 2) != 0;
        this.eleventhLsb = (b2 & 4) != 0;
        this.twelvethLsb = (b2 & 8) != 0;
        this.thirteenthLsb = (b2 & 16) != 0;
        this.fourteenthLsb = (b2 & 32) != 0;
        this.fifteenthLsb = (b2 & 64) != 0;
        this.sixteenthLsb = (b2 & 128) != 0;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "RX flags: ", str, sb);
        sb.append("  LSB: ");
        t61.z(sb, this.lsb, strZ, str, "  Bad PLCP CRC: ");
        t61.z(sb, this.badPlcpCrc, strZ, str, "  3rd LSB: ");
        t61.z(sb, this.thirdLsb, strZ, str, "  4th LSB: ");
        t61.z(sb, this.fourthLsb, strZ, str, "  5th LSB: ");
        t61.z(sb, this.fifthLsb, strZ, str, "  6th LSB: ");
        t61.z(sb, this.sixthLsb, strZ, str, "  7th LSB: ");
        t61.z(sb, this.seventhLsb, strZ, str, "  8th LSB: ");
        t61.z(sb, this.eighthLsb, strZ, str, "  9th LSB: ");
        t61.z(sb, this.ninthLsb, strZ, str, "  10th LSB: ");
        t61.z(sb, this.tenthLsb, strZ, str, "  11th LSB: ");
        t61.z(sb, this.eleventhLsb, strZ, str, "  12th LSB: ");
        t61.z(sb, this.twelvethLsb, strZ, str, "  13th LSB: ");
        t61.z(sb, this.thirteenthLsb, strZ, str, "  14th LSB: ");
        t61.z(sb, this.fourteenthLsb, strZ, str, "  15th LSB: ");
        t61.z(sb, this.fifteenthLsb, strZ, str, "  16th LSB: ");
        return t61.l(sb, this.sixteenthLsb, strZ);
    }

    private RadiotapDataRxFlags(Builder builder) {
        if (builder != null) {
            this.lsb = builder.lsb;
            this.badPlcpCrc = builder.badPlcpCrc;
            this.thirdLsb = builder.thirdLsb;
            this.fourthLsb = builder.fourthLsb;
            this.fifthLsb = builder.fifthLsb;
            this.sixthLsb = builder.sixthLsb;
            this.seventhLsb = builder.seventhLsb;
            this.eighthLsb = builder.eighthLsb;
            this.ninthLsb = builder.ninthLsb;
            this.tenthLsb = builder.tenthLsb;
            this.eleventhLsb = builder.eleventhLsb;
            this.twelvethLsb = builder.twelvethLsb;
            this.thirteenthLsb = builder.thirteenthLsb;
            this.fourteenthLsb = builder.fourteenthLsb;
            this.fifteenthLsb = builder.fifteenthLsb;
            this.sixteenthLsb = builder.sixteenthLsb;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
