package ir.mservices.market.movie.ui.detail.model;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pa2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.model.MovieDetailRepositoryImp$getMovieFullDto$1$1", f = "MovieDetailRepositoryImp.kt", l = {35}, m = "invokeSuspend", v = 1)
final class MovieDetailRepositoryImp$getMovieFullDto$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ pa2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRepositoryImp$getMovieFullDto$1$1(pa2 pa2Var, String str, String str2, String str3, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = pa2Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRepositoryImp$getMovieFullDto$1$1(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieDetailRepositoryImp$getMovieFullDto$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.model.MovieDetailRepositoryImp$getMovieFullDto$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
