package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2String implements Serializable {
    private static final long serialVersionUID = -1591381991570120515L;
    private final int length;
    private final byte[] string;

    public Ssh2String(byte[] bArr, int i, int i2) throws IllegalRawDataException {
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
            StringBuilder sbA2 = o40.A(120, "A string the length of which is longer than 2147483647 is not supported. length: ");
            sbA2.append(((long) i3) & 4294967295L);
            throw new IllegalRawDataException(sbA2.toString());
        }
        if (i2 - 4 >= i3) {
            this.string = ByteArrays.getSubArray(bArr, i + 4, i3);
            return;
        }
        StringBuilder sbA3 = o40.A(110, "The data is too short to build an Ssh2String (");
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
        if (!Ssh2String.class.isInstance(obj)) {
            return false;
        }
        Ssh2String ssh2String = (Ssh2String) obj;
        return this.length == ssh2String.length && Arrays.equals(this.string, ssh2String.string);
    }

    public int getLength() {
        return this.length;
    }

    public byte[] getRawData() {
        int i = this.length;
        byte[] bArr = new byte[i + 4];
        System.arraycopy(ByteArrays.toByteArray(i), 0, bArr, 0, 4);
        System.arraycopy(this.string, 0, bArr, 4, this.length);
        return bArr;
    }

    public byte[] getString() {
        return ByteArrays.clone(this.string);
    }

    public String getStringAsString() {
        try {
            return new String(this.string, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("Never get here.");
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.string) + ((527 + this.length) * 31);
    }

    public int length() {
        return this.length + 4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(getStringAsString());
        sb.append(" (");
        return t61.m(this.string, " ", sb, ")");
    }

    public Ssh2String(String str) {
        str.getClass();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.string = bytes;
            this.length = bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("Never get here.");
        }
    }
}
