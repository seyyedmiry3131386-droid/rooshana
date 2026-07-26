package ir.mservices.market.search.history.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel$removeAllFromDb$1", f = "SearchViewModel.kt", l = {445, 446, 447, 452}, m = "invokeSuspend", v = 1)
final class SearchViewModel$removeAllFromDb$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SearchViewModel b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$removeAllFromDb$1(SearchViewModel searchViewModel, int i, g51 g51Var) {
        super(2, g51Var);
        this.b = searchViewModel;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchViewModel$removeAllFromDb$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchViewModel$removeAllFromDb$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (kotlinx.coroutines.a.e(1100, r7) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            ir.mservices.market.search.history.ui.SearchViewModel r6 = r7.b
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.b.b(r8)
            goto L95
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.b.b(r8)
            goto L81
        L25:
            kotlin.b.b(r8)
            goto L6f
        L29:
            kotlin.b.b(r8)
            goto L53
        L2d:
            kotlin.b.b(r8)
            rv6 r8 = r6.E
            v48 r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "movie"
            boolean r1 = defpackage.js3.i(r8, r1)
            if (r1 == 0) goto L56
            hh2 r8 = r6.z
            r7.a = r5
            java.lang.Object r8 = r8.c
            k65 r8 = (defpackage.k65) r8
            y2 r8 = (defpackage.y2) r8
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L53
            goto L94
        L53:
            x38 r8 = (defpackage.x38) r8
            goto L83
        L56:
            java.lang.String r1 = "app"
            boolean r8 = defpackage.js3.i(r8, r1)
            if (r8 == 0) goto L72
            qq4 r8 = r6.y
            r7.a = r4
            java.lang.Object r8 = r8.b
            ad8 r8 = (defpackage.ad8) r8
            y2 r8 = (defpackage.y2) r8
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L6f
            goto L94
        L6f:
            x38 r8 = (defpackage.x38) r8
            goto L83
        L72:
            x19 r8 = r6.A
            r7.a = r3
            v19 r8 = r8.b
            y2 r8 = (defpackage.y2) r8
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L81
            goto L94
        L81:
            x38 r8 = (defpackage.x38) r8
        L83:
            boolean r8 = r8 instanceof defpackage.w38
            if (r8 == 0) goto La9
            ir.mservices.market.search.history.ui.SearchViewModel.D(r6)
            r7.a = r2
            r1 = 1100(0x44c, double:5.435E-321)
            java.lang.Object r8 = kotlinx.coroutines.a.e(r1, r7)
            if (r8 != r0) goto L95
        L94:
            return r0
        L95:
            yz5 r8 = new yz5
            x34 r0 = new x34
            int r1 = r7.c
            r0.<init>(r1)
            r8.<init>(r0)
            br9[] r0 = new defpackage.br9[r5]
            r1 = 0
            r0[r1] = r8
            r6.g(r0)
        La9:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel$removeAllFromDb$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
