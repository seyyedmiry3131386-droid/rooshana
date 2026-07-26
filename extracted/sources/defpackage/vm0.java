package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class vm0 implements hv1 {
    public final um0 a;
    public final wv8 b;
    public jx9 c;
    public jx9 d;

    public vm0() {
        tj1 tj1Var = rq4.a;
        LayoutDirection layoutDirection = LayoutDirection.a;
        um0 um0Var = new um0();
        um0Var.a = tj1Var;
        um0Var.b = layoutDirection;
        um0Var.c = b12.a;
        um0Var.d = 0L;
        this.a = um0Var;
        this.b = new wv8(this);
    }

    public static jx9 a(vm0 vm0Var, long j, iv1 iv1Var, float f, int i) {
        jx9 jx9VarE = vm0Var.e(iv1Var);
        if (f != 1.0f) {
            j = zu0.b(zu0.d(j) * f, j);
        }
        Paint paint = (Paint) jx9VarE.b;
        if (!zu0.c(gu9.d(paint.getColor()), j)) {
            jx9VarE.p(j);
        }
        if (((Shader) jx9VarE.c) != null) {
            jx9VarE.s(null);
        }
        if (!js3.i((tc0) jx9VarE.d, null)) {
            jx9VarE.q(null);
        }
        if (jx9VarE.a != i) {
            jx9VarE.o(i);
        }
        if (paint.isFilterBitmap()) {
            return jx9VarE;
        }
        jx9VarE.r(1);
        return jx9VarE;
    }

    @Override // defpackage.hv1
    public final void A(long j, float f, float f2, boolean z, long j2, long j3, iv1 iv1Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, z, a(this, j, iv1Var, 1.0f, 3));
    }

    @Override // defpackage.hv1
    public final void E(long j, float f, long j2, iv1 iv1Var) {
        this.a.c.k(f, j2, a(this, j, iv1Var, 1.0f, 3));
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return dw1.d(this, L(f));
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.hv1
    public final void M(u26 u26Var, ch0 ch0Var, float f, iv1 iv1Var, int i) {
        this.a.c.q(u26Var, b(ch0Var, iv1Var, f, null, i, 1));
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.a.a.O();
    }

    @Override // defpackage.hv1
    public final void R(long j, long j2, long j3, long j4, iv1 iv1Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, iv1Var, 1.0f, 3));
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.hv1
    public final wv8 X() {
        return this.b;
    }

    @Override // defpackage.hv1
    public final void a0(og ogVar, long j, long j2, long j3, float f, tc0 tc0Var, int i) {
        this.a.c.r(ogVar, j, j2, j3, b(null, dc2.a, f, tc0Var, 3, i));
    }

    public final jx9 b(ch0 ch0Var, iv1 iv1Var, float f, tc0 tc0Var, int i, int i2) {
        jx9 jx9VarE = e(iv1Var);
        if (ch0Var != null) {
            ch0Var.a(f, this.b.A(), jx9VarE);
        } else {
            Paint paint = (Paint) jx9VarE.b;
            if (((Shader) jx9VarE.c) != null) {
                jx9VarE.s(null);
            }
            long jD = gu9.d(paint.getColor());
            long j = zu0.b;
            if (!zu0.c(jD, j)) {
                jx9VarE.p(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                jx9VarE.n(f);
            }
        }
        if (!js3.i((tc0) jx9VarE.d, tc0Var)) {
            jx9VarE.q(tc0Var);
        }
        if (jx9VarE.a != i) {
            jx9VarE.o(i);
        }
        if (((Paint) jx9VarE.b).isFilterBitmap() == i2) {
            return jx9VarE;
        }
        jx9VarE.r(i2);
        return jx9VarE;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    public final void c(og ogVar, tc0 tc0Var) {
        this.a.c.t(ogVar, b(null, dc2.a, 1.0f, tc0Var, 3, 1));
    }

    @Override // defpackage.hv1
    public final long d() {
        return this.b.A();
    }

    @Override // defpackage.hv1
    public final long d0() {
        return uy6.e(this.b.A());
    }

    public final jx9 e(iv1 iv1Var) {
        if (js3.i(iv1Var, dc2.a)) {
            jx9 jx9Var = this.c;
            if (jx9Var != null) {
                return jx9Var;
            }
            jx9 jx9VarC = dt2.c();
            jx9VarC.x(0);
            this.c = jx9VarC;
            return jx9VarC;
        }
        if (!(iv1Var instanceof p88)) {
            throw new NoWhenBranchMatchedException();
        }
        jx9 jx9VarC2 = this.d;
        if (jx9VarC2 == null) {
            jx9VarC2 = dt2.c();
            jx9VarC2.x(1);
            this.d = jx9VarC2;
        }
        Paint paint = (Paint) jx9VarC2.b;
        float strokeWidth = paint.getStrokeWidth();
        p88 p88Var = (p88) iv1Var;
        float f = p88Var.a;
        if (strokeWidth != f) {
            jx9VarC2.w(f);
        }
        int i = jx9VarC2.i();
        int i2 = p88Var.c;
        if (i != i2) {
            jx9VarC2.u(i2);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = p88Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iJ = jx9VarC2.j();
        int i3 = p88Var.d;
        if (iJ == i3) {
            return jx9VarC2;
        }
        jx9VarC2.v(i3);
        return jx9VarC2;
    }

    @Override // defpackage.hv1
    public final void g0(ch0 ch0Var, long j, long j2, float f, iv1 iv1Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), b(ch0Var, iv1Var, f, null, 3, 1));
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.a.getDensity();
    }

    @Override // defpackage.hv1
    public final LayoutDirection getLayoutDirection() {
        return this.a.b;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    @Override // defpackage.hv1
    public final void l0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.g(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, dc2.a, f, i));
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }

    @Override // defpackage.hv1
    public final void y(long j, long j2, long j3, float f, int i) {
        tm0 tm0Var = this.a.c;
        jx9 jx9VarC = this.d;
        if (jx9VarC == null) {
            jx9VarC = dt2.c();
            jx9VarC.x(1);
            this.d = jx9VarC;
        }
        Paint paint = (Paint) jx9VarC.b;
        if (!zu0.c(gu9.d(paint.getColor()), j)) {
            jx9VarC.p(j);
        }
        if (((Shader) jx9VarC.c) != null) {
            jx9VarC.s(null);
        }
        if (!js3.i((tc0) jx9VarC.d, null)) {
            jx9VarC.q(null);
        }
        if (jx9VarC.a != 3) {
            jx9VarC.o(3);
        }
        if (paint.getStrokeWidth() != f) {
            jx9VarC.w(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (jx9VarC.i() != i) {
            jx9VarC.u(i);
        }
        if (jx9VarC.j() != 0) {
            jx9VarC.v(0);
        }
        if (!paint.isFilterBitmap()) {
            jx9VarC.r(1);
        }
        tm0Var.p(j2, j3, jx9VarC);
    }

    @Override // defpackage.hv1
    public final void z(u26 u26Var, long j, iv1 iv1Var) {
        this.a.c.q(u26Var, a(this, j, iv1Var, 1.0f, 3));
    }
}
