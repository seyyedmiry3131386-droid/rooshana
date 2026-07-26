package androidx.lifecycle.compose;

import androidx.compose.runtime.g;
import androidx.lifecycle.Lifecycle$State;
import defpackage.bz0;
import defpackage.dp2;
import defpackage.g64;
import defpackage.i64;
import defpackage.jz0;
import defpackage.lc4;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.v25;
import defpackage.v48;
import defpackage.wb5;
import defpackage.zk8;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final wb5 a(v48 v48Var, qz0 qz0Var) {
        g64 g64Var = (g64) qz0Var.j(lc4.a);
        Lifecycle$State lifecycle$State = Lifecycle$State.d;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        Object value = v48Var.getValue();
        i64 i64VarD = g64Var.D();
        Object[] objArr = {v48Var, i64VarD, lifecycle$State, emptyCoroutineContext};
        boolean zH = qz0Var.h(i64VarD) | qz0Var.d(lifecycle$State.ordinal()) | qz0Var.h(emptyCoroutineContext) | qz0Var.h(v48Var);
        Object objM = qz0Var.M();
        if (zH || objM == jz0.a) {
            Object flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(i64VarD, lifecycle$State, emptyCoroutineContext, v48Var, null);
            qz0Var.l0(flowExtKt$collectAsStateWithLifecycle$1$1);
            objM = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        return g.j(value, objArr, (qp2) objM, qz0Var);
    }

    public static final bz0 b(Lifecycle$State lifecycle$State, qz0 qz0Var) {
        Object obj = (g64) qz0Var.j(lc4.a);
        boolean zF = qz0Var.f(obj);
        Object objM = qz0Var.M();
        Object obj2 = jz0.a;
        if (zF || objM == obj2) {
            objM = new bz0();
            qz0Var.l0(objM);
        }
        bz0 bz0Var = (bz0) objM;
        boolean zH = qz0Var.h(bz0Var) | qz0Var.h(obj);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == obj2) {
            objM2 = new v25(obj, bz0Var, 18);
            qz0Var.l0(objM2);
        }
        zk8.e(bz0Var, obj, (dp2) objM2, qz0Var);
        boolean zH2 = qz0Var.h(bz0Var) | qz0Var.d(lifecycle$State.ordinal());
        Object objM3 = qz0Var.M();
        if (zH2 || objM3 == obj2) {
            objM3 = new RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(bz0Var, lifecycle$State, null);
            qz0Var.l0(objM3);
        }
        zk8.i(bz0Var, lifecycle$State, (qp2) objM3, qz0Var);
        return bz0Var;
    }
}
