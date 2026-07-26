package ir.myket.player.viewmodel;

import defpackage.b32;
import defpackage.g51;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$showNextEpisodeState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$showNextEpisodeState$1 extends SuspendLambda implements sp2 {
    public /* synthetic */ long a;
    public /* synthetic */ PlayerMovieData b;
    public /* synthetic */ b32 c;
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$showNextEpisodeState$1(g51 g51Var, e eVar) {
        super(4, g51Var);
        this.d = eVar;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        PlayerViewModel$showNextEpisodeState$1 playerViewModel$showNextEpisodeState$1 = new PlayerViewModel$showNextEpisodeState$1((g51) obj4, this.d);
        playerViewModel$showNextEpisodeState$1.a = jLongValue;
        playerViewModel$showNextEpisodeState$1.b = (PlayerMovieData) obj2;
        playerViewModel$showNextEpisodeState$1.c = (b32) obj3;
        return playerViewModel$showNextEpisodeState$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            long r0 = r6.a
            ir.myket.player.domain.models.PlayerMovieData r2 = r6.b
            b32 r3 = r6.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            kotlin.b.b(r7)
            if (r3 == 0) goto L49
            ir.myket.movie.common.domain.models.MovieUri r7 = r2.a
            ir.myket.movie.common.domain.models.Credits r7 = r7.j
            if (r7 == 0) goto L49
            ir.myket.player.viewmodel.e r2 = r6.d
            androidx.media3.exoplayer.ExoPlayer r2 = r2.d
            e62 r2 = (defpackage.e62) r2
            long r2 = r2.getDuration()
            ir.myket.movie.common.domain.models.MovieCredit r7 = r7.b
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L26
            goto L49
        L26:
            if (r7 == 0) goto L33
            int r7 = r7.a
            if (r7 == 0) goto L33
            int r0 = defpackage.b47.v(r0)
            if (r0 < r7) goto L49
            goto L47
        L33:
            int r7 = defpackage.b47.v(r0)
            double r0 = (double) r7
            int r7 = defpackage.b47.v(r2)
            double r2 = (double) r7
            r4 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r2 = r2 * r4
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L49
        L47:
            r7 = 1
            goto L4a
        L49:
            r7 = 0
        L4a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.viewmodel.PlayerViewModel$showNextEpisodeState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
