package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import org.pcap4j.packet.namednumber.DnsClass;
import org.pcap4j.packet.namednumber.DnsResourceRecordType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsQuestion implements Serializable {
    private static final long serialVersionUID = -709060058515052575L;
    private final DnsClass qClass;
    private final DnsDomainName qName;
    private final DnsResourceRecordType qType;

    public static final class Builder {
        private DnsClass qClass;
        private DnsDomainName qName;
        private DnsResourceRecordType qType;

        public DnsQuestion build() {
            return new DnsQuestion(this);
        }

        public Builder qClass(DnsClass dnsClass) {
            this.qClass = dnsClass;
            return this;
        }

        public Builder qName(DnsDomainName dnsDomainName) {
            this.qName = dnsDomainName;
            return this;
        }

        public Builder qType(DnsResourceRecordType dnsResourceRecordType) {
            this.qType = dnsResourceRecordType;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsQuestion dnsQuestion) {
            this.qName = dnsQuestion.qName;
            this.qType = dnsQuestion.qType;
            this.qClass = dnsQuestion.qClass;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb.append(str);
        sb.append("QNAME: ");
        sb.append(bArr != null ? this.qName.toString(bArr) : this.qName);
        sb.append(property);
        sb.append(str);
        sb.append("QTYPE: ");
        sb.append(this.qType);
        sb.append(property);
        sb.append(str);
        sb.append("QCLASS: ");
        sb.append(this.qClass);
        sb.append(property);
        return sb.toString();
    }

    public static DnsQuestion newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsQuestion(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsQuestion.class != obj.getClass()) {
            return false;
        }
        DnsQuestion dnsQuestion = (DnsQuestion) obj;
        return this.qClass.equals(dnsQuestion.qClass) && this.qName.equals(dnsQuestion.qName) && this.qType.equals(dnsQuestion.qType);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsClass getQClass() {
        return this.qClass;
    }

    public DnsDomainName getQName() {
        return this.qName;
    }

    public DnsResourceRecordType getQType() {
        return this.qType;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] rawData = this.qName.getRawData();
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length;
        System.arraycopy(ByteArrays.toByteArray(this.qType.value().shortValue()), 0, bArr, length, 2);
        System.arraycopy(ByteArrays.toByteArray(this.qClass.value().shortValue()), 0, bArr, length + 2, 2);
        return bArr;
    }

    public int hashCode() {
        return this.qType.hashCode() + ((this.qName.hashCode() + ((this.qClass.hashCode() + 31) * 31)) * 31);
    }

    public int length() {
        return this.qName.length() + 4;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsQuestion(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        DnsDomainName dnsDomainNameNewInstance = DnsDomainName.newInstance(bArr, i, i2);
        this.qName = dnsDomainNameNewInstance;
        int length = dnsDomainNameNewInstance.length();
        if (i2 - length >= 4) {
            this.qType = DnsResourceRecordType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + length)));
            this.qClass = DnsClass.getInstance(Short.valueOf(ByteArrays.getShort(bArr, length + 2 + i)));
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build qType an qClass of DnsQuestion. data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        sbA.append(", cursor: ");
        sbA.append(length);
        throw new IllegalRawDataException(sbA.toString());
    }

    public String toString(String str) {
        return convertToString(str, null);
    }

    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }

    private DnsQuestion(Builder builder) {
        if (builder != null && builder.qName != null && builder.qType != null && builder.qClass != null) {
            this.qName = builder.qName;
            this.qType = builder.qType;
            this.qClass = builder.qClass;
            return;
        }
        throw new NullPointerException("builder" + builder + " builder.qName: " + builder.qName + " builder.qType: " + builder.qType + " builder.qClass: " + builder.qClass);
    }
}
