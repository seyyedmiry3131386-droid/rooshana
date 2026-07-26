package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fb6 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final jp4 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = j29.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public fb6(Object obj, int i, jp4 jp4Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = jp4Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public static fb6 c(Bundle bundle) {
        int i = bundle.getInt(j, 0);
        Bundle bundle2 = bundle.getBundle(k);
        return new fb6(null, i, bundle2 == null ? null : jp4.b(bundle2), null, bundle.getInt(l, 0), bundle.getLong(m, 0L), bundle.getLong(n, 0L), bundle.getInt(o, -1), bundle.getInt(p, -1));
    }

    public final boolean a(fb6 fb6Var) {
        return this.b == fb6Var.b && this.e == fb6Var.e && this.f == fb6Var.f && this.g == fb6Var.g && this.h == fb6Var.h && this.i == fb6Var.i && Objects.equals(this.c, fb6Var.c);
    }

    public final fb6 b(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new fb6(this.a, z2 ? this.b : 0, z ? this.c : null, this.d, z2 ? this.e : 0, z ? this.f : 0L, z ? this.g : 0L, z ? this.h : -1, z ? this.i : -1);
    }

    public final Bundle d(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        jp4 jp4Var = this.c;
        if (jp4Var != null) {
            bundle.putBundle(k, jp4Var.c(false));
        }
        int i3 = this.e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(l, i3);
        }
        long j2 = this.f;
        if (i < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i4 = this.h;
        if (i4 != -1) {
            bundle.putInt(o, i4);
        }
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt(p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fb6.class == obj.getClass()) {
            fb6 fb6Var = (fb6) obj;
            if (a(fb6Var) && Objects.equals(this.a, fb6Var.a) && Objects.equals(this.d, fb6Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbE = bl4.E(str, ", contentPos=");
        sbE.append(this.g);
        sbE.append(", adGroup=");
        sbE.append(i);
        sbE.append(", ad=");
        sbE.append(this.i);
        return sbE.toString();
    }
}
