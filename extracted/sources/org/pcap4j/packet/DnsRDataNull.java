package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataNull implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -8881175833056081958L;
    private final byte[] rawData;

    public static final class Builder {
        private byte[] rawData;

        public DnsRDataNull build() {
            return new DnsRDataNull(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataNull dnsRDataNull) {
            this.rawData = dnsRDataNull.rawData;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "NULL RDATA:", str, sb);
        sb.append("  data: ");
        return t61.m(this.rawData, "", sb, strZ);
    }

    public static DnsRDataNull newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataNull(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataNull.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((DnsRDataNull) obj).rawData);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return ByteArrays.clone(this.rawData);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.rawData.length;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str) {
        return convertToString(str, null);
    }

    private DnsRDataNull(byte[] bArr, int i, int i2) {
        this.rawData = ByteArrays.getSubArray(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }

    private DnsRDataNull(Builder builder) {
        if (builder != null && builder.rawData != null) {
            this.rawData = ByteArrays.clone(builder.rawData);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
    }
}
