package ir.mservices.market.movie.ui.home;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.home.MovieHomeViewModel$homeMovieDtoMapper$1$2$1", f = "MovieHomeViewModel.kt", l = {77}, m = "invokeSuspend", v = 1)
public final class MovieHomeViewModel$homeMovieDtoMapper$1$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieHomeViewModel b;
    public final /* synthetic */ AddaxBoxDto c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeViewModel$homeMovieDtoMapper$1$2$1(MovieHomeViewModel movieHomeViewModel, AddaxBoxDto addaxBoxDto, g51 g51Var) {
        super(2, g51Var);
        this.b = movieHomeViewModel;
        this.c = addaxBoxDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieHomeViewModel$homeMovieDtoMapper$1$2$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieHomeViewModel$homeMovieDtoMapper$1$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            i iVar = this.b.z;
            String id = this.c.getId();
            this.a = 1;
            if (iVar.emit(id, this) == coroutineSingletons) {
                return coroutineSingletons;
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
