package ir.mservices.market.movie.ui.detail;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$toggleBookmark$1$1", f = "MovieDetailViewModel.kt", l = {464, 466}, m = "invokeSuspend", v = 1)
final class MovieDetailViewModel$toggleBookmark$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDetailViewModel b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailViewModel$toggleBookmark$1$1(MovieDetailViewModel movieDetailViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDetailViewModel;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailViewModel$toggleBookmark$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailViewModel$toggleBookmark$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r6.deleteBookmark(r4, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r6.addBookmark(r4, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.b.b(r6)
            goto L36
        L19:
            kotlin.b.b(r6)
            ir.mservices.market.movie.ui.detail.MovieDetailViewModel r6 = r5.b
            boolean r1 = r6.O
            java.lang.String r4 = r5.c
            if (r1 == 0) goto L2d
            r5.a = r3
            java.lang.Object r6 = ir.mservices.market.movie.ui.detail.MovieDetailViewModel.u(r6, r4, r5)
            if (r6 != r0) goto L36
            goto L35
        L2d:
            r5.a = r2
            java.lang.Object r6 = ir.mservices.market.movie.ui.detail.MovieDetailViewModel.t(r6, r4, r5)
            if (r6 != r0) goto L36
        L35:
            return r0
        L36:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$toggleBookmark$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
