package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataTxt implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 469382715852386597L;
    private final List<String> texts;

    public static final class Builder {
        private List<String> texts;

        public DnsRDataTxt build() {
            return new DnsRDataTxt(this);
        }

        public Builder texts(List<String> list) {
            this.texts = list;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataTxt dnsRDataTxt) {
            this.texts = dnsRDataTxt.texts;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb.append(str);
        sb.append("TXT RDATA:");
        sb.append(property);
        Iterator<String> it = this.texts.iterator();
        while (it.hasNext()) {
            o40.I(str, "  TEXT: ", it.next(), property, sb);
        }
        return sb.toString();
    }

    public static DnsRDataTxt newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataTxt(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DnsRDataTxt.class == obj.getClass() && this.texts.equals(((DnsRDataTxt) obj).texts);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        ArrayList<byte[]> arrayList = new ArrayList();
        Iterator<String> it = this.texts.iterator();
        int length = 0;
        while (it.hasNext()) {
            byte[] bytes = it.next().getBytes();
            arrayList.add(bytes);
            length += bytes.length + 1;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : arrayList) {
            bArr[length2] = (byte) bArr2.length;
            int i = length2 + 1;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            length2 = i + bArr2.length;
        }
        return bArr;
    }

    public List<String> getTexts() {
        return new ArrayList(this.texts);
    }

    public int hashCode() {
        return this.texts.hashCode() + 31;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        Iterator<String> it = this.texts.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().getBytes().length + 1;
        }
        return length;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataTxt(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.texts = new ArrayList();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = bArr[i + i3] & 255;
            int i5 = i3 + 1;
            if (i4 > i2 - i5) {
                StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a txt in DnsRDataTxt. data: ");
                t61.t(i, " ", ", offset: ", sbA, bArr);
                sbA.append(", length: ");
                sbA.append(i2);
                sbA.append(", cursor: ");
                sbA.append(i5);
                throw new IllegalRawDataException(sbA.toString());
            }
            this.texts.add(new String(bArr, i + i5, i4));
            i3 = i5 + i4;
        }
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str) {
        return convertToString(str, null);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }

    private DnsRDataTxt(Builder builder) {
        if (builder != null && builder.texts != null) {
            for (String str : builder.texts) {
                if (str.getBytes().length > 255) {
                    throw new IllegalArgumentException("Length of a text must be less than 256. text: ".concat(str));
                }
            }
            this.texts = new ArrayList(builder.texts);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.texts: " + builder.texts);
    }
}
