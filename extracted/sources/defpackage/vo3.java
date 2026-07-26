package defpackage;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public class vo3 extends qo3 implements f14 {
    public me9 q;

    public vo3(me9 me9Var) {
        this.q = me9Var;
    }

    @Override // defpackage.qo3
    public final qx8 C0(me9 me9Var) {
        return new qx8(me9Var, this.q);
    }

    @Override // defpackage.qo3
    public final void D0() {
        super.D0();
        zk8.J(this);
    }

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
        int iD = this.p.d(el4Var, el4Var.getLayoutDirection()) - this.o.d(el4Var, el4Var.getLayoutDirection());
        int iB = this.p.b(el4Var) - this.o.b(el4Var);
        int iC = (this.p.c(el4Var, el4Var.getLayoutDirection()) - this.o.c(el4Var, el4Var.getLayoutDirection())) + iD;
        int iA = (this.p.a(el4Var) - this.o.a(el4Var)) + iB;
        b96 b96VarT = yk4Var.t(j31.i(-iC, -iA, j));
        return el4Var.D(j31.g(b96VarT.a + iC, j), j31.f(b96VarT.b + iA, j), b.I(), new uo3(b96VarT, iD, iB, 0));
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
