package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataCaa implements DnsResourceRecord.DnsRData {
    private static final int CAA_RR_MIN_LEN = 2;
    private static final long serialVersionUID = -1015182073420031158L;
    private final boolean critical;
    private final byte reservedFlags;
    private final String tag;
    private final String value;

    public static final class Builder {
        private boolean critical;
        private byte reservedFlags;
        private String tag;
        private String value;

        public DnsRDataCaa build() {
            return new DnsRDataCaa(this);
        }

        public Builder critical(boolean z) {
            this.critical = z;
            return this;
        }

        public Builder reservedFlags(byte b) {
            this.reservedFlags = b;
            return this;
        }

        public Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public Builder value(String str) {
            this.value = str;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataCaa dnsRDataCaa) {
            this.critical = dnsRDataCaa.critical;
            this.reservedFlags = dnsRDataCaa.reservedFlags;
            this.tag = dnsRDataCaa.tag;
            this.value = dnsRDataCaa.value;
        }
    }

    public static DnsRDataCaa newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataCaa(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataCaa.class != obj.getClass()) {
            return false;
        }
        DnsRDataCaa dnsRDataCaa = (DnsRDataCaa) obj;
        if (this.critical == dnsRDataCaa.critical && this.reservedFlags == dnsRDataCaa.reservedFlags && this.tag.equals(dnsRDataCaa.tag)) {
            return this.value.equals(dnsRDataCaa.value);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte b = this.reservedFlags;
        bArr[0] = b;
        if (this.critical) {
            bArr[0] = (byte) (b | 128);
        }
        byte[] bytes = this.tag.getBytes();
        bArr[1] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        int length = bytes.length + 2;
        byte[] bytes2 = this.value.getBytes();
        System.arraycopy(bytes2, 0, bArr, length, bytes2.length);
        return bArr;
    }

    public byte getReservedFlags() {
        return this.reservedFlags;
    }

    public String getTag() {
        return this.tag;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + rm7.k(this.tag, (((this.critical ? 1 : 0) * 31) + this.reservedFlags) * 31, 31);
    }

    public boolean isCritical() {
        return this.critical;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.tag.getBytes().length + 2 + this.value.getBytes().length;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str) {
        String property = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("CAA RDATA:");
        sb.append(property);
        sb.append(str);
        sb.append("  Issuer Critical: ");
        t61.z(sb, this.critical, property, str, "  Reserved Flags: 0x");
        sb.append(ByteArrays.toHexString(this.reservedFlags, ""));
        sb.append(property);
        sb.append(str);
        sb.append("  Tag: ");
        o40.I(this.tag, property, str, "  Value: ", sb);
        return dw1.s(sb, this.value, property);
    }

    private DnsRDataCaa(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a DnsRDataCaa (Min: 2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        this.critical = (b & 128) != 0;
        this.reservedFlags = (byte) (b & 127);
        int i3 = bArr[i + 1] & 255;
        int i4 = 2 + i3;
        if (i2 >= i4) {
            this.tag = new String(bArr, i + 2, i3);
            this.value = new String(bArr, i + i4, i2 - i4);
            return;
        }
        StringBuilder sb = new StringBuilder(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        sb.append("The data is too short to build a DnsRDataCaa (Tag Length: ");
        sb.append(i3);
        sb.append(" bytes). data: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        throw new IllegalRawDataException(sb.toString());
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str, byte[] bArr) {
        return toString(str);
    }

    private DnsRDataCaa(Builder builder) {
        if (builder.tag != null && builder.value != null) {
            if ((builder.reservedFlags & 128) == 0) {
                if (builder.tag.getBytes().length <= 255) {
                    this.critical = builder.critical;
                    this.reservedFlags = builder.reservedFlags;
                    this.tag = builder.tag;
                    this.value = builder.value;
                    return;
                }
                throw new IllegalArgumentException("builder.tag.getBytes().length must be less than 256. builder.tag: " + builder.tag);
            }
            throw new IllegalArgumentException("(builder.reservedFlags & 0x80) must be zero. builder.reservedFlags: " + ((int) builder.reservedFlags));
        }
        throw new NullPointerException(" builder.tag: " + builder.tag + " builder.value: " + builder.value);
    }
}
