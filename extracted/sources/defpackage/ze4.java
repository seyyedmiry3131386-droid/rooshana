package defpackage;

import androidx.compose.ui.node.m;

/* JADX INFO: loaded from: classes.dex */
public final class ze4 implements v04 {
    public final ye4 a;

    public ze4(ye4 ye4Var) {
        this.a = ye4Var;
    }

    @Override // defpackage.v04
    public final long C(v04 v04Var, long j) {
        return H(v04Var, j);
    }

    @Override // defpackage.v04
    public final long G(long j) {
        return nr5.g(this.a.p.G(j), a());
    }

    @Override // defpackage.v04
    public final long H(v04 v04Var, long j) {
        boolean z = v04Var instanceof ze4;
        ye4 ye4Var = this.a;
        if (!z) {
            ye4 ye4VarB = s7.B(ye4Var);
            m mVar = ye4VarB.p;
            long jH = H(ye4VarB.s, j);
            long j2 = ye4VarB.q;
            long jF = nr5.f(jH, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!mVar.J0().n) {
                rn3.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            mVar.S0();
            m mVar2 = mVar.s;
            if (mVar2 != null) {
                mVar = mVar2;
            }
            return nr5.g(jF, mVar.H(v04Var, 0L));
        }
        ye4 ye4Var2 = ((ze4) v04Var).a;
        m mVar3 = ye4Var2.p;
        mVar3.S0();
        ye4 ye4VarH0 = ye4Var.p.F0(mVar3).H0();
        if (ye4VarH0 != null) {
            long jB = rq3.b(rq3.c(ye4Var2.C0(ye4VarH0, false), is3.I(j)), ye4Var.C0(ye4VarH0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        ye4 ye4VarB2 = s7.B(ye4Var2);
        long jC = rq3.c(rq3.c(ye4Var2.C0(ye4VarB2, false), ye4VarB2.q), is3.I(j));
        ye4 ye4VarB3 = s7.B(ye4Var);
        long jB2 = rq3.b(jC, rq3.c(ye4Var.C0(ye4VarB3, false), ye4VarB3.q));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        m mVar4 = ye4VarB3.p.s;
        js3.m(mVar4);
        m mVar5 = ye4VarB2.p.s;
        js3.m(mVar5);
        return mVar4.H(mVar5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.v04
    public final sy6 I(v04 v04Var, boolean z) {
        return this.a.p.I(v04Var, z);
    }

    @Override // defpackage.v04
    public final long K(long j) {
        return this.a.p.K(nr5.g(j, a()));
    }

    public final long a() {
        ye4 ye4Var = this.a;
        ye4 ye4VarB = s7.B(ye4Var);
        return nr5.f(H(ye4VarB.s, 0L), ye4Var.p.H(ye4VarB.p, 0L));
    }

    @Override // defpackage.v04
    public final long b(long j) {
        return this.a.p.b(nr5.g(j, a()));
    }

    @Override // defpackage.v04
    public final boolean h() {
        return this.a.p.J0().n;
    }

    @Override // defpackage.v04
    public final void i(float[] fArr) {
        this.a.p.i(fArr);
    }

    @Override // defpackage.v04
    public final void j(v04 v04Var, float[] fArr) {
        this.a.p.j(v04Var, fArr);
    }

    @Override // defpackage.v04
    public final long k() {
        ye4 ye4Var = this.a;
        return (((long) ye4Var.a) << 32) | (((long) ye4Var.b) & 4294967295L);
    }

    @Override // defpackage.v04
    public final long q(long j) {
        return this.a.p.q(nr5.g(0L, a()));
    }

    @Override // defpackage.v04
    public final long u(long j) {
        return nr5.g(this.a.p.u(j), a());
    }

    @Override // defpackage.v04
    public final v04 w() {
        ye4 ye4VarH0;
        if (!h()) {
            rn3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m mVar = ((m) this.a.p.p.H.e).s;
        if (mVar == null || (ye4VarH0 = mVar.H0()) == null) {
            return null;
        }
        return ye4VarH0.s;
    }
}
