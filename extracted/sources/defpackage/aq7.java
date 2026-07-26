package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class aq7 {
    public static final fb6 k;
    public static final aq7 l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final fb6 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        fb6 fb6Var = new fb6(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = fb6Var;
        l = new aq7(fb6Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = j29.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public aq7(fb6 fb6Var, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        vy2.j(z == (fb6Var.h != -1));
        this.a = fb6Var;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
    }

    public static aq7 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(m);
        return new aq7(bundle2 == null ? k : fb6.c(bundle2), bundle.getBoolean(n, false), bundle.getLong(o, -9223372036854775807L), bundle.getLong(p, -9223372036854775807L), bundle.getLong(q, 0L), bundle.getInt(r, 0), bundle.getLong(s, 0L), bundle.getLong(t, -9223372036854775807L), bundle.getLong(u, -9223372036854775807L), bundle.getLong(v, 0L));
    }

    public final aq7 a(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new aq7(this.a.b(z, z2), z && this.b, this.c, z ? this.d : -9223372036854775807L, z ? this.e : 0L, z ? this.f : 0, z ? this.g : 0L, z ? this.h : -9223372036854775807L, z ? this.i : -9223372036854775807L, z ? this.j : 0L);
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        fb6 fb6Var = this.a;
        if (i < 3 || !k.a(fb6Var)) {
            bundle.putBundle(m, fb6Var.d(i));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j = this.c;
        if (j != -9223372036854775807L) {
            bundle.putLong(o, j);
        }
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(p, j2);
        }
        long j3 = this.e;
        if (i < 3 || j3 != 0) {
            bundle.putLong(q, j3);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        long j4 = this.g;
        if (j4 != 0) {
            bundle.putLong(s, j4);
        }
        long j5 = this.h;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(t, j5);
        }
        long j6 = this.i;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(u, j6);
        }
        long j7 = this.j;
        if (i >= 3 && j7 == 0) {
            return bundle;
        }
        bundle.putLong(v, j7);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aq7.class == obj.getClass()) {
            aq7 aq7Var = (aq7) obj;
            if (this.c == aq7Var.c && this.a.equals(aq7Var.a) && this.b == aq7Var.b && this.d == aq7Var.d && this.e == aq7Var.e && this.f == aq7Var.f && this.g == aq7Var.g && this.h == aq7Var.h && this.i == aq7Var.i && this.j == aq7Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        fb6 fb6Var = this.a;
        sb.append(fb6Var.b);
        sb.append(", periodIndex=");
        sb.append(fb6Var.e);
        sb.append(", positionMs=");
        sb.append(fb6Var.f);
        sb.append(", contentPositionMs=");
        sb.append(fb6Var.g);
        sb.append(", adGroupIndex=");
        sb.append(fb6Var.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(fb6Var.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return bl4.s(this.j, "}", sb);
    }
}
