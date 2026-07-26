package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class am8 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final Object q = new Object();
    public static final Object r = new Object();
    public static final jp4 s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public ep4 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public jp4 c = s;

    static {
        fp4 fp4Var;
        yo4 yo4Var = new yo4();
        bp4 bp4Var = new bp4();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListQ = ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        Uri uri = Uri.EMPTY;
        vy2.s(((Uri) bp4Var.e) == null || ((UUID) bp4Var.d) != null);
        cp4 cp4Var = null;
        if (uri != null) {
            if (((UUID) bp4Var.d) != null) {
                cp4Var = new cp4(bp4Var);
            }
            fp4Var = new fp4(uri, null, cp4Var, null, list, null, immutableListQ, -9223372036854775807L);
        } else {
            fp4Var = null;
        }
        s = new jp4("androidx.media3.common.Timeline", new ap4(yo4Var), fp4Var, new ep4(dp4Var), qp4.K, gp4Var);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(Object obj, jp4 jp4Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, ep4 ep4Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.c = jp4Var != null ? jp4Var : s;
        if (jp4Var != null) {
            fp4 fp4Var = jp4Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        this.j = ep4Var;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = i2;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && am8.class.equals(obj.getClass())) {
            am8 am8Var = (am8) obj;
            if (Objects.equals(this.a, am8Var.a) && Objects.equals(this.c, am8Var.c) && Objects.equals(this.d, am8Var.d) && Objects.equals(this.j, am8Var.j) && this.e == am8Var.e && this.f == am8Var.f && this.g == am8Var.g && this.h == am8Var.h && this.i == am8Var.i && this.k == am8Var.k && this.l == am8Var.l && this.m == am8Var.m && this.n == am8Var.n && this.o == am8Var.o && this.p == am8Var.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        ep4 ep4Var = this.j;
        int iHashCode3 = (iHashCode2 + (ep4Var != null ? ep4Var.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
