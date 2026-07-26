package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataAMpduStatus implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 8;
    private static final long serialVersionUID = 5595179236319330489L;
    private final boolean delimiterCrcError;
    private final byte delimiterCrcValue;
    private final boolean delimiterCrcValueKnown;
    private final boolean driverReportsZeroLengthSubframes;
    private final boolean eighthMsbOfFlags;
    private final boolean fifthMsbOfFlags;
    private final boolean fourthMsbOfFlags;
    private final boolean lastSubframe;
    private final boolean lastSubframeKnown;
    private final boolean msbOfFlags;
    private final boolean ninthMsbOfFlags;
    private final int referenceNumber;
    private final byte reserved;
    private final boolean secondMsbOfFlags;
    private final boolean seventhMsbOfFlags;
    private final boolean sixthMsbOfFlags;
    private final boolean tenthMsbOfFlags;
    private final boolean thirdMsbOfFlags;
    private final boolean zeroLengthSubframe;

    public static final class Builder {
        private boolean delimiterCrcError;
        private byte delimiterCrcValue;
        private boolean delimiterCrcValueKnown;
        private boolean driverReportsZeroLengthSubframes;
        private boolean eighthMsbOfFlags;
        private boolean fifthMsbOfFlags;
        private boolean fourthMsbOfFlags;
        private boolean lastSubframe;
        private boolean lastSubframeKnown;
        private boolean msbOfFlags;
        private boolean ninthMsbOfFlags;
        private int referenceNumber;
        private byte reserved;
        private boolean secondMsbOfFlags;
        private boolean seventhMsbOfFlags;
        private boolean sixthMsbOfFlags;
        private boolean tenthMsbOfFlags;
        private boolean thirdMsbOfFlags;
        private boolean zeroLengthSubframe;

        public RadiotapDataAMpduStatus build() {
            return new RadiotapDataAMpduStatus(this);
        }

        public Builder delimiterCrcError(boolean z) {
            this.delimiterCrcError = z;
            return this;
        }

        public Builder delimiterCrcValue(byte b) {
            this.delimiterCrcValue = b;
            return this;
        }

        public Builder delimiterCrcValueKnown(boolean z) {
            this.delimiterCrcValueKnown = z;
            return this;
        }

        public Builder driverReportsZeroLengthSubframes(boolean z) {
            this.driverReportsZeroLengthSubframes = z;
            return this;
        }

        public Builder eighthMsbOfFlags(boolean z) {
            this.eighthMsbOfFlags = z;
            return this;
        }

        public Builder fifthMsbOfFlags(boolean z) {
            this.fifthMsbOfFlags = z;
            return this;
        }

        public Builder fourthMsbOfFlags(boolean z) {
            this.fourthMsbOfFlags = z;
            return this;
        }

        public Builder lastSubframe(boolean z) {
            this.lastSubframe = z;
            return this;
        }

        public Builder lastSubframeKnown(boolean z) {
            this.lastSubframeKnown = z;
            return this;
        }

        public Builder msbOfFlags(boolean z) {
            this.msbOfFlags = z;
            return this;
        }

        public Builder ninthMsbOfFlags(boolean z) {
            this.ninthMsbOfFlags = z;
            return this;
        }

        public Builder referenceNumber(int i) {
            this.referenceNumber = i;
            return this;
        }

        public Builder reserved(byte b) {
            this.reserved = b;
            return this;
        }

        public Builder secondMsbOfFlags(boolean z) {
            this.secondMsbOfFlags = z;
            return this;
        }

        public Builder seventhMsbOfFlags(boolean z) {
            this.seventhMsbOfFlags = z;
            return this;
        }

        public Builder sixthMsbOfFlags(boolean z) {
            this.sixthMsbOfFlags = z;
            return this;
        }

        public Builder tenthMsbOfFlags(boolean z) {
            this.tenthMsbOfFlags = z;
            return this;
        }

        public Builder thirdMsbOfFlags(boolean z) {
            this.thirdMsbOfFlags = z;
            return this;
        }

        public Builder zeroLengthSubframe(boolean z) {
            this.zeroLengthSubframe = z;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataAMpduStatus radiotapDataAMpduStatus) {
            this.referenceNumber = radiotapDataAMpduStatus.referenceNumber;
            this.driverReportsZeroLengthSubframes = radiotapDataAMpduStatus.driverReportsZeroLengthSubframes;
            this.zeroLengthSubframe = radiotapDataAMpduStatus.zeroLengthSubframe;
            this.lastSubframeKnown = radiotapDataAMpduStatus.lastSubframeKnown;
            this.lastSubframe = radiotapDataAMpduStatus.lastSubframe;
            this.delimiterCrcError = radiotapDataAMpduStatus.delimiterCrcError;
            this.delimiterCrcValueKnown = radiotapDataAMpduStatus.delimiterCrcValueKnown;
            this.tenthMsbOfFlags = radiotapDataAMpduStatus.tenthMsbOfFlags;
            this.ninthMsbOfFlags = radiotapDataAMpduStatus.ninthMsbOfFlags;
            this.eighthMsbOfFlags = radiotapDataAMpduStatus.eighthMsbOfFlags;
            this.seventhMsbOfFlags = radiotapDataAMpduStatus.seventhMsbOfFlags;
            this.sixthMsbOfFlags = radiotapDataAMpduStatus.sixthMsbOfFlags;
            this.fifthMsbOfFlags = radiotapDataAMpduStatus.fifthMsbOfFlags;
            this.fourthMsbOfFlags = radiotapDataAMpduStatus.fourthMsbOfFlags;
            this.thirdMsbOfFlags = radiotapDataAMpduStatus.thirdMsbOfFlags;
            this.secondMsbOfFlags = radiotapDataAMpduStatus.secondMsbOfFlags;
            this.msbOfFlags = radiotapDataAMpduStatus.msbOfFlags;
            this.delimiterCrcValue = radiotapDataAMpduStatus.delimiterCrcValue;
            this.reserved = radiotapDataAMpduStatus.reserved;
        }
    }

    public static RadiotapDataAMpduStatus newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataAMpduStatus(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataAMpduStatus.class != obj.getClass()) {
            return false;
        }
        RadiotapDataAMpduStatus radiotapDataAMpduStatus = (RadiotapDataAMpduStatus) obj;
        return this.delimiterCrcError == radiotapDataAMpduStatus.delimiterCrcError && this.delimiterCrcValue == radiotapDataAMpduStatus.delimiterCrcValue && this.delimiterCrcValueKnown == radiotapDataAMpduStatus.delimiterCrcValueKnown && this.driverReportsZeroLengthSubframes == radiotapDataAMpduStatus.driverReportsZeroLengthSubframes && this.eighthMsbOfFlags == radiotapDataAMpduStatus.eighthMsbOfFlags && this.fifthMsbOfFlags == radiotapDataAMpduStatus.fifthMsbOfFlags && this.fourthMsbOfFlags == radiotapDataAMpduStatus.fourthMsbOfFlags && this.lastSubframe == radiotapDataAMpduStatus.lastSubframe && this.lastSubframeKnown == radiotapDataAMpduStatus.lastSubframeKnown && this.msbOfFlags == radiotapDataAMpduStatus.msbOfFlags && this.ninthMsbOfFlags == radiotapDataAMpduStatus.ninthMsbOfFlags && this.referenceNumber == radiotapDataAMpduStatus.referenceNumber && this.reserved == radiotapDataAMpduStatus.reserved && this.secondMsbOfFlags == radiotapDataAMpduStatus.secondMsbOfFlags && this.seventhMsbOfFlags == radiotapDataAMpduStatus.seventhMsbOfFlags && this.sixthMsbOfFlags == radiotapDataAMpduStatus.sixthMsbOfFlags && this.tenthMsbOfFlags == radiotapDataAMpduStatus.tenthMsbOfFlags && this.thirdMsbOfFlags == radiotapDataAMpduStatus.thirdMsbOfFlags && this.zeroLengthSubframe == radiotapDataAMpduStatus.zeroLengthSubframe;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getDelimiterCrcValue() {
        return this.delimiterCrcValue;
    }

    public boolean getDriverReportsZeroLengthSubframes() {
        return this.driverReportsZeroLengthSubframes;
    }

    public boolean getEighthMsbOfFlags() {
        return this.eighthMsbOfFlags;
    }

    public boolean getFifthMsbOfFlags() {
        return this.fifthMsbOfFlags;
    }

    public boolean getFourthMsbOfFlags() {
        return this.fourthMsbOfFlags;
    }

    public boolean getMsbOfFlags() {
        return this.msbOfFlags;
    }

    public boolean getNinthMsbOfFlags() {
        return this.ninthMsbOfFlags;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[8];
        System.arraycopy(ByteArrays.toByteArray(this.referenceNumber, ByteOrder.LITTLE_ENDIAN), 0, bArr, 0, 4);
        if (this.driverReportsZeroLengthSubframes) {
            bArr[4] = (byte) (bArr[4] | 1);
        }
        if (this.zeroLengthSubframe) {
            bArr[4] = (byte) (bArr[4] | 2);
        }
        if (this.lastSubframeKnown) {
            bArr[4] = (byte) (bArr[4] | 4);
        }
        if (this.lastSubframe) {
            bArr[4] = (byte) (bArr[4] | 8);
        }
        if (this.delimiterCrcError) {
            bArr[4] = (byte) (bArr[4] | 16);
        }
        if (this.delimiterCrcValueKnown) {
            bArr[4] = (byte) (bArr[4] | 32);
        }
        if (this.tenthMsbOfFlags) {
            bArr[4] = (byte) (bArr[4] | 64);
        }
        if (this.ninthMsbOfFlags) {
            bArr[4] = (byte) (bArr[4] | 128);
        }
        if (this.eighthMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 1);
        }
        if (this.seventhMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 2);
        }
        if (this.sixthMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 4);
        }
        if (this.fifthMsbOfFlags) {
            bArr[5] = (byte) (8 | bArr[5]);
        }
        if (this.fourthMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 16);
        }
        if (this.thirdMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 32);
        }
        if (this.secondMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 64);
        }
        if (this.msbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 128);
        }
        bArr[6] = this.delimiterCrcValue;
        bArr[7] = this.reserved;
        return bArr;
    }

    public int getReferenceNumber() {
        return this.referenceNumber;
    }

    public long getReferenceNumberAsLong() {
        return ((long) this.referenceNumber) & 4294967295L;
    }

    public byte getReserved() {
        return this.reserved;
    }

    public boolean getSecondMsbOfFlags() {
        return this.secondMsbOfFlags;
    }

    public boolean getSeventhMsbOfFlags() {
        return this.seventhMsbOfFlags;
    }

    public boolean getSixthMsbOfFlags() {
        return this.sixthMsbOfFlags;
    }

    public boolean getTenthMsbOfFlags() {
        return this.tenthMsbOfFlags;
    }

    public boolean getThirdMsbOfFlags() {
        return this.thirdMsbOfFlags;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.delimiterCrcError ? 1231 : 1237) + 31) * 31) + this.delimiterCrcValue) * 31) + (this.delimiterCrcValueKnown ? 1231 : 1237)) * 31) + (this.driverReportsZeroLengthSubframes ? 1231 : 1237)) * 31) + (this.eighthMsbOfFlags ? 1231 : 1237)) * 31) + (this.fifthMsbOfFlags ? 1231 : 1237)) * 31) + (this.fourthMsbOfFlags ? 1231 : 1237)) * 31) + (this.lastSubframe ? 1231 : 1237)) * 31) + (this.lastSubframeKnown ? 1231 : 1237)) * 31) + (this.msbOfFlags ? 1231 : 1237)) * 31) + (this.ninthMsbOfFlags ? 1231 : 1237)) * 31) + this.referenceNumber) * 31) + this.reserved) * 31) + (this.secondMsbOfFlags ? 1231 : 1237)) * 31) + (this.seventhMsbOfFlags ? 1231 : 1237)) * 31) + (this.sixthMsbOfFlags ? 1231 : 1237)) * 31) + (this.tenthMsbOfFlags ? 1231 : 1237)) * 31) + (this.thirdMsbOfFlags ? 1231 : 1237)) * 31) + (this.zeroLengthSubframe ? 1231 : 1237);
    }

    public boolean isDelimiterCrcError() {
        return this.delimiterCrcError;
    }

    public boolean isDelimiterCrcValueKnown() {
        return this.delimiterCrcValueKnown;
    }

    public boolean isLastSubframe() {
        return this.lastSubframe;
    }

    public boolean isLastSubframeKnown() {
        return this.lastSubframeKnown;
    }

    public boolean isZeroLengthSubframe() {
        return this.zeroLengthSubframe;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 8;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataAMpduStatus(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 8) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapAMpduStatus (8 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.referenceNumber = ByteArrays.getInt(bArr, i, ByteOrder.LITTLE_ENDIAN);
        byte b = bArr[i + 4];
        this.driverReportsZeroLengthSubframes = (b & 1) != 0;
        this.zeroLengthSubframe = (b & 2) != 0;
        this.lastSubframeKnown = (b & 4) != 0;
        this.lastSubframe = (b & 8) != 0;
        this.delimiterCrcError = (b & 16) != 0;
        this.delimiterCrcValueKnown = (b & 32) != 0;
        this.tenthMsbOfFlags = (b & 64) != 0;
        this.ninthMsbOfFlags = (b & 128) != 0;
        byte b2 = bArr[i + 5];
        this.eighthMsbOfFlags = (b2 & 1) != 0;
        this.seventhMsbOfFlags = (b2 & 2) != 0;
        this.sixthMsbOfFlags = (b2 & 4) != 0;
        this.fifthMsbOfFlags = (b2 & 8) != 0;
        this.fourthMsbOfFlags = (b2 & 16) != 0;
        this.thirdMsbOfFlags = (b2 & 32) != 0;
        this.secondMsbOfFlags = (b2 & 64) != 0;
        this.msbOfFlags = (b2 & 128) != 0;
        this.delimiterCrcValue = bArr[i + 6];
        this.reserved = bArr[i + 7];
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "A-MPDU status: ", str, sb);
        sb.append("  reference number: ");
        sb.append(getReferenceNumberAsLong());
        sb.append(strZ);
        sb.append(str);
        sb.append("  driver reports 0-length subframes: ");
        t61.z(sb, this.driverReportsZeroLengthSubframes, strZ, str, "  0-length subframe: ");
        t61.z(sb, this.zeroLengthSubframe, strZ, str, "  last subframe is known: ");
        t61.z(sb, this.lastSubframeKnown, strZ, str, "  last subframe: ");
        t61.z(sb, this.lastSubframe, strZ, str, "  delimiter CRC error: ");
        t61.z(sb, this.delimiterCrcError, strZ, str, "  delimiter CRC value is known: ");
        t61.z(sb, this.delimiterCrcValueKnown, strZ, str, "  10th MSB of flags: ");
        t61.z(sb, this.tenthMsbOfFlags, strZ, str, "  9th MSB of flags: ");
        t61.z(sb, this.ninthMsbOfFlags, strZ, str, "  8th MSB of flags: ");
        t61.z(sb, this.eighthMsbOfFlags, strZ, str, "  7th MSB of flags: ");
        t61.z(sb, this.seventhMsbOfFlags, strZ, str, "  6th MSB of flags: ");
        t61.z(sb, this.sixthMsbOfFlags, strZ, str, "  5th MSB of flags: ");
        t61.z(sb, this.fifthMsbOfFlags, strZ, str, "  4th MSB of flags: ");
        t61.z(sb, this.fourthMsbOfFlags, strZ, str, "  3rd MSB of flags: ");
        t61.z(sb, this.thirdMsbOfFlags, strZ, str, "  2nd MSB of flags: ");
        t61.z(sb, this.secondMsbOfFlags, strZ, str, "  MSB of flags: ");
        t61.z(sb, this.msbOfFlags, strZ, str, "  delimiter CRC value: 0x");
        sb.append(ByteArrays.toHexString(this.delimiterCrcValue, ""));
        sb.append(strZ);
        sb.append(str);
        sb.append("  reserved: 0x");
        sb.append(ByteArrays.toHexString(this.reserved, ""));
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataAMpduStatus(Builder builder) {
        if (builder != null) {
            this.referenceNumber = builder.referenceNumber;
            this.driverReportsZeroLengthSubframes = builder.driverReportsZeroLengthSubframes;
            this.zeroLengthSubframe = builder.zeroLengthSubframe;
            this.lastSubframeKnown = builder.lastSubframeKnown;
            this.lastSubframe = builder.lastSubframe;
            this.delimiterCrcError = builder.delimiterCrcError;
            this.delimiterCrcValueKnown = builder.delimiterCrcValueKnown;
            this.tenthMsbOfFlags = builder.tenthMsbOfFlags;
            this.ninthMsbOfFlags = builder.ninthMsbOfFlags;
            this.eighthMsbOfFlags = builder.eighthMsbOfFlags;
            this.seventhMsbOfFlags = builder.seventhMsbOfFlags;
            this.sixthMsbOfFlags = builder.sixthMsbOfFlags;
            this.fifthMsbOfFlags = builder.fifthMsbOfFlags;
            this.fourthMsbOfFlags = builder.fourthMsbOfFlags;
            this.thirdMsbOfFlags = builder.thirdMsbOfFlags;
            this.secondMsbOfFlags = builder.secondMsbOfFlags;
            this.msbOfFlags = builder.msbOfFlags;
            this.delimiterCrcValue = builder.delimiterCrcValue;
            this.reserved = builder.reserved;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
