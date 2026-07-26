package androidx.compose.ui;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import defpackage.a96;
import defpackage.b96;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.f14;
import defpackage.gx4;
import defpackage.t61;
import defpackage.tx8;
import defpackage.yk4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends gx4 implements f14 {
    public float o;

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
        final b96 b96VarT = yk4Var.t(j);
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                ((a96) obj).g(b96VarT, 0, 0, this.o);
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

    public final String toString() {
        return t61.k(new StringBuilder("ZIndexModifier(zIndex="), this.o, ')');
    }
}
