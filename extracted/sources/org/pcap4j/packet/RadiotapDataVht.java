package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.packet.namednumber.RadiotapVhtBandwidth;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataVht implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 12;
    private static final long serialVersionUID = -7423738690741454273L;
    private final RadiotapVhtBandwidth bandwidth;
    private final boolean bandwidthKnown;
    private final boolean beamformed;
    private final boolean beamformedKnown;
    private final RadiotapFecType[] fecTypes;
    private final boolean fifthMsbOfKnown;
    private final boolean fourthMsbOfKnown;
    private final byte groupId;
    private final boolean groupIdKnown;
    private final boolean guardIntervalKnown;
    private final boolean ldpcExtraOfdmSymbol;
    private final boolean ldpcExtraOfdmSymbolKnown;
    private final byte[] mcses;
    private final boolean msbOfFlags;
    private final boolean msbOfKnown;
    private final byte[] nsses;
    private final short partialAid;
    private final boolean partialAidKnown;
    private final boolean secondMsbOfFlags;
    private final boolean secondMsbOfKnown;
    private final boolean seventhMsbOfKnown;
    private final boolean shortGiNsymDisambiguation;
    private final boolean shortGiNsymDisambiguationKnown;
    private final boolean shortGuardInterval;
    private final boolean sixthMsbOfKnown;
    private final boolean stbc;
    private final boolean stbcKnown;
    private final boolean thirdMsbOfKnown;
    private final boolean txopPsNotAllowed;
    private final boolean txopPsNotAllowedKnown;
    private final byte unusedInCoding;

    public static final class Builder {
        private RadiotapVhtBandwidth bandwidth;
        private boolean bandwidthKnown;
        private boolean beamformed;
        private boolean beamformedKnown;
        private RadiotapFecType[] fecTypes;
        private boolean fifthMsbOfKnown;
        private boolean fourthMsbOfKnown;
        private byte groupId;
        private boolean groupIdKnown;
        private boolean guardIntervalKnown;
        private boolean ldpcExtraOfdmSymbol;
        private boolean ldpcExtraOfdmSymbolKnown;
        private byte[] mcses;
        private boolean msbOfFlags;
        private boolean msbOfKnown;
        private byte[] nsses;
        private short partialAid;
        private boolean partialAidKnown;
        private boolean secondMsbOfFlags;
        private boolean secondMsbOfKnown;
        private boolean seventhMsbOfKnown;
        private boolean shortGiNsymDisambiguation;
        private boolean shortGiNsymDisambiguationKnown;
        private boolean shortGuardInterval;
        private boolean sixthMsbOfKnown;
        private boolean stbc;
        private boolean stbcKnown;
        private boolean thirdMsbOfKnown;
        private boolean txopPsNotAllowed;
        private boolean txopPsNotAllowedKnown;
        private byte unusedInCoding;

        public Builder bandwidth(RadiotapVhtBandwidth radiotapVhtBandwidth) {
            this.bandwidth = radiotapVhtBandwidth;
            return this;
        }

        public Builder bandwidthKnown(boolean z) {
            this.bandwidthKnown = z;
            return this;
        }

        public Builder beamformed(boolean z) {
            this.beamformed = z;
            return this;
        }

        public Builder beamformedKnown(boolean z) {
            this.beamformedKnown = z;
            return this;
        }

        public RadiotapDataVht build() {
            return new RadiotapDataVht(this);
        }

        public Builder fecTypes(RadiotapFecType[] radiotapFecTypeArr) {
            this.fecTypes = radiotapFecTypeArr;
            return this;
        }

        public Builder fifthMsbOfKnown(boolean z) {
            this.fifthMsbOfKnown = z;
            return this;
        }

        public Builder fourthMsbOfKnown(boolean z) {
            this.fourthMsbOfKnown = z;
            return this;
        }

        public Builder groupId(byte b) {
            this.groupId = b;
            return this;
        }

        public Builder groupIdKnown(boolean z) {
            this.groupIdKnown = z;
            return this;
        }

        public Builder guardIntervalKnown(boolean z) {
            this.guardIntervalKnown = z;
            return this;
        }

        public Builder ldpcExtraOfdmSymbol(boolean z) {
            this.ldpcExtraOfdmSymbol = z;
            return this;
        }

        public Builder ldpcExtraOfdmSymbolKnown(boolean z) {
            this.ldpcExtraOfdmSymbolKnown = z;
            return this;
        }

        public Builder mcses(byte[] bArr) {
            this.mcses = bArr;
            return this;
        }

        public Builder msbOfFlags(boolean z) {
            this.msbOfFlags = z;
            return this;
        }

        public Builder msbOfKnown(boolean z) {
            this.msbOfKnown = z;
            return this;
        }

        public Builder nsses(byte[] bArr) {
            this.nsses = bArr;
            return this;
        }

        public Builder partialAid(short s) {
            this.partialAid = s;
            return this;
        }

        public Builder partialAidKnown(boolean z) {
            this.partialAidKnown = z;
            return this;
        }

        public Builder secondMsbOfFlags(boolean z) {
            this.secondMsbOfFlags = z;
            return this;
        }

        public Builder secondMsbOfKnown(boolean z) {
            this.secondMsbOfKnown = z;
            return this;
        }

        public Builder seventhMsbOfKnown(boolean z) {
            this.seventhMsbOfKnown = z;
            return this;
        }

        public Builder shortGiNsymDisambiguation(boolean z) {
            this.shortGiNsymDisambiguation = z;
            return this;
        }

        public Builder shortGiNsymDisambiguationKnown(boolean z) {
            this.shortGiNsymDisambiguationKnown = z;
            return this;
        }

        public Builder shortGuardInterval(boolean z) {
            this.shortGuardInterval = z;
            return this;
        }

        public Builder sixthMsbOfKnown(boolean z) {
            this.sixthMsbOfKnown = z;
            return this;
        }

        public Builder stbc(boolean z) {
            this.stbc = z;
            return this;
        }

        public Builder stbcKnown(boolean z) {
            this.stbcKnown = z;
            return this;
        }

        public Builder thirdMsbOfKnown(boolean z) {
            this.thirdMsbOfKnown = z;
            return this;
        }

        public Builder txopPsNotAllowed(boolean z) {
            this.txopPsNotAllowed = z;
            return this;
        }

        public Builder txopPsNotAllowedKnown(boolean z) {
            this.txopPsNotAllowedKnown = z;
            return this;
        }

        public Builder unusedInCoding(byte b) {
            this.unusedInCoding = b;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataVht radiotapDataVht) {
            this.stbcKnown = radiotapDataVht.stbcKnown;
            this.txopPsNotAllowedKnown = radiotapDataVht.txopPsNotAllowedKnown;
            this.guardIntervalKnown = radiotapDataVht.guardIntervalKnown;
            this.shortGiNsymDisambiguationKnown = radiotapDataVht.shortGiNsymDisambiguationKnown;
            this.ldpcExtraOfdmSymbolKnown = radiotapDataVht.ldpcExtraOfdmSymbolKnown;
            this.beamformedKnown = radiotapDataVht.beamformedKnown;
            this.bandwidthKnown = radiotapDataVht.bandwidthKnown;
            this.groupIdKnown = radiotapDataVht.groupIdKnown;
            this.partialAidKnown = radiotapDataVht.partialAidKnown;
            this.seventhMsbOfKnown = radiotapDataVht.seventhMsbOfKnown;
            this.sixthMsbOfKnown = radiotapDataVht.sixthMsbOfKnown;
            this.fifthMsbOfKnown = radiotapDataVht.fifthMsbOfKnown;
            this.fourthMsbOfKnown = radiotapDataVht.fourthMsbOfKnown;
            this.thirdMsbOfKnown = radiotapDataVht.thirdMsbOfKnown;
            this.secondMsbOfKnown = radiotapDataVht.secondMsbOfKnown;
            this.msbOfKnown = radiotapDataVht.msbOfKnown;
            this.stbc = radiotapDataVht.stbc;
            this.txopPsNotAllowed = radiotapDataVht.txopPsNotAllowed;
            this.shortGuardInterval = radiotapDataVht.shortGuardInterval;
            this.shortGiNsymDisambiguation = radiotapDataVht.shortGiNsymDisambiguation;
            this.ldpcExtraOfdmSymbol = radiotapDataVht.ldpcExtraOfdmSymbol;
            this.beamformed = radiotapDataVht.beamformed;
            this.secondMsbOfFlags = radiotapDataVht.secondMsbOfFlags;
            this.msbOfFlags = radiotapDataVht.msbOfFlags;
            this.bandwidth = radiotapDataVht.bandwidth;
            this.mcses = radiotapDataVht.mcses;
            this.nsses = radiotapDataVht.nsses;
            this.fecTypes = radiotapDataVht.fecTypes;
            this.unusedInCoding = radiotapDataVht.unusedInCoding;
            this.groupId = radiotapDataVht.groupId;
            this.partialAid = radiotapDataVht.partialAid;
        }
    }

    public static RadiotapDataVht newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataVht(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataVht.class != obj.getClass()) {
            return false;
        }
        RadiotapDataVht radiotapDataVht = (RadiotapDataVht) obj;
        return this.bandwidth.equals(radiotapDataVht.bandwidth) && this.bandwidthKnown == radiotapDataVht.bandwidthKnown && this.beamformed == radiotapDataVht.beamformed && this.beamformedKnown == radiotapDataVht.beamformedKnown && Arrays.equals(this.fecTypes, radiotapDataVht.fecTypes) && this.fifthMsbOfKnown == radiotapDataVht.fifthMsbOfKnown && this.fourthMsbOfKnown == radiotapDataVht.fourthMsbOfKnown && this.groupId == radiotapDataVht.groupId && this.groupIdKnown == radiotapDataVht.groupIdKnown && this.guardIntervalKnown == radiotapDataVht.guardIntervalKnown && this.ldpcExtraOfdmSymbol == radiotapDataVht.ldpcExtraOfdmSymbol && this.ldpcExtraOfdmSymbolKnown == radiotapDataVht.ldpcExtraOfdmSymbolKnown && Arrays.equals(this.mcses, radiotapDataVht.mcses) && this.msbOfFlags == radiotapDataVht.msbOfFlags && this.msbOfKnown == radiotapDataVht.msbOfKnown && Arrays.equals(this.nsses, radiotapDataVht.nsses) && this.partialAid == radiotapDataVht.partialAid && this.partialAidKnown == radiotapDataVht.partialAidKnown && this.secondMsbOfFlags == radiotapDataVht.secondMsbOfFlags && this.secondMsbOfKnown == radiotapDataVht.secondMsbOfKnown && this.seventhMsbOfKnown == radiotapDataVht.seventhMsbOfKnown && this.shortGiNsymDisambiguation == radiotapDataVht.shortGiNsymDisambiguation && this.shortGiNsymDisambiguationKnown == radiotapDataVht.shortGiNsymDisambiguationKnown && this.shortGuardInterval == radiotapDataVht.shortGuardInterval && this.sixthMsbOfKnown == radiotapDataVht.sixthMsbOfKnown && this.stbc == radiotapDataVht.stbc && this.stbcKnown == radiotapDataVht.stbcKnown && this.thirdMsbOfKnown == radiotapDataVht.thirdMsbOfKnown && this.txopPsNotAllowed == radiotapDataVht.txopPsNotAllowed && this.txopPsNotAllowedKnown == radiotapDataVht.txopPsNotAllowedKnown && this.unusedInCoding == radiotapDataVht.unusedInCoding;
    }

    public RadiotapVhtBandwidth getBandwidth() {
        return this.bandwidth;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public RadiotapFecType[] getFecTypes() {
        return (RadiotapFecType[]) this.fecTypes.clone();
    }

    public boolean getFifthMsbOfKnown() {
        return this.fifthMsbOfKnown;
    }

    public boolean getFourthMsbOfKnown() {
        return this.fourthMsbOfKnown;
    }

    public byte getGroupId() {
        return this.groupId;
    }

    public int getGroupIdAsInt() {
        return this.groupId & 255;
    }

    public byte[] getMcses() {
        return ByteArrays.clone(this.mcses);
    }

    public boolean getMsbOfFlags() {
        return this.msbOfFlags;
    }

    public boolean getMsbOfKnown() {
        return this.msbOfKnown;
    }

    public byte[] getNsses() {
        return ByteArrays.clone(this.nsses);
    }

    public short getPartialAid() {
        return this.partialAid;
    }

    public int getPartialAidAsInt() {
        return this.partialAid & 65535;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[12];
        if (this.stbcKnown) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        if (this.txopPsNotAllowedKnown) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.guardIntervalKnown) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.shortGiNsymDisambiguationKnown) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.ldpcExtraOfdmSymbolKnown) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.beamformedKnown) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.bandwidthKnown) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.groupIdKnown) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        if (this.partialAidKnown) {
            bArr[1] = (byte) (bArr[1] | 1);
        }
        if (this.seventhMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 2);
        }
        if (this.sixthMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 4);
        }
        if (this.fifthMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.fourthMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        if (this.thirdMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 32);
        }
        if (this.secondMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 64);
        }
        if (this.msbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 128);
        }
        if (this.stbc) {
            bArr[2] = (byte) (bArr[2] | 1);
        }
        if (this.txopPsNotAllowed) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.shortGuardInterval) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        if (this.shortGiNsymDisambiguation) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        if (this.ldpcExtraOfdmSymbol) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.beamformed) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.secondMsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.msbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        bArr[3] = this.bandwidth.value().byteValue();
        for (int i = 0; i < 4; i++) {
            bArr[i + 4] = (byte) (this.nsses[i] | (this.mcses[i] << 4));
        }
        byte b = (byte) (this.unusedInCoding << 4);
        bArr[8] = b;
        RadiotapFecType[] radiotapFecTypeArr = this.fecTypes;
        RadiotapFecType radiotapFecType = radiotapFecTypeArr[0];
        RadiotapFecType radiotapFecType2 = RadiotapFecType.LDPC;
        if (radiotapFecType == radiotapFecType2) {
            bArr[8] = (byte) (b | 1);
        }
        if (radiotapFecTypeArr[1] == radiotapFecType2) {
            bArr[8] = (byte) (bArr[8] | 2);
        }
        if (radiotapFecTypeArr[2] == radiotapFecType2) {
            bArr[8] = (byte) (bArr[8] | 4);
        }
        if (radiotapFecTypeArr[3] == radiotapFecType2) {
            bArr[8] = (byte) (bArr[8] | 8);
        }
        bArr[9] = this.groupId;
        System.arraycopy(ByteArrays.toByteArray(this.partialAid, ByteOrder.LITTLE_ENDIAN), 0, bArr, 10, 2);
        return bArr;
    }

    public boolean getSecondMsbOfFlags() {
        return this.secondMsbOfFlags;
    }

    public boolean getSecondMsbOfKnown() {
        return this.secondMsbOfKnown;
    }

    public boolean getSeventhMsbOfKnown() {
        return this.seventhMsbOfKnown;
    }

    public boolean getSixthMsbOfKnown() {
        return this.sixthMsbOfKnown;
    }

    public boolean getThirdMsbOfKnown() {
        return this.thirdMsbOfKnown;
    }

    public byte getUnusedInCoding() {
        return this.unusedInCoding;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((Arrays.hashCode(this.nsses) + ((((((Arrays.hashCode(this.mcses) + ((((((((((((((((((((((((this.bandwidth.hashCode() + 31) * 31) + (this.bandwidthKnown ? 1231 : 1237)) * 31) + (this.beamformed ? 1231 : 1237)) * 31) + (this.beamformedKnown ? 1231 : 1237)) * 31) + Arrays.hashCode(this.fecTypes)) * 31) + (this.fifthMsbOfKnown ? 1231 : 1237)) * 31) + (this.fourthMsbOfKnown ? 1231 : 1237)) * 31) + this.groupId) * 31) + (this.groupIdKnown ? 1231 : 1237)) * 31) + (this.guardIntervalKnown ? 1231 : 1237)) * 31) + (this.ldpcExtraOfdmSymbol ? 1231 : 1237)) * 31) + (this.ldpcExtraOfdmSymbolKnown ? 1231 : 1237)) * 31)) * 31) + (this.msbOfFlags ? 1231 : 1237)) * 31) + (this.msbOfKnown ? 1231 : 1237)) * 31)) * 31) + this.partialAid) * 31) + (this.partialAidKnown ? 1231 : 1237)) * 31) + (this.secondMsbOfFlags ? 1231 : 1237)) * 31) + (this.secondMsbOfKnown ? 1231 : 1237)) * 31) + (this.seventhMsbOfKnown ? 1231 : 1237)) * 31) + (this.shortGiNsymDisambiguation ? 1231 : 1237)) * 31) + (this.shortGiNsymDisambiguationKnown ? 1231 : 1237)) * 31) + (this.shortGuardInterval ? 1231 : 1237)) * 31) + (this.sixthMsbOfKnown ? 1231 : 1237)) * 31) + (this.stbc ? 1231 : 1237)) * 31) + (this.stbcKnown ? 1231 : 1237)) * 31) + (this.thirdMsbOfKnown ? 1231 : 1237)) * 31) + (this.txopPsNotAllowed ? 1231 : 1237)) * 31) + (this.txopPsNotAllowedKnown ? 1231 : 1237)) * 31) + this.unusedInCoding;
    }

    public boolean isBandwidthKnown() {
        return this.bandwidthKnown;
    }

    public boolean isBeamformed() {
        return this.beamformed;
    }

    public boolean isBeamformedKnown() {
        return this.beamformedKnown;
    }

    public boolean isGroupIdKnown() {
        return this.groupIdKnown;
    }

    public boolean isGuardIntervalKnown() {
        return this.guardIntervalKnown;
    }

    public boolean isLdpcExtraOfdmSymbol() {
        return this.ldpcExtraOfdmSymbol;
    }

    public boolean isLdpcExtraOfdmSymbolKnown() {
        return this.ldpcExtraOfdmSymbolKnown;
    }

    public boolean isPartialAidKnown() {
        return this.partialAidKnown;
    }

    public boolean isShortGiNsymDisambiguation() {
        return this.shortGiNsymDisambiguation;
    }

    public boolean isShortGiNsymDisambiguationKnown() {
        return this.shortGiNsymDisambiguationKnown;
    }

    public boolean isShortGuardInterval() {
        return this.shortGuardInterval;
    }

    public boolean isStbc() {
        return this.stbc;
    }

    public boolean isStbcKnown() {
        return this.stbcKnown;
    }

    public boolean isTxopPsNotAllowed() {
        return this.txopPsNotAllowed;
    }

    public boolean isTxopPsNotAllowedKnown() {
        return this.txopPsNotAllowedKnown;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 12;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataVht(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 12) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapVht (12 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        this.stbcKnown = (b & 1) != 0;
        this.txopPsNotAllowedKnown = (b & 2) != 0;
        this.guardIntervalKnown = (b & 4) != 0;
        this.shortGiNsymDisambiguationKnown = (b & 8) != 0;
        this.ldpcExtraOfdmSymbolKnown = (b & 16) != 0;
        this.beamformedKnown = (b & 32) != 0;
        this.bandwidthKnown = (b & 64) != 0;
        this.groupIdKnown = (b & 128) != 0;
        byte b2 = bArr[i + 1];
        this.partialAidKnown = (b2 & 1) != 0;
        this.seventhMsbOfKnown = (b2 & 2) != 0;
        this.sixthMsbOfKnown = (b2 & 4) != 0;
        this.fifthMsbOfKnown = (b2 & 8) != 0;
        this.fourthMsbOfKnown = (b2 & 16) != 0;
        this.thirdMsbOfKnown = (b2 & 32) != 0;
        this.secondMsbOfKnown = (b2 & 64) != 0;
        this.msbOfKnown = (b2 & 128) != 0;
        byte b3 = bArr[i + 2];
        this.stbc = (b3 & 1) != 0;
        this.txopPsNotAllowed = (b3 & 2) != 0;
        this.shortGuardInterval = (b3 & 4) != 0;
        this.shortGiNsymDisambiguation = (b3 & 8) != 0;
        this.ldpcExtraOfdmSymbol = (b3 & 16) != 0;
        this.beamformed = (b3 & 32) != 0;
        this.secondMsbOfFlags = (b3 & 64) != 0;
        this.msbOfFlags = (b3 & 128) != 0;
        this.bandwidth = RadiotapVhtBandwidth.getInstance(Byte.valueOf(bArr[i + 3]));
        this.mcses = new byte[4];
        this.nsses = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            byte b4 = bArr[i + 4 + i3];
            this.mcses[i3] = (byte) ((b4 >> 4) & 15);
            this.nsses[i3] = (byte) (b4 & 15);
        }
        this.fecTypes = new RadiotapFecType[4];
        for (int i4 = 0; i4 < 4; i4++) {
            if (((bArr[i + 8] >> i4) & 1) != 0) {
                this.fecTypes[i4] = RadiotapFecType.LDPC;
            } else {
                this.fecTypes[i4] = RadiotapFecType.BCC;
            }
        }
        this.unusedInCoding = (byte) ((bArr[i + 8] >> 4) & 15);
        this.groupId = bArr[i + 9];
        this.partialAid = ByteArrays.getShort(bArr, i + 10, ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "VHT: ", str, sb);
        sb.append("  STBC known: ");
        t61.z(sb, this.stbcKnown, strZ, str, "  TXOP_PS_NOT_ALLOWED known: ");
        t61.z(sb, this.txopPsNotAllowedKnown, strZ, str, "  Guard interval known: ");
        t61.z(sb, this.guardIntervalKnown, strZ, str, "  Short GI NSYM disambiguation known: ");
        t61.z(sb, this.shortGiNsymDisambiguationKnown, strZ, str, "  LDPC extra OFDM symbol known: ");
        t61.z(sb, this.ldpcExtraOfdmSymbolKnown, strZ, str, "  Beamformed known: ");
        t61.z(sb, this.beamformedKnown, strZ, str, "  Bandwidth known: ");
        t61.z(sb, this.bandwidthKnown, strZ, str, "  Group ID known: ");
        t61.z(sb, this.groupIdKnown, strZ, str, "  Partial AID known: ");
        t61.z(sb, this.partialAidKnown, strZ, str, "  7th MSB of known: ");
        t61.z(sb, this.seventhMsbOfKnown, strZ, str, "  6th MSB of known: ");
        t61.z(sb, this.sixthMsbOfKnown, strZ, str, "  5th MSB of known: ");
        t61.z(sb, this.fifthMsbOfKnown, strZ, str, "  4th MSB of known: ");
        t61.z(sb, this.fourthMsbOfKnown, strZ, str, "  3rd MSB of known: ");
        t61.z(sb, this.thirdMsbOfKnown, strZ, str, "  2nd MSB of known: ");
        t61.z(sb, this.secondMsbOfKnown, strZ, str, "  MSB of known: ");
        t61.z(sb, this.msbOfKnown, strZ, str, "  STBC: ");
        t61.z(sb, this.stbc, strZ, str, "  TXOP_PS_NOT_ALLOWED: ");
        t61.z(sb, this.txopPsNotAllowed, strZ, str, "  Short Guard interval: ");
        t61.z(sb, this.shortGuardInterval, strZ, str, "  Short GI NSYM disambiguation: ");
        t61.z(sb, this.shortGiNsymDisambiguation, strZ, str, "  LDPC extra OFDM symbol: ");
        t61.z(sb, this.ldpcExtraOfdmSymbol, strZ, str, "  Beamformed: ");
        t61.z(sb, this.beamformed, strZ, str, "  2nd MSB of flags: ");
        t61.z(sb, this.secondMsbOfFlags, strZ, str, "  MSB of flags: ");
        t61.z(sb, this.msbOfFlags, strZ, str, "  Bandwidth: ");
        sb.append(this.bandwidth);
        sb.append(strZ);
        for (int i = 0; i < 4; i++) {
            sb.append(str);
            sb.append("  NSS-");
            sb.append(i);
            sb.append(": ");
            sb.append((int) this.nsses[i]);
            sb.append(strZ);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            sb.append(str);
            sb.append("  MCS-");
            sb.append(i2);
            sb.append(": ");
            sb.append((int) this.mcses[i2]);
            sb.append(strZ);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            sb.append(str);
            sb.append("  FEC-");
            sb.append(i3);
            sb.append(": ");
            sb.append(this.fecTypes[i3]);
            sb.append(strZ);
        }
        sb.append(str);
        sb.append("  Group ID: ");
        sb.append(getGroupIdAsInt());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Partial AID: ");
        sb.append(getPartialAidAsInt());
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataVht(Builder builder) {
        if (builder != null && builder.bandwidth != null && builder.mcses != null && builder.nsses != null && builder.fecTypes != null) {
            if ((builder.unusedInCoding & 240) == 0) {
                if (builder.mcses.length == 4) {
                    if (builder.nsses.length == 4) {
                        if (builder.fecTypes.length == 4) {
                            for (byte b : builder.mcses) {
                                if ((b & 240) != 0) {
                                    throw new IllegalArgumentException("(mcs & 0xF0) must be zero. builder.mcses: " + Arrays.toString(builder.mcses));
                                }
                            }
                            for (byte b2 : builder.nsses) {
                                if ((b2 & 240) != 0) {
                                    throw new IllegalArgumentException("(nss & 0xF0) must be zero. builder.nsses: " + Arrays.toString(builder.nsses));
                                }
                            }
                            this.stbcKnown = builder.stbcKnown;
                            this.txopPsNotAllowedKnown = builder.txopPsNotAllowedKnown;
                            this.guardIntervalKnown = builder.guardIntervalKnown;
                            this.shortGiNsymDisambiguationKnown = builder.shortGiNsymDisambiguationKnown;
                            this.ldpcExtraOfdmSymbolKnown = builder.ldpcExtraOfdmSymbolKnown;
                            this.beamformedKnown = builder.beamformedKnown;
                            this.bandwidthKnown = builder.bandwidthKnown;
                            this.groupIdKnown = builder.groupIdKnown;
                            this.partialAidKnown = builder.partialAidKnown;
                            this.seventhMsbOfKnown = builder.seventhMsbOfKnown;
                            this.sixthMsbOfKnown = builder.sixthMsbOfKnown;
                            this.fifthMsbOfKnown = builder.fifthMsbOfKnown;
                            this.fourthMsbOfKnown = builder.fourthMsbOfKnown;
                            this.thirdMsbOfKnown = builder.thirdMsbOfKnown;
                            this.secondMsbOfKnown = builder.secondMsbOfKnown;
                            this.msbOfKnown = builder.msbOfKnown;
                            this.stbc = builder.stbc;
                            this.txopPsNotAllowed = builder.txopPsNotAllowed;
                            this.shortGuardInterval = builder.shortGuardInterval;
                            this.shortGiNsymDisambiguation = builder.shortGiNsymDisambiguation;
                            this.ldpcExtraOfdmSymbol = builder.ldpcExtraOfdmSymbol;
                            this.beamformed = builder.beamformed;
                            this.secondMsbOfFlags = builder.secondMsbOfFlags;
                            this.msbOfFlags = builder.msbOfFlags;
                            this.bandwidth = builder.bandwidth;
                            this.mcses = ByteArrays.clone(builder.mcses);
                            this.nsses = ByteArrays.clone(builder.nsses);
                            this.fecTypes = (RadiotapFecType[]) builder.fecTypes.clone();
                            this.unusedInCoding = builder.unusedInCoding;
                            this.groupId = builder.groupId;
                            this.partialAid = builder.partialAid;
                            return;
                        }
                        throw new IllegalArgumentException("builder.fecTypes.length must be 4. builder.fecTypes: " + Arrays.toString(builder.fecTypes));
                    }
                    throw new IllegalArgumentException("builder.nsses.length must be 4. builder.nsses: " + Arrays.toString(builder.nsses));
                }
                throw new IllegalArgumentException("builder.mcses.length must be 4. builder.mcses: " + Arrays.toString(builder.mcses));
            }
            throw new IllegalArgumentException("builder.unusedInCoding & 0xF0 must be 0. builder.unusedInCoding: " + ((int) builder.unusedInCoding));
        }
        throw new NullPointerException("builder: " + builder + " builder.bandwidth: " + builder.bandwidth + " builder.mcses: " + builder.mcses + " builder.nsses: " + builder.nsses + " builder.fecTypes: " + builder.fecTypes);
    }
}
