package ir.mservices.market.movie.ui.detail;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$handleTab$tabPosition$1", f = "MovieDetailRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$handleTab$tabPosition$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieDetailRecyclerListFragment a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$handleTab$tabPosition$1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, RecyclerView recyclerView, int i, g51 g51Var) {
        super(2, g51Var);
        this.a = movieDetailRecyclerListFragment;
        this.b = recyclerView;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailRecyclerListFragment$handleTab$tabPosition$1(this.a, this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailRecyclerListFragment$handleTab$tabPosition$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$handleTab$tabPosition$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
