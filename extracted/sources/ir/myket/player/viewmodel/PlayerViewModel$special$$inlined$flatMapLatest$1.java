package ir.myket.player.viewmodel;

import defpackage.f88;
import defpackage.g51;
import defpackage.gf2;
import defpackage.hs2;
import defpackage.js3;
import defpackage.kf1;
import defpackage.rf6;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.xe2;
import defpackage.yx5;
import defpackage.yx6;
import defpackage.ze2;
import ir.myket.player.data.repositories.PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1;
import ir.myket.player.data.repositories.PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$2;
import ir.myket.player.data.repositories.PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$3;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$special$$inlined$flatMapLatest$1", f = "PlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 1)
public final class PlayerViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hs2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$special$$inlined$flatMapLatest$1(g51 g51Var, hs2 hs2Var) {
        super(3, g51Var);
        this.d = hs2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$special$$inlined$flatMapLatest$1 playerViewModel$special$$inlined$flatMapLatest$1 = new PlayerViewModel$special$$inlined$flatMapLatest$1((g51) obj3, this.d);
        playerViewModel$special$$inlined$flatMapLatest$1.b = (ze2) obj;
        playerViewModel$special$$inlined$flatMapLatest$1.c = obj2;
        return playerViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        ze2 ze2Var = this.b;
        yx6 yx6Var = (yx6) this.c;
        String str = yx6Var.b;
        String str2 = yx6Var.c;
        js3.p(str, "movieId");
        rf6 rf6Var = (rf6) this.d.v;
        Map mapM = kotlin.collections.b.M(new Pair("movieId", str));
        ir.myket.network.server.c cVar = rf6Var.b;
        ug1 ug1Var = up1.a;
        kf1 kf1Var = kf1.c;
        for (String str3 : f88.z0("/movie-api/v1/movies/{movieId}/player/recommendation/", new char[]{'/'})) {
            if (!f88.n0(str3)) {
                xe2 xe2VarT = kotlinx.coroutines.flow.d.t(new gf2(new gf2(kotlinx.coroutines.flow.d.C(cVar.f, new PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1(cVar, str3, null, mapM, rf6Var, str2)), new PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$2(3, null), 1), new PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$3(2, null)), kf1Var);
                this.b = null;
                this.c = null;
                this.a = 1;
                kotlinx.coroutines.flow.d.o(ze2Var);
                Object objA = xe2VarT.a(new yx5(ze2Var, 15), this);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.a;
                if (objA != coroutineSingletons2) {
                    objA = tx8Var;
                }
                if (objA != coroutineSingletons2) {
                    objA = tx8Var;
                }
                return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
