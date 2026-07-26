package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ls3 implements el4, es3 {
    public final /* synthetic */ es3 a;
    public final LayoutDirection b;

    public ls3(es3 es3Var, LayoutDirection layoutDirection) {
        this.a = es3Var;
        this.b = layoutDirection;
    }

    @Override // defpackage.el4
    public final dl4 D(int i, int i2, Map map, dp2 dp2Var) {
        return Z(i, i2, map, null, dp2Var);
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
        return this.a.L(f);
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.a.O();
    }

    @Override // defpackage.es3
    public final boolean Q() {
        return this.a.Q();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return this.a.S(f);
    }

    @Override // defpackage.el4
    public final dl4 Z(int i, int i2, Map map, dp2 dp2Var, dp2 dp2Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            rn3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new ks3(i, i2, map, dp2Var);
    }

    @Override // defpackage.qj1
    public final int b0(float f) {
        return this.a.b0(f);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.es3
    public final LayoutDirection getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.qj1
    public final long h0(long j) {
        return this.a.h0(j);
    }

    @Override // defpackage.qj1
    public final float j0(long j) {
        return this.a.j0(j);
    }

    @Override // defpackage.qj1
    public final long o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.qj1
    public final float s(long j) {
        return this.a.s(j);
    }
}
