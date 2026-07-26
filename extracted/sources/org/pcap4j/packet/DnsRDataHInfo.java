package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataHInfo implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -4910328276617707827L;
    private final String cpu;
    private final String os;

    public static final class Builder {
        private String cpu;
        private String os;

        public DnsRDataHInfo build() {
            return new DnsRDataHInfo(this);
        }

        public Builder cpu(String str) {
            this.cpu = str;
            return this;
        }

        public Builder os(String str) {
            this.os = str;
            return this;
        }

        public Builder() {
        }

        private Builder(DnsRDataHInfo dnsRDataHInfo) {
            this.cpu = dnsRDataHInfo.cpu;
            this.os = dnsRDataHInfo.os;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "HINFO RDATA:", str, sb);
        sb.append("  CPU: ");
        o40.I(this.cpu, strZ, str, "  OS: ", sb);
        return dw1.s(sb, this.os, strZ);
    }

    public static DnsRDataHInfo newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataHInfo(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataHInfo.class != obj.getClass()) {
            return false;
        }
        DnsRDataHInfo dnsRDataHInfo = (DnsRDataHInfo) obj;
        return this.cpu.equals(dnsRDataHInfo.cpu) && this.os.equals(dnsRDataHInfo.os);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getOs() {
        return this.os;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] bytes = this.cpu.getBytes();
        bArr[0] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        int length = bytes.length;
        byte[] bytes2 = this.os.getBytes();
        bArr[1 + length] = (byte) bytes2.length;
        System.arraycopy(bytes2, 0, bArr, length + 2, bytes2.length);
        return bArr;
    }

    public int hashCode() {
        return this.os.hashCode() + rm7.k(this.cpu, 31, 31);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.cpu.getBytes().length + this.os.getBytes().length + 2;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataHInfo(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        int i3 = bArr[i] & 255;
        int i4 = i3 + 1;
        if (i4 > i2 - 1) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build cpu and os in DnsRDataHInfo. data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            sbA.append(", cursor: 1");
            throw new IllegalRawDataException(sbA.toString());
        }
        this.cpu = new String(bArr, i + 1, i3);
        int i5 = bArr[i4 + i] & 255;
        int i6 = i3 + 2;
        if (i5 <= i2 - i6) {
            this.os = new String(bArr, i + i6, i5);
            return;
        }
        StringBuilder sb = new StringBuilder(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        sb.append("The data is too short to build os in DnsRDataHInfo (");
        sb.append(i5);
        sb.append(" bytes). data: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        sb.append(", cursor: ");
        sb.append(i6);
        throw new IllegalRawDataException(sb.toString());
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

    private DnsRDataHInfo(Builder builder) {
        if (builder != null && builder.cpu != null && builder.os != null) {
            if (builder.cpu.getBytes().length <= 255) {
                if (builder.os.getBytes().length <= 255) {
                    this.cpu = builder.cpu;
                    this.os = builder.os;
                    return;
                } else {
                    throw new IllegalArgumentException("Length of os must be less than 256. os: " + builder.os);
                }
            }
            throw new IllegalArgumentException("Length of cpu must be less than 256. cpu: " + builder.cpu);
        }
        throw new NullPointerException("builder: " + builder + " builder.cpu: " + builder.cpu + " builder.os: " + builder.os);
    }
}
