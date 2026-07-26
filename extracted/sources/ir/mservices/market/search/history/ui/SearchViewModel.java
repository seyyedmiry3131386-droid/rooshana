package ir.mservices.market.search.history.ui;

import defpackage.ad8;
import defpackage.bl4;
import defpackage.br9;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.d;
import defpackage.dp2;
import defpackage.ds;
import defpackage.e71;
import defpackage.g51;
import defpackage.hh2;
import defpackage.is3;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k65;
import defpackage.l65;
import defpackage.li7;
import defpackage.ly5;
import defpackage.m88;
import defpackage.og6;
import defpackage.pq6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.qq4;
import defpackage.ri7;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.vy2;
import defpackage.w19;
import defpackage.wu0;
import defpackage.x19;
import defpackage.x38;
import defpackage.xk6;
import defpackage.xt3;
import defpackage.xv3;
import defpackage.xz5;
import defpackage.y2;
import defpackage.y97;
import defpackage.yl5;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.search.common.SearchType;
import ir.mservices.market.search.history.ui.SearchAction;
import ir.mservices.market.search.history.ui.recycler.MovieSearchHomeMoviesRowData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryHorizontalTagsData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryListTitleData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryTagData;
import ir.mservices.market.search.history.ui.recycler.SearchTermData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchViewModel extends ir.mservices.market.viewModel.a {
    public final x19 A;
    public final ut4 B;
    public final String C;
    public final l D;
    public final rv6 E;
    public String F;
    public String G;
    public xt3 H;
    public final i I;
    public final pv6 J;
    public final rv6 K;
    public final List L;
    public final jd7 v;
    public final ir.mservices.market.version2.manager.install.a w;
    public final yl5 x;
    public final qq4 y;
    public final hh2 z;

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel$1", f = "SearchViewModel.kt", l = {548}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SearchViewModel.this.new AnonymousClass1(g51Var);
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
            SearchViewModel searchViewModel = SearchViewModel.this;
            pv6 pv6Var = searchViewModel.u;
            xk6 xk6Var = new xk6(11, searchViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 21), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$getSearchHomeData$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel", f = "SearchViewModel.kt", l = {267}, m = "getSearchHomeData", v = 1)
    public static final class C02061 extends ContinuationImpl {
        public ArrayList a;
        public /* synthetic */ Object b;
        public int d;

        public C02061(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SearchViewModel.this.getSearchHomeData(this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$getSearchKeywords$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel", f = "SearchViewModel.kt", l = {231}, m = "getSearchKeywords", v = 1)
    public static final class C02071 extends ContinuationImpl {
        public ArrayList a;
        public /* synthetic */ Object b;
        public int d;

        public C02071(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SearchViewModel.this.getSearchKeywords(this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$getSearchSuggestions$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel", f = "SearchViewModel.kt", l = {190, 195, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR}, m = "getSearchSuggestions", v = 1)
    public static final class C02081 extends ContinuationImpl {
        public ArrayList a;
        public /* synthetic */ Object b;
        public int d;

        public C02081(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SearchViewModel.this.getSearchSuggestions(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$getUserSearchHomeData$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel", f = "SearchViewModel.kt", l = {318}, m = "getUserSearchHomeData", v = 1)
    public static final class C02091 extends ContinuationImpl {
        public ArrayList a;
        public /* synthetic */ Object b;
        public int d;

        public C02091(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SearchViewModel.this.getUserSearchHomeData(this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$setSearchHistoryItems$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel$setSearchHistoryItems$1", f = "SearchViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C02101 extends SuspendLambda implements qp2 {
        public final /* synthetic */ List a;
        public final /* synthetic */ qp2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02101(List list, qp2 qp2Var, g51 g51Var) {
            super(2, g51Var);
            this.a = list;
            this.b = qp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new C02101(this.a, this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02101) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            List list = this.a;
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bl4.G((MyketRecyclerData) it.next(), arrayList);
            }
            return new bz6(arrayList, (GeneralFilter) null, this.b, 2);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$startLottieAnimation$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel$startLottieAnimation$1", f = "SearchViewModel.kt", l = {110}, m = "invokeSuspend", v = 1)
    public static final class C02111 extends SuspendLambda implements qp2 {
        public int a;

        public C02111(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SearchViewModel.this.new C02111(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02111) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = SearchViewModel.this.I;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (iVar.emit(bool, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel(jd7 jd7Var, ir.mservices.market.version2.manager.install.a aVar, yl5 yl5Var, qq4 qq4Var, hh2 hh2Var, x19 x19Var, ut4 ut4Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(aVar, "installQueue");
        js3.p(yl5Var, "neneDownloadRepository");
        this.v = jd7Var;
        this.w = aVar;
        this.x = yl5Var;
        this.y = qq4Var;
        this.z = hh2Var;
        this.A = x19Var;
        this.B = ut4Var;
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        this.C = (String) jd7Var.b("source");
        l lVarB = ja1.b(jd7Var.b("sourceType"));
        this.D = lVarB;
        this.E = new rv6(lVarB);
        this.F = (String) jd7Var.b("BUNDLE_KEY_QUERY");
        i iVarE = vy2.e(0, 7, null);
        this.I = iVarE;
        this.J = new pv6(iVarE);
        this.K = jd7Var.c(Boolean.FALSE, "BUNDLE_KEY_OPEN_STATE");
        this.L = kotlin.collections.a.P0(SearchType.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MyketRecyclerData> fillData(List<li7> list, List<? extends MyketRecyclerData> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            li7 li7Var = (li7) obj;
            if (list2 == null || !list2.isEmpty()) {
                for (MyketRecyclerData myketRecyclerData : list2) {
                    SearchTermData searchTermData = myketRecyclerData instanceof SearchTermData ? (SearchTermData) myketRecyclerData : null;
                    if (m88.T(searchTermData != null ? searchTermData.b : null, li7Var.a, true)) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        int i = 0;
        List listSubList = arrayList2.subList(0, Math.min(arrayList2.size(), 2));
        ArrayList arrayList3 = new ArrayList(wu0.V(listSubList, 10));
        for (Object obj2 : listSubList) {
            int i2 = i + 1;
            if (i < 0) {
                br9.P();
                throw null;
            }
            arrayList3.add(new SearchHistoryData(yq6.ic_history, i, ((li7) obj2).a, this.F));
            i = i2;
        }
        arrayList.addAll(list2);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<MyketRecyclerData> fillTagData(List<li7> list, List<? extends MyketRecyclerData> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != 0 && !list.isEmpty()) {
            arrayList.add(new SearchHistoryListTitleData(rs6.search_histoy_title));
            int size = list.size();
            if (size > 20) {
                size = 20;
            }
            int i = 0;
            List listSubList = list.subList(0, size);
            ArrayList arrayList2 = new ArrayList(wu0.V(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((li7) it.next()).a);
            }
            arrayList.add(new SearchHistoryHorizontalTagsData(new bz6(getTagsRecyclerItems(arrayList2), (GeneralFilter) null, (qp2) null, 6), new SearchViewModel$fillTagData$1$1(1, this, SearchViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    br9.P();
                    throw null;
                }
                if (list instanceof ri7) {
                    ((ri7) list).a = i;
                }
                i = i2;
            }
        }
        arrayList.addAll(list2);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getSearchHomeData(defpackage.g51<? super java.util.List<? extends ir.mservices.market.common.ui.recycler.MyketRecyclerData>> r26) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel.getSearchHomeData(g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSearchHomeData$lambda$0$1(HomeMovieBannerListDto homeMovieBannerListDto) {
        js3.p(homeMovieBannerListDto, "dto");
        List<HomeMovieBannerDto> banners = homeMovieBannerListDto.getBanners();
        ArrayList arrayList = new ArrayList(wu0.V(banners, 10));
        Iterator<T> it = banners.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new MovieHomeBannersItemData((HomeMovieBannerDto) it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getSearchKeywords(defpackage.g51<? super java.util.List<? extends ir.mservices.market.common.ui.recycler.MyketRecyclerData>> r14) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel.getSearchKeywords(g51):java.lang.Object");
    }

    private static final String getSearchKeywords$lambda$0$0$0() {
        long j = is3.p + 1;
        is3.p = j;
        return String.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.bz6 getSearchRecommendedRecyclerData(ir.mservices.market.app.detail.data.RecommendationDto r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel.getSearchRecommendedRecyclerData(ir.mservices.market.app.detail.data.RecommendationDto):bz6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getSearchSuggestions(java.lang.String r18, defpackage.g51<? super java.util.List<? extends ir.mservices.market.common.ui.recycler.MyketRecyclerData>> r19) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel.getSearchSuggestions(java.lang.String, g51):java.lang.Object");
    }

    private final List<RecyclerItem> getTagsRecyclerItems(List<String> list) {
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                br9.P();
                throw null;
            }
            arrayList.add(new RecyclerItem(new SearchHistoryTagData((String) obj, i)));
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getUserSearchHomeData(defpackage.g51<? super java.util.List<? extends ir.mservices.market.common.ui.recycler.MyketRecyclerData>> r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel.getUserSearchHomeData(g51):java.lang.Object");
    }

    private final void launchInSearchFlow(dp2 dp2Var) {
        xt3 xt3VarA = kotlinx.coroutines.a.a();
        bt2.G(y97.G(this), xt3VarA, null, new SearchViewModel$launchInSearchFlow$1$1(null, dp2Var), 2);
        this.H = xt3VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadAllSearchHistory(String str, g51<? super x38> g51Var) {
        String str2 = (String) this.E.a.getValue();
        if (js3.i(str2, CommonDataKt.MOVIE_TYPE_MOVIE)) {
            l65 l65Var = (l65) ((k65) this.z.c);
            l65Var.getClass();
            return y2.a(new xv3(l65Var, str, 5), g51Var);
        }
        if (js3.i(str2, "app")) {
            ds dsVar = (ds) ((ad8) this.y.b);
            dsVar.getClass();
            return y2.a(new d(dsVar, str, 9), g51Var);
        }
        w19 w19Var = (w19) this.A.b;
        w19Var.getClass();
        return y2.a(new xv3(w19Var, str, 28), g51Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOpenAction(SearchAction.OpenAction openAction) {
        this.v.d(Boolean.valueOf(openAction.getOpen()), "BUNDLE_KEY_OPEN_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setHomeDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem == null) {
            return null;
        }
        MyketRecyclerData myketRecyclerData = recyclerItem.c;
        if (!(myketRecyclerData instanceof MovieSearchHomeMoviesRowData) && !(myketRecyclerData instanceof MovieHomeBannersRowData)) {
            return null;
        }
        DividerData dividerData = new DividerData();
        dividerData.b = false;
        dividerData.f = pq6.space_16;
        return new RecyclerItem(dividerData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSearchHistoryItems(List<? extends MyketRecyclerData> list, qp2 qp2Var) {
        p(new C02101(list, qp2Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLottieAnimation() {
        bt2.G(y97.G(this), null, null, new C02111(null), 3);
    }

    public final void E(String str) {
        js3.p(str, "title");
        bt2.G(y97.G(this), null, null, new SearchViewModel$addToRecent$1(this, str, null), 3);
    }

    public final void F() {
        String str = this.F;
        if (str != null) {
            launchInSearchFlow(new SearchViewModel$initSearchHistory$1$1(this, str, null));
        }
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    public final void onEvent(ly5 ly5Var) {
        js3.p(ly5Var, "event");
        String action = ly5Var.b.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -810471698) {
                if (iHashCode != 525384130) {
                    if (iHashCode != 1544582882 || !action.equals("android.intent.action.PACKAGE_ADDED")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.PACKAGE_REPLACED")) {
                return;
            }
            g(new xz5(null));
        }
    }
}
