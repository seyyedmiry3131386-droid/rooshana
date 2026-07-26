package defpackage;

import androidx.compose.ui.node.j;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class xe4 extends a96 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ xe4(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.qj1
    public final float O() {
        switch (this.b) {
            case 0:
                return ((j) this.c).O();
            default:
                return ((AndroidComposeView) this.c).getDensity().O();
        }
    }

    @Override // defpackage.a96
    public float b(sc3 sc3Var) {
        float fIntBitsToFloat;
        int iN0;
        switch (this.b) {
            case 0:
                qp2 qp2Var = sc3Var.a;
                if (qp2Var != null) {
                    return ((Number) qp2Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                j jVar = (j) this.c;
                if (jVar.k) {
                    return Float.NaN;
                }
                j jVar2 = jVar;
                while (true) {
                    yb ybVar = jVar2.m;
                    float f = (ybVar == null || (iN0 = ew.N0((sc3[]) ybVar.b, sc3Var)) < 0) ? Float.NaN : ((float[]) ybVar.c)[iN0];
                    if (!Float.isNaN(f)) {
                        jVar2.e0(jVar.f0(), sc3Var);
                        v04 v04VarP0 = jVar2.p0();
                        v04 v04VarP02 = jVar.p0();
                        switch (sc3Var.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (v04VarP02.C(v04VarP0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (v04VarP0.k() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (v04VarP02.C(v04VarP0, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(((int) (v04VarP0.k() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    j jVarS0 = jVar2.s0();
                    if (jVarS0 == null) {
                        jVar2.e0(jVar.f0(), sc3Var);
                        return Float.NaN;
                    }
                    jVar2 = jVarS0;
                }
                break;
            default:
                return super.b(sc3Var);
        }
    }

    @Override // defpackage.a96
    public final v04 c() {
        switch (this.b) {
            case 0:
                j jVar = (j) this.c;
                v04 v04VarP0 = jVar.k ? null : jVar.p0();
                if (v04VarP0 == null) {
                    jVar.f0().t().b();
                }
                return v04VarP0;
            default:
                return (m) ((AndroidComposeView) this.c).getRoot().H.e;
        }
    }

    @Override // defpackage.a96
    public final LayoutDirection e() {
        switch (this.b) {
            case 0:
                return ((j) this.c).getLayoutDirection();
            default:
                return ((AndroidComposeView) this.c).getLayoutDirection();
        }
    }

    @Override // defpackage.a96
    public final int f() {
        switch (this.b) {
            case 0:
                return ((j) this.c).U();
            default:
                return ((AndroidComposeView) this.c).getRoot().I();
        }
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        switch (this.b) {
            case 0:
                return ((j) this.c).getDensity();
            default:
                return ((AndroidComposeView) this.c).getDensity().getDensity();
        }
    }
}
