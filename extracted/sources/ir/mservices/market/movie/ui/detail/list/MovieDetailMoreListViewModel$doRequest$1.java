package ir.mservices.market.movie.ui.detail.list;

import defpackage.bz6;
import defpackage.g51;
import defpackage.o15;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.version2.ui.recycler.filter.FilterCondition;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.ui.recycler.filter.a;
import ir.mservices.market.version2.webapi.responsedto.MovieIgnoreConditionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.list.MovieDetailMoreListViewModel$doRequest$1", f = "MovieDetailMoreListViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieDetailMoreListViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieDetailMoreListViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailMoreListViewModel$doRequest$1(MovieDetailMoreListViewModel movieDetailMoreListViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = movieDetailMoreListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailMoreListViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailMoreListViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        o15 o15Var = this.a.t;
        List<MovieDto> movies = o15Var.a.getMovies();
        ArrayList arrayList = new ArrayList(wu0.V(movies, 10));
        Iterator<T> it = movies.iterator();
        while (it.hasNext()) {
            MovieHomeMovieData movieHomeMovieData = new MovieHomeMovieData((MovieDto) it.next(), null, null, 6, 0);
            movieHomeMovieData.f = o15Var.a.getAnalyticsName();
            arrayList.add(new RecyclerItem(movieHomeMovieData));
        }
        ArrayList arrayList2 = null;
        bz6 bz6Var = new bz6(arrayList, (GeneralFilter) null, (qp2) null, 6);
        if (bz6Var.b == null) {
            List<MovieIgnoreConditionDto> ignoreConditions = o15Var.a.getIgnoreConditions();
            if (ignoreConditions != null) {
                arrayList2 = new ArrayList(wu0.V(ignoreConditions, 10));
                for (MovieIgnoreConditionDto movieIgnoreConditionDto : ignoreConditions) {
                    arrayList2.add(new FilterCondition.IntCondition(movieIgnoreConditionDto.getCondition(), movieIgnoreConditionDto.getPercent()));
                }
            }
            bz6Var.b = a.b(arrayList2);
        }
        return bz6Var;
    }
}
