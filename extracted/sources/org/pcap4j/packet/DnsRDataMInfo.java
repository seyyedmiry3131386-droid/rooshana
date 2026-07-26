package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataMInfo implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3803968528398017544L;
    private final DnsDomainName eMailBx;
    private final DnsDomainName rMailBx;

    public static final class Builder {
        private DnsDomainName eMailBx;
        private DnsDomainName rMailBx;

        public DnsRDataMInfo build() {
            return new DnsRDataMInfo(this);
        }

        public Builder eMailBx(DnsDomainName dnsDomainName) {
            this.eMailBx = dnsDomainName;
            return this;
        }

        public Builder rMailBx(DnsDomainName dnsDomainName) {
            this.rMailBx = dnsDomainName;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataMInfo dnsRDataMInfo) {
            this.rMailBx = dnsRDataMInfo.rMailBx;
            this.eMailBx = dnsRDataMInfo.eMailBx;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "MINFO RDATA:", str, sb);
        sb.append("  RMAILBX: ");
        DnsDomainName dnsDomainName = this.rMailBx;
        o40.I(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString(), strZ, str, "  EMAILBX: ", sb);
        DnsDomainName dnsDomainName2 = this.eMailBx;
        return dw1.s(sb, bArr != null ? dnsDomainName2.toString(bArr) : dnsDomainName2.toString(), strZ);
    }

    public static DnsRDataMInfo newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataMInfo(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataMInfo.class != obj.getClass()) {
            return false;
        }
        DnsRDataMInfo dnsRDataMInfo = (DnsRDataMInfo) obj;
        return this.rMailBx.equals(dnsRDataMInfo.rMailBx) && this.eMailBx.equals(dnsRDataMInfo.eMailBx);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getEMailBx() {
        return this.eMailBx;
    }

    public DnsDomainName getRMailBx() {
        return this.rMailBx;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] rawData = this.rMailBx.getRawData();
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length;
        byte[] rawData2 = this.eMailBx.getRawData();
        System.arraycopy(rawData2, 0, bArr, length, rawData2.length);
        return bArr;
    }

    public int hashCode() {
        return this.eMailBx.hashCode() + ((this.rMailBx.hashCode() + 31) * 31);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.eMailBx.length() + this.rMailBx.length();
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataMInfo(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        DnsDomainName dnsDomainNameNewInstance = DnsDomainName.newInstance(bArr, i, i2);
        this.rMailBx = dnsDomainNameNewInstance;
        int length = dnsDomainNameNewInstance.length();
        if (length != i2) {
            this.eMailBx = DnsDomainName.newInstance(bArr, i + length, i2 - length);
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build eMailBx in DnsRDataMInfo. data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
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

    private DnsRDataMInfo(Builder builder) {
        if (builder != null && builder.rMailBx != null && builder.eMailBx != null) {
            this.rMailBx = builder.rMailBx;
            this.eMailBx = builder.eMailBx;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rMailBx: " + builder.rMailBx + " builder.eMailBx: " + builder.eMailBx);
    }
}
