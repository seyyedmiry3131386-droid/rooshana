package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataMr implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3960543085797464866L;
    private final DnsDomainName newName;

    public static final class Builder {
        private DnsDomainName newName;

        public DnsRDataMr build() {
            return new DnsRDataMr(this);
        }

        public Builder newName(DnsDomainName dnsDomainName) {
            this.newName = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataMr dnsRDataMr) {
            this.newName = dnsRDataMr.newName;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "MR RDATA:", str, sb);
        sb.append("  NEWNAME: ");
        return dw1.s(sb, bArr != null ? this.newName.toString(bArr) : this.newName.toString(), strZ);
    }

    public static DnsRDataMr newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataMr(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMr.class.isInstance(obj)) {
            return this.newName.equals(((DnsRDataMr) obj).newName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getNewName() {
        return this.newName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.newName.getRawData();
    }

    public int hashCode() {
        return this.newName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.newName.length();
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataMr(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.newName = DnsDomainName.newInstance(bArr, i, i2);
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

    private DnsRDataMr(Builder builder) {
        if (builder != null && builder.newName != null) {
            this.newName = builder.newName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.newName: " + builder.newName);
    }
}
