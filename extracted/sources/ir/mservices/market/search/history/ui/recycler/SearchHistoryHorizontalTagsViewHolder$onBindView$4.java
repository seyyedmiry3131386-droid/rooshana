package ir.mservices.market.search.history.ui.recycler;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.search.history.ui.recycler.SearchHistoryHorizontalTagsViewHolder$onBindView$4", f = "SearchHistoryHorizontalTags.kt", l = {}, m = "invokeSuspend", v = 1)
final class SearchHistoryHorizontalTagsViewHolder$onBindView$4 extends SuspendLambda implements qp2 {
    public final /* synthetic */ a a;
    public final /* synthetic */ SearchHistoryHorizontalTagsData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryHorizontalTagsViewHolder$onBindView$4(a aVar, SearchHistoryHorizontalTagsData searchHistoryHorizontalTagsData, g51 g51Var) {
        super(2, g51Var);
        this.a = aVar;
        this.b = searchHistoryHorizontalTagsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchHistoryHorizontalTagsViewHolder$onBindView$4(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        SearchHistoryHorizontalTagsViewHolder$onBindView$4 searchHistoryHorizontalTagsViewHolder$onBindView$4 = (SearchHistoryHorizontalTagsViewHolder$onBindView$4) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        searchHistoryHorizontalTagsViewHolder$onBindView$4.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.a.y.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.i1(0, this.b.g * (-1));
        }
        return tx8.a;
    }
}
