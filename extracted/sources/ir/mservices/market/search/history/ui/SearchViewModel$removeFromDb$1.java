package ir.mservices.market.search.history.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel$removeFromDb$1", f = "SearchViewModel.kt", l = {474, 475, 476}, m = "invokeSuspend", v = 1)
final class SearchViewModel$removeFromDb$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SearchViewModel b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$removeFromDb$1(SearchViewModel searchViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.b = searchViewModel;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchViewModel$removeFromDb$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchViewModel$removeFromDb$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r8 == r0) goto L26;
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
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = r7.c
            ir.mservices.market.search.history.ui.SearchViewModel r6 = r7.b
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlin.b.b(r8)
            goto L94
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlin.b.b(r8)
            goto L7a
        L24:
            kotlin.b.b(r8)
            goto L56
        L28:
            kotlin.b.b(r8)
            rv6 r8 = r6.E
            v48 r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "movie"
            boolean r1 = defpackage.js3.i(r8, r1)
            if (r1 == 0) goto L59
            hh2 r8 = r6.z
            r7.a = r4
            java.lang.Object r8 = r8.c
            k65 r8 = (defpackage.k65) r8
            y2 r8 = (defpackage.y2) r8
            r8.getClass()
            d r1 = new d
            r1.<init>(r8, r5, r4)
            java.lang.Object r8 = defpackage.y2.a(r1, r7)
            if (r8 != r0) goto L56
            goto L93
        L56:
            x38 r8 = (defpackage.x38) r8
            goto L96
        L59:
            java.lang.String r1 = "app"
            boolean r8 = defpackage.js3.i(r8, r1)
            if (r8 == 0) goto L7d
            qq4 r8 = r6.y
            r7.a = r3
            java.lang.Object r8 = r8.b
            ad8 r8 = (defpackage.ad8) r8
            y2 r8 = (defpackage.y2) r8
            r8.getClass()
            d r1 = new d
            r1.<init>(r8, r5, r4)
            java.lang.Object r8 = defpackage.y2.a(r1, r7)
            if (r8 != r0) goto L7a
            goto L93
        L7a:
            x38 r8 = (defpackage.x38) r8
            goto L96
        L7d:
            x19 r8 = r6.A
            r7.a = r2
            v19 r8 = r8.b
            y2 r8 = (defpackage.y2) r8
            r8.getClass()
            d r1 = new d
            r1.<init>(r8, r5, r4)
            java.lang.Object r8 = defpackage.y2.a(r1, r7)
            if (r8 != r0) goto L94
        L93:
            return r0
        L94:
            x38 r8 = (defpackage.x38) r8
        L96:
            boolean r0 = r8 instanceof defpackage.w38
            if (r0 == 0) goto Laf
            yz5 r8 = new yz5
            kt r0 = new kt
            r1 = 9
            r0.<init>(r5, r1)
            r8.<init>(r0)
            br9[] r0 = new defpackage.br9[r4]
            r1 = 0
            r0[r1] = r8
            r6.g(r0)
            goto Lb3
        Laf:
            boolean r8 = r8 instanceof defpackage.v38
            if (r8 == 0) goto Lb6
        Lb3:
            tx8 r8 = defpackage.tx8.a
            return r8
        Lb6:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel$removeFromDb$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
