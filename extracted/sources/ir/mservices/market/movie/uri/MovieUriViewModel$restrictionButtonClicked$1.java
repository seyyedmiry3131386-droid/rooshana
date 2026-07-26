package ir.mservices.market.movie.uri;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.uri.MovieUriViewModel$restrictionButtonClicked$1", f = "MovieUriViewModel.kt", l = {206, 214, 218}, m = "invokeSuspend", v = 1)
final class MovieUriViewModel$restrictionButtonClicked$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MovieUriViewModel c;
    public final /* synthetic */ PlayerMovieData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieUriViewModel$restrictionButtonClicked$1(String str, MovieUriViewModel movieUriViewModel, PlayerMovieData playerMovieData, g51 g51Var) {
        super(2, g51Var);
        this.b = str;
        this.c = movieUriViewModel;
        this.d = playerMovieData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieUriViewModel$restrictionButtonClicked$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieUriViewModel$restrictionButtonClicked$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r0.emit(defpackage.q77.a, r6) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            ir.mservices.market.movie.uri.MovieUriViewModel r0 = r6.c
            kotlinx.coroutines.flow.i r0 = r0.G
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r6.a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1c
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlin.b.b(r7)
            goto L6e
        L20:
            kotlin.b.b(r7)
            java.lang.String r7 = "network_setting"
            java.lang.String r2 = r6.b
            boolean r7 = r2.equalsIgnoreCase(r7)
            if (r7 == 0) goto L38
            r6.a = r5
            q77 r7 = defpackage.q77.a
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L6e
            goto L6d
        L38:
            java.lang.String r7 = "dismiss"
            boolean r7 = r2.equalsIgnoreCase(r7)
            if (r7 != 0) goto L6e
            java.lang.String r7 = "play"
            boolean r7 = r2.equalsIgnoreCase(r7)
            if (r7 == 0) goto L5a
            ir.myket.player.domain.models.PlayerMovieData r7 = r6.d
            if (r7 == 0) goto L6e
            r77 r2 = new r77
            r2.<init>(r7)
            r6.a = r4
            java.lang.Object r7 = r0.emit(r2, r6)
            if (r7 != r1) goto L6e
            goto L6d
        L5a:
            boolean r7 = defpackage.f88.n0(r2)
            if (r7 != 0) goto L6e
            p77 r7 = new p77
            r7.<init>(r2)
            r6.a = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.uri.MovieUriViewModel$restrictionButtonClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
