package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4InternetTimestampOptionAddressPrespecified implements IpV4InternetTimestampOption.IpV4InternetTimestampOptionData {
    private static final long serialVersionUID = 3865517048348635723L;
    private final Inet4Address address;
    private final List<Integer> timestamps;

    private IpV4InternetTimestampOptionAddressPrespecified(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 % 4 != 0) {
            StringBuilder sbA = o40.A(100, "The raw data length must be an integer multiple of 4 octets long. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.address = ByteArrays.getInet4Address(bArr, i);
        this.timestamps = new ArrayList();
        for (int i3 = 4; i3 < i2; i3 += 4) {
            this.timestamps.add(Integer.valueOf(ByteArrays.getInt(bArr, i3 + i)));
        }
    }

    public static IpV4InternetTimestampOptionAddressPrespecified newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV4InternetTimestampOptionAddressPrespecified(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IpV4InternetTimestampOptionAddressPrespecified.class.isInstance(obj)) {
            return Arrays.equals(((IpV4InternetTimestampOptionAddressPrespecified) IpV4InternetTimestampOptionAddressPrespecified.class.cast(obj)).getRawData(), getRawData());
        }
        return false;
    }

    public Inet4Address getAddress() {
        return this.address;
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public byte[] getRawData() {
        int length = length();
        byte[] bArr = new byte[length];
        Iterator<Integer> it = this.timestamps.iterator();
        for (int i = 0; i < length; i += 4) {
            System.arraycopy(ByteArrays.toByteArray(it.next().intValue()), 0, bArr, 0, 4);
        }
        return bArr;
    }

    public List<Integer> getTimestamps() {
        return new ArrayList(this.timestamps);
    }

    public int hashCode() {
        return Arrays.hashCode(getRawData());
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public int length() {
        if (this.address == null) {
            return 0;
        }
        return (this.timestamps.size() * 4) + 4;
    }

    public String toString() {
        if (this.address == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[address: ");
        sb.append(this.address);
        sb.append("] [timestamps:");
        for (Integer num : this.timestamps) {
            sb.append(" ");
            sb.append(((long) num.intValue()) & 4294967295L);
        }
        sb.append("]");
        return sb.toString();
    }

    public IpV4InternetTimestampOptionAddressPrespecified(Inet4Address inet4Address, List<Integer> list) {
        if (list != null) {
            if (inet4Address == null && !list.isEmpty()) {
                throw new IllegalArgumentException("timestamps.size() must be 0 if address is null");
            }
            this.address = inet4Address;
            this.timestamps = new ArrayList(list);
            return;
        }
        throw new NullPointerException("timestamps may not be null");
    }
}
