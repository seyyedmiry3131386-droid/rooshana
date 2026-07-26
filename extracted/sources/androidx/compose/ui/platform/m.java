package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c26;
import defpackage.dp2;
import defpackage.eh;
import defpackage.ev2;
import defpackage.fa7;
import defpackage.fv2;
import defpackage.fy5;
import defpackage.fz;
import defpackage.gh;
import defpackage.hv1;
import defpackage.ia7;
import defpackage.id0;
import defpackage.js3;
import defpackage.lq8;
import defpackage.nr5;
import defpackage.o87;
import defpackage.pk4;
import defpackage.qb5;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.rn3;
import defpackage.rn6;
import defpackage.rq3;
import defpackage.rq4;
import defpackage.sy6;
import defpackage.t61;
import defpackage.tm0;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.u26;
import defpackage.uy6;
import defpackage.vm0;
import defpackage.vw5;
import defpackage.wv8;
import defpackage.ww5;
import defpackage.xw5;
import defpackage.yh0;
import defpackage.zb5;
import defpackage.zq3;
import defpackage.zu0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements fy5 {
    public androidx.compose.ui.graphics.layer.a a;
    public final ev2 b;
    public final AndroidComposeView c;
    public qp2 d;
    public bp2 e;
    public long f;
    public boolean g;
    public float[] i;
    public boolean j;
    public int n;
    public rq4 p;
    public boolean q;
    public boolean r;
    public boolean t;
    public final float[] h = pk4.a();
    public qj1 k = yh0.c();
    public LayoutDirection l = LayoutDirection.a;
    public final vm0 m = new vm0();
    public long o = lq8.b;
    public boolean s = true;
    public final dp2 u = new dp2() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            hv1 hv1Var = (hv1) obj;
            tm0 tm0VarV = hv1Var.X().v();
            qp2 qp2Var = this.g.d;
            if (qp2Var != null) {
                qp2Var.invoke(tm0VarV, (androidx.compose.ui.graphics.layer.a) hv1Var.X().c);
            }
            return tx8.a;
        }
    };

    public m(androidx.compose.ui.graphics.layer.a aVar, ev2 ev2Var, AndroidComposeView androidComposeView, qp2 qp2Var, bp2 bp2Var) {
        this.a = aVar;
        this.b = ev2Var;
        this.c = androidComposeView;
        this.d = qp2Var;
        this.e = bp2Var;
        long j = Integer.MAX_VALUE;
        this.f = (j & 4294967295L) | (j << 32);
    }

    @Override // defpackage.fy5
    public final void a(float[] fArr) {
        pk4.e(fArr, m());
    }

    @Override // defpackage.fy5
    public final void b(qb5 qb5Var, boolean z) {
        float[] fArrL = z ? l() : m();
        if (this.s) {
            return;
        }
        if (fArrL != null) {
            pk4.c(fArrL, qb5Var);
            return;
        }
        qb5Var.b = 0.0f;
        qb5Var.c = 0.0f;
        qb5Var.d = 0.0f;
        qb5Var.e = 0.0f;
    }

    @Override // defpackage.fy5
    public final void c(tm0 tm0Var, androidx.compose.ui.graphics.layer.a aVar) {
        k();
        this.t = this.a.a.M() > 0.0f;
        vm0 vm0Var = this.m;
        wv8 wv8Var = vm0Var.b;
        wv8Var.M(tm0Var);
        wv8Var.c = aVar;
        tt3.v(vm0Var, this.a);
    }

    @Override // defpackage.fy5
    public final boolean d(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        androidx.compose.ui.graphics.layer.a aVar = this.a;
        if (!aVar.w) {
            return true;
        }
        rq4 rq4VarD = aVar.d();
        if (rq4VarD instanceof ww5) {
            sy6 sy6Var = ((ww5) rq4VarD).p;
            return sy6Var.a <= fIntBitsToFloat && fIntBitsToFloat < sy6Var.c && sy6Var.b <= fIntBitsToFloat2 && fIntBitsToFloat2 < sy6Var.d;
        }
        if (!(rq4VarD instanceof xw5)) {
            if (rq4VarD instanceof vw5) {
                return ia7.i(((vw5) rq4VarD).p, fIntBitsToFloat, fIntBitsToFloat2);
            }
            throw new NoWhenBranchMatchedException();
        }
        fa7 fa7Var = ((xw5) rq4VarD).p;
        float f = fa7Var.a;
        long j2 = fa7Var.f;
        long j3 = fa7Var.h;
        long j4 = fa7Var.g;
        float f2 = fa7Var.d;
        float f3 = fa7Var.b;
        float f4 = fa7Var.c;
        long j5 = fa7Var.e;
        if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
            int i = (int) (j5 >> 32);
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            int i2 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= fa7Var.b()) {
                int i3 = (int) (j3 >> 32);
                float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                int i4 = (int) (j4 >> 32);
                if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= fa7Var.b()) {
                    int i5 = (int) (j5 & 4294967295L);
                    int i6 = (int) (j3 & 4294967295L);
                    if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= fa7Var.a()) {
                        int i7 = (int) (j2 & 4294967295L);
                        int i8 = (int) (j4 & 4294967295L);
                        if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= fa7Var.a()) {
                            float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f;
                            float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f3;
                            float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i2);
                            float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f3;
                            float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i4);
                            float fIntBitsToFloat10 = f2 - Float.intBitsToFloat(i8);
                            float fIntBitsToFloat11 = f2 - Float.intBitsToFloat(i6);
                            float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f;
                            if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                return ia7.k(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, fa7Var.e);
                            }
                            if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                return ia7.k(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, fa7Var.h);
                            }
                            if (fIntBitsToFloat > fIntBitsToFloat7 && fIntBitsToFloat2 < fIntBitsToFloat8) {
                                return ia7.k(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, fa7Var.f);
                            }
                            if (fIntBitsToFloat > fIntBitsToFloat9 && fIntBitsToFloat2 > fIntBitsToFloat10) {
                                return ia7.k(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, fa7Var.g);
                            }
                        }
                    }
                }
            }
            eh ehVarA = gh.a();
            bl4.j(ehVarA, fa7Var);
            return ia7.i(ehVarA, fIntBitsToFloat, fIntBitsToFloat2);
        }
    }

    @Override // defpackage.fy5
    public final void destroy() {
        zb5 zb5Var;
        Reference referencePoll;
        this.d = null;
        this.e = null;
        this.g = true;
        boolean z = this.j;
        AndroidComposeView androidComposeView = this.c;
        if (z) {
            this.j = false;
            androidComposeView.w(this, false);
        }
        ev2 ev2Var = this.b;
        if (ev2Var != null) {
            ev2Var.a(this.a);
            rn6 rn6Var = androidComposeView.T0;
            do {
                ReferenceQueue referenceQueue = (ReferenceQueue) rn6Var.c;
                zb5Var = (zb5) rn6Var.b;
                referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    zb5Var.k(referencePoll);
                }
            } while (referencePoll != null);
            zb5Var.b(new WeakReference(this, (ReferenceQueue) rn6Var.c));
            androidComposeView.D.k(this);
        }
    }

    @Override // defpackage.fy5
    public final void e(o87 o87Var) {
        bp2 bp2Var;
        int i;
        bp2 bp2Var2;
        int i2 = o87Var.a | this.n;
        this.l = o87Var.p;
        this.k = o87Var.o;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.o = o87Var.j;
        }
        if ((i2 & 1) != 0) {
            androidx.compose.ui.graphics.layer.a aVar = this.a;
            float f = o87Var.b;
            fv2 fv2Var = aVar.a;
            if (fv2Var.b() != f) {
                fv2Var.B(f);
            }
        }
        if ((i2 & 2) != 0) {
            androidx.compose.ui.graphics.layer.a aVar2 = this.a;
            float f2 = o87Var.c;
            fv2 fv2Var2 = aVar2.a;
            if (fv2Var2.N() != f2) {
                fv2Var2.l(f2);
            }
        }
        if ((i2 & 4) != 0) {
            androidx.compose.ui.graphics.layer.a aVar3 = this.a;
            float f3 = o87Var.d;
            fv2 fv2Var3 = aVar3.a;
            if (fv2Var3.a() != f3) {
                fv2Var3.u(f3);
            }
        }
        if ((i2 & 8) != 0) {
            fv2 fv2Var4 = this.a.a;
            if (fv2Var4.D() != 0.0f) {
                fv2Var4.F();
            }
        }
        if ((i2 & 16) != 0) {
            fv2 fv2Var5 = this.a.a;
            if (fv2Var5.v() != 0.0f) {
                fv2Var5.w();
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            androidx.compose.ui.graphics.layer.a aVar4 = this.a;
            float f4 = o87Var.e;
            fv2 fv2Var6 = aVar4.a;
            if (fv2Var6.M() != f4) {
                fv2Var6.c(f4);
                aVar4.g = true;
                aVar4.a();
            }
            if (o87Var.e > 0.0f && !this.t && (bp2Var2 = this.e) != null) {
                bp2Var2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            androidx.compose.ui.graphics.layer.a aVar5 = this.a;
            long j = o87Var.f;
            fv2 fv2Var7 = aVar5.a;
            if (!zu0.c(j, fv2Var7.s())) {
                fv2Var7.z(j);
            }
        }
        if ((i2 & 128) != 0) {
            androidx.compose.ui.graphics.layer.a aVar6 = this.a;
            long j2 = o87Var.g;
            fv2 fv2Var8 = aVar6.a;
            if (!zu0.c(j2, fv2Var8.y())) {
                fv2Var8.J(j2);
            }
        }
        if ((i2 & 1024) != 0) {
            androidx.compose.ui.graphics.layer.a aVar7 = this.a;
            float f5 = o87Var.h;
            fv2 fv2Var9 = aVar7.a;
            if (fv2Var9.q() != f5) {
                fv2Var9.e(f5);
            }
        }
        if ((i2 & 256) != 0) {
            fv2 fv2Var10 = this.a.a;
            if (fv2Var10.H() != 0.0f) {
                fv2Var10.t();
            }
        }
        if ((i2 & 512) != 0) {
            fv2 fv2Var11 = this.a.a;
            if (fv2Var11.n() != 0.0f) {
                fv2Var11.x();
            }
        }
        if ((i2 & 2048) != 0) {
            androidx.compose.ui.graphics.layer.a aVar8 = this.a;
            float f6 = o87Var.i;
            fv2 fv2Var12 = aVar8.a;
            if (fv2Var12.C() != f6) {
                fv2Var12.L(f6);
            }
        }
        if (i3 != 0) {
            if (lq8.a(this.o, lq8.b)) {
                androidx.compose.ui.graphics.layer.a aVar9 = this.a;
                if (!nr5.c(aVar9.v, 9205357640488583168L)) {
                    aVar9.v = 9205357640488583168L;
                    aVar9.a.r(9205357640488583168L);
                }
            } else {
                androidx.compose.ui.graphics.layer.a aVar10 = this.a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(lq8.c(this.o) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(lq8.b(this.o) * ((int) (this.f >> 32)))) << 32);
                if (!nr5.c(aVar10.v, jFloatToRawIntBits)) {
                    aVar10.v = jFloatToRawIntBits;
                    aVar10.a.r(jFloatToRawIntBits);
                }
            }
        }
        if ((i2 & 16384) != 0) {
            androidx.compose.ui.graphics.layer.a aVar11 = this.a;
            boolean z2 = o87Var.l;
            if (aVar11.w != z2) {
                aVar11.w = z2;
                aVar11.g = true;
                aVar11.a();
            }
        }
        if ((131072 & i2) != 0) {
            androidx.compose.ui.graphics.layer.a aVar12 = this.a;
            id0 id0Var = o87Var.q;
            fv2 fv2Var13 = aVar12.a;
            if (!js3.i(fv2Var13.d(), id0Var)) {
                fv2Var13.E(id0Var);
            }
        }
        if ((262144 & i2) != 0) {
            fv2 fv2Var14 = this.a.a;
            if (!js3.i(fv2Var14.k(), null)) {
                fv2Var14.A();
            }
        }
        if ((524288 & i2) != 0) {
            androidx.compose.ui.graphics.layer.a aVar13 = this.a;
            int i4 = o87Var.r;
            fv2 fv2Var15 = aVar13.a;
            if (fv2Var15.O() != i4) {
                fv2Var15.g(i4);
            }
        }
        if ((32768 & i2) != 0) {
            androidx.compose.ui.graphics.layer.a aVar14 = this.a;
            int i5 = o87Var.m;
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i5 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            fv2 fv2Var16 = aVar14.a;
            if (fv2Var16.j() != i) {
                fv2Var16.I(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.q = true;
            this.r = true;
        }
        if (js3.i(this.p, o87Var.s)) {
            z = false;
        } else {
            rq4 rq4Var = o87Var.s;
            this.p = rq4Var;
            if (rq4Var != null) {
                androidx.compose.ui.graphics.layer.a aVar15 = this.a;
                if (rq4Var instanceof ww5) {
                    sy6 sy6Var = ((ww5) rq4Var).p;
                    float f7 = sy6Var.a;
                    float f8 = sy6Var.b;
                    aVar15.f((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(sy6Var.c - f7)) << 32) | (((long) Float.floatToRawIntBits(sy6Var.d - f8)) & 4294967295L), 0.0f);
                } else if (rq4Var instanceof vw5) {
                    u26 u26Var = ((vw5) rq4Var).p;
                    aVar15.k = null;
                    aVar15.i = 9205357640488583168L;
                    aVar15.h = 0L;
                    aVar15.j = 0.0f;
                    aVar15.g = true;
                    aVar15.n = false;
                    aVar15.l = u26Var;
                    aVar15.a();
                } else {
                    if (!(rq4Var instanceof xw5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xw5 xw5Var = (xw5) rq4Var;
                    eh ehVar = xw5Var.q;
                    if (ehVar != null) {
                        aVar15.k = null;
                        aVar15.i = 9205357640488583168L;
                        aVar15.h = 0L;
                        aVar15.j = 0.0f;
                        aVar15.g = true;
                        aVar15.n = false;
                        aVar15.l = ehVar;
                        aVar15.a();
                    } else {
                        fa7 fa7Var = xw5Var.p;
                        aVar15.f((((long) Float.floatToRawIntBits(fa7Var.a)) << 32) | (((long) Float.floatToRawIntBits(fa7Var.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fa7Var.b())) << 32) | (((long) Float.floatToRawIntBits(fa7Var.a())) & 4294967295L), Float.intBitsToFloat((int) (fa7Var.h >> 32)));
                    }
                }
                if ((rq4Var instanceof vw5) && Build.VERSION.SDK_INT < 33 && (bp2Var = this.e) != null) {
                    bp2Var.invoke();
                }
            }
        }
        this.n = o87Var.a;
        if (i2 != 0 || z) {
            int i6 = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.c;
            if (i6 >= 26) {
                fz.p(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            if (androidComposeView.l) {
                androidComposeView.M(0.0f);
            }
        }
    }

    @Override // defpackage.fy5
    public final long f(long j, boolean z) {
        float[] fArrM;
        if (z) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.s ? j : pk4.b(j, fArrM);
    }

    @Override // defpackage.fy5
    public final void g(long j) {
        if (zq3.b(j, this.f)) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.l) {
            androidComposeView.M(-4.0f);
        }
        this.f = j;
        if (this.j || this.g) {
            return;
        }
        androidComposeView.invalidate();
        if (true != this.j) {
            this.j = true;
            androidComposeView.w(this, true);
        }
    }

    @Override // defpackage.fy5
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo7getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // defpackage.fy5
    public final void h(qp2 qp2Var, bp2 bp2Var) {
        ev2 ev2Var = this.b;
        if (ev2Var == null) {
            throw t61.r("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.a.s) {
            rn3.a("layer should have been released before reuse");
        }
        this.a = ev2Var.b();
        this.g = false;
        this.d = qp2Var;
        this.e = bp2Var;
        this.q = false;
        this.r = false;
        this.s = true;
        pk4.d(this.h);
        float[] fArr = this.i;
        if (fArr != null) {
            pk4.d(fArr);
        }
        this.o = lq8.b;
        this.t = false;
        long j = Integer.MAX_VALUE;
        this.f = (j & 4294967295L) | (j << 32);
        this.p = null;
        this.n = 0;
    }

    @Override // defpackage.fy5
    public final void i(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            pk4.e(fArr, fArrL);
        }
    }

    @Override // defpackage.fy5
    public final void invalidate() {
        if (this.j || this.g) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        androidComposeView.invalidate();
        if (true != this.j) {
            this.j = true;
            androidComposeView.w(this, true);
        }
    }

    @Override // defpackage.fy5
    public final void j(long j) {
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.l) {
            androidComposeView.M(-4.0f);
        }
        androidx.compose.ui.graphics.layer.a aVar = this.a;
        if (!rq3.a(aVar.t, j)) {
            aVar.t = j;
            aVar.a.m((int) (j >> 32), (int) (j & 4294967295L), aVar.u);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            fz.p(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    @Override // defpackage.fy5
    public final void k() {
        if (this.j) {
            if (!lq8.a(this.o, lq8.b) && !zq3.b(this.a.u, this.f)) {
                androidx.compose.ui.graphics.layer.a aVar = this.a;
                float fB = lq8.b(this.o) * ((int) (this.f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(lq8.c(this.o) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!nr5.c(aVar.v, jFloatToRawIntBits)) {
                    aVar.v = jFloatToRawIntBits;
                    aVar.a.r(jFloatToRawIntBits);
                }
            }
            this.a.e(this.k, this.l, this.f, this.u);
            if (this.j) {
                this.j = false;
                this.c.w(this, false);
            }
        }
    }

    public final float[] l() {
        float[] fArrA = this.i;
        if (fArrA == null) {
            fArrA = pk4.a();
            this.i = fArrA;
        }
        if (this.r) {
            this.r = false;
            float[] fArrM = m();
            if (this.s) {
                return fArrM;
            }
            if (!c26.F(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z = this.q;
        float[] fArr = this.h;
        if (z) {
            androidx.compose.ui.graphics.layer.a aVar = this.a;
            long jE = aVar.v;
            fv2 fv2Var = aVar.a;
            if ((9223372034707292159L & jE) == 9205357640488583168L) {
                jE = uy6.e(tt3.M(this.f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
            float fD = fv2Var.D();
            float fV = fv2Var.v();
            float fH = fv2Var.H();
            float fN = fv2Var.n();
            float fQ = fv2Var.q();
            float fB = fv2Var.b();
            float fN2 = fv2Var.N();
            double d = ((double) fH) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fV * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fV * fSin);
            double d2 = ((double) fN) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fD * fCos2);
            float f10 = (f3 * fCos2) + ((-fD) * fSin2);
            double d3 = ((double) fQ) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fB;
            float f16 = f14 * fB;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fB;
            float f18 = f12 * fN2;
            float f19 = fCos * fCos3 * fN2;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fN2;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.q = false;
            this.s = bt2.E(fArr);
        }
        return fArr;
    }
}
