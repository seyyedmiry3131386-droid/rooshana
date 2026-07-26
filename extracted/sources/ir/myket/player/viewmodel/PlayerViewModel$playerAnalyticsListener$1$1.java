package ir.myket.player.viewmodel;

import defpackage.ag6;
import defpackage.b47;
import defpackage.e62;
import defpackage.e71;
import defpackage.eo7;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.domain.models.PlayerType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$playerAnalyticsListener$1$1", f = "PlayerViewModel.kt", l = {915}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$playerAnalyticsListener$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ ir.myket.analytics.spix.domain.usecase.a c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$playerAnalyticsListener$1$1(e eVar, ir.myket.analytics.spix.domain.usecase.a aVar, String str, String str2, int i, String str3, g51 g51Var) {
        super(2, g51Var);
        this.b = eVar;
        this.c = aVar;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerViewModel$playerAnalyticsListener$1$1(this.b, this.c, this.d, this.e, this.f, this.g, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$playerAnalyticsListener$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.b;
            PlayerMovieData playerMovieData = (PlayerMovieData) eVar.p.getValue();
            String str = playerMovieData.d.a;
            String str2 = playerMovieData.b;
            String str3 = (String) playerMovieData.a.a.get(eVar.m);
            MovieType movieType = playerMovieData.d.e;
            js3.p(movieType, "<this>");
            eo7 eo7Var = new eo7(new ag6(str, str2, str3, (movieType == MovieType.c ? PlayerType.b : PlayerType.a).name(), b47.v(((e62) eVar.d).d0()), this.d, this.e, this.f, this.g));
            this.a = 1;
            if (this.c.z0(eo7Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
