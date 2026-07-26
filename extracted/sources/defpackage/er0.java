package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class er0 {
    public final a40 a;
    public final cp8 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public er0(int i, a40 a40Var, cp8 cp8Var) {
        int i2 = a40Var.d;
        this.a = a40Var;
        int iA = a40Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        vy2.j(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) a40Var.b) * 1000000;
        long j2 = a40Var.c;
        String str = j29.a;
        this.e = j29.d0(i2, j, j2, RoundingMode.DOWN);
        this.b = cp8Var;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final ml7 a(int i) {
        return new ml7(((this.e * ((long) 1)) / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final jl7 b(long j) {
        if (this.k == 0) {
            ml7 ml7Var = new ml7(0L, this.l);
            return new jl7(ml7Var, ml7Var);
        }
        int i = (int) (j / ((this.e * ((long) 1)) / ((long) this.f)));
        int iD = j29.d(this.n, i, true, true);
        if (this.n[iD] == i) {
            ml7 ml7VarA = a(iD);
            return new jl7(ml7VarA, ml7VarA);
        }
        ml7 ml7VarA2 = a(iD);
        int i2 = iD + 1;
        return i2 < this.m.length ? new jl7(ml7VarA2, a(i2)) : new jl7(ml7VarA2, ml7VarA2);
    }
}
