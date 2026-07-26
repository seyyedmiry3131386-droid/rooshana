package ir.myket.player.viewmodel;

import defpackage.dt3;
import defpackage.et3;
import defpackage.ft3;
import defpackage.g51;
import defpackage.js3;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yx6;
import defpackage.zl6;
import ir.myket.movie.common.domain.models.RecommendationTime;
import ir.myket.player.domain.models.PlayerMovie;
import ir.myket.player.domain.models.PlayerMovieData;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$recommendationStateState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$recommendationStateState$1 extends SuspendLambda implements sp2 {
    public /* synthetic */ zl6 a;
    public /* synthetic */ PlayerMovieData b;
    public /* synthetic */ String c;

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        PlayerViewModel$recommendationStateState$1 playerViewModel$recommendationStateState$1 = new PlayerViewModel$recommendationStateState$1(4, (g51) obj4);
        playerViewModel$recommendationStateState$1.a = (zl6) obj;
        playerViewModel$recommendationStateState$1.b = (PlayerMovieData) obj2;
        playerViewModel$recommendationStateState$1.c = (String) obj3;
        return playerViewModel$recommendationStateState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zl6 zl6Var = this.a;
        PlayerMovieData playerMovieData = this.b;
        String str = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        boolean zB = playerMovieData.b();
        PlayerMovie playerMovie = playerMovieData.d;
        if ((zB && str == null) || playerMovieData.a()) {
            return new yx6(playerMovie.a, 4);
        }
        if (!js3.i(zl6Var.d, playerMovieData.b)) {
            return new yx6(playerMovie.a, 4);
        }
        RecommendationTime recommendationTime = playerMovieData.a.i;
        long j = zl6Var.a;
        long j2 = zl6Var.c;
        js3.p(recommendationTime, "<this>");
        ft3 dt3Var = et3.a;
        if (j2 > 0) {
            if (j >= j2 - ((long) 500)) {
                dt3Var = new dt3(true);
            } else {
                long millis = TimeUnit.SECONDS.toMillis(recommendationTime.a);
                if (j2 <= millis) {
                    millis = (long) (j2 * 0.95d);
                }
                if (j >= millis) {
                    dt3Var = new dt3(false);
                }
            }
        }
        return new yx6(dt3Var, playerMovie.a, str);
    }
}
