package ir.mservices.market.app.search.result.ui.recycler;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.recycler.ScrollableScreenshotViewHolder$onBindView$2", f = "SearchScreenShotApp.kt", l = {}, m = "invokeSuspend", v = 1)
final class ScrollableScreenshotViewHolder$onBindView$2 extends SuspendLambda implements qp2 {
    public final /* synthetic */ c a;
    public final /* synthetic */ SearchScrollableScreenshotAppData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableScreenshotViewHolder$onBindView$2(c cVar, SearchScrollableScreenshotAppData searchScrollableScreenshotAppData, g51 g51Var) {
        super(2, g51Var);
        this.a = cVar;
        this.b = searchScrollableScreenshotAppData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ScrollableScreenshotViewHolder$onBindView$2(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ScrollableScreenshotViewHolder$onBindView$2 scrollableScreenshotViewHolder$onBindView$2 = (ScrollableScreenshotViewHolder$onBindView$2) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        scrollableScreenshotViewHolder$onBindView$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.a.B().getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.i1(0, this.b.m * (-1));
        }
        return tx8.a;
    }
}
