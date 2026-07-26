package ir.mservices.market.movie.ui.home;

import defpackage.bj2;
import defpackage.bl4;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.pa2;
import defpackage.pq6;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.y05;
import defpackage.y97;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.data.DynamicButtonDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.HomeMovieDto;
import ir.mservices.market.movie.data.webapi.HomeMovieElementsDto;
import ir.mservices.market.movie.ui.home.MovieHomeAction;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsRowData;
import ir.mservices.market.viewModel.BaseHomeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHomeViewModel extends BaseHomeViewModel {
    public final pv6 A;
    public String B;
    public boolean C;
    public final pa2 x;
    public final y05 y;
    public final i z;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.home.MovieHomeViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.home.MovieHomeViewModel$1", f = "MovieHomeViewModel.kt", l = {129}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieHomeViewModel.this.new AnonymousClass1(g51Var);
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
            MovieHomeViewModel movieHomeViewModel = MovieHomeViewModel.this;
            pv6 pv6Var = movieHomeViewModel.u;
            bj2 bj2Var = new bj2(14, movieHomeViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 13), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    public MovieHomeViewModel(pa2 pa2Var, y05 y05Var) {
        js3.p(y05Var, "movieDataMapper");
        this.x = pa2Var;
        this.y = y05Var;
        i iVarE = vy2.e(0, 7, null);
        this.z = iVarE;
        this.A = new pv6(iVarE);
        this.C = true;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> homeMovieDtoMapper(HomeMovieElementsDto homeMovieElementsDto) {
        ArrayList arrayList = new ArrayList();
        for (HomeMovieDto homeMovieDto : homeMovieElementsDto.getElements()) {
            if (js3.i(homeMovieDto.getType(), CommonDataKt.HOME_MOVIE_ADDAX_TYPE)) {
                AddaxBoxDto addax = homeMovieDto.getAddax();
                if (addax != null) {
                    if (!addax.canAddAddax()) {
                        addax = null;
                    }
                    if (addax != null) {
                        arrayList.add(new AddaxBoxData(addax, true));
                        bt2.G(y97.G(this), null, null, new MovieHomeViewModel$homeMovieDtoMapper$1$2$1(this, addax, null), 3);
                    }
                }
            } else {
                arrayList.addAll(this.y.c(homeMovieDto, y97.G(this), null, false, null, this, this.C, new MovieHomeViewModel$homeMovieDtoMapper$1$3(1, this, MovieHomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
            }
        }
        DynamicButtonDto dynamicButton = homeMovieElementsDto.getDynamicButton();
        if (dynamicButton != null) {
            l lVar = this.v;
            lVar.getClass();
            lVar.p(null, dynamicButton);
        }
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitAction(MovieHomeAction.InitAction initAction) {
        this.C = initAction.getHasSideNavigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem == null || recyclerItem2 == null) {
            return null;
        }
        if (recyclerItem.c instanceof ExtHeaderRowData) {
            MyketRecyclerData myketRecyclerData = recyclerItem2.c;
            if ((myketRecyclerData instanceof MovieHomeReelsRowData) || (myketRecyclerData instanceof MovieHomeBannersRowData)) {
                return null;
            }
        }
        DividerData dividerData = new DividerData();
        dividerData.d = pq6.space_m;
        dividerData.b = false;
        return new RecyclerItem(dividerData);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieHomeViewModel$doRequest$1(this, null));
    }
}
