package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.a96;
import defpackage.b96;
import defpackage.br9;
import defpackage.d58;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.du7;
import defpackage.ek6;
import defpackage.el4;
import defpackage.eu7;
import defpackage.f14;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.h08;
import defpackage.jr5;
import defpackage.s08;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.y08;
import defpackage.yk4;
import defpackage.yu0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n extends gx4 implements f14, jr5, gv1 {
    public l o;

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(androidx.compose.ui.node.i iVar) {
        iVar.a();
        SnapshotStateList snapshotStateList = this.o.c;
        if (snapshotStateList.size() > 1) {
            yu0.Y(snapshotStateList, new ek6(8));
        }
        if (snapshotStateList.size() <= 0) {
            return;
        }
        ((eu7) snapshotStateList.get(0)).getClass();
        throw null;
    }

    @Override // defpackage.jr5
    public final void Y() {
        l lVar = this.o;
        wb5 wb5Var = lVar.a;
        y08 y08Var = lVar.d;
        boolean zIsEmpty = y08Var.isEmpty();
        h08 h08Var = y08Var.b;
        if (!zIsEmpty) {
            Iterator it = h08Var.iterator();
            if (((d58) it).hasNext()) {
                ((du7) ((Map.Entry) ((d58) it).next()).getValue()).getClass();
                throw null;
            }
        }
        s08 s08Var = (s08) wb5Var;
        if (((Boolean) s08Var.getValue()).booleanValue()) {
            s08Var.setValue(Boolean.FALSE);
            Iterator it2 = h08Var.iterator();
            if (((d58) it2).hasNext()) {
                ((du7) ((Map.Entry) ((d58) it2).next()).getValue()).getClass();
                throw null;
            }
        }
        Iterator it3 = h08Var.iterator();
        if (((d58) it3).hasNext()) {
            ((du7) ((Map.Entry) ((d58) it3).next()).getValue()).getClass();
            throw null;
        }
        br9.G(this, this.o.b);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int a(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(final el4 el4Var, yk4 yk4Var, long j) {
        final b96 b96VarT = yk4Var.t(j);
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                if (a96Var.c() != null) {
                    boolean zQ = el4Var.Q();
                    n nVar = this;
                    if (zQ) {
                        nVar.o.getClass();
                    } else {
                        nVar.o.getClass();
                    }
                }
                a96Var.g(b96VarT, 0, 0, 0.0f);
                return tx8.a;
            }
        });
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.a(this, jVar, yk4Var, i);
    }

    @Override // defpackage.gx4
    public final void s0() {
        br9.G(this, this.o.b);
        this.o.getClass();
    }

    @Override // defpackage.gx4
    public final void u0() {
        this.o.getClass();
    }
}
