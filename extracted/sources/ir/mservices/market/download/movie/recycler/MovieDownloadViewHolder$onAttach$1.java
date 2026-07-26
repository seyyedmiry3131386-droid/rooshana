package ir.mservices.market.download.movie.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.movie.recycler.MovieDownloadViewHolder$onAttach$1", f = "MovieDownload.kt", l = {156, 156}, m = "invokeSuspend", v = 1)
final class MovieDownloadViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MovieDownloadData c;
    public final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadViewHolder$onAttach$1(MovieDownloadData movieDownloadData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.c = movieDownloadData;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MovieDownloadViewHolder$onAttach$1 movieDownloadViewHolder$onAttach$1 = new MovieDownloadViewHolder$onAttach$1(this.c, this.d, g51Var);
        movieDownloadViewHolder$onAttach$1.b = obj;
        return movieDownloadViewHolder$onAttach$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MovieDownloadViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (((defpackage.v48) r8).a(r0, r7) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r7.a
            r3 = 0
            ir.mservices.market.download.movie.recycler.MovieDownloadData r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L23
            if (r2 == r6) goto L1f
            if (r2 == r5) goto L1b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.b.b(r8)
            goto L47
        L1f:
            kotlin.b.b(r8)
            goto L33
        L23:
            kotlin.b.b(r8)
            rv6 r8 = r4.e
            r7.b = r3
            r7.a = r6
            java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r0, r7)
            if (r8 != r1) goto L33
            goto L46
        L33:
            v48 r8 = (defpackage.v48) r8
            w25 r0 = new w25
            ir.mservices.market.download.movie.recycler.a r2 = r7.d
            r0.<init>(r2, r4)
            r7.b = r3
            r7.a = r5
            java.lang.Object r8 = r8.a(r0, r7)
            if (r8 != r1) goto L47
        L46:
            return r1
        L47:
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.movie.recycler.MovieDownloadViewHolder$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
