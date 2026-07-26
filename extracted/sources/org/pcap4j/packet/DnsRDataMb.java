package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataMb implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -7237273314471356977L;
    private final DnsDomainName maDName;

    public static final class Builder {
        private DnsDomainName maDName;

        public DnsRDataMb build() {
            return new DnsRDataMb(this);
        }

        public Builder maDName(DnsDomainName dnsDomainName) {
            this.maDName = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataMb dnsRDataMb) {
            this.maDName = dnsRDataMb.maDName;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "MB RDATA:", str, sb);
        sb.append("  MADNAME: ");
        return dw1.s(sb, bArr != null ? this.maDName.toString(bArr) : this.maDName.toString(), strZ);
    }

    public static DnsRDataMb newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataMb(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMb.class.isInstance(obj)) {
            return this.maDName.equals(((DnsRDataMb) obj).maDName);
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

    private DnsRDataMb(byte[] bArr, int i, int i2) throws IllegalRawDataException {
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

    private DnsRDataMb(Builder builder) {
        if (builder != null && builder.maDName != null) {
            this.maDName = builder.maDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.maDName: " + builder.maDName);
    }
}
