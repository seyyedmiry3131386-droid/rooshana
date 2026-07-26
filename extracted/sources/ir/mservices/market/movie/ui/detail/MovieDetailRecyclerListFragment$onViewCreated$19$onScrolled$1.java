package ir.mservices.market.movie.ui.detail;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$1", f = "MovieDetailRecyclerListFragment.kt", l = {1187}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;
    public final /* synthetic */ RecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, RecyclerView recyclerView, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDetailRecyclerListFragment;
        this.c = recyclerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (MovieDetailRecyclerListFragment.R1(this.b, this.c, this) == coroutineSingletons) {
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
