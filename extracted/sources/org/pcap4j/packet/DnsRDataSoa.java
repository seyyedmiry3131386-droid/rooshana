package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataSoa implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -5916011849950625284L;
    private final int expire;
    private final DnsDomainName mName;
    private final int minimum;
    private final DnsDomainName rName;
    private final int refresh;
    private final int retry;
    private final int serial;

    public static final class Builder {
        private int expire;
        private DnsDomainName mName;
        private int minimum;
        private DnsDomainName rName;
        private int refresh;
        private int retry;
        private int serial;

        public DnsRDataSoa build() {
            return new DnsRDataSoa(this);
        }

        public Builder expire(int i) {
            this.expire = i;
            return this;
        }

        public Builder mName(DnsDomainName dnsDomainName) {
            this.mName = dnsDomainName;
            return this;
        }

        public Builder minimum(int i) {
            this.minimum = i;
            return this;
        }

        public Builder rName(DnsDomainName dnsDomainName) {
            this.rName = dnsDomainName;
            return this;
        }

        public Builder refresh(int i) {
            this.refresh = i;
            return this;
        }

        public Builder retry(int i) {
            this.retry = i;
            return this;
        }

        public Builder serial(int i) {
            this.serial = i;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataSoa dnsRDataSoa) {
            this.mName = dnsRDataSoa.mName;
            this.rName = dnsRDataSoa.rName;
            this.serial = dnsRDataSoa.serial;
            this.refresh = dnsRDataSoa.refresh;
            this.retry = dnsRDataSoa.retry;
            this.expire = dnsRDataSoa.expire;
            this.minimum = dnsRDataSoa.minimum;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "SOA RDATA:", str, sb);
        sb.append("  MNAME: ");
        DnsDomainName dnsDomainName = this.mName;
        o40.I(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString(), strZ, str, "  RNAME: ", sb);
        o40.I(bArr != null ? this.rName.toString(bArr) : this.rName.toString(), strZ, str, "  SERIAL: ", sb);
        sb.append(getSerialAsLong());
        sb.append(strZ);
        sb.append(str);
        sb.append("  REFRESH: ");
        sb.append(getRefreshAsLong());
        sb.append(strZ);
        sb.append(str);
        sb.append("  RETRY: ");
        sb.append(getRetryAsLong());
        sb.append(strZ);
        sb.append(str);
        sb.append("  EXPIRE: ");
        sb.append(getExpireAsLong());
        sb.append(strZ);
        sb.append(str);
        sb.append("  MINIMUM: ");
        sb.append(getMinimumAsLong());
        sb.append(strZ);
        return sb.toString();
    }

    public static DnsRDataSoa newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataSoa(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataSoa.class != obj.getClass()) {
            return false;
        }
        DnsRDataSoa dnsRDataSoa = (DnsRDataSoa) obj;
        return this.expire == dnsRDataSoa.expire && this.mName.equals(dnsRDataSoa.mName) && this.minimum == dnsRDataSoa.minimum && this.rName.equals(dnsRDataSoa.rName) && this.refresh == dnsRDataSoa.refresh && this.retry == dnsRDataSoa.retry && this.serial == dnsRDataSoa.serial;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public int getExpire() {
        return this.expire;
    }

    public long getExpireAsLong() {
        return ((long) this.expire) & 4294967295L;
    }

    public DnsDomainName getMName() {
        return this.mName;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public long getMinimumAsLong() {
        return ((long) this.minimum) & 4294967295L;
    }

    public DnsDomainName getRName() {
        return this.rName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] rawData = this.mName.getRawData();
        byte[] rawData2 = this.rName.getRawData();
        byte[] bArr = new byte[rawData.length + rawData2.length + 20];
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length;
        System.arraycopy(rawData2, 0, bArr, length, rawData2.length);
        int length2 = length + rawData2.length;
        System.arraycopy(ByteArrays.toByteArray(this.serial), 0, bArr, length2, 4);
        System.arraycopy(ByteArrays.toByteArray(this.refresh), 0, bArr, length2 + 4, 4);
        System.arraycopy(ByteArrays.toByteArray(this.retry), 0, bArr, length2 + 8, 4);
        System.arraycopy(ByteArrays.toByteArray(this.expire), 0, bArr, length2 + 12, 4);
        System.arraycopy(ByteArrays.toByteArray(this.minimum), 0, bArr, length2 + 16, 4);
        return bArr;
    }

    public int getRefresh() {
        return this.refresh;
    }

    public long getRefreshAsLong() {
        return ((long) this.refresh) & 4294967295L;
    }

    public int getRetry() {
        return this.retry;
    }

    public long getRetryAsLong() {
        return ((long) this.retry) & 4294967295L;
    }

    public int getSerial() {
        return this.serial;
    }

    public long getSerialAsLong() {
        return ((long) this.serial) & 4294967295L;
    }

    public int hashCode() {
        return ((((((this.rName.hashCode() + ((((this.mName.hashCode() + ((this.expire + 31) * 31)) * 31) + this.minimum) * 31)) * 31) + this.refresh) * 31) + this.retry) * 31) + this.serial;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.rName.length() + this.mName.length() + 20;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataSoa(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        DnsDomainName dnsDomainNameNewInstance = DnsDomainName.newInstance(bArr, i, i2);
        this.mName = dnsDomainNameNewInstance;
        int length = dnsDomainNameNewInstance.length();
        if (length == i2) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build rName in DnsRDataSoa. data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            sbA.append(", cursor: ");
            sbA.append(length);
            throw new IllegalRawDataException(sbA.toString());
        }
        DnsDomainName dnsDomainNameNewInstance2 = DnsDomainName.newInstance(bArr, i + length, i2 - length);
        this.rName = dnsDomainNameNewInstance2;
        int length2 = dnsDomainNameNewInstance2.length() + length;
        if (length2 + 20 <= i2) {
            this.serial = ByteArrays.getInt(bArr, i + length2);
            this.refresh = ByteArrays.getInt(bArr, length2 + 4 + i);
            this.retry = ByteArrays.getInt(bArr, length2 + 8 + i);
            this.expire = ByteArrays.getInt(bArr, length2 + 12 + i);
            this.minimum = ByteArrays.getInt(bArr, length2 + 16 + i);
            return;
        }
        StringBuilder sbA2 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build serial, refresh, retry, expire, and minimumin DnsRDataSoa. data: ");
        t61.t(i, " ", ", offset: ", sbA2, bArr);
        sbA2.append(", length: ");
        sbA2.append(i2);
        sbA2.append(", cursor: ");
        sbA2.append(length2);
        throw new IllegalRawDataException(sbA2.toString());
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

    private DnsRDataSoa(Builder builder) {
        if (builder != null && builder.mName != null && builder.rName != null) {
            this.mName = builder.mName;
            this.rName = builder.rName;
            this.serial = builder.serial;
            this.refresh = builder.refresh;
            this.retry = builder.retry;
            this.expire = builder.expire;
            this.minimum = builder.minimum;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.mName: " + builder.mName + " builder.rName: " + builder.rName);
    }
}
