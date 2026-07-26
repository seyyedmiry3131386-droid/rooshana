package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataMg implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 884121664381530886L;
    private final DnsDomainName mgMName;

    public static final class Builder {
        private DnsDomainName mgMName;

        public DnsRDataMg build() {
            return new DnsRDataMg(this);
        }

        public Builder mgMName(DnsDomainName dnsDomainName) {
            this.mgMName = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataMg dnsRDataMg) {
            this.mgMName = dnsRDataMg.mgMName;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "MG RDATA:", str, sb);
        sb.append("  MGMNAME: ");
        return dw1.s(sb, bArr != null ? this.mgMName.toString(bArr) : this.mgMName.toString(), strZ);
    }

    public static DnsRDataMg newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataMg(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMg.class.isInstance(obj)) {
            return this.mgMName.equals(((DnsRDataMg) obj).mgMName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getMgMName() {
        return this.mgMName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.mgMName.getRawData();
    }

    public int hashCode() {
        return this.mgMName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.mgMName.length();
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataMg(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.mgMName = DnsDomainName.newInstance(bArr, i, i2);
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

    private DnsRDataMg(Builder builder) {
        if (builder != null && builder.mgMName != null) {
            this.mgMName = builder.mgMName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.mgMName: " + builder.mgMName);
    }
}
