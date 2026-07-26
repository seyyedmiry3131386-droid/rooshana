package ir.mservices.market.movie.ui.detail.seasons;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import defpackage.dt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.uri.MovieUriViewModel;
import ir.myket.movie.common.domain.models.RestrictionButton;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$onViewCreated$4$1", f = "MovieSeasonsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieSeasonsRecyclerListFragment$onViewCreated$4$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieSeasonsRecyclerListFragment a;
    public final /* synthetic */ ActivityResult b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonsRecyclerListFragment$onViewCreated$4$1(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment, ActivityResult activityResult, g51 g51Var) {
        super(2, g51Var);
        this.a = movieSeasonsRecyclerListFragment;
        this.b = activityResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieSeasonsRecyclerListFragment$onViewCreated$4$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        MovieSeasonsRecyclerListFragment$onViewCreated$4$1 movieSeasonsRecyclerListFragment$onViewCreated$4$1 = (MovieSeasonsRecyclerListFragment$onViewCreated$4$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        movieSeasonsRecyclerListFragment$onViewCreated$4$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bundle extras;
        Bundle extras2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        int i = MovieSeasonsRecyclerListFragment.s1;
        MovieUriViewModel movieUriViewModelS1 = this.a.S1();
        ActivityResult activityResult = this.b;
        Intent intent = activityResult.b;
        RestrictionButton restrictionButton = null;
        RestrictionInfo restrictionInfo = (intent == null || (extras2 = intent.getExtras()) == null) ? null : (RestrictionInfo) dt2.p(extras2, "MOVIE_RESTRICTION_INFO", RestrictionInfo.class);
        Intent intent2 = activityResult.b;
        if (intent2 != null && (extras = intent2.getExtras()) != null) {
            restrictionButton = (RestrictionButton) dt2.p(extras, "MOVIE_RESTRICTION_BUTTON", RestrictionButton.class);
        }
        movieUriViewModelS1.t(restrictionInfo, restrictionButton);
        return tx8.a;
    }
}
