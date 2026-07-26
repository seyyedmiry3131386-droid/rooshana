package ir.myket.player.viewmodel;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.bt2;
import defpackage.e62;
import defpackage.g51;
import defpackage.h85;
import defpackage.kf1;
import defpackage.lo3;
import defpackage.n85;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.zb6;
import ir.myket.movie.common.model.repositories.MovieWatchProgressRepositoryImpl$insertMovieWatchProgress$$inlined$safeDbCall$default$1;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeMovieWatchProgressSaver$1", f = "PlayerViewModel.kt", l = {1261}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeMovieWatchProgressSaver$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeMovieWatchProgressSaver$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerViewModel$subscribeMovieWatchProgressSaver$1(g51Var, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$subscribeMovieWatchProgressSaver$1) create((zb6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.b;
            PlayerMovieData playerMovieData = (PlayerMovieData) eVar.p.getValue();
            ExoPlayer exoPlayer = eVar.d;
            if (((e62) exoPlayer).d0() > 3000 && !playerMovieData.a() && playerMovieData.a.k == null) {
                lo3 lo3Var = eVar.k;
                e62 e62Var = (e62) exoPlayer;
                h85 h85Var = new h85(e62Var.d0() - 3000, e62Var.getDuration(), System.currentTimeMillis(), playerMovieData.b, playerMovieData.d.a);
                this.a = 1;
                n85 n85Var = (n85) lo3Var.g;
                ug1 ug1Var = up1.a;
                if (bt2.Z(kf1.c, new MovieWatchProgressRepositoryImpl$insertMovieWatchProgress$$inlined$safeDbCall$default$1(null, n85Var, h85Var), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
