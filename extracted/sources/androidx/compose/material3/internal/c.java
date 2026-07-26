package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import defpackage.g51;
import defpackage.ke;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final ke a;
    public final /* synthetic */ d b;

    public c(d dVar) {
        this.b = dVar;
        this.a = new ke(dVar);
    }

    public final Object a(qp2 qp2Var, g51 g51Var) {
        Object objA = this.b.a(MutatePriority.b, new AnchoredDraggableState$draggableState$1$drag$2(this, qp2Var, null), (ContinuationImpl) g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }
}
