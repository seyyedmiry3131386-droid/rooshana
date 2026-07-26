package ir.mservices.market.app.home;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.HomeViewModel$stopPlayingVideoShot$1", f = "HomeViewModel.kt", l = {714}, m = "invokeSuspend", v = 1)
final class HomeViewModel$stopPlayingVideoShot$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ HomeViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$stopPlayingVideoShot$1(HomeViewModel homeViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new HomeViewModel$stopPlayingVideoShot$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$stopPlayingVideoShot$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            i iVar = this.b.L;
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (iVar.emit(bool, this) == coroutineSingletons) {
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
