package ir.mservices.market.download.movie.model;

import defpackage.dp2;
import defpackage.g51;
import defpackage.nc2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.movie.model.MovieInfoRepositoryImpl$getMoviesInfo$2$1", f = "MovieInfoRepositoryImpl.kt", l = {34}, m = "invokeSuspend", v = 1)
final class MovieInfoRepositoryImpl$getMoviesInfo$2$1 extends SuspendLambda implements dp2 {
    public List a;
    public int b;
    public final /* synthetic */ nc2 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieInfoRepositoryImpl$getMoviesInfo$2$1(nc2 nc2Var, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.c = nc2Var;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieInfoRepositoryImpl$getMoviesInfo$2$1(this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieInfoRepositoryImpl$getMoviesInfo$2$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        r1.add(new ir.mservices.market.download.movie.data.MovieDownloadInfoData(r2, r4));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.movie.model.MovieInfoRepositoryImpl$getMoviesInfo$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
