package ir.myket.movie.common.model.repositories;

import defpackage.e85;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import ir.myket.movie.common.domain.models.PlaySource;
import ir.myket.network.server.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.movie.common.model.repositories.MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1", f = "MovieUriRepositoryImpl.kt", l = {198, 59}, m = "invokeSuspend", v = 1)
public final class MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1 extends SuspendLambda implements rp2 {
    public ze2 a;
    public int b;
    public int c;
    public /* synthetic */ ze2 d;
    public /* synthetic */ HashMap e;
    public final /* synthetic */ c f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Map h;
    public final /* synthetic */ e85 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1(c cVar, String str, g51 g51Var, Map map, e85 e85Var, int i, String str2) {
        super(3, g51Var);
        PlaySource[] playSourceArr = PlaySource.a;
        this.f = cVar;
        this.g = str;
        this.h = map;
        this.i = e85Var;
        this.j = i;
        this.k = str2;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        g51 g51Var = (g51) obj3;
        PlaySource[] playSourceArr = PlaySource.a;
        MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1 movieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1 = new MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1(this.f, this.g, g51Var, this.h, this.i, this.j, this.k);
        movieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1.d = (ze2) obj;
        movieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1.e = (HashMap) obj2;
        return movieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
    
        if (r8.emit(r0, r36) != r9) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.movie.common.model.repositories.MovieUriRepositoryImpl$getMovieUri$$inlined$flowSafeCall$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
