package ir.mservices.market.movie.ui.detail.seasons;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u65;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.model.paging.b;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeData;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel$doRequest$1", f = "MovieSeasonsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieSeasonsViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieSeasonsViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            ((MovieSeasonsViewModel) this.receiver).getClass();
            if (recyclerItem == null || recyclerItem2 == null || !(recyclerItem.c instanceof MovieEpisodeData) || !(recyclerItem2.c instanceof MovieSeasonFixedTitleData)) {
                return null;
            }
            DividerData dividerData = new DividerData();
            dividerData.e = pq6.horizontal_space_outer;
            dividerData.c = pq6.horizontal_space_inner;
            return new RecyclerItem(dividerData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonsViewModel$doRequest$1(MovieSeasonsViewModel movieSeasonsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = movieSeasonsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieSeasonsViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieSeasonsViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        final MovieSeasonsViewModel movieSeasonsViewModel = this.a;
        final u65 u65Var = movieSeasonsViewModel.t;
        final String str = movieSeasonsViewModel.w.f;
        u65Var.getClass();
        js3.p(str, "movieId");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new b(new MovieSeasonRepositoryImpl$getSeasons$1$1(u65Var, str, movieSeasonsViewModel, null));
            }
        }).a, new z45(3, movieSeasonsViewModel)), y97.G(movieSeasonsViewModel)), null, new AnonymousClass2(2, movieSeasonsViewModel, MovieSeasonsViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
