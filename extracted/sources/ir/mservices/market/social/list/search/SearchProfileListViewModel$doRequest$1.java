package ir.mservices.market.social.list.search;

import androidx.paging.e;
import defpackage.bz6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.search.SearchProfileListViewModel$doRequest$1", f = "SearchProfileListViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SearchProfileListViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ SearchProfileListViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchProfileListViewModel$doRequest$1(g51 g51Var, SearchProfileListViewModel searchProfileListViewModel) {
        super(2, g51Var);
        this.a = searchProfileListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchProfileListViewModel$doRequest$1(g51Var, this.a);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchProfileListViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        SearchProfileListViewModel searchProfileListViewModel = this.a;
        return new bz6(e.b(searchProfileListViewModel.B, y97.G(searchProfileListViewModel)), null, null, null, 14);
    }
}
