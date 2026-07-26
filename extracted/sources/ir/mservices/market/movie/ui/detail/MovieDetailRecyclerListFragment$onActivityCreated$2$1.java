package ir.mservices.market.movie.ui.detail;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onActivityCreated$2$1", f = "MovieDetailRecyclerListFragment.kt", l = {349}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onActivityCreated$2$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onActivityCreated$2$1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, View view, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDetailRecyclerListFragment;
        this.c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onActivityCreated$2$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieDetailRecyclerListFragment$onActivityCreated$2$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            movieDetailRecyclerListFragment.C1 = true;
            MovieDetailRecyclerListFragment.S1(movieDetailRecyclerListFragment, ((TabLayout) this.c).getSelectedTabPosition());
            this.a = 1;
            if (kotlinx.coroutines.a.e(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        movieDetailRecyclerListFragment.C1 = false;
        return tx8.a;
    }
}
