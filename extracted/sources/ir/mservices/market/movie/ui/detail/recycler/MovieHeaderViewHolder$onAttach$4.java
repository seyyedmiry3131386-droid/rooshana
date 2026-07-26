package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.d35;
import defpackage.e71;
import defpackage.eq1;
import defpackage.g51;
import defpackage.hs9;
import defpackage.i25;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieHeaderViewHolder$onAttach$4", f = "MovieHeader.kt", l = {284}, m = "invokeSuspend", v = 1)
final class MovieHeaderViewHolder$onAttach$4 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieHeaderData b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHeaderViewHolder$onAttach$4(MovieHeaderData movieHeaderData, c cVar, g51 g51Var) {
        super(2, g51Var);
        this.b = movieHeaderData;
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieHeaderViewHolder$onAttach$4(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieHeaderViewHolder$onAttach$4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MovieHeaderData movieHeaderData = this.b;
            eq1 eq1VarB = hs9.B(movieHeaderData.p, new i25(2), hs9.e);
            d35 d35Var = new d35(this.c, movieHeaderData, 2);
            this.a = 1;
            if (eq1VarB.a(d35Var, this) == coroutineSingletons) {
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
