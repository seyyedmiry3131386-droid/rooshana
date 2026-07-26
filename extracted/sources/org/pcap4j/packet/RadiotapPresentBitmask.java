package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.namednumber.RadiotapPresentBitNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapPresentBitmask implements Serializable {
    private static final long serialVersionUID = -4525947413002802922L;
    private final boolean anotherBitmapFollows;
    private final List<RadiotapPresentBitNumber> bitNumbers;
    private final String namespace;
    private final boolean radiotapNamespaceNext;
    private final boolean vendorNamespaceNext;

    public static final class Builder {
        private boolean anotherBitmapFollows;
        private List<RadiotapPresentBitNumber> bitNumbers;
        private String namespace;
        private boolean radiotapNamespaceNext;
        private boolean vendorNamespaceNext;

        public Builder anotherBitmapFollows(boolean z) {
            this.anotherBitmapFollows = z;
            return this;
        }

        public Builder bitNumbers(List<RadiotapPresentBitNumber> list) {
            this.bitNumbers = list;
            return this;
        }

        public RadiotapPresentBitmask build() {
            return new RadiotapPresentBitmask(this);
        }

        public Builder namespace(String str) {
            this.namespace = str;
            return this;
        }

        public Builder radiotapNamespaceNext(boolean z) {
            this.radiotapNamespaceNext = z;
            return this;
        }

        public Builder vendorNamespaceNext(boolean z) {
            this.vendorNamespaceNext = z;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapPresentBitmask radiotapPresentBitmask) {
            this.namespace = radiotapPresentBitmask.namespace;
            this.bitNumbers = radiotapPresentBitmask.bitNumbers;
            this.radiotapNamespaceNext = radiotapPresentBitmask.radiotapNamespaceNext;
            this.vendorNamespaceNext = radiotapPresentBitmask.vendorNamespaceNext;
            this.anotherBitmapFollows = radiotapPresentBitmask.anotherBitmapFollows;
        }
    }

    public static RadiotapPresentBitmask newInstance(byte[] bArr, int i, int i2, int i3) throws IllegalRawDataException {
        return newInstance(bArr, i, i2, i3, "");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!RadiotapPresentBitmask.class.isInstance(obj)) {
            return false;
        }
        RadiotapPresentBitmask radiotapPresentBitmask = (RadiotapPresentBitmask) obj;
        return this.bitNumbers.equals(radiotapPresentBitmask.bitNumbers) && this.namespace.equals(radiotapPresentBitmask.namespace) && this.radiotapNamespaceNext == radiotapPresentBitmask.radiotapNamespaceNext && this.vendorNamespaceNext == radiotapPresentBitmask.vendorNamespaceNext && this.anotherBitmapFollows == radiotapPresentBitmask.anotherBitmapFollows;
    }

    public ArrayList<RadiotapPresentBitNumber> getBitNumbers() {
        return new ArrayList<>(this.bitNumbers);
    }

    public byte[] getBitmask() {
        return getRawData();
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public String getNamespace() {
        return this.namespace;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        Iterator<RadiotapPresentBitNumber> it = this.bitNumbers.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().value().intValue() % 32;
            int i = iIntValue / 8;
            bArr[i] = (byte) ((1 << (iIntValue % 8)) | bArr[i]);
        }
        boolean z = this.radiotapNamespaceNext;
        if (z) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.vendorNamespaceNext) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (z) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        return bArr;
    }

    public int hashCode() {
        return ((((this.bitNumbers.hashCode() + rm7.k(this.namespace, ((this.anotherBitmapFollows ? 1231 : 1237) + 31) * 31, 31)) * 31) + (this.radiotapNamespaceNext ? 1231 : 1237)) * 31) + (this.vendorNamespaceNext ? 1231 : 1237);
    }

    public boolean isAnotherBitmapFollows() {
        return this.anotherBitmapFollows;
    }

    public boolean isRadiotapNamespaceNext() {
        return this.radiotapNamespaceNext;
    }

    public boolean isVendorNamespaceNext() {
        return this.vendorNamespaceNext;
    }

    public int length() {
        return 4;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapPresentBitmask(byte[] bArr, int i, int i2, int i3, String str) throws IllegalRawDataException {
        if (4 > i2) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapPresentBitmask (4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.namespace = str;
        this.bitNumbers = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < 4; i4++) {
            byte b = bArr[i + i4];
            for (int i5 = 0; i5 < 8; i5++) {
                if ((b & 1) != 0) {
                    switch (i3 % 32) {
                        case 29:
                            z = true;
                            break;
                        case 30:
                            z2 = true;
                            break;
                        case 31:
                            z3 = true;
                            break;
                        default:
                            this.bitNumbers.add(RadiotapPresentBitNumber.getInstance(Integer.valueOf(i3), str));
                            break;
                    }
                }
                i3++;
                b = (byte) (b >>> 1);
            }
        }
        this.radiotapNamespaceNext = z;
        this.vendorNamespaceNext = z2;
        this.anotherBitmapFollows = z3;
    }

    public static RadiotapPresentBitmask newInstance(byte[] bArr, int i, int i2, int i3, String str) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapPresentBitmask(bArr, i, i2, i3, str);
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb.append(str);
        sb.append("Present Bitmask (");
        sb.append(ByteArrays.toHexString(getRawData(), " "));
        sb.append("):");
        sb.append(property);
        t61.y(sb, str, "  Present Fields: ", property);
        for (RadiotapPresentBitNumber radiotapPresentBitNumber : this.bitNumbers) {
            sb.append(str);
            sb.append("    ");
            sb.append(radiotapPresentBitNumber);
            sb.append(property);
        }
        sb.append(str);
        sb.append("  Radiotap NS Next: ");
        t61.z(sb, this.radiotapNamespaceNext, property, str, "  Vendor NS Next: ");
        t61.z(sb, this.vendorNamespaceNext, property, str, "  Another Bitmap Follows: ");
        return t61.l(sb, this.anotherBitmapFollows, property);
    }

    private RadiotapPresentBitmask(Builder builder) {
        if (builder != null && builder.namespace != null && builder.bitNumbers != null) {
            if (builder.bitNumbers.size() <= 29) {
                this.namespace = builder.namespace;
                this.bitNumbers = new ArrayList(builder.bitNumbers);
                this.radiotapNamespaceNext = builder.radiotapNamespaceNext;
                this.vendorNamespaceNext = builder.vendorNamespaceNext;
                this.anotherBitmapFollows = builder.anotherBitmapFollows;
                return;
            }
            throw new IllegalArgumentException("bitNumbers.size() must be less than 30 but is: " + builder.bitNumbers.size());
        }
        throw new NullPointerException("builder: " + builder + " builder.namespace: " + builder.namespace + " builder.bitNumbers: " + builder.bitNumbers);
    }
}
