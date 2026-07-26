package ir.myket.player.viewmodel;

import defpackage.b32;
import defpackage.g51;
import defpackage.nn5;
import defpackage.on5;
import defpackage.pn5;
import defpackage.tb1;
import defpackage.tp2;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$nextEpisodeViewStateState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$nextEpisodeViewStateState$1 extends SuspendLambda implements tp2 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ b32 c;
    public /* synthetic */ boolean d;

    @Override // defpackage.tp2
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        PlayerViewModel$nextEpisodeViewStateState$1 playerViewModel$nextEpisodeViewStateState$1 = new PlayerViewModel$nextEpisodeViewStateState$1(5, (g51) obj5);
        playerViewModel$nextEpisodeViewStateState$1.a = zBooleanValue;
        playerViewModel$nextEpisodeViewStateState$1.b = zBooleanValue2;
        playerViewModel$nextEpisodeViewStateState$1.c = (b32) obj3;
        playerViewModel$nextEpisodeViewStateState$1.d = zBooleanValue3;
        return playerViewModel$nextEpisodeViewStateState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        b32 b32Var = this.c;
        boolean z3 = this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return z2 ? z ? new pn5(b32Var, z3) : new on5(b32Var) : nn5.a;
    }
}
