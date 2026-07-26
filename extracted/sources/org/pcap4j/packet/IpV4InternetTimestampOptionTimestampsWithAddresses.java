package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4InternetTimestampOptionTimestampsWithAddresses implements IpV4InternetTimestampOption.IpV4InternetTimestampOptionData {
    private static final long serialVersionUID = -331040457248187753L;
    private final List<TimestampWithAddress> timestampsWithAddresses;

    public static final class TimestampWithAddress implements Serializable {
        private static final long serialVersionUID = -1592713837380606740L;
        private final Inet4Address address;
        private final Integer timestamp;

        public TimestampWithAddress(Inet4Address inet4Address, Integer num) {
            if (inet4Address == null) {
                throw new NullPointerException("address may not be null");
            }
            this.address = inet4Address;
            this.timestamp = num;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!TimestampWithAddress.class.isInstance(obj)) {
                return false;
            }
            TimestampWithAddress timestampWithAddress = (TimestampWithAddress) obj;
            return this.timestamp.equals(timestampWithAddress.timestamp) && this.address.equals(timestampWithAddress.address);
        }

        public Inet4Address getAddress() {
            return this.address;
        }

        public Integer getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            Integer num = this.timestamp;
            return this.address.hashCode() + ((num != null ? num.hashCode() + 527 : 17) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.address);
            sb.append(", ");
            Integer num = this.timestamp;
            if (num != null) {
                sb.append(((long) num.intValue()) & 4294967295L);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    private IpV4InternetTimestampOptionTimestampsWithAddresses(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 % 4 != 0) {
            StringBuilder sbA = o40.A(100, "The raw data length must be an integer multiple of 4 octets long. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        this.timestampsWithAddresses = new ArrayList();
        for (int i3 = 0; i3 < i2; i3 += 8) {
            int i4 = i3 + 4;
            this.timestampsWithAddresses.add(new TimestampWithAddress(ByteArrays.getInet4Address(bArr, i3 + i), i4 < i2 ? Integer.valueOf(ByteArrays.getInt(bArr, i4 + i)) : null));
        }
    }

    public static IpV4InternetTimestampOptionTimestampsWithAddresses newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV4InternetTimestampOptionTimestampsWithAddresses(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IpV4InternetTimestampOptionTimestampsWithAddresses.class.isInstance(obj)) {
            return Arrays.equals(((IpV4InternetTimestampOptionTimestampsWithAddresses) IpV4InternetTimestampOptionTimestampsWithAddresses.class.cast(obj)).getRawData(), getRawData());
        }
        return false;
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public byte[] getRawData() {
        int length = length();
        byte[] bArr = new byte[length];
        Iterator<TimestampWithAddress> it = this.timestampsWithAddresses.iterator();
        for (int i = 0; i < length; i += 8) {
            TimestampWithAddress next = it.next();
            System.arraycopy(ByteArrays.toByteArray(next.address), 0, bArr, i, 4);
            if (next.timestamp != null) {
                System.arraycopy(ByteArrays.toByteArray(next.timestamp.intValue()), 0, bArr, i + 4, 4);
            }
        }
        return bArr;
    }

    public List<TimestampWithAddress> getTimestampWithAddress() {
        return new ArrayList(this.timestampsWithAddresses);
    }

    public int hashCode() {
        return Arrays.hashCode(getRawData());
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public int length() {
        List<TimestampWithAddress> list = this.timestampsWithAddresses;
        return list.get(list.size() + (-1)).timestamp == null ? (this.timestampsWithAddresses.size() * 8) - 4 : this.timestampsWithAddresses.size() * 8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[(address, timestamp):");
        Iterator<TimestampWithAddress> it = this.timestampsWithAddresses.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        sb.append("]");
        return sb.toString();
    }

    public IpV4InternetTimestampOptionTimestampsWithAddresses(List<TimestampWithAddress> list) {
        if (list != null) {
            Iterator<TimestampWithAddress> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().timestamp == null && it.hasNext()) {
                    throw new IllegalArgumentException("Every element of timestampsWithAddresses must not have null field except last element.");
                }
            }
            this.timestampsWithAddresses = new ArrayList(list);
            return;
        }
        throw new NullPointerException("timestamps may not be null");
    }
}
