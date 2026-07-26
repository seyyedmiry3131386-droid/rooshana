package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRDataWks implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 4550031993619542554L;
    private final Inet4Address address;
    private final byte[] bitMap;
    private final List<Integer> portNumbers;
    private final IpNumber protocol;

    public static final class Builder {
        private Inet4Address address;
        private byte[] bitMap;
        private List<Integer> portNumbers;
        private IpNumber protocol;

        public Builder address(Inet4Address inet4Address) {
            this.address = inet4Address;
            return this;
        }

        public Builder bitMap(byte[] bArr) {
            this.bitMap = bArr;
            this.portNumbers = null;
            return this;
        }

        public DnsRDataWks build() {
            return new DnsRDataWks(this);
        }

        public Builder portNumbers(List<Integer> list) {
            this.portNumbers = list;
            this.bitMap = null;
            return this;
        }

        public Builder protocol(IpNumber ipNumber) {
            this.protocol = ipNumber;
            return this;
        }

        public Builder() {
            this.bitMap = null;
            this.portNumbers = null;
        }

        private Builder(DnsRDataWks dnsRDataWks) {
            this.bitMap = null;
            this.portNumbers = null;
            this.address = dnsRDataWks.address;
            this.protocol = dnsRDataWks.protocol;
            this.bitMap = dnsRDataWks.bitMap;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "WKS RDATA:", str, sb);
        sb.append("  ADDRESS: ");
        sb.append(this.address.getHostAddress());
        sb.append(strZ);
        sb.append(str);
        sb.append("  PROTOCOL: ");
        sb.append(this.protocol);
        sb.append(strZ);
        sb.append(str);
        sb.append("  BIT MAP: 0x");
        sb.append(ByteArrays.toHexString(this.bitMap, ""));
        sb.append(strZ);
        sb.append(str);
        sb.append("  PORTS: ");
        Iterator<Integer> it = this.portNumbers.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(strZ);
        return sb.toString();
    }

    public static DnsRDataWks newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsRDataWks(bArr, i, i2);
    }

    private List<Integer> toPortNumbers(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (byte b : bArr) {
            int i2 = 7;
            while (i2 >= 0) {
                if (((b >> i2) & 1) != 0) {
                    arrayList.add(Integer.valueOf(i));
                }
                i2--;
                i++;
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataWks.class != obj.getClass()) {
            return false;
        }
        DnsRDataWks dnsRDataWks = (DnsRDataWks) obj;
        return this.address.equals(dnsRDataWks.address) && Arrays.equals(this.bitMap, dnsRDataWks.bitMap) && this.protocol.equals(dnsRDataWks.protocol);
    }

    public Inet4Address getAddress() {
        return this.address;
    }

    public byte[] getBitMap() {
        return ByteArrays.clone(this.bitMap);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public List<Integer> getPortNumbers() {
        return new ArrayList(this.portNumbers);
    }

    public IpNumber getProtocol() {
        return this.protocol;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        System.arraycopy(this.address.getAddress(), 0, bArr, 0, 4);
        System.arraycopy(ByteArrays.toByteArray(this.protocol.value().byteValue()), 0, bArr, 4, 1);
        byte[] bArr2 = this.bitMap;
        System.arraycopy(bArr2, 0, bArr, 5, bArr2.length);
        return bArr;
    }

    public int hashCode() {
        return this.protocol.hashCode() + ((Arrays.hashCode(this.bitMap) + ((this.address.hashCode() + 31) * 31)) * 31);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.bitMap.length + 5;
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsRDataWks(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 5) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a DnsRDataWks (5 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.address = ByteArrays.getInet4Address(bArr, i);
        this.protocol = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i + 4)));
        if (5 < i2) {
            this.bitMap = ByteArrays.getSubArray(bArr, i + 5, i2 - 5);
        } else {
            this.bitMap = new byte[0];
        }
        byte[] bArr2 = this.bitMap;
        if (bArr2.length <= 8192) {
            this.portNumbers = toPortNumbers(bArr2);
        } else {
            throw new IllegalRawDataException("Length of bitMap must be less than 8193. bitMap.length: " + this.bitMap.length);
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

    private DnsRDataWks(Builder builder) {
        if (builder != null && builder.address != null && builder.protocol != null) {
            this.address = builder.address;
            this.protocol = builder.protocol;
            if (builder.bitMap != null) {
                if (builder.bitMap.length <= 8192) {
                    byte[] bArrClone = ByteArrays.clone(builder.bitMap);
                    this.bitMap = bArrClone;
                    this.portNumbers = toPortNumbers(bArrClone);
                    return;
                } else {
                    throw new IllegalArgumentException("Length of bitMap must be less than 8193. builder.bitMap.length: " + builder.bitMap.length);
                }
            }
            if (builder.portNumbers != null) {
                ArrayList arrayList = new ArrayList(builder.portNumbers);
                this.portNumbers = arrayList;
                if (arrayList.size() != 0) {
                    Collections.sort(arrayList);
                    int iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
                    if (((-65536) & iIntValue) == 0) {
                        this.bitMap = new byte[(iIntValue / 8) + 1];
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            byte[] bArr = this.bitMap;
                            int i = iIntValue2 / 8;
                            bArr[i] = (byte) ((128 >> (iIntValue2 % 8)) | bArr[i]);
                        }
                        return;
                    }
                    throw new IllegalArgumentException(rm7.n(iIntValue, "(port & 0xFFFF0000) must be zero. port: "));
                }
                this.bitMap = new byte[0];
                return;
            }
            throw new NullPointerException("Both bitMap and portNumbers are null.");
        }
        throw new NullPointerException("builder: " + builder + " builder.address: " + builder.address + " builder.protocol: " + builder.protocol);
    }
}
