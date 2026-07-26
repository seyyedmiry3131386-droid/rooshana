package ir.myket.player.viewmodel;

import defpackage.a61;
import defpackage.b32;
import defpackage.b47;
import defpackage.bs2;
import defpackage.bt2;
import defpackage.ds2;
import defpackage.e85;
import defpackage.f88;
import defpackage.g51;
import defpackage.gf2;
import defpackage.h85;
import defpackage.js3;
import defpackage.kf1;
import defpackage.n85;
import defpackage.ob1;
import defpackage.pb1;
import defpackage.rp2;
import defpackage.sb6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.xe2;
import defpackage.yb6;
import defpackage.ze2;
import ir.myket.movie.common.domain.models.PlaySource;
import ir.myket.movie.common.model.repositories.MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1;
import ir.myket.movie.common.model.repositories.MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$2;
import ir.myket.movie.common.model.repositories.MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$3;
import ir.myket.movie.common.model.repositories.MovieWatchProgressRepositoryImpl$getMovieWatchProgressByPlayId$$inlined$safeDbCall$default$1;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1", f = "PlayerViewModel.kt", l = {191, 189}, m = "invokeSuspend", v = 1)
public final class PlayerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public ze2 e;
    public yb6 f;
    public String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1(g51 g51Var, e eVar) {
        super(3, g51Var);
        this.d = eVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1 playerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1 = new PlayerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1((g51) obj3, this.d);
        playerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1.b = (ze2) obj;
        playerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1.c = obj2;
        return playerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        yb6 yb6Var;
        Object objZ;
        String str;
        ze2 ze2Var;
        Long l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        e eVar = this.d;
        if (i == 0) {
            kotlin.b.b(obj);
            ze2 ze2Var2 = this.b;
            yb6Var = (yb6) this.c;
            String str2 = yb6Var.a.a;
            ds2 ds2Var = eVar.g;
            js3.p(str2, "playId");
            this.b = null;
            this.c = null;
            this.e = ze2Var2;
            this.f = yb6Var;
            this.g = str2;
            this.a = 1;
            n85 n85Var = (n85) ds2Var.g;
            ug1 ug1Var = up1.a;
            objZ = bt2.Z(kf1.c, new MovieWatchProgressRepositoryImpl$getMovieWatchProgressByPlayId$$inlined$safeDbCall$default$1(null, n85Var, str2), this);
            if (objZ != coroutineSingletons) {
                str = str2;
                ze2Var = ze2Var2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        String str3 = this.g;
        yb6Var = this.f;
        ze2 ze2Var3 = this.e;
        kotlin.b.b(obj);
        str = str3;
        ze2Var = ze2Var3;
        objZ = obj;
        pb1 pb1Var = (pb1) objZ;
        if (pb1Var instanceof ob1) {
            h85 h85Var = (h85) ((ob1) pb1Var).a;
            l = h85Var != null ? new Long(h85Var.c) : null;
        } else {
            l = new Long(0L);
        }
        int iV = b47.v(l != null ? l.longValue() : 0L);
        b32 b32Var = (b32) eVar.x.a.getValue();
        if (js3.i(b32Var != null ? b32Var.b : null, str)) {
            eVar.e(new sb6(true));
        }
        bs2 bs2Var = eVar.j;
        String str4 = yb6Var.a.c;
        PlaySource[] playSourceArr = PlaySource.a;
        js3.p(str, "playId");
        bs2Var.getClass();
        e85 e85Var = (e85) bs2Var.v;
        Map mapM = kotlin.collections.b.M(new Pair("playId", str));
        ir.myket.network.server.c cVar = e85Var.c;
        ug1 ug1Var2 = up1.a;
        kf1 kf1Var = kf1.c;
        for (String str5 : f88.z0("/movie-api/v1/play-info/{playId}/uri/", new char[]{'/'})) {
            if (!f88.n0(str5)) {
                xe2 xe2VarT = kotlinx.coroutines.flow.d.t(new gf2(new gf2(kotlinx.coroutines.flow.d.C(cVar.f, new MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1(cVar, str5, null, mapM, e85Var, iV, str4)), new MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$2(3, null), 1), new MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$3(2, null)), kf1Var);
                this.b = null;
                this.c = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.a = 2;
                kotlinx.coroutines.flow.d.o(ze2Var);
                Object objA = xe2VarT.a(new a61(ze2Var, eVar, str, yb6Var, 3), this);
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
