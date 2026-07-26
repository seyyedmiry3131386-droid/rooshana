package ir.mservices.market.movie.ui.detail;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment", f = "MovieDetailRecyclerListFragment.kt", l = {1325}, m = "handleTab", v = 1)
final class MovieDetailRecyclerListFragment$handleTab$1 extends ContinuationImpl {
    public MovieDetailRecyclerListFragment a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MovieDetailRecyclerListFragment c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$handleTab$1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return MovieDetailRecyclerListFragment.R1(this.c, null, this);
    }
}
