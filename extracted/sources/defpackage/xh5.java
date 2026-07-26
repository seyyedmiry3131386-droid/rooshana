package defpackage;

import com.sun.jna.Native;

/* JADX INFO: loaded from: classes3.dex */
public final class xh5 implements CharSequence, Comparable {
    public final ft4 a;
    public final String b;

    public xh5(String str, boolean z) {
        this(str, z ? "--WIDE-STRING--" : Native.g());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return toString().compareTo(obj.toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CharSequence) && compareTo(obj) == 0;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.b;
        boolean zEquals = "--WIDE-STRING--".equals(str);
        ft4 ft4Var = this.a;
        return zEquals ? ft4Var.l() : ft4Var.i(str);
    }

    public xh5(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("String must not be null");
        }
        this.b = str2;
        if ("--WIDE-STRING--".equals(str2)) {
            ft4 ft4Var = new ft4(this, (str.length() + 1) * Native.k);
            this.a = ft4Var;
            ft4Var.D(str);
        } else {
            byte[] bytes = str.getBytes(Native.e(str2));
            ft4 ft4Var2 = new ft4(this, bytes.length + 1);
            this.a = ft4Var2;
            ft4Var2.G(bytes.length, 0L, bytes);
            ft4Var2.u(bytes.length, (byte) 0);
        }
    }
}
