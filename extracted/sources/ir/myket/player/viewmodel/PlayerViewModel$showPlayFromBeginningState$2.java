package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.tb1;
import defpackage.tp2;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$showPlayFromBeginningState$2", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$showPlayFromBeginningState$2 extends SuspendLambda implements tp2 {
    public /* synthetic */ long a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    @Override // defpackage.tp2
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        ((Boolean) obj4).getClass();
        PlayerViewModel$showPlayFromBeginningState$2 playerViewModel$showPlayFromBeginningState$2 = new PlayerViewModel$showPlayFromBeginningState$2(5, (g51) obj5);
        playerViewModel$showPlayFromBeginningState$2.a = jLongValue;
        playerViewModel$showPlayFromBeginningState$2.b = zBooleanValue;
        playerViewModel$showPlayFromBeginningState$2.c = zBooleanValue2;
        return playerViewModel$showPlayFromBeginningState$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return Boolean.valueOf((z || z2 || j <= 0) ? false : true);
    }
}
