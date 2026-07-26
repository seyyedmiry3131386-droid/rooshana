package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class be {
    public final long a;
    public final bm8 b;
    public final int c;
    public final ks4 d;
    public final long e;
    public final bm8 f;
    public final int g;
    public final ks4 h;
    public final long i;
    public final long j;

    public be(long j, bm8 bm8Var, int i, ks4 ks4Var, long j2, bm8 bm8Var2, int i2, ks4 ks4Var2, long j3, long j4) {
        this.a = j;
        this.b = bm8Var;
        this.c = i;
        this.d = ks4Var;
        this.e = j2;
        this.f = bm8Var2;
        this.g = i2;
        this.h = ks4Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && be.class == obj.getClass()) {
            be beVar = (be) obj;
            if (this.a == beVar.a && this.c == beVar.c && this.e == beVar.e && this.g == beVar.g && this.i == beVar.i && this.j == beVar.j && Objects.equals(this.b, beVar.b) && Objects.equals(this.d, beVar.d) && Objects.equals(this.f, beVar.f) && Objects.equals(this.h, beVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
