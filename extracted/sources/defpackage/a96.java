package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract class a96 implements qj1 {
    public boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a96 a96Var, b96 b96Var) {
        a96Var.getClass();
        if (b96Var instanceof zy4) {
            ((zy4) b96Var).x(a96Var.a);
        }
    }

    public static void i(a96 a96Var, b96 b96Var, long j) {
        a96Var.getClass();
        a(a96Var, b96Var);
        b96Var.W(rq3.c(j, b96Var.e), 0.0f, null);
    }

    public static void j(a96 a96Var, b96 b96Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (a96Var.e() == LayoutDirection.a || a96Var.f() == 0) {
            a(a96Var, b96Var);
            b96Var.W(rq3.c(j, b96Var.e), 0.0f, null);
        } else {
            int iF = (a96Var.f() - b96Var.a) - ((int) (j >> 32));
            a(a96Var, b96Var);
            b96Var.W(rq3.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), b96Var.e), 0.0f, null);
        }
    }

    public static void k(a96 a96Var, b96 b96Var, int i, int i2) {
        dp2 dp2Var = k.a;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (a96Var.e() == LayoutDirection.a || a96Var.f() == 0) {
            a(a96Var, b96Var);
            b96Var.W(rq3.c(j, b96Var.e), 0.0f, dp2Var);
        } else {
            int iF = (a96Var.f() - b96Var.a) - ((int) (j >> 32));
            a(a96Var, b96Var);
            b96Var.W(rq3.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), b96Var.e), 0.0f, dp2Var);
        }
    }

    public static void l(a96 a96Var, b96 b96Var, int i, int i2, dp2 dp2Var, int i3) {
        if ((i3 & 8) != 0) {
            dp2Var = k.a;
        }
        a96Var.getClass();
        a(a96Var, b96Var);
        b96Var.W(rq3.c((((long) i2) & 4294967295L) | (((long) i) << 32), b96Var.e), 0.0f, dp2Var);
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

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    public float b(sc3 sc3Var) {
        return Float.NaN;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    public abstract v04 c();

    public abstract LayoutDirection e();

    public abstract int f();

    public final void g(b96 b96Var, int i, int i2, float f) {
        a(this, b96Var);
        b96Var.W(rq3.c((((long) i2) & 4294967295L) | (((long) i) << 32), b96Var.e), f, null);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }
}
