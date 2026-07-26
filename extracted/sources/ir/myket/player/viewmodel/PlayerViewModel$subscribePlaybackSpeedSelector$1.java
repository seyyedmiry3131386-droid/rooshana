package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.gc6;
import defpackage.o80;
import defpackage.rp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wa6;
import defpackage.xc6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribePlaybackSpeedSelector$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribePlaybackSpeedSelector$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ gc6 a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribePlaybackSpeedSelector$1(g51 g51Var, e eVar) {
        super(3, g51Var);
        this.b = eVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$subscribePlaybackSpeedSelector$1 playerViewModel$subscribePlaybackSpeedSelector$1 = new PlayerViewModel$subscribePlaybackSpeedSelector$1((g51) obj3, this.b);
        playerViewModel$subscribePlaybackSpeedSelector$1.a = (gc6) obj;
        return playerViewModel$subscribePlaybackSpeedSelector$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gc6 gc6Var = this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e eVar = this.b;
        ((o80) eVar.d).t0(gc6Var.a);
        xc6 xc6Var = (xc6) eVar.B.a.getValue();
        float f = gc6Var.a;
        ((s08) xc6Var.h).setValue(new wa6(f));
        return new wa6(f);
    }
}
