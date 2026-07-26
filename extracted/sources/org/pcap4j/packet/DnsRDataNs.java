package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataNs implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -5232680288519805322L;
    private final DnsDomainName nsDName;

    public static final class Builder {
        private DnsDomainName nsDName;

        public DnsRDataNs build() {
            return new DnsRDataNs(this);
        }

        public Builder nsDName(DnsDomainName dnsDomainName) {
            this.nsDName = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataNs dnsRDataNs) {
            this.nsDName = dnsRDataNs.nsDName;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "NS RDATA:", str, sb);
        sb.append("  NSDNAME: ");
        return dw1.s(sb, bArr != null ? this.nsDName.toString(bArr) : this.nsDName.toString(), strZ);
    }

    public static DnsRDataNs newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataNs(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataNs.class.isInstance(obj)) {
            return this.nsDName.equals(((DnsRDataNs) obj).nsDName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getNsDName() {
        return this.nsDName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.nsDName.getRawData();
    }

    public int hashCode() {
        return this.nsDName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.nsDName.length();
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataNs(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.nsDName = DnsDomainName.newInstance(bArr, i, i2);
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

    private DnsRDataNs(Builder builder) {
        if (builder != null && builder.nsDName != null) {
            this.nsDName = builder.nsDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.nsDName: " + builder.nsDName);
    }
}
