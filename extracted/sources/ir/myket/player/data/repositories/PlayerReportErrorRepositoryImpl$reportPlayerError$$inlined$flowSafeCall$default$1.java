package ir.myket.player.data.repositories;

import defpackage.bn5;
import defpackage.cp7;
import defpackage.g51;
import defpackage.js8;
import defpackage.q47;
import defpackage.rp2;
import defpackage.sf6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uf6;
import defpackage.ze2;
import ir.myket.network.server.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.data.repositories.PlayerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1", f = "PlayerReportErrorRepositoryImpl.kt", l = {198, 59}, m = "invokeSuspend", v = 1)
public final class PlayerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1 extends SuspendLambda implements rp2 {
    public ze2 a;
    public int b;
    public int c;
    public /* synthetic */ ze2 d;
    public /* synthetic */ HashMap e;
    public final /* synthetic */ c f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ uf6 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1(c cVar, String str, g51 g51Var, Map map, uf6 uf6Var, int i, String str2) {
        super(3, g51Var);
        this.f = cVar;
        this.g = str;
        this.h = map;
        this.i = uf6Var;
        this.j = i;
        this.k = str2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        String str = this.k;
        PlayerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1 playerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1 = new PlayerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1(this.f, this.g, (g51) obj3, this.h, this.i, i, str);
        playerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1.d = (ze2) obj;
        playerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1.e = (HashMap) obj2;
        return playerReportErrorRepositoryImpl$reportPlayerError$$inlined$flowSafeCall$default$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        ze2 ze2Var = this.d;
        HashMap map = this.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = this.c;
        tx8 tx8Var = tx8.a;
        if (i2 == 0) {
            b.b(obj);
            cp7 cp7Var = (cp7) map.get(this.f.b(this.g));
            String str = cp7Var != null ? cp7Var.f : null;
            if (str != null) {
                String strConcat = str.concat(js8.n(this.h, "/movie-api/v1/movies/{movieId}/{playId}/report/"));
                sf6 sf6Var = this.i.a;
                q47 q47Var = new q47(this.j, this.k);
                this.d = null;
                this.e = null;
                this.a = ze2Var;
                i = 0;
                this.b = 0;
                this.c = 1;
                if (sf6Var.a(strConcat, q47Var, this) != coroutineSingletons) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        int i3 = this.b;
        ze2 ze2Var2 = this.a;
        b.b(obj);
        i = i3;
        ze2Var = ze2Var2;
        bn5 bn5Var = new bn5(tx8Var);
        this.d = null;
        this.e = null;
        this.a = null;
        this.b = i;
        this.c = 2;
        return ze2Var.emit(bn5Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
