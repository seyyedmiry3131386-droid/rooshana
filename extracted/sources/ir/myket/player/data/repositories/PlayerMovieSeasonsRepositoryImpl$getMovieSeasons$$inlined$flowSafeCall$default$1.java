package ir.myket.player.data.repositories;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ue6;
import defpackage.ze2;
import ir.myket.network.server.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.data.repositories.PlayerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1", f = "PlayerMovieSeasonsRepositoryImpl.kt", l = {198, 59}, m = "invokeSuspend", v = 1)
public final class PlayerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1 extends SuspendLambda implements rp2 {
    public ze2 a;
    public int b;
    public int c;
    public /* synthetic */ ze2 d;
    public /* synthetic */ HashMap e;
    public final /* synthetic */ c f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Map h;
    public final /* synthetic */ ue6 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1(c cVar, String str, g51 g51Var, Map map, ue6 ue6Var) {
        super(3, g51Var);
        this.f = cVar;
        this.g = str;
        this.h = map;
        this.i = ue6Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        Map map = this.h;
        ue6 ue6Var = this.i;
        PlayerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1 playerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1 = new PlayerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1(this.f, this.g, (g51) obj3, map, ue6Var);
        playerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1.d = (ze2) obj;
        playerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1.e = (HashMap) obj2;
        return playerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        if (r1.emit(r2, r18) != r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.data.repositories.PlayerMovieSeasonsRepositoryImpl$getMovieSeasons$$inlined$flowSafeCall$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
