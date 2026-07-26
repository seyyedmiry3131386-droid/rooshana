package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fx7 implements v72 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public x72 f;
    public cp8 g;

    public fx7(String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        cp8 cp8Var = this.g;
        cp8Var.getClass();
        int iE = cp8Var.e(w72Var, 1024, true);
        if (iE != -1) {
            this.d += iE;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        int i = this.b;
        int i2 = this.a;
        vy2.s((i2 == -1 || i == -1) ? false : true);
        h26 h26Var = new h26(i);
        ((oe1) w72Var).e(h26Var.a, 0, i, false);
        return h26Var.D() == i2;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.f = x72Var;
        cp8 cp8VarO = x72Var.o(1024, 4);
        this.g = cp8VarO;
        rj2 rj2Var = new rj2();
        String str = this.c;
        rj2Var.l = tv4.m(str);
        rj2Var.m = tv4.m(str);
        rm7.w(rj2Var, cp8VarO);
        this.f.l();
        this.f.t(new kx7());
        this.e = 1;
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
