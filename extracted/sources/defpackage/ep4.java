package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ep4 {
    public static final ep4 f = new ep4(new dp4());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = j29.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public ep4(dp4 dp4Var) {
        long j2 = dp4Var.a;
        long j3 = dp4Var.b;
        long j4 = dp4Var.c;
        float f2 = dp4Var.d;
        float f3 = dp4Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static ep4 b(Bundle bundle) {
        dp4 dp4Var = new dp4();
        ep4 ep4Var = f;
        dp4Var.a = bundle.getLong(g, ep4Var.a);
        dp4Var.b = bundle.getLong(h, ep4Var.b);
        dp4Var.c = bundle.getLong(i, ep4Var.c);
        dp4Var.d = bundle.getFloat(j, ep4Var.d);
        dp4Var.e = bundle.getFloat(k, ep4Var.e);
        return new ep4(dp4Var);
    }

    public final dp4 a() {
        dp4 dp4Var = new dp4();
        dp4Var.a = this.a;
        dp4Var.b = this.b;
        dp4Var.c = this.c;
        dp4Var.d = this.d;
        dp4Var.e = this.e;
        return dp4Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ep4 ep4Var = f;
        long j2 = ep4Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = ep4Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = ep4Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = ep4Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = ep4Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep4)) {
            return false;
        }
        ep4 ep4Var = (ep4) obj;
        return this.a == ep4Var.a && this.b == ep4Var.b && this.c == ep4Var.c && this.d == ep4Var.d && this.e == ep4Var.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
