package ir.myket.player.viewmodel;

import defpackage.cc6;
import defpackage.g51;
import defpackage.o80;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb6;
import defpackage.zl6;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$checkSampleWatchLimitation$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$checkSampleWatchLimitation$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$checkSampleWatchLimitation$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$checkSampleWatchLimitation$1 playerViewModel$checkSampleWatchLimitation$1 = new PlayerViewModel$checkSampleWatchLimitation$1(g51Var, this.b);
        playerViewModel$checkSampleWatchLimitation$1.a = obj;
        return playerViewModel$checkSampleWatchLimitation$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$checkSampleWatchLimitation$1 playerViewModel$checkSampleWatchLimitation$1 = (PlayerViewModel$checkSampleWatchLimitation$1) create((zl6) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$checkSampleWatchLimitation$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zl6 zl6Var = (zl6) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (zl6Var.a >= 600000) {
            e eVar = this.b;
            ((o80) eVar.d).b();
            eVar.e(new cc6(600000L));
            eVar.e(new wb6((PlayerMovieData) eVar.q.a.getValue()));
        }
        return tx8.a;
    }
}
