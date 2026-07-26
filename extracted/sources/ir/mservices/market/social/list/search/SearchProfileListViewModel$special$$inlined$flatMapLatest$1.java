package ir.mservices.market.social.list.search;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.search.SearchProfileListViewModel$special$$inlined$flatMapLatest$1", f = "SearchProfileListViewModel.kt", l = {189}, m = "invokeSuspend", v = 1)
public final class SearchProfileListViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ SearchProfileListViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchProfileListViewModel$special$$inlined$flatMapLatest$1(g51 g51Var, SearchProfileListViewModel searchProfileListViewModel) {
        super(3, g51Var);
        this.d = searchProfileListViewModel;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        SearchProfileListViewModel$special$$inlined$flatMapLatest$1 searchProfileListViewModel$special$$inlined$flatMapLatest$1 = new SearchProfileListViewModel$special$$inlined$flatMapLatest$1((g51) obj3, this.d);
        searchProfileListViewModel$special$$inlined$flatMapLatest$1.b = (ze2) obj;
        searchProfileListViewModel$special$$inlined$flatMapLatest$1.c = obj2;
        return searchProfileListViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ze2 ze2Var = this.b;
            String str = (String) this.c;
            SearchProfileListViewModel searchProfileListViewModel = this.d;
            xe2 xe2VarSearchApp = searchProfileListViewModel.A ? searchProfileListViewModel.searchApp(str) : searchProfileListViewModel.searchMovie(str);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (d.m(ze2Var, xe2VarSearchApp, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
