package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataMx implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -5914050306503756427L;
    private final DnsDomainName exchange;
    private final short preference;

    public static final class Builder {
        private DnsDomainName exchange;
        private short preference;

        public DnsRDataMx build() {
            return new DnsRDataMx(this);
        }

        public Builder exchange(DnsDomainName dnsDomainName) {
            this.exchange = dnsDomainName;
            return this;
        }

        public Builder preference(short s) {
            this.preference = s;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataMx dnsRDataMx) {
            this.preference = dnsRDataMx.preference;
            this.exchange = dnsRDataMx.exchange;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "MX RDATA:", str, sb);
        sb.append("  PREFERENCE: ");
        sb.append((int) this.preference);
        sb.append(strZ);
        sb.append(str);
        sb.append("  EXCHANGE: ");
        DnsDomainName dnsDomainName = this.exchange;
        return dw1.s(sb, bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString(), strZ);
    }

    public static DnsRDataMx newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataMx(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataMx.class != obj.getClass()) {
            return false;
        }
        DnsRDataMx dnsRDataMx = (DnsRDataMx) obj;
        return this.exchange.equals(dnsRDataMx.exchange) && this.preference == dnsRDataMx.preference;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getExchange() {
        return this.exchange;
    }

    public short getPreference() {
        return this.preference;
    }

    public int getPreferenceAsInt() {
        return this.preference;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] rawData = this.exchange.getRawData();
        byte[] bArr = new byte[rawData.length + 2];
        System.arraycopy(ByteArrays.toByteArray(this.preference), 0, bArr, 0, 2);
        System.arraycopy(rawData, 0, bArr, 2, rawData.length);
        return bArr;
    }

    public int hashCode() {
        return ((this.exchange.hashCode() + 31) * 31) + this.preference;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.exchange.length() + 2;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataMx(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 3) {
            this.preference = ByteArrays.getShort(bArr, i);
            this.exchange = DnsDomainName.newInstance(bArr, i + 2, i2 - 2);
        } else {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a DnsRDataMx (3 bytes at least). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
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

    private DnsRDataMx(Builder builder) {
        if (builder != null && builder.exchange != null) {
            this.preference = builder.preference;
            this.exchange = builder.exchange;
        } else {
            throw new NullPointerException("builder: " + builder + " builder.exchange: " + builder.exchange);
        }
    }
}
