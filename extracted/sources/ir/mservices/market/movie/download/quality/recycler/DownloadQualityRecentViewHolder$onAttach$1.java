package ir.mservices.market.movie.download.quality.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentViewHolder$onAttach$1", f = "DownloadQualityRecent.kt", l = {71, 71}, m = "invokeSuspend", v = 1)
final class DownloadQualityRecentViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DownloadQualityRecentData c;
    public final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadQualityRecentViewHolder$onAttach$1(DownloadQualityRecentData downloadQualityRecentData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.c = downloadQualityRecentData;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DownloadQualityRecentViewHolder$onAttach$1 downloadQualityRecentViewHolder$onAttach$1 = new DownloadQualityRecentViewHolder$onAttach$1(this.c, this.d, g51Var);
        downloadQualityRecentViewHolder$onAttach$1.b = obj;
        return downloadQualityRecentViewHolder$onAttach$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((DownloadQualityRecentViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (((defpackage.v48) r7).a(r0, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r6.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 == r4) goto L19
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.b.b(r7)
            goto L49
        L1d:
            kotlin.b.b(r7)
            goto L33
        L21:
            kotlin.b.b(r7)
            ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentData r7 = r6.c
            xe2 r7 = r7.a
            r6.b = r3
            r6.a = r5
            java.lang.Object r7 = kotlinx.coroutines.flow.d.B(r7, r0, r6)
            if (r7 != r1) goto L33
            goto L48
        L33:
            v48 r7 = (defpackage.v48) r7
            r4 r0 = new r4
            ir.mservices.market.movie.download.quality.recycler.a r2 = r6.d
            r5 = 22
            r0.<init>(r5, r2)
            r6.b = r3
            r6.a = r4
            java.lang.Object r7 = r7.a(r0, r6)
            if (r7 != r1) goto L49
        L48:
            return r1
        L49:
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentViewHolder$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
