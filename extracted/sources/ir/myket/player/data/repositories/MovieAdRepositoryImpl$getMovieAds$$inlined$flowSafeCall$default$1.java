package ir.myket.player.data.repositories;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wz4;
import defpackage.ze2;
import ir.myket.movie.common.domain.models.AdInfo;
import ir.myket.network.server.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1", f = "MovieAdRepositoryImpl.kt", l = {199, 59}, m = "invokeSuspend", v = 1)
public final class MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1 extends SuspendLambda implements rp2 {
    public ze2 a;
    public int b;
    public int c;
    public /* synthetic */ ze2 d;
    public /* synthetic */ HashMap e;
    public final /* synthetic */ c f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Map h;
    public final /* synthetic */ wz4 i;
    public final /* synthetic */ AdInfo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1(c cVar, String str, g51 g51Var, Map map, wz4 wz4Var, AdInfo adInfo) {
        super(3, g51Var);
        this.f = cVar;
        this.g = str;
        this.h = map;
        this.i = wz4Var;
        this.j = adInfo;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        wz4 wz4Var = this.i;
        AdInfo adInfo = this.j;
        MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1 movieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1 = new MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1(this.f, this.g, (g51) obj3, this.h, wz4Var, adInfo);
        movieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1.d = (ze2) obj;
        movieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1.e = (HashMap) obj2;
        return movieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x021a, code lost:
    
        if (r4.emit(r5, r33) != r3) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.data.repositories.MovieAdRepositoryImpl$getMovieAds$$inlined$flowSafeCall$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
