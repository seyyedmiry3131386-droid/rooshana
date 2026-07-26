package androidx.compose.animation;

import defpackage.af4;
import defpackage.av;
import defpackage.e71;
import defpackage.hs9;
import defpackage.jz0;
import defpackage.my6;
import defpackage.ou7;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.s7;
import defpackage.tx8;
import defpackage.zk8;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class SharedTransitionScopeKt$SharedTransitionScope$2 extends Lambda implements qp2 {
    public final /* synthetic */ androidx.compose.runtime.internal.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$2(androidx.compose.runtime.internal.a aVar, int i) {
        super(2);
        this.g = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        ((Number) obj2).intValue();
        int iW = hs9.W(7);
        int i = ou7.a;
        qz0Var.c0(1908320054);
        boolean zR = qz0Var.R(iW & 1, (iW & 3) != 2);
        final androidx.compose.runtime.internal.a aVar = this.g;
        if (zR) {
            androidx.compose.ui.layout.e.a(s7.X(2062852661, new rp2() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                {
                    super(3);
                }

                @Override // defpackage.rp2
                public final Object a(Object obj3, Object obj4, Object obj5) {
                    af4 af4Var = (af4) obj3;
                    qz0 qz0Var2 = (qz0) obj4;
                    ((Number) obj5).intValue();
                    Object objM = qz0Var2.M();
                    av avVar = jz0.a;
                    if (objM == avVar) {
                        objM = zk8.x(EmptyCoroutineContext.a, qz0Var2);
                        qz0Var2.l0(objM);
                    }
                    e71 e71Var = (e71) objM;
                    Object objM2 = qz0Var2.M();
                    if (objM2 == avVar) {
                        objM2 = new l(af4Var, e71Var);
                        qz0Var2.l0(objM2);
                    }
                    l lVar = (l) objM2;
                    aVar.g(lVar, new m(lVar), qz0Var2, 6);
                    return tx8.a;
                }
            }, qz0Var), qz0Var, 6);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new SharedTransitionScopeKt$SharedTransitionScope$2(aVar, iW);
        }
        return tx8.a;
    }
}
