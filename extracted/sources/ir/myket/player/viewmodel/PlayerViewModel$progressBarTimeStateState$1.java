package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zl6;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$progressBarTimeStateState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$progressBarTimeStateState$1 extends SuspendLambda implements sp2 {
    public /* synthetic */ long a;
    public /* synthetic */ long b;
    public /* synthetic */ long c;
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$progressBarTimeStateState$1(g51 g51Var, e eVar) {
        super(4, g51Var);
        this.d = eVar;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        long jLongValue3 = ((Number) obj3).longValue();
        PlayerViewModel$progressBarTimeStateState$1 playerViewModel$progressBarTimeStateState$1 = new PlayerViewModel$progressBarTimeStateState$1((g51) obj4, this.d);
        playerViewModel$progressBarTimeStateState$1.a = jLongValue;
        playerViewModel$progressBarTimeStateState$1.b = jLongValue2;
        playerViewModel$progressBarTimeStateState$1.c = jLongValue3;
        return playerViewModel$progressBarTimeStateState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return new zl6(j, j2 / j3, j3, ((PlayerMovieData) this.d.p.getValue()).b);
    }
}
