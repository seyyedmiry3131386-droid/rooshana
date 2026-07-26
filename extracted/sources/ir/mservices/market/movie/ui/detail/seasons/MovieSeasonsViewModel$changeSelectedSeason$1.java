package ir.mservices.market.movie.ui.detail.seasons;

import defpackage.a75;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.data.webapi.SeasonDto;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel$changeSelectedSeason$1", f = "MovieSeasonsViewModel.kt", l = {173}, m = "invokeSuspend", v = 1)
final class MovieSeasonsViewModel$changeSelectedSeason$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieSeasonsViewModel b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MovieSeasonFixedTitleData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonsViewModel$changeSelectedSeason$1(MovieSeasonsViewModel movieSeasonsViewModel, int i, MovieSeasonFixedTitleData movieSeasonFixedTitleData, g51 g51Var) {
        super(2, g51Var);
        this.b = movieSeasonsViewModel;
        this.c = i;
        this.d = movieSeasonFixedTitleData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieSeasonsViewModel$changeSelectedSeason$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieSeasonsViewModel$changeSelectedSeason$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        MovieSeasonsViewModel movieSeasonsViewModel = this.b;
        List list = (List) movieSeasonsViewModel.C.a.getValue();
        SeasonDto seasonDto = list != null ? (SeasonDto) kotlin.collections.a.q0(this.c, list) : null;
        MovieSeasonFixedTitleData movieSeasonFixedTitleData = this.d;
        if (movieSeasonFixedTitleData != null && seasonDto != null) {
            l lVar = movieSeasonsViewModel.x;
            String title = seasonDto.getTitle();
            String id = seasonDto.getId();
            ArrayList arrayList = movieSeasonFixedTitleData.c;
            a75 a75Var = movieSeasonsViewModel.w;
            boolean z = a75Var.h;
            MovieSeasonFixedTitleData movieSeasonFixedTitleData2 = new MovieSeasonFixedTitleData(title, id, arrayList, this.c, z, !z || a75Var.c > 1);
            this.a = 1;
            lVar.emit(movieSeasonFixedTitleData2, this);
            if (tx8Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8Var;
    }
}
