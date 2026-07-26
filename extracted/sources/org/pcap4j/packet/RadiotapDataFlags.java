package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataFlags implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = 3144457914168529098L;
    private final boolean badFcs;
    private final boolean cfp;
    private final boolean fragmented;
    private final boolean includingFcs;
    private final boolean padding;
    private final boolean shortGuardInterval;
    private final boolean shortPreamble;
    private final boolean wepEncrypted;

    public static final class Builder {
        private boolean badFcs;
        private boolean cfp;
        private boolean fragmented;
        private boolean includingFcs;
        private boolean padding;
        private boolean shortGuardInterval;
        private boolean shortPreamble;
        private boolean wepEncrypted;

        public Builder badFcs(boolean z) {
            this.badFcs = z;
            return this;
        }

        public RadiotapDataFlags build() {
            return new RadiotapDataFlags(this);
        }

        public Builder cfp(boolean z) {
            this.cfp = z;
            return this;
        }

        public Builder fragmented(boolean z) {
            this.fragmented = z;
            return this;
        }

        public Builder includingFcs(boolean z) {
            this.includingFcs = z;
            return this;
        }

        public Builder padding(boolean z) {
            this.padding = z;
            return this;
        }

        public Builder shortGuardInterval(boolean z) {
            this.shortGuardInterval = z;
            return this;
        }

        public Builder shortPreamble(boolean z) {
            this.shortPreamble = z;
            return this;
        }

        public Builder wepEncrypted(boolean z) {
            this.wepEncrypted = z;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataFlags radiotapDataFlags) {
            this.cfp = radiotapDataFlags.cfp;
        }
    }

    public static RadiotapDataFlags newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataFlags(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataFlags.class != obj.getClass()) {
            return false;
        }
        RadiotapDataFlags radiotapDataFlags = (RadiotapDataFlags) obj;
        return this.badFcs == radiotapDataFlags.badFcs && this.cfp == radiotapDataFlags.cfp && this.fragmented == radiotapDataFlags.fragmented && this.includingFcs == radiotapDataFlags.includingFcs && this.padding == radiotapDataFlags.padding && this.shortGuardInterval == radiotapDataFlags.shortGuardInterval && this.shortPreamble == radiotapDataFlags.shortPreamble && this.wepEncrypted == radiotapDataFlags.wepEncrypted;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[1];
        if (this.cfp) {
            bArr[0] = (byte) (1 | bArr[0]);
        }
        if (this.shortPreamble) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.wepEncrypted) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.fragmented) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.includingFcs) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.padding) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.badFcs) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.shortGuardInterval) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        return bArr;
    }

    public boolean hasPadding() {
        return this.padding;
    }

    public int hashCode() {
        return (((((((((((((((this.badFcs ? 1231 : 1237) + 31) * 31) + (this.cfp ? 1231 : 1237)) * 31) + (this.fragmented ? 1231 : 1237)) * 31) + (this.includingFcs ? 1231 : 1237)) * 31) + (this.padding ? 1231 : 1237)) * 31) + (this.shortGuardInterval ? 1231 : 1237)) * 31) + (this.shortPreamble ? 1231 : 1237)) * 31) + (this.wepEncrypted ? 1231 : 1237);
    }

    public boolean isBadFcs() {
        return this.badFcs;
    }

    public boolean isCfp() {
        return this.cfp;
    }

    public boolean isFragmented() {
        return this.fragmented;
    }

    public boolean isIncludingFcs() {
        return this.includingFcs;
    }

    public boolean isShortGuardInterval() {
        return this.shortGuardInterval;
    }

    public boolean isShortPreamble() {
        return this.shortPreamble;
    }

    public boolean isWepEncrypted() {
        return this.wepEncrypted;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 1;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataFlags(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 1) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapFlags (1 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        this.cfp = (b & 1) != 0;
        this.shortPreamble = (b & 2) != 0;
        this.wepEncrypted = (b & 4) != 0;
        this.fragmented = (b & 8) != 0;
        this.includingFcs = (b & 16) != 0;
        this.padding = (b & 32) != 0;
        this.badFcs = (b & 64) != 0;
        this.shortGuardInterval = (b & 128) != 0;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Flags: ", str, sb);
        sb.append("  CFP: ");
        t61.z(sb, this.cfp, strZ, str, "  Short Preamble: ");
        t61.z(sb, this.shortPreamble, strZ, str, "  WEP: ");
        t61.z(sb, this.wepEncrypted, strZ, str, "  Fragmented: ");
        t61.z(sb, this.fragmented, strZ, str, "  FCS: ");
        t61.z(sb, this.includingFcs, strZ, str, "  PAD: ");
        t61.z(sb, this.padding, strZ, str, "  Bad FCS: ");
        t61.z(sb, this.badFcs, strZ, str, "  Short Guard Interval: ");
        return t61.l(sb, this.shortGuardInterval, strZ);
    }

    private RadiotapDataFlags(Builder builder) {
        if (builder != null) {
            this.cfp = builder.cfp;
            this.shortPreamble = builder.shortPreamble;
            this.wepEncrypted = builder.wepEncrypted;
            this.fragmented = builder.fragmented;
            this.includingFcs = builder.includingFcs;
            this.padding = builder.padding;
            this.badFcs = builder.badFcs;
            this.shortGuardInterval = builder.shortGuardInterval;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
