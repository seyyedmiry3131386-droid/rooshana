package ir.myket.player.viewmodel;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.b47;
import defpackage.e62;
import defpackage.g51;
import defpackage.pj3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.movie.common.domain.models.AdInfo;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$watchedPlaybackPositionState$2", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$watchedPlaybackPositionState$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$watchedPlaybackPositionState$2(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$watchedPlaybackPositionState$2 playerViewModel$watchedPlaybackPositionState$2 = new PlayerViewModel$watchedPlaybackPositionState$2(g51Var, this.b);
        playerViewModel$watchedPlaybackPositionState$2.a = obj;
        return playerViewModel$watchedPlaybackPositionState$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$watchedPlaybackPositionState$2 playerViewModel$watchedPlaybackPositionState$2 = (PlayerViewModel$watchedPlaybackPositionState$2) create((Long) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$watchedPlaybackPositionState$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pj3 pj3Var;
        AdInfo adInfo;
        e eVar = this.b;
        ExoPlayer exoPlayer = eVar.d;
        Long l = (Long) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (l == null || !((pj3Var = ((PlayerMovieData) eVar.q.a.getValue()).a.h) == null || (adInfo = (AdInfo) kotlin.collections.a.p0(pj3Var)) == null || b47.v(l.longValue()) != adInfo.a)) {
            ((e62) exoPlayer).C(false);
            eVar.n = true;
        } else {
            eVar.o.add(new Integer(-1));
            ((e62) exoPlayer).C(true);
            eVar.n = false;
        }
        return tx8.a;
    }
}
