package defpackage;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class xy5 extends gx4 implements f14 {
    public wy5 o;

    @Override // defpackage.f14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        float fA = this.o.a(el4Var.getLayoutDirection());
        wy5 wy5Var = this.o;
        float f = wy5Var.b;
        float fB = wy5Var.b(el4Var.getLayoutDirection());
        float f2 = this.o.d;
        float f3 = 0;
        if (!((au1.a(f2, f3) >= 0) & (au1.a(fA, f3) >= 0) & (au1.a(f, f3) >= 0) & (au1.a(fB, f3) >= 0))) {
            pn3.a("Padding must be non-negative");
        }
        int iB0 = el4Var.b0(fA);
        int iB02 = el4Var.b0(fB) + iB0;
        int iB03 = el4Var.b0(f);
        int iB04 = el4Var.b0(f2) + iB03;
        b96 b96VarT = yk4Var.t(j31.i(-iB02, -iB04, j));
        return el4Var.D(j31.g(b96VarT.a + iB02, j), j31.f(b96VarT.b + iB04, j), b.I(), new uo3(b96VarT, iB0, iB03, 2));
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }
}
