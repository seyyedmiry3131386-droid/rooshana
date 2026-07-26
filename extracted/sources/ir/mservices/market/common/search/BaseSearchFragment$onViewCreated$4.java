package ir.mservices.market.common.search;

import android.os.Handler;
import android.os.Looper;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.ee;
import defpackage.f65;
import defpackage.f88;
import defpackage.g51;
import defpackage.g6;
import defpackage.ii7;
import defpackage.ji7;
import defpackage.js3;
import defpackage.lw;
import defpackage.o27;
import defpackage.qp2;
import defpackage.rn6;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zk8;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.common.search.SearchState;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.views.SearchView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.search.BaseSearchFragment$onViewCreated$4", f = "BaseSearchFragment.kt", l = {275}, m = "invokeSuspend", v = 1)
final class BaseSearchFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseSearchFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.common.search.BaseSearchFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.common.search.BaseSearchFragment$onViewCreated$4$1", f = "BaseSearchFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BaseSearchFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseSearchFragment baseSearchFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = baseSearchFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((SearchState) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Handler handler;
            SearchState searchState = (SearchState) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            if (searchState instanceof SearchState.Result) {
                this.b.S1().r(new SearchAction.SetFirstListShow(Boolean.TRUE));
                BaseSearchFragment baseSearchFragment = this.b;
                SearchFragment searchFragmentV1 = baseSearchFragment.V1(((Boolean) baseSearchFragment.S1().B.a.getValue()).booleanValue());
                if (searchFragmentV1 != null) {
                    searchFragmentV1.F0();
                    searchFragmentV1.J0();
                    SearchState.Result result = (SearchState.Result) searchState;
                    String str = result.a;
                    String str2 = result.b;
                    js3.p(str, "query");
                    js3.p(str2, "querySource");
                    if (!f88.n0(str)) {
                        synchronized (zk8.class) {
                            handler = zk8.a;
                            if (handler == null) {
                                handler = new Handler(Looper.getMainLooper());
                                zk8.a = handler;
                            }
                        }
                        handler.removeCallbacks(searchFragmentV1.R0);
                        searchFragmentV1.G0.a("SEARCH_REQUEST_TAG");
                        if (js3.i(searchFragmentV1.p0().getString("sourceType"), "user")) {
                            dw1.C(searchFragmentV1, new ji7(str, str2), null, 6);
                        } else {
                            dw1.C(searchFragmentV1, new ii7(str, str2, js3.i(searchFragmentV1.G0().E.a.getValue(), CommonDataKt.MOVIE_TYPE_MOVIE) ? "MOVIE" : "APP", -1), null, 6);
                        }
                        if (js3.i(searchFragmentV1.p0().getString("sourceType"), CommonDataKt.MOVIE_TYPE_MOVIE)) {
                            f65 f65Var = searchFragmentV1.O0;
                            if (f65Var == null) {
                                js3.V("movieSearchAnalytics");
                                throw null;
                            }
                            f65Var.a().b("movie_search_query", "query", str);
                        } else {
                            rn6 rn6Var = searchFragmentV1.N0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            rn6Var.c = str;
                            ((ee) rn6Var.b).b("search_query", "query", str);
                        }
                        searchFragmentV1.G0().E(str);
                    }
                }
                SearchView searchView = this.b.l1;
                if (searchView != null) {
                    searchView.k(((SearchState.Result) searchState).a);
                }
            } else if (searchState instanceof SearchState.Home) {
                Object value = this.b.S1().z.a.getValue();
                Boolean bool = Boolean.FALSE;
                if (js3.i(value, bool)) {
                    return tx8.a;
                }
                this.b.S1().r(new SearchAction.SetFirstListShow(bool));
                BaseSearchFragment baseSearchFragment2 = this.b;
                SearchFragment searchFragmentV12 = baseSearchFragment2.V1(((Boolean) baseSearchFragment2.S1().B.a.getValue()).booleanValue());
                if (searchFragmentV12 != null) {
                    searchFragmentV12.r(null);
                    Handler handlerF = o27.f();
                    g6 g6Var = searchFragmentV12.R0;
                    handlerF.removeCallbacks(g6Var);
                    g6Var.getClass();
                    g6Var.b = "";
                    lw.f(null, null, o27.f().postDelayed(g6Var, 200L));
                }
                SearchView searchView2 = this.b.l1;
                if (searchView2 != null) {
                    searchView2.k("");
                }
            } else if (searchState instanceof SearchState.Suggestion) {
                this.b.S1().r(new SearchAction.SetFirstListShow(Boolean.TRUE));
                BaseSearchFragment baseSearchFragment3 = this.b;
                SearchFragment searchFragmentV13 = baseSearchFragment3.V1(((Boolean) baseSearchFragment3.S1().B.a.getValue()).booleanValue());
                if (searchFragmentV13 != null) {
                    searchFragmentV13.Z0 = false;
                    searchFragmentV13.r(null);
                    searchFragmentV13.J0();
                    String str3 = ((SearchState.Suggestion) searchState).a;
                    js3.p(str3, "query");
                    Handler handlerF2 = o27.f();
                    g6 g6Var2 = searchFragmentV13.R0;
                    handlerF2.removeCallbacks(g6Var2);
                    g6Var2.getClass();
                    g6Var2.b = str3;
                    lw.f(null, null, o27.f().postDelayed(g6Var2, 200L));
                }
            } else {
                this.b.S1().r(new SearchAction.SetFirstListShow(null));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchFragment$onViewCreated$4(BaseSearchFragment baseSearchFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseSearchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseSearchFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseSearchFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            BaseSearchFragment baseSearchFragment = this.b;
            rv6 rv6Var = baseSearchFragment.S1().D;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseSearchFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
