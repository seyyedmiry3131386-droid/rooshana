package androidx.compose.foundation.lazy;

import androidx.compose.ui.node.h;
import defpackage.ai0;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rg7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v24;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend", v = 1)
final class LazyListState$scrollToItem$2 extends SuspendLambda implements qp2 {
    public final /* synthetic */ b a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(b bVar, int i, g51 g51Var) {
        super(2, g51Var);
        this.a = bVar;
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new LazyListState$scrollToItem$2(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        LazyListState$scrollToItem$2 lazyListState$scrollToItem$2 = (LazyListState$scrollToItem$2) create((rg7) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        lazyListState$scrollToItem$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        b bVar = this.a;
        ai0 ai0Var = bVar.e;
        int iQ = ai0Var.q();
        int i = this.b;
        if (iQ != i || ai0Var.r() != 0) {
            v24 v24Var = bVar.n;
            v24Var.d();
            v24Var.b = null;
        }
        ai0Var.A(i, 0);
        ai0Var.d = null;
        h hVar = bVar.k;
        if (hVar != null) {
            hVar.l();
        }
        return tx8.a;
    }
}
