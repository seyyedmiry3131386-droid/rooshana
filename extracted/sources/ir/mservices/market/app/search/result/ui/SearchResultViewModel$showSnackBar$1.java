package ir.mservices.market.app.search.result.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.SearchResultViewModel$showSnackBar$1", f = "SearchResultViewModel.kt", l = {265}, m = "invokeSuspend", v = 1)
final class SearchResultViewModel$showSnackBar$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SearchResultViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultViewModel$showSnackBar$1(SearchResultViewModel searchResultViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = searchResultViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchResultViewModel$showSnackBar$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchResultViewModel$showSnackBar$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        SearchResultViewModel searchResultViewModel = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!js3.i(searchResultViewModel.E, Boolean.FALSE)) {
                i iVar = searchResultViewModel.A;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (iVar.emit(bool, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tx8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        searchResultViewModel.F = true;
        return tx8.a;
    }
}
