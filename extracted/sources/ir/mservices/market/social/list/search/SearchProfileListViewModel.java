package ir.mservices.market.social.list.search;

import androidx.paging.m;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.fj7;
import defpackage.g51;
import defpackage.gu9;
import defpackage.ja1;
import defpackage.js3;
import defpackage.mh7;
import defpackage.og6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.um7;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.xk6;
import defpackage.y97;
import defpackage.yi7;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.social.list.common.app.recycler.ProfileAppData;
import ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData;
import ir.mservices.market.social.list.search.SearchProfileListAction;
import ir.mservices.market.social.list.search.app.data.ProfileApplicationsDto;
import ir.mservices.market.social.list.search.movie.data.ProfileMoviesDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchProfileListViewModel extends a {
    public boolean A;
    public final d B;
    public final um7 v;
    public final mh7 w;
    public final yi7 x;
    public final l y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.list.search.SearchProfileListViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.list.search.SearchProfileListViewModel$1", f = "SearchProfileListViewModel.kt", l = {108}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ SearchProfileListViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, SearchProfileListViewModel searchProfileListViewModel) {
            super(2, g51Var);
            this.b = searchProfileListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(g51Var, this.b);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            SearchProfileListViewModel searchProfileListViewModel = this.b;
            pv6 pv6Var = searchProfileListViewModel.u;
            xk6 xk6Var = new xk6(9, searchProfileListViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 20), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchProfileListViewModel(um7 um7Var, mh7 mh7Var, yi7 yi7Var) {
        super(true);
        js3.p(um7Var, "selectedItemsRepository");
        js3.p(mh7Var, "searchAppProfileListRepository");
        js3.p(yi7Var, "searchMovieProfileListRepository");
        this.v = um7Var;
        this.w = mh7Var;
        this.x = yi7Var;
        l lVarB = ja1.b("");
        this.y = lVarB;
        this.z = new rv6(lVarB);
        this.A = true;
        this.B = kotlinx.coroutines.flow.d.C(kotlinx.coroutines.flow.d.i(kotlinx.coroutines.flow.d.i(kotlinx.coroutines.flow.d.A(lVarB, y97.G(this), ru7.b, ""))), new SearchProfileListViewModel$special$$inlined$flatMapLatest$1(null, this));
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null, this), 3);
    }

    private static /* synthetic */ void getSearchQueryFlow$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInit(SearchProfileListAction.Init init) {
        this.A = init.isApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSearchAction(SearchProfileListAction.Search search) {
        l lVar;
        Object value;
        do {
            lVar = this.y;
            value = lVar.getValue();
        } while (!lVar.n(value, search.getQuery()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xe2 searchApp(final String str) {
        final mh7 mh7Var = this.w;
        mh7Var.getClass();
        js3.p(str, "query");
        return gu9.x((xe2) new m(gu9.n(false), new bp2() { // from class: ir.mservices.market.social.list.search.app.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new SearchAppProfileListRepositoryImpl$search$1$1(str, mh7Var, this, null), null);
            }
        }).a, new fj7(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List searchApp$lambda$0(SearchProfileListViewModel searchProfileListViewModel, ProfileApplicationsDto profileApplicationsDto) {
        js3.p(profileApplicationsDto, "it");
        List<ApplicationDTO> list = profileApplicationsDto.getList();
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        for (ApplicationDTO applicationDTO : list) {
            um7 um7Var = searchProfileListViewModel.v;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList.add(new RecyclerItem(new ProfileAppData(applicationDTO, um7Var.b(packageName))));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xe2 searchMovie(final String str) {
        final yi7 yi7Var = this.x;
        yi7Var.getClass();
        js3.p(str, "query");
        return gu9.x((xe2) new m(gu9.n(false), new bp2() { // from class: ir.mservices.market.social.list.search.movie.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new SearchMovieProfileListRepositoryImpl$search$1$1(str, yi7Var, this, null), null);
            }
        }).a, new fj7(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List searchMovie$lambda$0(SearchProfileListViewModel searchProfileListViewModel, ProfileMoviesDto profileMoviesDto) {
        js3.p(profileMoviesDto, "it");
        List<MovieDto> list = profileMoviesDto.getList();
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        for (MovieDto movieDto : list) {
            arrayList.add(new RecyclerItem(new ProfileMovieData(movieDto, searchProfileListViewModel.v.b(movieDto.getId()))));
        }
        return arrayList;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new SearchProfileListViewModel$doRequest$1(null, this));
    }
}
