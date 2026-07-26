package ir.mservices.market.movie.ui.home.model;

import defpackage.g51;
import defpackage.pa2;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.home.model.MovieHomeRepositoryImpl$getHome$1$1", f = "MovieHomeRepositoryImpl.kt", l = {35}, m = "invokeSuspend", v = 1)
final class MovieHomeRepositoryImpl$getHome$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ pa2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeRepositoryImpl$getHome$1$1(pa2 pa2Var, String str, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = pa2Var;
        this.e = str;
        this.f = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        String str = this.e;
        Object obj5 = this.f;
        MovieHomeRepositoryImpl$getHome$1$1 movieHomeRepositoryImpl$getHome$1$1 = new MovieHomeRepositoryImpl$getHome$1$1(this.d, str, obj5, (g51) obj4);
        movieHomeRepositoryImpl$getHome$1$1.b = iIntValue;
        movieHomeRepositoryImpl$getHome$1$1.c = iIntValue2;
        return movieHomeRepositoryImpl$getHome$1$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.home.model.MovieHomeRepositoryImpl$getHome$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
