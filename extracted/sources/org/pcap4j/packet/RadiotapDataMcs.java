package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataMcs implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 3;
    private static final long serialVersionUID = 8914690461479810322L;
    private final Bandwidth bandwidth;
    private final boolean bandwidthKnown;
    private final RadiotapFecType fecType;
    private final boolean fecTypeKnown;
    private final boolean guardIntervalKnown;
    private final HtFormat htFormat;
    private final boolean htFormatKnown;
    private final boolean mcsIndexKnown;
    private final byte mcsRateIndex;
    private final boolean nessKnown;
    private final boolean nessLsb;
    private final boolean nessMsb;
    private final byte numStbcStreams;
    private final boolean shortGuardInterval;
    private final boolean stbcKnown;

    public enum Bandwidth {
        BW_20(0, "20"),
        BW_40(1, "40"),
        BW_20L(2, "20L"),
        BW_20U(3, "20U");

        private final String name;
        private final int value;

        Bandwidth(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.value);
            sb.append(" (");
            return dw1.s(sb, this.name, ")");
        }
    }

    public static final class Builder {
        private Bandwidth bandwidth;
        private boolean bandwidthKnown;
        private RadiotapFecType fecType;
        private boolean fecTypeKnown;
        private boolean guardIntervalKnown;
        private HtFormat htFormat;
        private boolean htFormatKnown;
        private boolean mcsIndexKnown;
        private byte mcsRateIndex;
        private boolean nessKnown;
        private boolean nessLsb;
        private boolean nessMsb;
        private byte numStbcStreams;
        private boolean shortGuardInterval;
        private boolean stbcKnown;

        public Builder bandwidth(Bandwidth bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder bandwidthKnown(boolean z) {
            this.bandwidthKnown = z;
            return this;
        }

        public RadiotapDataMcs build() {
            return new RadiotapDataMcs(this);
        }

        public Builder fecType(RadiotapFecType radiotapFecType) {
            this.fecType = radiotapFecType;
            return this;
        }

        public Builder fecTypeKnown(boolean z) {
            this.fecTypeKnown = z;
            return this;
        }

        public Builder guardIntervalKnown(boolean z) {
            this.guardIntervalKnown = z;
            return this;
        }

        public Builder htFormat(HtFormat htFormat) {
            this.htFormat = htFormat;
            return this;
        }

        public Builder htFormatKnown(boolean z) {
            this.htFormatKnown = z;
            return this;
        }

        public Builder mcsIndexKnown(boolean z) {
            this.mcsIndexKnown = z;
            return this;
        }

        public Builder mcsRateIndex(byte b) {
            this.mcsRateIndex = b;
            return this;
        }

        public Builder nessKnown(boolean z) {
            this.nessKnown = z;
            return this;
        }

        public Builder nessLsb(boolean z) {
            this.nessLsb = z;
            return this;
        }

        public Builder nessMsb(boolean z) {
            this.nessMsb = z;
            return this;
        }

        public Builder numStbcStreams(byte b) {
            this.numStbcStreams = b;
            return this;
        }

        public Builder shortGuardInterval(boolean z) {
            this.shortGuardInterval = z;
            return this;
        }

        public Builder stbcKnown(boolean z) {
            this.stbcKnown = z;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataMcs radiotapDataMcs) {
            this.bandwidthKnown = radiotapDataMcs.bandwidthKnown;
            this.mcsIndexKnown = radiotapDataMcs.mcsIndexKnown;
            this.guardIntervalKnown = radiotapDataMcs.guardIntervalKnown;
            this.htFormatKnown = radiotapDataMcs.htFormatKnown;
            this.fecTypeKnown = radiotapDataMcs.fecTypeKnown;
            this.stbcKnown = radiotapDataMcs.stbcKnown;
            this.nessKnown = radiotapDataMcs.nessKnown;
            this.nessMsb = radiotapDataMcs.nessMsb;
            this.bandwidth = radiotapDataMcs.bandwidth;
            this.shortGuardInterval = radiotapDataMcs.shortGuardInterval;
            this.htFormat = radiotapDataMcs.htFormat;
            this.fecType = radiotapDataMcs.fecType;
            this.numStbcStreams = radiotapDataMcs.numStbcStreams;
            this.nessLsb = radiotapDataMcs.nessLsb;
            this.mcsRateIndex = radiotapDataMcs.mcsRateIndex;
        }
    }

    public enum HtFormat {
        MIXED(0),
        GREENFIELD(1);

        private final int value;

        HtFormat(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static RadiotapDataMcs newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataMcs(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataMcs.class != obj.getClass()) {
            return false;
        }
        RadiotapDataMcs radiotapDataMcs = (RadiotapDataMcs) obj;
        return this.bandwidth == radiotapDataMcs.bandwidth && this.bandwidthKnown == radiotapDataMcs.bandwidthKnown && this.fecType == radiotapDataMcs.fecType && this.fecTypeKnown == radiotapDataMcs.fecTypeKnown && this.guardIntervalKnown == radiotapDataMcs.guardIntervalKnown && this.htFormat == radiotapDataMcs.htFormat && this.htFormatKnown == radiotapDataMcs.htFormatKnown && this.mcsIndexKnown == radiotapDataMcs.mcsIndexKnown && this.mcsRateIndex == radiotapDataMcs.mcsRateIndex && this.nessLsb == radiotapDataMcs.nessLsb && this.nessMsb == radiotapDataMcs.nessMsb && this.nessKnown == radiotapDataMcs.nessKnown && this.numStbcStreams == radiotapDataMcs.numStbcStreams && this.shortGuardInterval == radiotapDataMcs.shortGuardInterval && this.stbcKnown == radiotapDataMcs.stbcKnown;
    }

    public Bandwidth getBandwidth() {
        return this.bandwidth;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public RadiotapFecType getFecType() {
        return this.fecType;
    }

    public HtFormat getHtFormat() {
        return this.htFormat;
    }

    public byte getMcsRateIndex() {
        return this.mcsRateIndex;
    }

    public int getMcsRateIndexAsInt() {
        return this.mcsRateIndex & 255;
    }

    public boolean getNessLsb() {
        return this.nessLsb;
    }

    public boolean getNessMsb() {
        return this.nessMsb;
    }

    public byte getNumStbcStreams() {
        return this.numStbcStreams;
    }

    public int getNumStbcStreamsAsInt() {
        return this.numStbcStreams;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[3];
        if (this.bandwidthKnown) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        if (this.mcsIndexKnown) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.guardIntervalKnown) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.htFormatKnown) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.fecTypeKnown) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.stbcKnown) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.nessKnown) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.nessMsb) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        byte b = (byte) this.bandwidth.value;
        bArr[1] = b;
        if (this.shortGuardInterval) {
            bArr[1] = (byte) (b | 4);
        }
        if (this.htFormat == HtFormat.GREENFIELD) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.fecType == RadiotapFecType.LDPC) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        byte b2 = (byte) (bArr[1] | (this.numStbcStreams << 5));
        bArr[1] = b2;
        if (this.nessLsb) {
            bArr[1] = (byte) (b2 | 128);
        }
        bArr[2] = this.mcsRateIndex;
        return bArr;
    }

    public int hashCode() {
        return ((((((((((((((((((this.htFormat.hashCode() + ((((((this.fecType.hashCode() + ((((this.bandwidth.hashCode() + 31) * 31) + (this.bandwidthKnown ? 1231 : 1237)) * 31)) * 31) + (this.fecTypeKnown ? 1231 : 1237)) * 31) + (this.guardIntervalKnown ? 1231 : 1237)) * 31)) * 31) + (this.htFormatKnown ? 1231 : 1237)) * 31) + (this.mcsIndexKnown ? 1231 : 1237)) * 31) + this.mcsRateIndex) * 31) + (this.nessLsb ? 1231 : 1237)) * 31) + (this.nessMsb ? 1231 : 1237)) * 31) + (this.nessKnown ? 1231 : 1237)) * 31) + this.numStbcStreams) * 31) + (this.shortGuardInterval ? 1231 : 1237)) * 31) + (this.stbcKnown ? 1231 : 1237);
    }

    public boolean isBandwidthKnown() {
        return this.bandwidthKnown;
    }

    public boolean isFecTypeKnown() {
        return this.fecTypeKnown;
    }

    public boolean isGuardIntervalKnown() {
        return this.guardIntervalKnown;
    }

    public boolean isHtFormatKnown() {
        return this.htFormatKnown;
    }

    public boolean isMcsIndexKnown() {
        return this.mcsIndexKnown;
    }

    public boolean isNessKnown() {
        return this.nessKnown;
    }

    public boolean isShortGuardInterval() {
        return this.shortGuardInterval;
    }

    public boolean isStbcKnown() {
        return this.stbcKnown;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 3;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataMcs(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 3) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapMcs (3 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        this.bandwidthKnown = (b & 1) != 0;
        this.mcsIndexKnown = (b & 2) != 0;
        this.guardIntervalKnown = (b & 4) != 0;
        this.htFormatKnown = (b & 8) != 0;
        this.fecTypeKnown = (b & 16) != 0;
        this.stbcKnown = (b & 32) != 0;
        this.nessKnown = (b & 64) != 0;
        this.nessMsb = (b & 128) != 0;
        byte b2 = bArr[i + 1];
        int i3 = b2 & 3;
        if (i3 == 0) {
            this.bandwidth = Bandwidth.BW_20;
        } else if (i3 == 1) {
            this.bandwidth = Bandwidth.BW_40;
        } else if (i3 == 2) {
            this.bandwidth = Bandwidth.BW_20L;
        } else {
            if (i3 != 3) {
                throw new AssertionError("Never get here.");
            }
            this.bandwidth = Bandwidth.BW_20U;
        }
        this.shortGuardInterval = (b2 & 4) != 0;
        if ((b2 & 8) != 0) {
            this.htFormat = HtFormat.GREENFIELD;
        } else {
            this.htFormat = HtFormat.MIXED;
        }
        if ((b2 & 16) != 0) {
            this.fecType = RadiotapFecType.LDPC;
        } else {
            this.fecType = RadiotapFecType.BCC;
        }
        this.numStbcStreams = (byte) ((b2 & 96) >> 5);
        this.nessLsb = (b2 & 128) != 0;
        this.mcsRateIndex = bArr[i + 2];
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "MCS: ", str, sb);
        sb.append("  bandwidth known: ");
        t61.z(sb, this.bandwidthKnown, strZ, str, "  MCS index known: ");
        t61.z(sb, this.mcsIndexKnown, strZ, str, "  guard interval known: ");
        t61.z(sb, this.guardIntervalKnown, strZ, str, "  HT format known: ");
        t61.z(sb, this.htFormatKnown, strZ, str, "  FEC type known: ");
        t61.z(sb, this.fecTypeKnown, strZ, str, "  STBC known: ");
        t61.z(sb, this.stbcKnown, strZ, str, "  Ness known: ");
        t61.z(sb, this.nessKnown, strZ, str, "  Ness data known: ");
        t61.z(sb, this.nessMsb, strZ, str, "  bandwidth: ");
        sb.append(this.bandwidth);
        sb.append(strZ);
        sb.append(str);
        sb.append("  short guard interval: ");
        t61.z(sb, this.shortGuardInterval, strZ, str, "  HT format: ");
        sb.append(this.htFormat);
        sb.append(strZ);
        sb.append(str);
        sb.append("  FEC type: ");
        sb.append(this.fecType);
        sb.append(strZ);
        sb.append(str);
        sb.append("  Number of STBC streams: ");
        sb.append((int) this.numStbcStreams);
        sb.append(strZ);
        sb.append(str);
        sb.append("  Ness: ");
        t61.z(sb, this.nessLsb, strZ, str, "  MCS rate index: ");
        sb.append(getMcsRateIndexAsInt());
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataMcs(Builder builder) {
        if (builder != null && builder.bandwidth != null && builder.htFormat != null && builder.fecType != null) {
            if ((builder.numStbcStreams & 252) == 0) {
                this.bandwidthKnown = builder.bandwidthKnown;
                this.mcsIndexKnown = builder.mcsIndexKnown;
                this.guardIntervalKnown = builder.guardIntervalKnown;
                this.htFormatKnown = builder.htFormatKnown;
                this.fecTypeKnown = builder.fecTypeKnown;
                this.stbcKnown = builder.stbcKnown;
                this.nessKnown = builder.nessKnown;
                this.nessMsb = builder.nessMsb;
                this.bandwidth = builder.bandwidth;
                this.shortGuardInterval = builder.shortGuardInterval;
                this.htFormat = builder.htFormat;
                this.fecType = builder.fecType;
                this.numStbcStreams = builder.numStbcStreams;
                this.nessLsb = builder.nessLsb;
                this.mcsRateIndex = builder.mcsRateIndex;
                return;
            }
            throw new IllegalArgumentException("(builder.numStbcStreams & 0xFC) must be 0. builder.numStbcStreams: " + ((int) builder.numStbcStreams));
        }
        throw new NullPointerException("builder: " + builder + " builder.bandwidth: " + builder.bandwidth + " builder.htFormat: " + builder.htFormat + " builder.fecType: " + builder.fecType);
    }
}
