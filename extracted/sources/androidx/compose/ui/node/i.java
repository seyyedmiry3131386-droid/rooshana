package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ch0;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.hv1;
import defpackage.iv1;
import defpackage.js3;
import defpackage.m14;
import defpackage.o40;
import defpackage.og;
import defpackage.qj1;
import defpackage.ri1;
import defpackage.t61;
import defpackage.tc0;
import defpackage.ti1;
import defpackage.tm0;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.u26;
import defpackage.vm0;
import defpackage.wv8;
import defpackage.y40;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public final class i implements hv1 {
    public final vm0 a = new vm0();
    public gv1 b;

    @Override // defpackage.hv1
    public final void A(long j, float f, float f2, boolean z, long j2, long j3, iv1 iv1Var) {
        this.a.A(j, f, f2, z, j2, j3, iv1Var);
    }

    @Override // defpackage.hv1
    public final void E(long j, float f, long j2, iv1 iv1Var) {
        this.a.E(j, f, j2, iv1Var);
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return this.a.F(f);
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return this.a.J(i);
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.hv1
    public final void M(u26 u26Var, ch0 ch0Var, float f, iv1 iv1Var, int i) {
        this.a.M(u26Var, ch0Var, f, iv1Var, i);
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.a.O();
    }

    @Override // defpackage.hv1
    public final void R(long j, long j2, long j3, long j4, iv1 iv1Var) {
        this.a.R(j, j2, j3, j4, iv1Var);
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.hv1
    public final wv8 X() {
        return this.a.b;
    }

    public final void a() {
        vm0 vm0Var = this.a;
        tm0 tm0VarV = vm0Var.b.v();
        ri1 ri1Var = this.b;
        if (ri1Var == null) {
            throw t61.r("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        gx4 gx4Var = (gx4) ri1Var;
        gx4 gx4VarJ = gx4Var.a.f;
        if (gx4VarJ == null || (gx4VarJ.d & 4) == 0) {
            gx4VarJ = null;
        } else {
            while (gx4VarJ != null) {
                int i = gx4VarJ.c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    gx4VarJ = gx4VarJ.f;
                }
            }
            gx4VarJ = null;
        }
        if (gx4VarJ == null) {
            m mVarE = y40.E(ri1Var, 4);
            if (mVarE.J0() == gx4Var.a) {
                mVarE = mVarE.r;
                js3.m(mVarE);
            }
            mVarE.Y0(tm0VarV, (androidx.compose.ui.graphics.layer.a) vm0Var.b.c);
            return;
        }
        zb5 zb5Var = null;
        while (gx4VarJ != null) {
            if (gx4VarJ instanceof gv1) {
                gv1 gv1Var = (gv1) gx4VarJ;
                androidx.compose.ui.graphics.layer.a aVar = (androidx.compose.ui.graphics.layer.a) vm0Var.b.c;
                m mVarE2 = y40.E(gv1Var, 4);
                long jM = tt3.M(mVarE2.c);
                h hVar = mVarE2.p;
                hVar.getClass();
                m14.a(hVar).getSharedDrawScope().b(tm0VarV, jM, mVarE2, gv1Var, aVar);
            } else if ((gx4VarJ.c & 4) != 0 && (gx4VarJ instanceof ti1)) {
                int i2 = 0;
                for (gx4 gx4Var2 = ((ti1) gx4VarJ).p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                    if ((gx4Var2.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            gx4VarJ = gx4Var2;
                        } else {
                            if (zb5Var == null) {
                                zb5Var = new zb5(0, new gx4[16]);
                            }
                            if (gx4VarJ != null) {
                                zb5Var.b(gx4VarJ);
                                gx4VarJ = null;
                            }
                            zb5Var.b(gx4Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            gx4VarJ = y40.j(zb5Var);
        }
    }

    @Override // defpackage.hv1
    public final void a0(og ogVar, long j, long j2, long j3, float f, tc0 tc0Var, int i) {
        this.a.a0(ogVar, j, j2, j3, f, tc0Var, i);
    }

    public final void b(tm0 tm0Var, long j, m mVar, gv1 gv1Var, androidx.compose.ui.graphics.layer.a aVar) {
        gv1 gv1Var2 = this.b;
        this.b = gv1Var;
        LayoutDirection layoutDirection = mVar.p.B;
        vm0 vm0Var = this.a;
        qj1 qj1VarX = vm0Var.b.x();
        wv8 wv8Var = vm0Var.b;
        LayoutDirection layoutDirectionZ = wv8Var.z();
        tm0 tm0VarV = wv8Var.v();
        long jA = wv8Var.A();
        androidx.compose.ui.graphics.layer.a aVar2 = (androidx.compose.ui.graphics.layer.a) wv8Var.c;
        wv8Var.N(mVar);
        wv8Var.O(layoutDirection);
        wv8Var.M(tm0Var);
        wv8Var.P(j);
        wv8Var.c = aVar;
        tm0Var.e();
        try {
            gv1Var.T(this);
            tm0Var.o();
            wv8Var.N(qj1VarX);
            wv8Var.O(layoutDirectionZ);
            wv8Var.M(tm0VarV);
            wv8Var.P(jA);
            wv8Var.c = aVar2;
            this.b = gv1Var2;
        } catch (Throwable th) {
            tm0Var.o();
            wv8Var.N(qj1VarX);
            wv8Var.O(layoutDirectionZ);
            wv8Var.M(tm0VarV);
            wv8Var.P(jA);
            wv8Var.c = aVar2;
            throw th;
        }
    }

    @Override // defpackage.qj1
    public final int b0(float f) {
        vm0 vm0Var = this.a;
        vm0Var.getClass();
        return o40.a(vm0Var, f);
    }

    public final void c(ch0 ch0Var, long j, long j2, long j3, float f, iv1 iv1Var) {
        vm0 vm0Var = this.a;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        vm0Var.a.c.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), vm0Var.b(ch0Var, iv1Var, f, null, 3, 1));
    }

    @Override // defpackage.hv1
    public final long d() {
        return this.a.b.A();
    }

    @Override // defpackage.hv1
    public final long d0() {
        return this.a.d0();
    }

    public final void e(androidx.compose.ui.graphics.layer.a aVar, long j, final dp2 dp2Var) {
        final gv1 gv1Var = this.b;
        aVar.e(this, getLayoutDirection(), j, new dp2() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                hv1 hv1Var = (hv1) obj;
                i iVar = this.g;
                gv1 gv1Var2 = iVar.b;
                iVar.b = gv1Var;
                try {
                    qj1 qj1VarX = hv1Var.X().x();
                    LayoutDirection layoutDirectionZ = hv1Var.X().z();
                    tm0 tm0VarV = hv1Var.X().v();
                    long jA = hv1Var.X().A();
                    androidx.compose.ui.graphics.layer.a aVar2 = (androidx.compose.ui.graphics.layer.a) hv1Var.X().c;
                    dp2 dp2Var2 = dp2Var;
                    qj1 qj1VarX2 = iVar.X().x();
                    LayoutDirection layoutDirectionZ2 = iVar.X().z();
                    tm0 tm0VarV2 = iVar.X().v();
                    long jA2 = iVar.X().A();
                    androidx.compose.ui.graphics.layer.a aVar3 = (androidx.compose.ui.graphics.layer.a) iVar.X().c;
                    wv8 wv8VarX = iVar.X();
                    wv8VarX.N(qj1VarX);
                    wv8VarX.O(layoutDirectionZ);
                    wv8VarX.M(tm0VarV);
                    wv8VarX.P(jA);
                    wv8VarX.c = aVar2;
                    tm0VarV.e();
                    try {
                        dp2Var2.invoke(iVar);
                        iVar.b = gv1Var2;
                        return tx8.a;
                    } finally {
                        tm0VarV.o();
                        wv8 wv8VarX2 = iVar.X();
                        wv8VarX2.N(qj1VarX2);
                        wv8VarX2.O(layoutDirectionZ2);
                        wv8VarX2.M(tm0VarV2);
                        wv8VarX2.P(jA2);
                        wv8VarX2.c = aVar3;
                    }
                } catch (Throwable th) {
                    iVar.b = gv1Var2;
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.hv1
    public final void g0(ch0 ch0Var, long j, long j2, float f, iv1 iv1Var) {
        this.a.g0(ch0Var, j, j2, f, iv1Var);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.hv1
    public final LayoutDirection getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.qj1
    public final long h0(long j) {
        vm0 vm0Var = this.a;
        vm0Var.getClass();
        return o40.d(j, vm0Var);
    }

    @Override // defpackage.qj1
    public final float j0(long j) {
        vm0 vm0Var = this.a;
        vm0Var.getClass();
        return o40.c(j, vm0Var);
    }

    @Override // defpackage.hv1
    public final void l0(long j, long j2, long j3, float f, int i) {
        this.a.l0(j, j2, j3, f, i);
    }

    @Override // defpackage.qj1
    public final long o(long j) {
        vm0 vm0Var = this.a;
        vm0Var.getClass();
        return o40.b(j, vm0Var);
    }

    @Override // defpackage.qj1
    public final float s(long j) {
        vm0 vm0Var = this.a;
        vm0Var.getClass();
        return dw1.b(j, vm0Var);
    }

    @Override // defpackage.hv1
    public final void y(long j, long j2, long j3, float f, int i) {
        this.a.y(j, j2, j3, f, i);
    }

    @Override // defpackage.hv1
    public final void z(u26 u26Var, long j, iv1 iv1Var) {
        this.a.z(u26Var, j, iv1Var);
    }
}
