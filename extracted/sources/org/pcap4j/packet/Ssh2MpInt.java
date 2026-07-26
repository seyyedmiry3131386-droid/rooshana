package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2MpInt implements Serializable, Comparable<Ssh2MpInt> {
    private static final long serialVersionUID = 5539706044412185073L;
    private final int length;
    private final byte[] value;

    public Ssh2MpInt(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        if (i2 < 4) {
            StringBuilder sbA = o40.A(100, "The rawData length must be more than 3. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        int i3 = ByteArrays.getInt(bArr, i);
        this.length = i3;
        if (i3 < 0) {
            StringBuilder sbA2 = o40.A(120, "A mp-int the length of which is longer than 2147483647 is not supported. length: ");
            sbA2.append(((long) i3) & 4294967295L);
            throw new IllegalRawDataException(sbA2.toString());
        }
        if (i2 - 4 >= i3) {
            this.value = ByteArrays.getSubArray(bArr, i + 4, i3);
            return;
        }
        StringBuilder sbA3 = o40.A(110, "The data is too short to build an Ssh2MpInt (");
        sbA3.append(i3 + 4);
        sbA3.append(" bytes). data: ");
        t61.t(i, " ", ", offset: ", sbA3, bArr);
        sbA3.append(", length: ");
        sbA3.append(i2);
        throw new IllegalRawDataException(sbA3.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!Ssh2MpInt.class.isInstance(obj)) {
            return false;
        }
        Ssh2MpInt ssh2MpInt = (Ssh2MpInt) obj;
        return this.length == ssh2MpInt.length && Arrays.equals(this.value, ssh2MpInt.value);
    }

    public int getLength() {
        return this.length;
    }

    public byte[] getRawData() {
        int i = this.length;
        byte[] bArr = new byte[i + 4];
        System.arraycopy(ByteArrays.toByteArray(i), 0, bArr, 0, 4);
        System.arraycopy(this.value, 0, bArr, 4, this.length);
        return bArr;
    }

    public byte[] getValue() {
        return ByteArrays.clone(this.value);
    }

    public BigInteger getValueAsBigInteger() {
        return new BigInteger(this.value);
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + ((527 + this.length) * 31);
    }

    public int length() {
        return this.length + 4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(getValueAsBigInteger());
        sb.append(" (");
        return t61.m(this.value, " ", sb, ")");
    }

    @Override // java.lang.Comparable
    public int compareTo(Ssh2MpInt ssh2MpInt) {
        return getValueAsBigInteger().compareTo(ssh2MpInt.getValueAsBigInteger());
    }

    public Ssh2MpInt(long j) {
        byte[] byteArray = ByteArrays.toByteArray(j);
        if (-128 <= j && 127 <= j) {
            byteArray = ByteArrays.getSubArray(byteArray, 7);
        } else if (-32768 <= j && j <= 32767) {
            byteArray = ByteArrays.getSubArray(byteArray, 6);
        } else if (-8388608 <= j && j <= 8388607) {
            byteArray = ByteArrays.getSubArray(byteArray, 5);
        } else if (-2147483648L <= j && j <= 2147483647L) {
            byteArray = ByteArrays.getSubArray(byteArray, 4);
        } else if (0 <= j && j <= 549755813887L) {
            byteArray = ByteArrays.getSubArray(byteArray, 3);
        } else if (0 <= j && j <= 140737488355327L) {
            byteArray = ByteArrays.getSubArray(byteArray, 2);
        } else if (0 <= j && j <= 36028797018963967L) {
            byteArray = ByteArrays.getSubArray(byteArray, 1);
        }
        this.value = byteArray;
        this.length = byteArray.length;
    }
}
