package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11VendorSpecificElement extends Dot11InformationElement {
    private static final long serialVersionUID = 2095272309443428672L;
    private final byte[] information;

    public static final class Builder extends Dot11InformationElement.Builder {
        private byte[] information;

        public Builder information(byte[] bArr) {
            this.information = bArr;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.VENDOR_SPECIFIC.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.information == null) {
                throw new NullPointerException("information is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) this.information.length);
            }
            return new Dot11VendorSpecificElement(this);
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

        private Builder(Dot11VendorSpecificElement dot11VendorSpecificElement) {
            super(dot11VendorSpecificElement);
            this.information = dot11VendorSpecificElement.information;
        }
    }

    public static Dot11VendorSpecificElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11VendorSpecificElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && Arrays.equals(this.information, ((Dot11VendorSpecificElement) obj).information);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getInformation() {
        return ByteArrays.clone(this.information);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte[] bArr2 = this.information;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return Arrays.hashCode(this.information) + (super.hashCode() * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.information.length + 2;
    }

    public String toString() {
        return toString("");
    }

    private Dot11VendorSpecificElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.VENDOR_SPECIFIC);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt == 0) {
            this.information = new byte[0];
        } else {
            this.information = ByteArrays.getSubArray(bArr, i + 2, lengthAsInt);
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Vendor Specific:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  Information: 0x");
        return t61.m(this.information, "", sb, strZ);
    }

    private Dot11VendorSpecificElement(Builder builder) {
        super(builder);
        if (builder.information.length <= 255) {
            this.information = ByteArrays.clone(builder.information);
        } else {
            throw new IllegalArgumentException("Too long information: " + builder.information);
        }
    }
}
