package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$showNextEpisodeState$2", f = "PlayerViewModel.kt", l = {458}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$showNextEpisodeState$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$showNextEpisodeState$2 playerViewModel$showNextEpisodeState$2 = new PlayerViewModel$showNextEpisodeState$2(2, g51Var);
        playerViewModel$showNextEpisodeState$2.b = obj;
        return playerViewModel$showNextEpisodeState$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$showNextEpisodeState$2) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ze2 ze2Var = (ze2) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Boolean bool = Boolean.FALSE;
            this.b = null;
            this.a = 1;
            if (ze2Var.emit(bool, this) == coroutineSingletons) {
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
