package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.js3;
import defpackage.lc6;
import defpackage.no6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vk7;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$catchRecommendationSeasons$1", f = "PlayerViewModel.kt", l = {1283}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$catchRecommendationSeasons$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$catchRecommendationSeasons$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$catchRecommendationSeasons$1 playerViewModel$catchRecommendationSeasons$1 = new PlayerViewModel$catchRecommendationSeasons$1(g51Var, this.c);
        playerViewModel$catchRecommendationSeasons$1.b = obj;
        return playerViewModel$catchRecommendationSeasons$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$catchRecommendationSeasons$1) create((lc6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lc6 lc6Var = (lc6) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        no6 no6Var = this.c.h;
        String str = lc6Var.a;
        List list = lc6Var.b;
        js3.p(str, "movieId");
        js3.p(list, "seasons");
        this.b = null;
        this.a = 1;
        ((vk7) no6Var.g).a.a.put(str, list);
        return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
