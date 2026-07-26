package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6RoutingSourceRouteData implements IpV6ExtRoutingPacket.IpV6RoutingData {
    private static final long serialVersionUID = -7972526977248222954L;
    private final List<Inet6Address> addresses;
    private final int reserved;

    private IpV6RoutingSourceRouteData(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 4) {
            StringBuilder sbA = o40.A(100, "rawData length must be more than 3. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if ((i2 - 4) % 16 != 0) {
            StringBuilder sbA2 = o40.A(100, "(length -4 ) % 16 must be 0. rawData: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        this.reserved = ByteArrays.getInt(bArr, i);
        this.addresses = new ArrayList();
        for (int i3 = 4; i3 < i2; i3 += 16) {
            this.addresses.add(ByteArrays.getInet6Address(bArr, i3 + i));
        }
    }

    public static IpV6RoutingSourceRouteData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6RoutingSourceRouteData(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV6RoutingSourceRouteData.class.isInstance(obj)) {
            return false;
        }
        IpV6RoutingSourceRouteData ipV6RoutingSourceRouteData = (IpV6RoutingSourceRouteData) obj;
        return this.reserved == ipV6RoutingSourceRouteData.reserved && this.addresses.equals(ipV6RoutingSourceRouteData.addresses);
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public byte[] getRawData() {
        int length = length();
        byte[] bArr = new byte[length];
        System.arraycopy(ByteArrays.toByteArray(this.reserved), 0, bArr, 0, 4);
        Iterator<Inet6Address> it = this.addresses.iterator();
        for (int i = 4; i < length; i += 16) {
            System.arraycopy(ByteArrays.toByteArray(it.next()), 0, bArr, i, 16);
        }
        return bArr;
    }

    public int hashCode() {
        return this.addresses.hashCode() + ((527 + this.reserved) * 31);
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public int length() {
        return (this.addresses.size() * 16) + 4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[reserved: ");
        sb.append(this.reserved);
        sb.append("] [addresses:");
        for (Inet6Address inet6Address : this.addresses) {
            sb.append(" ");
            sb.append(inet6Address);
        }
        sb.append("]");
        return sb.toString();
    }

    public IpV6RoutingSourceRouteData(int i, List<Inet6Address> list) {
        if (list != null) {
            this.reserved = i;
            this.addresses = new ArrayList(list);
            return;
        }
        throw new NullPointerException("addresses must not be null");
    }
}
