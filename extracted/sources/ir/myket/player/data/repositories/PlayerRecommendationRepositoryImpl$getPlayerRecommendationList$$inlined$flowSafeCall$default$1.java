package ir.myket.player.data.repositories;

import defpackage.g51;
import defpackage.rf6;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import ir.myket.network.server.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.data.repositories.PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1", f = "PlayerRecommendationRepositoryImpl.kt", l = {198, 59}, m = "invokeSuspend", v = 1)
public final class PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1 extends SuspendLambda implements rp2 {
    public ze2 a;
    public int b;
    public int c;
    public /* synthetic */ ze2 d;
    public /* synthetic */ HashMap e;
    public final /* synthetic */ c f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Map h;
    public final /* synthetic */ rf6 i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1(c cVar, String str, g51 g51Var, Map map, rf6 rf6Var, String str2) {
        super(3, g51Var);
        this.f = cVar;
        this.g = str;
        this.h = map;
        this.i = rf6Var;
        this.j = str2;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        rf6 rf6Var = this.i;
        String str = this.j;
        PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1 playerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1 = new PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1(this.f, this.g, (g51) obj3, this.h, rf6Var, str);
        playerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1.d = (ze2) obj;
        playerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1.e = (HashMap) obj2;
        return playerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x018b, code lost:
    
        if (r1.emit(r2, r26) != r3) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, ze2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.data.repositories.PlayerRecommendationRepositoryImpl$getPlayerRecommendationList$$inlined$flowSafeCall$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
