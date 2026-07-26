package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalIpV6RoutingData implements IpV6ExtRoutingPacket.IpV6RoutingData {
    private static final long serialVersionUID = -6359533865311266265L;
    private final byte[] rawData;

    private IllegalIpV6RoutingData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static IllegalIpV6RoutingData newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IllegalIpV6RoutingData(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IllegalIpV6RoutingData.class.isInstance(obj)) {
            return Arrays.equals(((IllegalIpV6RoutingData) obj).rawData, this.rawData);
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
        return t61.m(this.rawData, "", new StringBuilder("[illegal data: "), "]");
    }
}
