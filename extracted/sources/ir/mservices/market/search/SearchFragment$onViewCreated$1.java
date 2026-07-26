package ir.mservices.market.search;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.views.SearchView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.search.SearchFragment$onViewCreated$1", f = "SearchFragment.kt", l = {134}, m = "invokeSuspend", v = 1)
final class SearchFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SearchFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.search.SearchFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.search.SearchFragment$onViewCreated$1$1", f = "SearchFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ SearchFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchFragment searchFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = searchFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean zI = js3.i(str, CommonDataKt.MOVIE_TYPE_MOVIE);
            SearchFragment searchFragment = this.b;
            if (zI) {
                ir.mservices.market.common.search.b bVar = searchFragment.S0;
                if (bVar != null) {
                    String string = searchFragment.K().getString(rs6.search_movie_hint);
                    js3.o(string, "getString(...)");
                    SearchView searchView = bVar.a.l1;
                    if (searchView != null) {
                        searchView.setHint(string);
                    }
                }
            } else if (js3.i(str, "app")) {
                ir.mservices.market.common.search.b bVar2 = searchFragment.S0;
                if (bVar2 != null) {
                    String string2 = searchFragment.K().getString(rs6.search_home_hint);
                    js3.o(string2, "getString(...)");
                    SearchView searchView2 = bVar2.a.l1;
                    if (searchView2 != null) {
                        searchView2.setHint(string2);
                    }
                }
            } else {
                ir.mservices.market.common.search.b bVar3 = searchFragment.S0;
                if (bVar3 != null) {
                    String string3 = searchFragment.K().getString(rs6.search_user_txt);
                    js3.o(string3, "getString(...)");
                    SearchView searchView3 = bVar3.a.l1;
                    if (searchView3 != null) {
                        searchView3.setHint(string3);
                    }
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$onViewCreated$1(SearchFragment searchFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = searchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SearchFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SearchFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = SearchFragment.b1;
            SearchFragment searchFragment = this.b;
            o4 o4Var = new o4(searchFragment.G0().E, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
