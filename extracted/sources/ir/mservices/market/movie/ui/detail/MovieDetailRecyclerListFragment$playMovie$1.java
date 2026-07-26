package ir.mservices.market.movie.ui.detail;

import androidx.fragment.app.FragmentActivity;
import defpackage.dp2;
import defpackage.g51;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.pika.common.model.NearbyRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$playMovie$1", f = "MovieDetailRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$playMovie$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ MovieDetailRecyclerListFragment a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$playMovie$1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, String str, g51 g51Var) {
        super(1, g51Var);
        this.a = movieDetailRecyclerListFragment;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$playMovie$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        MovieDetailRecyclerListFragment$playMovie$1 movieDetailRecyclerListFragment$playMovie$1 = (MovieDetailRecyclerListFragment$playMovie$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        movieDetailRecyclerListFragment$playMovie$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        FragmentActivity fragmentActivityF = this.a.F();
        String str = this.b;
        if (str != null) {
            t61.w(str, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
        }
        return tx8.a;
    }
}
