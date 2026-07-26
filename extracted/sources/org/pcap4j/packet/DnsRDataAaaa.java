package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.net.Inet6Address;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataAaaa implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 69151497541755310L;
    private final Inet6Address address;

    public static final class Builder {
        private Inet6Address address;

        public Builder address(Inet6Address inet6Address) {
            this.address = inet6Address;
            return this;
        }

        public DnsRDataAaaa build() {
            return new DnsRDataAaaa(this);
        }

        public Builder() {
        }

        private Builder(DnsRDataAaaa dnsRDataAaaa) {
            this.address = dnsRDataAaaa.address;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "AAAA RDATA:", str, sb);
        sb.append("  ADDRESS: ");
        sb.append(this.address.getHostAddress());
        sb.append(strZ);
        return sb.toString();
    }

    public static DnsRDataAaaa newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataAaaa(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataAaaa.class.isInstance(obj)) {
            return this.address.equals(((DnsRDataAaaa) obj).address);
        }
        return false;
    }

    public Inet6Address getAddress() {
        return this.address;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.address.getAddress();
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return 16;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataAaaa(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 16) {
            this.address = ByteArrays.getInet6Address(bArr, i);
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a DnsRDataAaaa (16 bytes). data: ");
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

    private DnsRDataAaaa(Builder builder) {
        if (builder != null && builder.address != null) {
            this.address = builder.address;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.address: " + builder.address);
    }
}
