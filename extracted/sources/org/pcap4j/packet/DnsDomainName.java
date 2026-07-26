package org.pcap4j.packet;

import defpackage.bl4;
import defpackage.o40;
import defpackage.rm7;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsDomainName implements Serializable {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) DnsDomainName.class);
    public static final DnsDomainName ROOT_DOMAIN;
    private static final long serialVersionUID = -9123494137779222577L;
    private final List<String> labels;
    private final String name;
    private final Short pointer;

    public static final class Builder {
        private List<String> labels;
        private Short pointer;

        public DnsDomainName build() {
            return new DnsDomainName(this);
        }

        public Builder labels(List<String> list) {
            this.labels = list;
            return this;
        }

        public Builder pointer(Short sh) {
            this.pointer = sh;
            return this;
        }

        public Builder() {
            this.pointer = null;
        }

        public Builder labels(String[] strArr) {
            this.labels = Arrays.asList(strArr);
            return this;
        }

        private Builder(DnsDomainName dnsDomainName) {
            this.pointer = null;
            this.labels = dnsDomainName.labels;
            this.pointer = dnsDomainName.pointer;
        }
    }

    static {
        try {
            ROOT_DOMAIN = new DnsDomainName(new byte[]{0}, 0, 1);
        } catch (IllegalRawDataException unused) {
            throw new AssertionError("Never get here.");
        }
    }

    private String joinLabels(List<String> list) {
        if (list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (true) {
            sb.append(it.next());
            if (!it.hasNext()) {
                return sb.toString();
            }
            sb.append(".");
        }
    }

    public static DnsDomainName newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsDomainName(bArr, i, i2);
    }

    public String decompress(byte[] bArr) throws IllegalRawDataException {
        if (bArr != null) {
            return decompress(bArr, new ArrayList());
        }
        throw new NullPointerException("headerRawData is null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsDomainName.class != obj.getClass()) {
            return false;
        }
        DnsDomainName dnsDomainName = (DnsDomainName) obj;
        if (!this.name.equals(dnsDomainName.name)) {
            return false;
        }
        Short sh = this.pointer;
        if (sh == null) {
            if (dnsDomainName.pointer != null) {
                return false;
            }
        } else if (!sh.equals(dnsDomainName.pointer)) {
            return false;
        }
        return true;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public List<String> getLabels() {
        return new ArrayList(this.labels);
    }

    public String getName() {
        return this.name;
    }

    public Short getPointer() {
        return this.pointer;
    }

    public Integer getPointerAsInt() {
        Short sh = this.pointer;
        if (sh != null) {
            return Integer.valueOf(sh.shortValue());
        }
        return null;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        Iterator<String> it = this.labels.iterator();
        int length = 0;
        while (it.hasNext()) {
            byte[] bytes = it.next().getBytes();
            bArr[length] = (byte) bytes.length;
            int i = length + 1;
            System.arraycopy(bytes, 0, bArr, i, bytes.length);
            length = i + bytes.length;
        }
        Short sh = this.pointer;
        if (sh != null) {
            byte[] byteArray = ByteArrays.toByteArray(sh.shortValue());
            byteArray[0] = (byte) (byteArray[0] | 192);
            System.arraycopy(byteArray, 0, bArr, length, byteArray.length);
        }
        return bArr;
    }

    public int hashCode() {
        int iK = rm7.k(this.name, 31, 31);
        Short sh = this.pointer;
        return iK + (sh == null ? 0 : sh.hashCode());
    }

    public int length() {
        Iterator<String> it = this.labels.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length() + 1;
        }
        return this.pointer != null ? length + 2 : length + 1;
    }

    public String toString() {
        if (this.labels.size() == 0 && this.pointer == null) {
            return "<ROOT>";
        }
        if (this.pointer == null) {
            return this.name;
        }
        return "[name: " + this.name + ", pointer: " + this.pointer + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        r17.pointer = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r17.name = joinLabels(r17.labels);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r4 = defpackage.o40.A(ir.mservices.market.version2.webapi.responsedto.ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "No null termination nor pointer. data: ");
        defpackage.t61.t(r19, " ", ", offset: ", r4, r18);
        r4.append(", length: ");
        r4.append(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        throw new org.pcap4j.packet.IllegalRawDataException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private DnsDomainName(byte[] r18, int r19, int r20) throws org.pcap4j.packet.IllegalRawDataException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.packet.DnsDomainName.<init>(byte[], int, int):void");
    }

    private String decompress(byte[] bArr, List<Short> list) throws IllegalRawDataException {
        Short sh = this.pointer;
        if (sh == null) {
            return this.name;
        }
        if (!list.contains(sh)) {
            list.add(this.pointer);
            return this.name + "." + new DnsDomainName(bArr, this.pointer.shortValue(), bArr.length - this.pointer.shortValue()).decompress(bArr, list);
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "Circular reference detected. data: ");
        sbA.append(ByteArrays.toHexString(bArr, " "));
        sbA.append(", offset: ");
        sbA.append(this.pointer);
        sbA.append(", name: ");
        sbA.append(this.name);
        throw new IllegalRawDataException(sbA.toString());
    }

    public String toString(byte[] bArr) {
        String strDecompress;
        if (this.labels.size() == 0 && this.pointer == null) {
            return "<ROOT>";
        }
        if (this.pointer == null) {
            return this.name;
        }
        try {
            strDecompress = decompress(bArr);
        } catch (IllegalRawDataException e) {
            LOG.error("Error occurred during building complete name.", (Throwable) e);
            strDecompress = "Error occurred during building complete name";
        }
        StringBuilder sbE = bl4.E(strDecompress, " (name: ");
        sbE.append(this.name);
        sbE.append(", pointer: ");
        sbE.append(this.pointer);
        sbE.append(")");
        return sbE.toString();
    }

    private DnsDomainName(Builder builder) {
        if (builder != null && builder.labels != null) {
            for (String str : builder.labels) {
                if (str.getBytes().length > 63) {
                    throw new IllegalArgumentException("Length of a label must be less than 64. label: ".concat(str));
                }
            }
            if (builder.pointer != null && (builder.pointer.shortValue() & 49152) != 0) {
                throw new IllegalArgumentException("(builder.pointer & 0xC000) must be zero. builder.pointer: " + builder.pointer);
            }
            ArrayList arrayList = new ArrayList(builder.labels);
            this.labels = arrayList;
            this.name = joinLabels(arrayList);
            this.pointer = builder.pointer;
            return;
        }
        throw new NullPointerException("builder" + builder + " builder.labels: " + builder.labels);
    }
}
