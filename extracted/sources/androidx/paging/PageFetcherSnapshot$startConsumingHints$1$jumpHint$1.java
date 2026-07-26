package androidx.paging;

import defpackage.g51;
import defpackage.ja9;
import defpackage.qp2;
import defpackage.rz5;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend", v = 1)
final class PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(l lVar, g51 g51Var) {
        super(2, g51Var);
        this.b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.b, g51Var);
        pageFetcherSnapshot$startConsumingHints$1$jumpHint$1.a = obj;
        return pageFetcherSnapshot$startConsumingHints$1$jumpHint$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$1$jumpHint$1) create((ja9) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        ja9 ja9Var = (ja9) this.a;
        int i = ja9Var.a * (-1);
        rz5 rz5Var = this.b.c;
        return Boolean.valueOf(i > Integer.MIN_VALUE || ja9Var.b * (-1) > Integer.MIN_VALUE);
    }
}
