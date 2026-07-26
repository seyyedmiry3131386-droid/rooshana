package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot112040BssCoexistenceElement extends Dot11InformationElement {
    private static final long serialVersionUID = 8883468584264617141L;
    private final boolean bit5;
    private final boolean bit6;
    private final boolean bit7;
    private final boolean fortyMhzIntolerant;
    private final boolean informationRequested;
    private final boolean obssScanningExemptionGranted;
    private final boolean obssScanningExemptionRequested;
    private final boolean twentyMhzBssWidthRequested;

    public static final class Builder extends Dot11InformationElement.Builder {
        private boolean bit5;
        private boolean bit6;
        private boolean bit7;
        private boolean fortyMhzIntolerant;
        private boolean informationRequested;
        private boolean obssScanningExemptionGranted;
        private boolean obssScanningExemptionRequested;
        private boolean twentyMhzBssWidthRequested;

        public Builder bit5(boolean z) {
            this.bit5 = z;
            return this;
        }

        public Builder bit6(boolean z) {
            this.bit6 = z;
            return this;
        }

        public Builder bit7(boolean z) {
            this.bit7 = z;
            return this;
        }

        public Builder fortyMhzIntolerant(boolean z) {
            this.fortyMhzIntolerant = z;
            return this;
        }

        public Builder informationRequested(boolean z) {
            this.informationRequested = z;
            return this;
        }

        public Builder obssScanningExemptionGranted(boolean z) {
            this.obssScanningExemptionGranted = z;
            return this;
        }

        public Builder obssScanningExemptionRequested(boolean z) {
            this.obssScanningExemptionRequested = z;
            return this;
        }

        public Builder twentyMhzBssWidthRequested(boolean z) {
            this.twentyMhzBssWidthRequested = z;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.IE_20_40_BSS_COEXISTENCE.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                length((byte) 1);
            }
            return new Dot112040BssCoexistenceElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b) {
            super.length(b);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z) {
            super.correctLengthAtBuild2(z);
            return this;
        }

        private Builder(Dot112040BssCoexistenceElement dot112040BssCoexistenceElement) {
            super(dot112040BssCoexistenceElement);
            this.informationRequested = dot112040BssCoexistenceElement.informationRequested;
            this.fortyMhzIntolerant = dot112040BssCoexistenceElement.fortyMhzIntolerant;
            this.twentyMhzBssWidthRequested = dot112040BssCoexistenceElement.twentyMhzBssWidthRequested;
            this.obssScanningExemptionRequested = dot112040BssCoexistenceElement.obssScanningExemptionRequested;
            this.obssScanningExemptionGranted = dot112040BssCoexistenceElement.obssScanningExemptionGranted;
            this.bit5 = dot112040BssCoexistenceElement.bit5;
            this.bit6 = dot112040BssCoexistenceElement.bit6;
            this.bit7 = dot112040BssCoexistenceElement.bit7;
        }
    }

    public static Dot112040BssCoexistenceElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot112040BssCoexistenceElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = (Dot112040BssCoexistenceElement) obj;
        return this.fortyMhzIntolerant == dot112040BssCoexistenceElement.fortyMhzIntolerant && this.informationRequested == dot112040BssCoexistenceElement.informationRequested && this.obssScanningExemptionGranted == dot112040BssCoexistenceElement.obssScanningExemptionGranted && this.obssScanningExemptionRequested == dot112040BssCoexistenceElement.obssScanningExemptionRequested && this.twentyMhzBssWidthRequested == dot112040BssCoexistenceElement.twentyMhzBssWidthRequested && this.bit5 == dot112040BssCoexistenceElement.bit5 && this.bit6 == dot112040BssCoexistenceElement.bit6 && this.bit7 == dot112040BssCoexistenceElement.bit7;
    }

    public boolean getBit5() {
        return this.bit5;
    }

    public boolean getBit6() {
        return this.bit6;
    }

    public boolean getBit7() {
        return this.bit7;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[3];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        if (this.informationRequested) {
            bArr[2] = (byte) (bArr[2] | 1);
        }
        if (this.fortyMhzIntolerant) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.twentyMhzBssWidthRequested) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        if (this.obssScanningExemptionRequested) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        if (this.obssScanningExemptionGranted) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.bit5) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.bit6) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.bit7) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (((((((((((((((super.hashCode() * 31) + (this.bit5 ? 1231 : 1237)) * 31) + (this.bit6 ? 1231 : 1237)) * 31) + (this.bit7 ? 1231 : 1237)) * 31) + (this.fortyMhzIntolerant ? 1231 : 1237)) * 31) + (this.informationRequested ? 1231 : 1237)) * 31) + (this.obssScanningExemptionGranted ? 1231 : 1237)) * 31) + (this.obssScanningExemptionRequested ? 1231 : 1237)) * 31) + (this.twentyMhzBssWidthRequested ? 1231 : 1237);
    }

    public boolean is20MhzBssWidthRequested() {
        return this.twentyMhzBssWidthRequested;
    }

    public boolean is40MhzIntolerant() {
        return this.fortyMhzIntolerant;
    }

    public boolean isInformationRequested() {
        return this.informationRequested;
    }

    public boolean isObssScanningExemptionGranted() {
        return this.obssScanningExemptionGranted;
    }

    public boolean isObssScanningExemptionRequested() {
        return this.obssScanningExemptionRequested;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return 3;
    }

    public String toString() {
        return toString("");
    }

    private Dot112040BssCoexistenceElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.IE_20_40_BSS_COEXISTENCE);
        if (getLengthAsInt() != 1) {
            throw new IllegalRawDataException("The length must be 1 but is actually: " + getLengthAsInt());
        }
        byte b = bArr[i + 2];
        this.informationRequested = (b & 1) != 0;
        this.fortyMhzIntolerant = (b & 2) != 0;
        this.twentyMhzBssWidthRequested = (b & 4) != 0;
        this.obssScanningExemptionRequested = (b & 8) != 0;
        this.obssScanningExemptionGranted = (b & 16) != 0;
        this.bit5 = (b & 32) != 0;
        this.bit6 = (b & 64) != 0;
        this.bit7 = (b & 128) != 0;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "20/40 BSS Coexistence:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  Information Requested: ");
        t61.z(sb, this.informationRequested, strZ, str, "  40 MHz Intolerant: ");
        t61.z(sb, this.fortyMhzIntolerant, strZ, str, "  20 MHz BSS Width Requested: ");
        t61.z(sb, this.twentyMhzBssWidthRequested, strZ, str, "  OBSS Scanning Exemption Requested: ");
        t61.z(sb, this.obssScanningExemptionRequested, strZ, str, "  OBSS Scanning Exemption Granted: ");
        t61.z(sb, this.obssScanningExemptionGranted, strZ, str, "  Bit 5: ");
        t61.z(sb, this.bit5, strZ, str, "  Bit 6: ");
        t61.z(sb, this.bit6, strZ, str, "  Bit 7: ");
        return t61.l(sb, this.bit7, strZ);
    }

    private Dot112040BssCoexistenceElement(Builder builder) {
        super(builder);
        this.informationRequested = builder.informationRequested;
        this.fortyMhzIntolerant = builder.fortyMhzIntolerant;
        this.twentyMhzBssWidthRequested = builder.twentyMhzBssWidthRequested;
        this.obssScanningExemptionRequested = builder.obssScanningExemptionRequested;
        this.obssScanningExemptionGranted = builder.obssScanningExemptionGranted;
        this.bit5 = builder.bit5;
        this.bit6 = builder.bit6;
        this.bit7 = builder.bit7;
    }
}
