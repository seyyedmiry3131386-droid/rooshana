package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.hb6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xf6;
import defpackage.yb6;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeChangeEpisode$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeChangeEpisode$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeChangeEpisode$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$subscribeChangeEpisode$1 playerViewModel$subscribeChangeEpisode$1 = new PlayerViewModel$subscribeChangeEpisode$1(g51Var, this.b);
        playerViewModel$subscribeChangeEpisode$1.a = obj;
        return playerViewModel$subscribeChangeEpisode$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$subscribeChangeEpisode$1 playerViewModel$subscribeChangeEpisode$1 = (PlayerViewModel$subscribeChangeEpisode$1) create((hb6) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribeChangeEpisode$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hb6 hb6Var = (hb6) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        String str = hb6Var.a;
        e eVar = this.b;
        rv6 rv6Var = eVar.q;
        eVar.e(new yb6(new xf6(str, ((PlayerMovieData) rv6Var.a.getValue()).d, ((PlayerMovieData) rv6Var.a.getValue()).c, 24)));
        return tx8.a;
    }
}
