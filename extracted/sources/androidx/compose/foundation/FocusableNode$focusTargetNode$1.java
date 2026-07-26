package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.m;
import defpackage.ab5;
import defpackage.br9;
import defpackage.bt2;
import defpackage.c34;
import defpackage.dp2;
import defpackage.gg2;
import defpackage.hg2;
import defpackage.qp2;
import defpackage.t17;
import defpackage.tx8;
import defpackage.ug2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements qp2 {
    public final void b(ug2 ug2Var, ug2 ug2Var2) {
        boolean zB;
        h hVar = (h) this.receiver;
        if (hVar.n && (zB = ((FocusStateImpl) ug2Var2).b()) != ((FocusStateImpl) ug2Var).b()) {
            dp2 dp2Var = hVar.r;
            if (dp2Var != null) {
                dp2Var.invoke(Boolean.valueOf(zB));
            }
            if (zB) {
                bt2.G(hVar.o0(), null, null, new FocusableNode$onFocusStateChange$1(hVar, null), 3);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                br9.G(hVar, new defpackage.d(ref$ObjectRef, hVar, 23));
                c34 c34Var = (c34) ref$ObjectRef.a;
                if (c34Var != null) {
                    c34Var.a();
                } else {
                    c34Var = null;
                }
                hVar.t = c34Var;
                m mVar = hVar.u;
                if (mVar != null && mVar.J0().n) {
                    hVar.G0();
                }
            } else {
                c34 c34Var2 = hVar.t;
                if (c34Var2 != null) {
                    c34Var2.b();
                }
                hVar.t = null;
                hVar.G0();
            }
            t17.f(hVar);
            ab5 ab5Var = hVar.q;
            if (ab5Var != null) {
                if (!zB) {
                    gg2 gg2Var = hVar.s;
                    if (gg2Var != null) {
                        hVar.F0(ab5Var, new hg2(gg2Var));
                        hVar.s = null;
                        return;
                    }
                    return;
                }
                gg2 gg2Var2 = hVar.s;
                if (gg2Var2 != null) {
                    hVar.F0(ab5Var, new hg2(gg2Var2));
                    hVar.s = null;
                }
                gg2 gg2Var3 = new gg2();
                hVar.F0(ab5Var, gg2Var3);
                hVar.s = gg2Var3;
            }
        }
    }

    @Override // defpackage.qp2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        b((ug2) obj, (ug2) obj2);
        return tx8.a;
    }
}
