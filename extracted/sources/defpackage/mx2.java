package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mx2 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof mx2)) {
            return false;
        }
        mx2 mx2Var = (mx2) obj;
        return e() == mx2Var.e() && f(mx2Var);
    }

    public abstract boolean f(mx2 mx2Var);

    public byte[] g() {
        return a();
    }

    public final int hashCode() {
        if (e() >= 32) {
            return b();
        }
        byte[] bArrG = g();
        int i = bArrG[0] & 255;
        for (int i2 = 1; i2 < bArrG.length; i2++) {
            i |= (bArrG[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrG = g();
        StringBuilder sb = new StringBuilder(bArrG.length * 2);
        for (byte b : bArrG) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
