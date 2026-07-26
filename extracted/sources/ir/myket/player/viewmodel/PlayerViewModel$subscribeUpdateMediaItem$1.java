package ir.myket.player.viewmodel;

import android.net.Uri;
import android.os.Bundle;
import defpackage.b32;
import defpackage.e62;
import defpackage.f88;
import defpackage.g51;
import defpackage.gb6;
import defpackage.jp4;
import defpackage.js3;
import defpackage.o80;
import defpackage.pp4;
import defpackage.qp4;
import defpackage.tb1;
import defpackage.tp2;
import defpackage.tx8;
import defpackage.xc6;
import defpackage.xo4;
import ir.myket.player.domain.models.PlayerMovie;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeUpdateMediaItem$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeUpdateMediaItem$1 extends SuspendLambda implements tp2 {
    public /* synthetic */ PlayerMovieData a;
    public /* synthetic */ b32 b;
    public /* synthetic */ xc6 c;
    public /* synthetic */ Long d;
    public final /* synthetic */ e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeUpdateMediaItem$1(g51 g51Var, e eVar) {
        super(5, g51Var);
        this.e = eVar;
    }

    @Override // defpackage.tp2
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        PlayerViewModel$subscribeUpdateMediaItem$1 playerViewModel$subscribeUpdateMediaItem$1 = new PlayerViewModel$subscribeUpdateMediaItem$1((g51) obj5, this.e);
        playerViewModel$subscribeUpdateMediaItem$1.a = (PlayerMovieData) obj;
        playerViewModel$subscribeUpdateMediaItem$1.b = (b32) obj2;
        playerViewModel$subscribeUpdateMediaItem$1.c = (xc6) obj3;
        playerViewModel$subscribeUpdateMediaItem$1.d = (Long) obj4;
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribeUpdateMediaItem$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        PlayerMovieData playerMovieData = this.a;
        b32 b32Var = this.b;
        xc6 xc6Var = this.c;
        Long l = this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (!f88.n0(xc6Var.b) && l != null) {
            PlayerMovie playerMovie = playerMovieData.d;
            String str2 = playerMovie.c;
            if (b32Var != null) {
                str2 = b32Var.c;
                str = str2;
            } else {
                str = "-";
            }
            gb6 gb6Var = this.e.d;
            String str3 = playerMovieData.b;
            String str4 = playerMovie.d;
            Bundle bundle = new Bundle();
            bundle.putParcelable("KEY_PLAYER_MOVIE_DATA", playerMovieData);
            js3.p(gb6Var, "<this>");
            js3.p(str2, "title");
            js3.p(str4, "posterUrl");
            js3.p(str3, "mediaId");
            js3.p(str, "artist");
            o80 o80Var = (o80) gb6Var;
            jp4 jp4VarE = o80Var.E();
            if (jp4VarE != null) {
                int iM = ((e62) gb6Var).M();
                pp4 pp4VarA = jp4VarE.d.a();
                pp4VarA.a = str2;
                pp4VarA.b = str;
                pp4VarA.m = Uri.parse(str4);
                pp4VarA.H = bundle;
                qp4 qp4Var = new qp4(pp4VarA);
                xo4 xo4VarA = jp4VarE.a();
                xo4VarA.a = str3;
                xo4VarA.k = qp4Var;
                o80Var.T(iM, xo4VarA.a());
            }
        }
        return tx8.a;
    }
}
