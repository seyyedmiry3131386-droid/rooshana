package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownDnsRData implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 2491230520019980578L;
    private final byte[] rawData;

    public static final class Builder {
        private byte[] rawData;

        public UnknownDnsRData build() {
            return new UnknownDnsRData(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder() {
        }

        private Builder(UnknownDnsRData unknownDnsRData) {
            this.rawData = unknownDnsRData.rawData;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Unknown Data:", str, sb);
        sb.append("  data: ");
        return t61.m(this.rawData, "", sb, strZ);
    }

    public static UnknownDnsRData newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownDnsRData(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (UnknownDnsRData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((UnknownDnsRData) obj).rawData);
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

    private UnknownDnsRData(byte[] bArr, int i, int i2) {
        this.rawData = ByteArrays.getSubArray(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }

    private UnknownDnsRData(Builder builder) {
        if (builder != null && builder.rawData != null) {
            this.rawData = ByteArrays.clone(builder.rawData);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
    }
}
