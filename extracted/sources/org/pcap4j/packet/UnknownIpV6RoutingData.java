package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownIpV6RoutingData implements IpV6ExtRoutingPacket.IpV6RoutingData {
    private static final long serialVersionUID = -6359533865311266265L;
    private final byte[] rawData;

    private UnknownIpV6RoutingData(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 4) {
            StringBuilder sbA = o40.A(100, "rawData length must be more than 3. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if ((i2 + 4) % 8 == 0) {
            byte[] bArr2 = new byte[i2];
            this.rawData = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
        } else {
            StringBuilder sbA2 = o40.A(100, "(length + 4) % 8 must be 0. rawData: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
    }

    public static UnknownIpV6RoutingData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownIpV6RoutingData(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (UnknownIpV6RoutingData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((UnknownIpV6RoutingData) obj).rawData);
        }
        return false;
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return t61.m(this.rawData, " ", new StringBuilder("[data: "), "]");
    }
}
