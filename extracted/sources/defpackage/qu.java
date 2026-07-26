package defpackage;

import androidx.compose.ui.node.g;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qu implements el4, af4, es3 {
    public final g a;

    public qu(g gVar, cu7 cu7Var) {
        this.a = gVar;
    }

    @Override // defpackage.el4
    public final dl4 D(int i, int i2, Map map, dp2 dp2Var) {
        return this.a.Z(i, i2, map, null, dp2Var);
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

    @Override // defpackage.qj1
    public final float O() {
        return this.a.O();
    }

    @Override // defpackage.es3
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.el4
    public final dl4 Z(int i, int i2, Map map, dp2 dp2Var, dp2 dp2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            rn3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new pu(i, i2, map, dp2Var, dp2Var2, this, 0);
    }

    @Override // defpackage.qj1
    public final int b0(float f) {
        g gVar = this.a;
        gVar.getClass();
        return o40.a(gVar, f);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.es3
    public final LayoutDirection getLayoutDirection() {
        return this.a.p.B;
    }

    @Override // defpackage.qj1
    public final long h0(long j) {
        g gVar = this.a;
        gVar.getClass();
        return o40.d(j, gVar);
    }

    @Override // defpackage.qj1
    public final float j0(long j) {
        g gVar = this.a;
        gVar.getClass();
        return o40.c(j, gVar);
    }

    @Override // defpackage.qj1
    public final long o(long j) {
        g gVar = this.a;
        gVar.getClass();
        return o40.b(j, gVar);
    }

    @Override // defpackage.qj1
    public final float s(long j) {
        g gVar = this.a;
        gVar.getClass();
        return dw1.b(j, gVar);
    }
}
