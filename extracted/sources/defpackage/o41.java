package defpackage;

import androidx.compose.ui.node.i;
import androidx.compose.ui.node.j;
import coil3.compose.AsyncImagePainter;
import coil3.compose.b;

/* JADX INFO: loaded from: classes.dex */
public final class o41 extends gx4 implements gv1, f14, in7 {
    public qd o;
    public q41 p;
    public tc0 r;
    public b t;
    public final AsyncImagePainter u;
    public float q = 1.0f;
    public boolean s = true;

    public o41(AsyncImagePainter asyncImagePainter, qd qdVar, q41 q41Var, tc0 tc0Var, b bVar) {
        this.o = qdVar;
        this.p = q41Var;
        this.r = tc0Var;
        this.t = bVar;
        this.u = asyncImagePainter;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final long C0(long j) {
        if (ey7.f(j)) {
            return 0L;
        }
        long jH = this.u.h();
        if (jH == 9205357640488583168L) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        long jD = this.p.d(jFloatToRawIntBits, j);
        return (Math.abs(Float.intBitsToFloat((int) (jD >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jD))) > Float.MAX_VALUE) ? j : j27.l(jFloatToRawIntBits, jD);
    }

    public final long D0(long j) {
        float fJ;
        int i;
        float fS;
        boolean zF = h31.f(j);
        boolean zE = h31.e(j);
        if (zF && zE) {
            return j;
        }
        boolean z = h31.d(j) && h31.c(j);
        AsyncImagePainter asyncImagePainter = this.u;
        long jH = asyncImagePainter.h();
        if (jH == 9205357640488583168L) {
            return (!z || ((zw) asyncImagePainter.t.a.getValue()).a() == null) ? j : h31.a(j, h31.h(j), 0, h31.g(j), 0, 10);
        }
        if (z && (zF || zE)) {
            fJ = h31.h(j);
            i = h31.g(j);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
            if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                int i2 = q29.b;
                fJ = ok4.s(fIntBitsToFloat, h31.j(j), h31.h(j));
            } else {
                fJ = h31.j(j);
            }
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                int i3 = q29.b;
                fS = ok4.s(fIntBitsToFloat2, h31.i(j), h31.g(j));
                long jC0 = C0((((long) Float.floatToRawIntBits(fS)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                return h31.a(j, j31.g(ok4.V(Float.intBitsToFloat((int) (jC0 >> 32))), j), 0, j31.f(ok4.V(Float.intBitsToFloat((int) (jC0 & 4294967295L))), j), 0, 10);
            }
            i = h31.i(j);
        }
        fS = i;
        long jC02 = C0((((long) Float.floatToRawIntBits(fS)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
        return h31.a(j, j31.g(ok4.V(Float.intBitsToFloat((int) (jC02 >> 32))), j), 0, j31.f(ok4.V(Float.intBitsToFloat((int) (jC02 & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        vm0 vm0Var = iVar.a;
        long jC0 = C0(vm0Var.b.A());
        long jA = this.o.a(q29.b(jC0), q29.b(vm0Var.b.A()), iVar.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        wv8 wv8Var = vm0Var.b;
        long jA2 = wv8Var.A();
        wv8Var.v().e();
        try {
            nm5 nm5Var = (nm5) wv8Var.b;
            wv8 wv8Var2 = (wv8) nm5Var.b;
            if (this.s) {
                wv8Var2.v().m(0.0f, 0.0f, Float.intBitsToFloat((int) (wv8Var2.A() >> 32)), Float.intBitsToFloat((int) (4294967295L & wv8Var2.A())), 1);
            }
            nm5Var.z(i, i2);
            this.u.g(iVar, jC0, this.q, this.r);
            wv8Var.v().o();
            wv8Var.P(jA2);
            iVar.a();
        } catch (Throwable th) {
            o40.F(wv8Var, jA2);
            throw th;
        }
    }

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        long jB = j31.b(0, i, 7);
        b bVar = this.t;
        if (bVar != null) {
            bVar.j(jB);
        }
        if (this.u.h() == 9205357640488583168L) {
            return yk4Var.l(i);
        }
        long jD0 = D0(jB);
        return Math.max(h31.j(jD0), yk4Var.l(i));
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        long jB = j31.b(i, 0, 13);
        b bVar = this.t;
        if (bVar != null) {
            bVar.j(jB);
        }
        if (this.u.h() == 9205357640488583168L) {
            return yk4Var.P(i);
        }
        long jD0 = D0(jB);
        return Math.max(h31.i(jD0), yk4Var.P(i));
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        b bVar = this.t;
        if (bVar != null) {
            bVar.j(j);
        }
        b96 b96VarT = yk4Var.t(D0(j));
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new q(b96VarT, 0));
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        long jB = j31.b(0, i, 7);
        b bVar = this.t;
        if (bVar != null) {
            bVar.j(jB);
        }
        if (this.u.h() == 9205357640488583168L) {
            return yk4Var.n(i);
        }
        long jD0 = D0(jB);
        return Math.max(h31.j(jD0), yk4Var.n(i));
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        long jB = j31.b(i, 0, 13);
        b bVar = this.t;
        if (bVar != null) {
            bVar.j(jB);
        }
        if (this.u.h() == 9205357640488583168L) {
            return yk4Var.a(i);
        }
        long jD0 = D0(jB);
        return Math.max(h31.i(jD0), yk4Var.a(i));
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.gx4
    public final void s0() {
        e71 e71VarO0 = o0();
        AsyncImagePainter asyncImagePainter = this.u;
        asyncImagePainter.l = e71VarO0;
        asyncImagePainter.e();
    }

    @Override // defpackage.gx4
    public final void u0() {
        this.u.c();
    }

    @Override // defpackage.gx4
    public final void w0() {
        this.u.m(null);
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
    }
}
