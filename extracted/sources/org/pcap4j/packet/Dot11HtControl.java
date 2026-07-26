package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11HtControl implements Serializable {
    private static final long serialVersionUID = 8919536873635707080L;
    private final boolean acConstraint;
    private final boolean bit20;
    private final boolean bit21;
    private final boolean bit25;
    private final boolean bit26;
    private final boolean bit27;
    private final boolean bit28;
    private final boolean bit29;
    private final CalibrationPosition calibrationPosition;
    private final byte calibrationSequence;
    private final CsiOrSteering csiOrSteering;
    private final Dot11LinkAdaptationControl linkAdaptationControl;
    private final boolean ndpAnnouncement;
    private final boolean rdgOrMorePpdu;

    public static final class Builder {
        private boolean acConstraint;
        private boolean bit20;
        private boolean bit21;
        private boolean bit25;
        private boolean bit26;
        private boolean bit27;
        private boolean bit28;
        private boolean bit29;
        private CalibrationPosition calibrationPosition;
        private byte calibrationSequence;
        private CsiOrSteering csiOrSteering;
        private Dot11LinkAdaptationControl linkAdaptationControl;
        private boolean ndpAnnouncement;
        private boolean rdgOrMorePpdu;

        public Builder acConstraint(boolean z) {
            this.acConstraint = z;
            return this;
        }

        public Builder bit20(boolean z) {
            this.bit20 = z;
            return this;
        }

        public Builder bit21(boolean z) {
            this.bit21 = z;
            return this;
        }

        public Builder bit25(boolean z) {
            this.bit25 = z;
            return this;
        }

        public Builder bit26(boolean z) {
            this.bit26 = z;
            return this;
        }

        public Builder bit27(boolean z) {
            this.bit27 = z;
            return this;
        }

        public Builder bit28(boolean z) {
            this.bit28 = z;
            return this;
        }

        public Builder bit29(boolean z) {
            this.bit29 = z;
            return this;
        }

        public Dot11HtControl build() {
            return new Dot11HtControl(this);
        }

        public Builder calibrationPosition(CalibrationPosition calibrationPosition) {
            this.calibrationPosition = calibrationPosition;
            return this;
        }

        public Builder calibrationSequence(byte b) {
            this.calibrationSequence = b;
            return this;
        }

        public Builder csiOrSteering(CsiOrSteering csiOrSteering) {
            this.csiOrSteering = csiOrSteering;
            return this;
        }

        public Builder linkAdaptationControl(Dot11LinkAdaptationControl dot11LinkAdaptationControl) {
            this.linkAdaptationControl = dot11LinkAdaptationControl;
            return this;
        }

        public Builder ndpAnnouncement(boolean z) {
            this.ndpAnnouncement = z;
            return this;
        }

        public Builder rdgOrMorePpdu(boolean z) {
            this.rdgOrMorePpdu = z;
            return this;
        }

        public Builder() {
        }

        private Builder(Dot11HtControl dot11HtControl) {
            this.linkAdaptationControl = dot11HtControl.linkAdaptationControl;
            this.calibrationPosition = dot11HtControl.calibrationPosition;
            this.calibrationSequence = dot11HtControl.calibrationSequence;
            this.bit20 = dot11HtControl.bit20;
            this.bit21 = dot11HtControl.bit21;
            this.csiOrSteering = dot11HtControl.csiOrSteering;
            this.ndpAnnouncement = dot11HtControl.ndpAnnouncement;
            this.bit25 = dot11HtControl.bit25;
            this.bit26 = dot11HtControl.bit26;
            this.bit27 = dot11HtControl.bit27;
            this.bit28 = dot11HtControl.bit28;
            this.bit29 = dot11HtControl.bit29;
            this.acConstraint = dot11HtControl.acConstraint;
            this.rdgOrMorePpdu = dot11HtControl.rdgOrMorePpdu;
        }
    }

    public enum CalibrationPosition {
        NOT_CALIBRATION(0, "not a calibration frame"),
        CALIBRATION_START(1, "calibration start"),
        SOUNDING_RESPONSE(2, "sounding response"),
        SOUNDING_COMPLETE(3, "sounding complete");

        private final String name;
        private final int value;

        CalibrationPosition(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static CalibrationPosition getInstance(int i) {
            for (CalibrationPosition calibrationPosition : values()) {
                if (calibrationPosition.value == i) {
                    return calibrationPosition;
                }
            }
            throw new IllegalArgumentException(rm7.n(i, "Invalid value: "));
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb = new StringBuilder(50);
            sb.append(this.value);
            sb.append(" (");
            return dw1.s(sb, this.name, ")");
        }
    }

    public enum CsiOrSteering {
        NO_FEEDBACK_REQUIRED(0, "No feedback required"),
        CSI(1, "CSI"),
        NONCOMPRESSED_BEAMFORMING(2, "Noncompressed beamforming"),
        COMPRESSED_BEAMFORMING(3, "Compressed beamforming");

        private final String name;
        private final int value;

        CsiOrSteering(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static CsiOrSteering getInstance(int i) {
            for (CsiOrSteering csiOrSteering : values()) {
                if (csiOrSteering.value == i) {
                    return csiOrSteering;
                }
            }
            throw new IllegalArgumentException(rm7.n(i, "Invalid value: "));
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb = new StringBuilder(50);
            sb.append(this.value);
            sb.append(" (");
            return dw1.s(sb, this.name, ")");
        }
    }

    public static Dot11HtControl newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11HtControl(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11HtControl.class != obj.getClass()) {
            return false;
        }
        Dot11HtControl dot11HtControl = (Dot11HtControl) obj;
        return this.acConstraint == dot11HtControl.acConstraint && this.bit20 == dot11HtControl.bit20 && this.bit21 == dot11HtControl.bit21 && this.bit25 == dot11HtControl.bit25 && this.bit26 == dot11HtControl.bit26 && this.bit27 == dot11HtControl.bit27 && this.bit28 == dot11HtControl.bit28 && this.bit29 == dot11HtControl.bit29 && this.calibrationPosition == dot11HtControl.calibrationPosition && this.calibrationSequence == dot11HtControl.calibrationSequence && this.csiOrSteering == dot11HtControl.csiOrSteering && this.linkAdaptationControl.equals(dot11HtControl.linkAdaptationControl) && this.ndpAnnouncement == dot11HtControl.ndpAnnouncement && this.rdgOrMorePpdu == dot11HtControl.rdgOrMorePpdu;
    }

    public boolean getAcConstraint() {
        return this.acConstraint;
    }

    public boolean getBit20() {
        return this.bit20;
    }

    public boolean getBit21() {
        return this.bit21;
    }

    public boolean getBit25() {
        return this.bit25;
    }

    public boolean getBit26() {
        return this.bit26;
    }

    public boolean getBit27() {
        return this.bit27;
    }

    public boolean getBit28() {
        return this.bit28;
    }

    public boolean getBit29() {
        return this.bit29;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public CalibrationPosition getCalibrationPosition() {
        return this.calibrationPosition;
    }

    public byte getCalibrationSequence() {
        return this.calibrationSequence;
    }

    public int getCalibrationSequenceAsInt() {
        return this.calibrationSequence;
    }

    public CsiOrSteering getCsiOrSteering() {
        return this.csiOrSteering;
    }

    public Dot11LinkAdaptationControl getLinkAdaptationControl() {
        return this.linkAdaptationControl;
    }

    public boolean getNdpAnnouncement() {
        return this.ndpAnnouncement;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        System.arraycopy(this.linkAdaptationControl.getRawData(), 0, bArr, 0, 2);
        byte b = (byte) ((this.csiOrSteering.value << 6) | (this.calibrationSequence << 2) | this.calibrationPosition.value);
        bArr[2] = b;
        if (this.bit20) {
            bArr[2] = (byte) (b | 16);
        }
        if (this.bit21) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.ndpAnnouncement) {
            bArr[3] = (byte) (bArr[3] | 1);
        }
        if (this.bit25) {
            bArr[3] = (byte) (bArr[3] | 2);
        }
        if (this.bit26) {
            bArr[3] = (byte) (bArr[3] | 4);
        }
        if (this.bit27) {
            bArr[3] = (byte) (bArr[3] | 8);
        }
        if (this.bit28) {
            bArr[3] = (byte) (bArr[3] | 16);
        }
        if (this.bit29) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.acConstraint) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (this.rdgOrMorePpdu) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        return bArr;
    }

    public boolean getRdgOrMorePpdu() {
        return this.rdgOrMorePpdu;
    }

    public int hashCode() {
        return ((((this.linkAdaptationControl.hashCode() + ((this.csiOrSteering.hashCode() + ((((this.calibrationPosition.hashCode() + (((((((((((((((((this.acConstraint ? 1231 : 1237) + 31) * 31) + (this.bit20 ? 1231 : 1237)) * 31) + (this.bit21 ? 1231 : 1237)) * 31) + (this.bit25 ? 1231 : 1237)) * 31) + (this.bit26 ? 1231 : 1237)) * 31) + (this.bit27 ? 1231 : 1237)) * 31) + (this.bit28 ? 1231 : 1237)) * 31) + (this.bit29 ? 1231 : 1237)) * 31)) * 31) + this.calibrationSequence) * 31)) * 31)) * 31) + (this.ndpAnnouncement ? 1231 : 1237)) * 31) + (this.rdgOrMorePpdu ? 1231 : 1237);
    }

    public int length() {
        return 4;
    }

    public String toString() {
        return toString("");
    }

    private Dot11HtControl(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 4) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a Dot11HtControl (2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.linkAdaptationControl = Dot11LinkAdaptationControl.newInstance(bArr, i, 2);
        byte b = bArr[i + 2];
        this.calibrationPosition = CalibrationPosition.getInstance(b & 3);
        this.calibrationSequence = (byte) ((b >> 2) & 3);
        this.bit20 = (b & 16) != 0;
        this.bit21 = (b & 32) != 0;
        this.csiOrSteering = CsiOrSteering.getInstance((b >> 6) & 3);
        byte b2 = bArr[i + 3];
        this.ndpAnnouncement = (b2 & 1) != 0;
        this.bit25 = (b2 & 2) != 0;
        this.bit26 = (b2 & 4) != 0;
        this.bit27 = (b2 & 8) != 0;
        this.bit28 = (b2 & 16) != 0;
        this.bit29 = (b2 & 32) != 0;
        this.acConstraint = (b2 & 64) != 0;
        this.rdgOrMorePpdu = (b2 & 128) != 0;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb.append(str);
        sb.append("Link Adaptation Control: ");
        sb.append(this.linkAdaptationControl);
        sb.append(property);
        sb.append(str);
        sb.append("Calibration Position: ");
        sb.append(this.calibrationPosition);
        sb.append(property);
        sb.append(str);
        sb.append("Calibration Sequence: ");
        sb.append((int) this.calibrationSequence);
        sb.append(property);
        sb.append(str);
        sb.append("Bit 20: ");
        t61.z(sb, this.bit20, property, str, "Bit 21: ");
        t61.z(sb, this.bit21, property, str, "CSI/Steering: ");
        sb.append(this.csiOrSteering);
        sb.append(property);
        sb.append(str);
        sb.append("NDP Announcement: ");
        t61.z(sb, this.ndpAnnouncement, property, str, "Bit 25: ");
        t61.z(sb, this.bit25, property, str, "Bit 26: ");
        t61.z(sb, this.bit26, property, str, "Bit 27: ");
        t61.z(sb, this.bit27, property, str, "Bit 28: ");
        t61.z(sb, this.bit28, property, str, "Bit 29: ");
        t61.z(sb, this.bit29, property, str, "AC Constraint: ");
        t61.z(sb, this.acConstraint, property, str, "RDG/More PPDU: ");
        return t61.l(sb, this.rdgOrMorePpdu, property);
    }

    private Dot11HtControl(Builder builder) {
        if (builder != null && builder.linkAdaptationControl != null && builder.calibrationPosition != null && builder.csiOrSteering != null) {
            if ((builder.calibrationSequence & 252) == 0) {
                this.linkAdaptationControl = builder.linkAdaptationControl;
                this.calibrationPosition = builder.calibrationPosition;
                this.calibrationSequence = builder.calibrationSequence;
                this.bit20 = builder.bit20;
                this.bit21 = builder.bit21;
                this.csiOrSteering = builder.csiOrSteering;
                this.ndpAnnouncement = builder.ndpAnnouncement;
                this.bit25 = builder.bit25;
                this.bit26 = builder.bit26;
                this.bit27 = builder.bit27;
                this.bit28 = builder.bit28;
                this.bit29 = builder.bit29;
                this.acConstraint = builder.acConstraint;
                this.rdgOrMorePpdu = builder.rdgOrMorePpdu;
                return;
            }
            StringBuilder sbA = o40.A(150, "(builder.calibrationSequence & 0xFC) must be zero. builder.calibrationSequence: ");
            sbA.append((int) builder.calibrationSequence);
            throw new IllegalArgumentException(sbA.toString());
        }
        throw new NullPointerException("builder: " + builder + " builder.linkAdaptationControl: " + builder.linkAdaptationControl + " builder.calibrationPosition: " + builder.calibrationPosition + " builder.csiOrSteering: " + builder.csiOrSteering);
    }
}
