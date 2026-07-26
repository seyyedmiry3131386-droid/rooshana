package androidx.compose.runtime;

import defpackage.av;
import defpackage.bp2;
import defpackage.ck1;
import defpackage.gg2;
import defpackage.jz0;
import defpackage.l08;
import defpackage.n08;
import defpackage.p08;
import defpackage.pz0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.sk6;
import defpackage.t08;
import defpackage.th0;
import defpackage.tx8;
import defpackage.u08;
import defpackage.vb7;
import defpackage.w61;
import defpackage.wb5;
import defpackage.zb5;
import defpackage.zk8;
import java.util.Arrays;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final wb5 a(kotlinx.coroutines.flow.i iVar, gg2 gg2Var, qz0 qz0Var) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        boolean zH = qz0Var.h(emptyCoroutineContext) | qz0Var.h(iVar);
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (zH || objM == obj) {
            objM = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(emptyCoroutineContext, iVar, null);
            qz0Var.l0(objM);
        }
        qp2 qp2Var = (qp2) objM;
        Object objM2 = qz0Var.M();
        if (objM2 == obj) {
            objM2 = h(gg2Var);
            qz0Var.l0(objM2);
        }
        wb5 wb5Var = (wb5) objM2;
        boolean zH2 = qz0Var.h(qp2Var);
        Object objM3 = qz0Var.M();
        if (zH2 || objM3 == obj) {
            objM3 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(qp2Var, wb5Var, null);
            qz0Var.l0(objM3);
        }
        zk8.i(iVar, emptyCoroutineContext, (qp2) objM3, qz0Var);
        return wb5Var;
    }

    public static final zb5 b() {
        sk6 sk6Var = u08.b;
        zb5 zb5Var = (zb5) sk6Var.s();
        if (zb5Var != null) {
            return zb5Var;
        }
        zb5 zb5Var2 = new zb5(0, new pz0[0]);
        sk6Var.I(zb5Var2);
        return zb5Var2;
    }

    public static final ck1 c(bp2 bp2Var) {
        sk6 sk6Var = u08.a;
        return new ck1(bp2Var, null);
    }

    public static final l08 d(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    public static final n08 e(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final p08 f(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    public static final wb5 g(Object obj, t08 t08Var) {
        return new ParcelableSnapshotMutableState(obj, t08Var);
    }

    public static wb5 h(Object obj) {
        return new ParcelableSnapshotMutableState(obj, th0.t);
    }

    public static final wb5 i(qz0 qz0Var, qp2 qp2Var, Object obj) {
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = h(obj);
            qz0Var.l0(objM);
        }
        wb5 wb5Var = (wb5) objM;
        boolean zH = qz0Var.h(qp2Var);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == avVar) {
            objM2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(qp2Var, wb5Var, null);
            qz0Var.l0(objM2);
        }
        zk8.h(qz0Var, (qp2) objM2, tx8.a);
        return wb5Var;
    }

    public static final wb5 j(Object obj, Object[] objArr, qp2 qp2Var, qz0 qz0Var) {
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = h(obj);
            qz0Var.l0(objM);
        }
        wb5 wb5Var = (wb5) objM;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zH = qz0Var.h(qp2Var);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == avVar) {
            objM2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(qp2Var, wb5Var, null);
            qz0Var.l0(objM2);
        }
        qp2 qp2Var2 = (qp2) objM2;
        w61 w61Var = qz0Var.R;
        boolean zF = false;
        for (Object obj2 : Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)) {
            zF |= qz0Var.f(obj2);
        }
        Object objM3 = qz0Var.M();
        if (!zF && objM3 != avVar) {
            return wb5Var;
        }
        qz0Var.l0(new c(w61Var, qp2Var2));
        return wb5Var;
    }

    public static final wb5 k(Object obj, qz0 qz0Var) {
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = h(obj);
            qz0Var.l0(objM);
        }
        wb5 wb5Var = (wb5) objM;
        wb5Var.setValue(obj);
        return wb5Var;
    }

    public static final vb7 l(bp2 bp2Var) {
        return new vb7(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(bp2Var, null));
    }
}
