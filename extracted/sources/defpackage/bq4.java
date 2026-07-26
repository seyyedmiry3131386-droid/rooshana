package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bq4 {
    public final ks4 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public bq4(ks4 ks4Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        vy2.j(!z5 || z3);
        vy2.j(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        vy2.j(z6);
        this.a = ks4Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final bq4 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new bq4(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final bq4 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new bq4(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bq4.class == obj.getClass()) {
            bq4 bq4Var = (bq4) obj;
            if (this.b == bq4Var.b && this.c == bq4Var.c && this.d == bq4Var.d && this.e == bq4Var.e && this.f == bq4Var.f && this.g == bq4Var.g && this.h == bq4Var.h && this.i == bq4Var.i && this.j == bq4Var.j && Objects.equals(this.a, bq4Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
