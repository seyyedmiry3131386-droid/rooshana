package defpackage;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class og9 extends gx4 implements f14 {
    public Direction o;
    public qp2 p;

    @Override // defpackage.f14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(final el4 el4Var, yk4 yk4Var, long j) {
        final b96 b96VarT = yk4Var.t(j31.a(this.o != Direction.a ? 0 : h31.j(j), h31.h(j), this.o == Direction.b ? h31.i(j) : 0, h31.g(j)));
        final int iT = ok4.t(b96VarT.a, h31.j(j), h31.h(j));
        final int iT2 = ok4.t(b96VarT.b, h31.i(j), h31.g(j));
        return el4Var.D(iT, iT2, b.I(), new dp2() { // from class: ng9
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                qp2 qp2Var = this.a.p;
                b96 b96Var = b96VarT;
                a96.i((a96) obj, b96Var, ((rq3) qp2Var.invoke(new zq3((((long) (iT - b96Var.a)) << 32) | (((long) (iT2 - b96Var.b)) & 4294967295L)), el4Var.getLayoutDirection())).a);
                return tx8.a;
            }
        });
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
