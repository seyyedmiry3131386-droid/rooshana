package ir.mservices.market.app.suggest.detail.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel$handleError$1", f = "PlayDetailViewModel.kt", l = {196, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, 203}, m = "invokeSuspend", v = 1)
final class PlayDetailViewModel$handleError$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PlayDetailViewModel b;
    public final /* synthetic */ ErrorDTO c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayDetailViewModel$handleError$1(PlayDetailViewModel playDetailViewModel, ErrorDTO errorDTO, g51 g51Var) {
        super(2, g51Var);
        this.b = playDetailViewModel;
        this.c = errorDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayDetailViewModel$handleError$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayDetailViewModel$handleError$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel r0 = r11.b
            kotlinx.coroutines.flow.i r1 = r0.E
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r11.a
            r4 = 3
            r5 = 1
            tx8 r6 = defpackage.tx8.a
            r7 = 2
            if (r3 == 0) goto L29
            if (r3 == r5) goto L25
            if (r3 == r7) goto L21
            if (r3 != r4) goto L19
            kotlin.b.b(r12)
            return r6
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            kotlin.b.b(r12)
            return r6
        L25:
            kotlin.b.b(r12)
            return r6
        L29:
            kotlin.b.b(r12)
            la6 r12 = r0.w
            java.lang.String r12 = r12.a
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r8 = "packageName"
            r3.<init>(r8, r12)
            java.lang.String r12 = r0.x
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r9 = "BUNDLE_KEY_TITLE"
            r8.<init>(r9, r12)
            kotlin.Pair[] r12 = new kotlin.Pair[r7]
            r9 = 0
            r12[r9] = r3
            r12[r5] = r8
            android.os.Bundle r12 = defpackage.is3.g(r12)
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r3 = r11.c
            java.lang.String r8 = r3.getMessageCode()
            if (r8 == 0) goto L6d
            java.lang.String r8 = r3.getMessageCode()
            java.lang.String r10 = "getMessageCode(...)"
            defpackage.js3.o(r8, r10)
            java.lang.String r10 = "Could not retrieve response code from HttpUrlConnection"
            boolean r8 = defpackage.f88.c0(r8, r10, r9)
            if (r8 == 0) goto L6d
            r11.a = r5
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r2) goto L89
            goto L88
        L6d:
            int r3 = r3.getHttpStatus()
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != r5) goto L80
            kotlinx.coroutines.flow.i r0 = r0.C
            r11.a = r7
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r2) goto L89
            goto L88
        L80:
            r11.a = r4
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r2) goto L89
        L88:
            return r2
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel$handleError$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
