package ir.mservices.market.movie.ui.detail;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$movieFullMapperToRecyclerData$11$1", f = "MovieDetailViewModel.kt", l = {455}, m = "invokeSuspend", v = 1)
public final class MovieDetailViewModel$movieFullMapperToRecyclerData$11$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDetailViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailViewModel$movieFullMapperToRecyclerData$11$1(MovieDetailViewModel movieDetailViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailViewModel$movieFullMapperToRecyclerData$11$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailViewModel$movieFullMapperToRecyclerData$11$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.b.B0;
            Boolean bool = Boolean.FALSE;
            this.a = 1;
            if (iVar.emit(bool, this) == coroutineSingletons) {
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
