package org.apache.commons.io;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ByteOrderMark implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final int[] b;

    static {
        new ByteOrderMark("UTF-8", 239, 187, 191);
        new ByteOrderMark("UTF-16BE", 254, 255);
        new ByteOrderMark("UTF-16LE", 255, 254);
        new ByteOrderMark("UTF-32BE", 0, 0, 254, 255);
        new ByteOrderMark("UTF-32LE", 255, 254, 0, 0);
    }

    public ByteOrderMark(String str, int... iArr) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.a = str;
        int[] iArr2 = new int[iArr.length];
        this.b = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ByteOrderMark)) {
            return false;
        }
        int[] iArr = ((ByteOrderMark) obj).b;
        int[] iArr2 = this.b;
        if (iArr2.length != iArr.length) {
            return false;
        }
        for (int i = 0; i < iArr2.length; i++) {
            if (iArr2[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = getClass().hashCode();
        for (int i : this.b) {
            iHashCode += i;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.a);
        sb.append(": ");
        int i = 0;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                sb.append(']');
                return sb.toString();
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(iArr[i] & 255).toUpperCase());
            i++;
        }
    }
}
