package org.pcap4j.packet;

import defpackage.bl4;
import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataA implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 6539022022231148667L;
    private final Inet4Address address;
    private final boolean addressPlainText;

    public static final class Builder {
        private Inet4Address address;
        private boolean addressPlainText;

        public Builder address(Inet4Address inet4Address) {
            this.address = inet4Address;
            return this;
        }

        public Builder addressPlainText(boolean z) {
            this.addressPlainText = z;
            return this;
        }

        public DnsRDataA build() {
            return new DnsRDataA(this);
        }

        public Builder() {
        }

        private Builder(DnsRDataA dnsRDataA) {
            this.address = dnsRDataA.address;
            this.addressPlainText = dnsRDataA.addressPlainText;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "A RDATA:", str, sb);
        sb.append("  ADDRESS: ");
        sb.append(this.address.getHostAddress());
        sb.append(" (");
        return bl4.z(sb, this.addressPlainText ? ConfirmDTO.INPUT_TYPE_TEXT : "encoded", ")", strZ);
    }

    public static DnsRDataA newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataA(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataA.class != obj.getClass()) {
            return false;
        }
        DnsRDataA dnsRDataA = (DnsRDataA) obj;
        if (this.addressPlainText != dnsRDataA.addressPlainText) {
            return false;
        }
        return this.address.equals(dnsRDataA.address);
    }

    public Inet4Address getAddress() {
        return this.address;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.addressPlainText ? this.address.getHostAddress().getBytes() : this.address.getAddress();
    }

    public int hashCode() {
        return (this.address.hashCode() * 31) + (this.addressPlainText ? 1 : 0);
    }

    public boolean isAddressPlainText() {
        return this.addressPlainText;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        if (this.addressPlainText) {
            return this.address.getHostAddress().length();
        }
        return 4;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataA(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 4) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a DnsRDataA (Min: 4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (i2 == 4) {
            this.address = ByteArrays.getInet4Address(bArr, i);
            this.addressPlainText = false;
            return;
        }
        String str = new String(ByteArrays.getSubArray(bArr, i, i2));
        try {
            this.address = (Inet4Address) InetAddress.getByAddress(ByteArrays.parseInet4Address(str));
            this.addressPlainText = true;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
            sb.append("Couldn't get an Inet4Address from ");
            sb.append(str);
            sb.append(". data: ");
            t61.t(i, " ", ", offset: ", sb, bArr);
            sb.append(", length: ");
            sb.append(i2);
            throw new IllegalRawDataException(sb.toString(), e);
        } catch (UnknownHostException unused) {
            throw new AssertionError("Never get here.");
        }
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

    private DnsRDataA(Builder builder) {
        if (builder != null && builder.address != null) {
            this.address = builder.address;
            this.addressPlainText = builder.addressPlainText;
        } else {
            throw new NullPointerException("builder: " + builder + " builder.address: " + builder.address);
        }
    }
}
