package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o80 implements gb6 {
    public final am8 a = new am8();

    @Override // defpackage.gb6
    public final jp4 E() {
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        if (bm8VarS.p()) {
            return null;
        }
        return bm8VarS.m(e62Var.M(), this.a, 0L).c;
    }

    @Override // defpackage.gb6
    public final boolean H() {
        e62 e62Var = (e62) this;
        return e62Var.e() == 3 && e62Var.l() && e62Var.R() == 0;
    }

    @Override // defpackage.gb6
    public final void J(jp4 jp4Var) {
        h0(ImmutableList.s(jp4Var));
    }

    @Override // defpackage.gb6
    public final void K() {
        ((e62) this).C(true);
    }

    @Override // defpackage.gb6
    public final void P(jp4 jp4Var) {
        ((e62) this).c0(ImmutableList.s(jp4Var));
    }

    @Override // defpackage.gb6
    public final void T(int i, jp4 jp4Var) {
        ((e62) this).R0(i, i + 1, ImmutableList.s(jp4Var));
    }

    @Override // defpackage.gb6
    public final void X() {
        int iE;
        e62 e62Var = (e62) this;
        if (e62Var.S().p() || e62Var.h()) {
            l0();
            return;
        }
        if (!j0()) {
            if (n0() && m0()) {
                p0(e62Var.M(), -9223372036854775807L, false);
                return;
            } else {
                l0();
                return;
            }
        }
        bm8 bm8VarS = e62Var.S();
        if (bm8VarS.p()) {
            iE = -1;
        } else {
            int iM = e62Var.M();
            e62Var.c1();
            int i = e62Var.F;
            if (i == 1) {
                i = 0;
            }
            e62Var.c1();
            iE = bm8VarS.e(iM, i, e62Var.G);
        }
        if (iE == -1) {
            l0();
        } else if (iE == e62Var.M()) {
            p0(e62Var.M(), -9223372036854775807L, true);
        } else {
            p0(iE, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gb6
    public final void Y() {
        e62 e62Var = (e62) this;
        e62Var.c1();
        r0(12, e62Var.w);
    }

    @Override // defpackage.gb6
    public final void a0() {
        e62 e62Var = (e62) this;
        e62Var.c1();
        r0(11, -e62Var.v);
    }

    @Override // defpackage.gb6
    public final void b() {
        ((e62) this).C(false);
    }

    @Override // defpackage.gb6
    public final boolean f0(int i) {
        e62 e62Var = (e62) this;
        e62Var.c1();
        return e62Var.O.a(i);
    }

    public final void h0(List list) {
        ((e62) this).v0(Integer.MAX_VALUE, list);
    }

    public final void i0() {
        ((e62) this).N0(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.gb6
    public final void j(int i, long j) {
        p0(i, j, false);
    }

    public final boolean j0() {
        int iE;
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        if (bm8VarS.p()) {
            iE = -1;
        } else {
            int iM = e62Var.M();
            e62Var.c1();
            int i = e62Var.F;
            if (i == 1) {
                i = 0;
            }
            e62Var.c1();
            iE = bm8VarS.e(iM, i, e62Var.G);
        }
        return iE != -1;
    }

    @Override // defpackage.gb6
    public final void k(jp4 jp4Var, long j) {
        ((e62) this).A(ImmutableList.s(jp4Var), 0, j);
    }

    public final boolean k0() {
        int iK;
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        if (bm8VarS.p()) {
            iK = -1;
        } else {
            int iM = e62Var.M();
            e62Var.c1();
            int i = e62Var.F;
            if (i == 1) {
                i = 0;
            }
            e62Var.c1();
            iK = bm8VarS.k(iM, i, e62Var.G);
        }
        return iK != -1;
    }

    public final void l0() {
        ((e62) this).c1();
    }

    public final boolean m0() {
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        return !bm8VarS.p() && bm8VarS.m(e62Var.M(), this.a, 0L).i;
    }

    public final boolean n0() {
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        return !bm8VarS.p() && bm8VarS.m(e62Var.M(), this.a, 0L).a();
    }

    @Override // defpackage.gb6
    public final long o() {
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        if (bm8VarS.p()) {
            return -9223372036854775807L;
        }
        return j29.k0(bm8VarS.m(e62Var.M(), this.a, 0L).m);
    }

    public final boolean o0() {
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        return !bm8VarS.p() && bm8VarS.m(e62Var.M(), this.a, 0L).h;
    }

    public abstract void p0(int i, long j, boolean z);

    public final void q0(int i, long j) {
        p0(((e62) this).M(), j, false);
    }

    public final void r0(int i, long j) {
        e62 e62Var = (e62) this;
        long jD0 = e62Var.d0() + j;
        long duration = e62Var.getDuration();
        if (duration != -9223372036854775807L) {
            jD0 = Math.min(jD0, duration);
        }
        q0(i, Math.max(jD0, 0L));
    }

    public final void s0(int i) {
        int iK;
        e62 e62Var = (e62) this;
        bm8 bm8VarS = e62Var.S();
        if (bm8VarS.p()) {
            iK = -1;
        } else {
            int iM = e62Var.M();
            e62Var.c1();
            int i2 = e62Var.F;
            if (i2 == 1) {
                i2 = 0;
            }
            e62Var.c1();
            iK = bm8VarS.k(iM, i2, e62Var.G);
        }
        if (iK == -1) {
            l0();
        } else if (iK == e62Var.M()) {
            p0(e62Var.M(), -9223372036854775807L, true);
        } else {
            p0(iK, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gb6
    public final void t() {
        p0(((e62) this).M(), -9223372036854775807L, false);
    }

    public final void t0(float f) {
        e62 e62Var = (e62) this;
        e62Var.d(new ua6(f, e62Var.g().b));
    }

    @Override // defpackage.gb6
    public final void x(long j) {
        q0(5, j);
    }

    @Override // defpackage.gb6
    public final void z() {
        e62 e62Var = (e62) this;
        if (e62Var.S().p() || e62Var.h()) {
            l0();
            return;
        }
        boolean zK0 = k0();
        if (n0() && !o0()) {
            if (zK0) {
                s0(7);
                return;
            } else {
                l0();
                return;
            }
        }
        if (zK0) {
            long jD0 = e62Var.d0();
            e62Var.c1();
            if (jD0 <= e62Var.x) {
                s0(7);
                return;
            }
        }
        q0(7, 0L);
    }
}
