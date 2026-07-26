package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataMf implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -3535653721390953465L;
    private final DnsDomainName maDName;

    public static final class Builder {
        private DnsDomainName maDName;

        public DnsRDataMf build() {
            return new DnsRDataMf(this);
        }

        public Builder maDName(DnsDomainName dnsDomainName) {
            this.maDName = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataMf dnsRDataMf) {
            this.maDName = dnsRDataMf.maDName;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "MF RDATA:", str, sb);
        sb.append("  MADNAME: ");
        return dw1.s(sb, bArr != null ? this.maDName.toString(bArr) : this.maDName.toString(), strZ);
    }

    public static DnsRDataMf newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataMf(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMf.class.isInstance(obj)) {
            return this.maDName.equals(((DnsRDataMf) obj).maDName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getMaDName() {
        return this.maDName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.maDName.getRawData();
    }

    public int hashCode() {
        return this.maDName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.maDName.length();
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataMf(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.maDName = DnsDomainName.newInstance(bArr, i, i2);
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

    private DnsRDataMf(Builder builder) {
        if (builder != null && builder.maDName != null) {
            this.maDName = builder.maDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.maDName: " + builder.maDName);
    }
}
