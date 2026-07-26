package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.hb6;
import defpackage.js3;
import defpackage.qn5;
import defpackage.rn5;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zl6;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeAutoPlayNextEpisode$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeAutoPlayNextEpisode$1 extends SuspendLambda implements sp2 {
    public /* synthetic */ zl6 a;
    public /* synthetic */ PlayerMovieData b;
    public /* synthetic */ rn5 c;
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeAutoPlayNextEpisode$1(g51 g51Var, e eVar) {
        super(4, g51Var);
        this.d = eVar;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        PlayerViewModel$subscribeAutoPlayNextEpisode$1 playerViewModel$subscribeAutoPlayNextEpisode$1 = new PlayerViewModel$subscribeAutoPlayNextEpisode$1((g51) obj4, this.d);
        playerViewModel$subscribeAutoPlayNextEpisode$1.a = (zl6) obj;
        playerViewModel$subscribeAutoPlayNextEpisode$1.b = (PlayerMovieData) obj2;
        playerViewModel$subscribeAutoPlayNextEpisode$1.c = (rn5) obj3;
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribeAutoPlayNextEpisode$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zl6 zl6Var = this.a;
        PlayerMovieData playerMovieData = this.b;
        rn5 rn5Var = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if ((rn5Var instanceof qn5) && js3.i(playerMovieData.b, zl6Var.d) && Math.abs(zl6Var.c - zl6Var.a) < 1000) {
            this.d.e(new hb6(((qn5) rn5Var).a().b));
        }
        return tx8.a;
    }
}
