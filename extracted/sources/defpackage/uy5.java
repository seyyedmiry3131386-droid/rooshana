package defpackage;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class uy5 extends gx4 implements f14 {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

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
        int iB0 = el4Var.b0(this.q) + el4Var.b0(this.o);
        int iB02 = el4Var.b0(this.r) + el4Var.b0(this.p);
        b96 b96VarT = yk4Var.t(j31.i(-iB0, -iB02, j));
        return el4Var.D(j31.g(b96VarT.a + iB0, j), j31.f(b96VarT.b + iB02, j), b.I(), new v25(this, b96VarT, 10));
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
