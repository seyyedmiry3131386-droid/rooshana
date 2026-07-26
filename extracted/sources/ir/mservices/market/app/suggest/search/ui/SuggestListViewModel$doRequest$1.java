package ir.mservices.market.app.suggest.search.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.a67;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.c35;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rz5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.search.ui.SuggestListViewModel$doRequest$1", f = "SuggestListViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuggestListViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ SuggestListViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.app.suggest.search.ui.SuggestListViewModel$doRequest$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements bp2 {
        @Override // defpackage.bp2
        public final Object invoke() {
            ((SuggestListViewModel) this.receiver).crawlGoogleSearch();
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.suggest.search.ui.SuggestListViewModel$doRequest$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((SuggestListViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestListViewModel$doRequest$1(SuggestListViewModel suggestListViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = suggestListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SuggestListViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestListViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final SuggestListViewModel suggestListViewModel = this.a;
        final c35 c35Var = suggestListViewModel.w;
        final String str = suggestListViewModel.z.a;
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, suggestListViewModel, SuggestListViewModel.class, "crawlGoogleSearch", "crawlGoogleSearch()V", 0);
        final kotlinx.coroutines.channels.a aVar = suggestListViewModel.A;
        c35Var.getClass();
        js3.p(str, "query");
        js3.p(aVar, "googleSearchResult");
        return new bz6(e.b(gu9.x((xe2) new m(new rz5(1, 1, 1, 52), new bp2() { // from class: ir.mservices.market.app.suggest.search.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new SuggestListRepositoryImpl$getGooglePlayApps$1$1(anonymousClass1, aVar, c35Var, str, suggestListViewModel, null), null);
            }
        }).a, new a67(19, suggestListViewModel)), y97.G(suggestListViewModel)), null, new AnonymousClass3(2, suggestListViewModel, SuggestListViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
