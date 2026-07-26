package androidx.paging;

import defpackage.a06;
import defpackage.az5;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", l = {137, 153, 165, 168, 223, 226}, m = "invokeSuspend", v = 1)
final class PagingDataPresenter$collectFrom$2$1$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ az5 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ a06 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$collectFrom$2$1$2(az5 az5Var, a aVar, a06 a06Var, g51 g51Var) {
        super(2, g51Var);
        this.b = az5Var;
        this.c = aVar;
        this.d = a06Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PagingDataPresenter$collectFrom$2$1$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagingDataPresenter$collectFrom$2$1$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r15 == r0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (androidx.paging.a.a(r1, r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r15.c(r1, r14) != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        if (r15.c(r1, r14) != r0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025f A[LOOP:2: B:126:0x0259->B:128:0x025f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[PHI: r9
      0x00b4: PHI (r9v6 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
      (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
      (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
      (r9v7 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
     binds: [B:29:0x00a7, B:31:0x00b0, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199 A[PHI: r9
      0x0199: PHI (r9v10 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
      (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
      (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
      (r9v11 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
     binds: [B:80:0x018d, B:82:0x0196, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter$collectFrom$2$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
