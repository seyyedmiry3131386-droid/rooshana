package ir.mservices.market.movie.ui.search;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.search.SearchIntentViewModel$doRequest$1", f = "SearchIntentViewModel.kt", l = {31, 32}, m = "invokeSuspend", v = 1)
final class SearchIntentViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SearchIntentViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchIntentViewModel$doRequest$1(SearchIntentViewModel searchIntentViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = searchIntentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchIntentViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchIntentViewModel$doRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            ir.mservices.market.movie.ui.search.SearchIntentViewModel r0 = r8.b
            wh7 r1 = r0.u
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r8.a
            tx8 r4 = defpackage.tx8.a
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L22
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L16
            kotlin.b.b(r9)
            return r4
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.b.b(r9)
            return r4
        L22:
            kotlin.b.b(r9)
            boolean r9 = r0.v
            if (r9 == 0) goto L52
            jd7 r9 = r0.t
            java.lang.String r3 = "first_call"
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r9.d(r7, r3)
            java.lang.String r9 = r1.a
            boolean r9 = defpackage.f88.n0(r9)
            if (r9 == 0) goto L45
            kotlinx.coroutines.flow.i r9 = r0.w
            r8.a = r6
            java.lang.Object r9 = r9.emit(r4, r8)
            if (r9 != r2) goto L52
            goto L51
        L45:
            kotlinx.coroutines.flow.i r9 = r0.y
            java.lang.String r0 = r1.a
            r8.a = r5
            java.lang.Object r9 = r9.emit(r0, r8)
            if (r9 != r2) goto L52
        L51:
            return r2
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.search.SearchIntentViewModel$doRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
