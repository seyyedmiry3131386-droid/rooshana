package ir.mservices.market.common.comment;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.comment.data.CommentScenario;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.CommentViewModel$removeSubComment$1", f = "CommentViewModel.kt", l = {100, 99}, m = "invokeSuspend", v = 1)
final class CommentViewModel$removeSubComment$1 extends SuspendLambda implements qp2 {
    public String a;
    public i b;
    public int c;
    public int d;
    public int e;
    public final /* synthetic */ CommentScenario.RemoveComment f;
    public final /* synthetic */ CommentViewModel g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewModel$removeSubComment$1(CommentScenario.RemoveComment removeComment, CommentViewModel commentViewModel, g51 g51Var) {
        super(2, g51Var);
        this.f = removeComment;
        this.g = commentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CommentViewModel$removeSubComment$1(this.f, this.g, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CommentViewModel$removeSubComment$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r4.emit(r12, r11) != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r11.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r12)
            goto L77
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            int r1 = r11.d
            int r3 = r11.c
            kotlinx.coroutines.flow.i r4 = r11.b
            java.lang.String r5 = r11.a
            kotlin.b.b(r12)
            r10 = r11
            goto L65
        L25:
            kotlin.b.b(r12)
            ir.mservices.market.common.comment.data.CommentScenario$RemoveComment r12 = r11.f
            ir.mservices.market.common.comment.data.RemoveReviewData r12 = r12.getValue()
            java.lang.String r7 = r12.getParentId()
            if (r7 == 0) goto L77
            ir.mservices.market.common.comment.CommentViewModel r9 = r11.g
            kotlinx.coroutines.flow.i r1 = r9.m
            ir.mservices.market.common.model.a r4 = r9.b
            java.lang.String r5 = r12.getPackageName()
            java.lang.String r6 = r12.getReviewId()
            c5 r12 = r9.d
            java.lang.String r8 = r12.a()
            java.lang.String r12 = "getAccountId(...)"
            defpackage.js3.o(r8, r12)
            r11.a = r7
            r11.b = r1
            r12 = 0
            r11.c = r12
            r11.d = r12
            r11.e = r3
            r10 = r11
            java.lang.Object r3 = r4.b(r5, r6, r7, r8, r9, r10)
            if (r3 != r0) goto L60
            goto L76
        L60:
            r4 = r1
            r5 = r7
            r1 = r12
            r12 = r3
            r3 = r1
        L65:
            r10.a = r5
            r5 = 0
            r10.b = r5
            r10.c = r3
            r10.d = r1
            r10.e = r2
            java.lang.Object r12 = r4.emit(r12, r11)
            if (r12 != r0) goto L78
        L76:
            return r0
        L77:
            r10 = r11
        L78:
            tx8 r12 = defpackage.tx8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.comment.CommentViewModel$removeSubComment$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
