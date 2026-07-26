package ir.myket.player.viewmodel;

import defpackage.b47;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zl6;
import ir.myket.movie.common.domain.models.Credits;
import ir.myket.movie.common.domain.models.MovieCredit;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$showSkipCreditsState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$showSkipCreditsState$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ zl6 a;
    public /* synthetic */ PlayerMovieData b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$showSkipCreditsState$1 playerViewModel$showSkipCreditsState$1 = new PlayerViewModel$showSkipCreditsState$1(3, (g51) obj3);
        playerViewModel$showSkipCreditsState$1.a = (zl6) obj;
        playerViewModel$showSkipCreditsState$1.b = (PlayerMovieData) obj2;
        return playerViewModel$showSkipCreditsState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zl6 zl6Var = this.a;
        PlayerMovieData playerMovieData = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        Credits credits = playerMovieData.a.j;
        boolean z = false;
        if (credits != null) {
            long j = zl6Var.a;
            MovieCredit movieCredit = credits.a;
            if (movieCredit != null) {
                int i = movieCredit.a;
                int i2 = movieCredit.b;
                int iV = b47.v(j);
                if (i <= iV && iV < i2) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
