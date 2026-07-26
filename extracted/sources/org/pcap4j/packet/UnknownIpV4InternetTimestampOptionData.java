package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownIpV4InternetTimestampOptionData implements IpV4InternetTimestampOption.IpV4InternetTimestampOptionData {
    private static final long serialVersionUID = 2799097946096468081L;
    private final byte[] rawData;

    private UnknownIpV4InternetTimestampOptionData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static UnknownIpV4InternetTimestampOptionData newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownIpV4InternetTimestampOptionData(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (UnknownIpV4InternetTimestampOptionData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((UnknownIpV4InternetTimestampOptionData) obj).rawData);
        }
        return false;
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return t61.m(this.rawData, "", new StringBuilder("[data: "), "]");
    }
}
