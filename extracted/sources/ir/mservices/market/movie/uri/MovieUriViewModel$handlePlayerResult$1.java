package ir.mservices.market.movie.uri;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.movie.common.domain.models.RestrictionButton;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.uri.MovieUriViewModel$handlePlayerResult$1", f = "MovieUriViewModel.kt", l = {232}, m = "invokeSuspend", v = 1)
final class MovieUriViewModel$handlePlayerResult$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ RestrictionButton b;
    public final /* synthetic */ MovieUriViewModel c;
    public final /* synthetic */ RestrictionInfo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieUriViewModel$handlePlayerResult$1(RestrictionButton restrictionButton, MovieUriViewModel movieUriViewModel, RestrictionInfo restrictionInfo, g51 g51Var) {
        super(2, g51Var);
        this.b = restrictionButton;
        this.c = movieUriViewModel;
        this.d = restrictionInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieUriViewModel$handlePlayerResult$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieUriViewModel$handlePlayerResult$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            MovieUriViewModel movieUriViewModel = this.c;
            RestrictionButton restrictionButton = this.b;
            if (restrictionButton != null) {
                movieUriViewModel.u(restrictionButton, null);
            } else {
                RestrictionInfo restrictionInfo = this.d;
                if (restrictionInfo != null) {
                    i iVar = movieUriViewModel.y;
                    this.a = 1;
                    if (iVar.emit(restrictionInfo, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
