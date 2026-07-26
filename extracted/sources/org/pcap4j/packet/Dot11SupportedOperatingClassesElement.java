package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11SupportedOperatingClassesElement extends Dot11InformationElement {
    private static final long serialVersionUID = 2089786652681023988L;
    private final byte currentOperatingClass;
    private final byte[] operatingClasses;

    public static final class Builder extends Dot11InformationElement.Builder {
        private byte currentOperatingClass;
        private byte[] operatingClasses;

        public Builder currentOperatingClass(byte b) {
            this.currentOperatingClass = b;
            return this;
        }

        public Builder operatingClasses(byte[] bArr) {
            this.operatingClasses = bArr;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.SUPPORTED_OPERATING_CLASSES.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.operatingClasses != null) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) (this.operatingClasses.length + 1));
                }
                return new Dot11SupportedOperatingClassesElement(this);
            }
            throw new NullPointerException("operatingClasses: " + this.operatingClasses);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b) {
            super.length(b);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z) {
            super.correctLengthAtBuild2(z);
            return this;
        }

        private Builder(Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement) {
            super(dot11SupportedOperatingClassesElement);
            this.currentOperatingClass = dot11SupportedOperatingClassesElement.currentOperatingClass;
            this.operatingClasses = dot11SupportedOperatingClassesElement.operatingClasses;
        }
    }

    public static Dot11SupportedOperatingClassesElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11SupportedOperatingClassesElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = (Dot11SupportedOperatingClassesElement) obj;
        return this.currentOperatingClass == dot11SupportedOperatingClassesElement.currentOperatingClass && Arrays.equals(this.operatingClasses, dot11SupportedOperatingClassesElement.operatingClasses);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getCurrentOperatingClass() {
        return this.currentOperatingClass;
    }

    public int getCurrentOperatingClassAsInt() {
        return this.currentOperatingClass & 255;
    }

    public byte[] getOperatingClasses() {
        return ByteArrays.clone(this.operatingClasses);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        bArr[2] = this.currentOperatingClass;
        byte[] bArr2 = this.operatingClasses;
        System.arraycopy(bArr2, 0, bArr, 3, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return Arrays.hashCode(this.operatingClasses) + (((super.hashCode() * 31) + this.currentOperatingClass) * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.operatingClasses.length + 3;
    }

    public String toString() {
        return toString("");
    }

    private Dot11SupportedOperatingClassesElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.SUPPORTED_OPERATING_CLASSES);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt < 1) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "The length must be more than 0 but is actually: "));
        }
        this.currentOperatingClass = bArr[i + 2];
        if (lengthAsInt == 1) {
            this.operatingClasses = new byte[0];
        } else {
            this.operatingClasses = ByteArrays.getSubArray(bArr, i + 3, lengthAsInt - 1);
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Supported Operating Classes:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  Current Operating Class: ");
        sb.append(getCurrentOperatingClassAsInt());
        sb.append(strZ);
        for (byte b : this.operatingClasses) {
            sb.append(str);
            sb.append("  Operating Class: ");
            sb.append(b & 255);
            sb.append(strZ);
        }
        return sb.toString();
    }

    private Dot11SupportedOperatingClassesElement(Builder builder) {
        super(builder);
        if (builder.operatingClasses.length <= 254) {
            this.currentOperatingClass = builder.currentOperatingClass;
            this.operatingClasses = ByteArrays.clone(builder.operatingClasses);
        } else {
            throw new IllegalArgumentException("Too long operatingClasses: " + ByteArrays.toHexString(builder.operatingClasses, " "));
        }
    }
}
