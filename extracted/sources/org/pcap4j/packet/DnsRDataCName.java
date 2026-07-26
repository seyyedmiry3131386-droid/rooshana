package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataCName implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3515906031137985263L;
    private final DnsDomainName cName;

    public static final class Builder {
        private DnsDomainName cName;

        public DnsRDataCName build() {
            return new DnsRDataCName(this);
        }

        public Builder cName(DnsDomainName dnsDomainName) {
            this.cName = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataCName dnsRDataCName) {
            this.cName = dnsRDataCName.cName;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "CNAME RDATA:", str, sb);
        sb.append("  CNAME: ");
        return dw1.s(sb, bArr != null ? this.cName.toString(bArr) : this.cName.toString(), strZ);
    }

    public static DnsRDataCName newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataCName(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataCName.class.isInstance(obj)) {
            return this.cName.equals(((DnsRDataCName) obj).cName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getCName() {
        return this.cName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.cName.getRawData();
    }

    public int hashCode() {
        return this.cName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.cName.length();
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataCName(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.cName = DnsDomainName.newInstance(bArr, i, i2);
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

    private DnsRDataCName(Builder builder) {
        if (builder != null && builder.cName != null) {
            this.cName = builder.cName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.cName: " + builder.cName);
    }
}
