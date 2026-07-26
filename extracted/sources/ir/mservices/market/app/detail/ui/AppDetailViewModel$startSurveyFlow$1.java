package ir.mservices.market.app.detail.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$startSurveyFlow$1", f = "AppDetailViewModel.kt", l = {1176, 1176}, m = "invokeSuspend", v = 1)
final class AppDetailViewModel$startSurveyFlow$1 extends SuspendLambda implements qp2 {
    public i a;
    public int b;
    public int c;
    public final /* synthetic */ AppDetailViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailViewModel$startSurveyFlow$1(AppDetailViewModel appDetailViewModel, g51 g51Var) {
        super(2, g51Var);
        this.d = appDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppDetailViewModel$startSurveyFlow$1(this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDetailViewModel$startSurveyFlow$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r3.emit(r8, r7) != r0) goto L21;
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
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r8)
            goto L57
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            int r1 = r7.b
            kotlinx.coroutines.flow.i r3 = r7.a
            kotlin.b.b(r8)
            goto L49
        L20:
            kotlin.b.b(r8)
            ir.mservices.market.app.detail.ui.AppDetailViewModel r8 = r7.d
            ir.mservices.market.app.detail.data.ApplicationFullDto r1 = r8.R()
            if (r1 == 0) goto L57
            java.lang.String r1 = r1.getPackageName()
            if (r1 == 0) goto L57
            kotlinx.coroutines.flow.i r4 = r8.C0
            v24 r5 = r8.v
            r7.a = r4
            r6 = 0
            r7.b = r6
            r7.c = r3
            java.lang.Object r3 = r5.b
            uc8 r3 = (defpackage.uc8) r3
            java.lang.Object r8 = r3.h(r1, r8, r7)
            if (r8 != r0) goto L47
            goto L56
        L47:
            r3 = r4
            r1 = r6
        L49:
            r4 = 0
            r7.a = r4
            r7.b = r1
            r7.c = r2
            java.lang.Object r8 = r3.emit(r8, r7)
            if (r8 != r0) goto L57
        L56:
            return r0
        L57:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel$startSurveyFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
