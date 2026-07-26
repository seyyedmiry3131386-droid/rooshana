package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataPtr implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3845617703457911405L;
    private final DnsDomainName ptrDName;

    public static final class Builder {
        private DnsDomainName ptrDName;

        public DnsRDataPtr build() {
            return new DnsRDataPtr(this);
        }

        public Builder ptrDName(DnsDomainName dnsDomainName) {
            this.ptrDName = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataPtr dnsRDataPtr) {
            this.ptrDName = dnsRDataPtr.ptrDName;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "PTR RDATA:", str, sb);
        sb.append("  PTRDNAME: ");
        return dw1.s(sb, bArr != null ? this.ptrDName.toString(bArr) : this.ptrDName.toString(), strZ);
    }

    public static DnsRDataPtr newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataPtr(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataPtr.class.isInstance(obj)) {
            return this.ptrDName.equals(((DnsRDataPtr) obj).ptrDName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getPtrDName() {
        return this.ptrDName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.ptrDName.getRawData();
    }

    public int hashCode() {
        return this.ptrDName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.ptrDName.length();
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataPtr(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.ptrDName = DnsDomainName.newInstance(bArr, i, i2);
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

    private DnsRDataPtr(Builder builder) {
        if (builder != null && builder.ptrDName != null) {
            this.ptrDName = builder.ptrDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.ptrDName: " + builder.ptrDName);
    }
}
