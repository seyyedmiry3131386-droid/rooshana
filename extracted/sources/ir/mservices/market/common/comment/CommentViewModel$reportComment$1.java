package ir.mservices.market.common.comment;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.comment.data.request.ReportCommentRequestDto;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.CommentViewModel$reportComment$1", f = "CommentViewModel.kt", l = {90, 89}, m = "invokeSuspend", v = 1)
final class CommentViewModel$reportComment$1 extends SuspendLambda implements qp2 {
    public i a;
    public int b;
    public final /* synthetic */ CommentViewModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ReportCommentRequestDto f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewModel$reportComment$1(CommentViewModel commentViewModel, String str, String str2, ReportCommentRequestDto reportCommentRequestDto, g51 g51Var) {
        super(2, g51Var);
        this.c = commentViewModel;
        this.d = str;
        this.e = str2;
        this.f = reportCommentRequestDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CommentViewModel$reportComment$1(this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CommentViewModel$reportComment$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L21;
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
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.b.b(r12)
            r9 = r11
            goto L91
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlinx.coroutines.flow.i r1 = r11.a
            kotlin.b.b(r12)
            r9 = r11
            goto L85
        L21:
            kotlin.b.b(r12)
            ir.mservices.market.common.comment.CommentViewModel r7 = r11.c
            kotlinx.coroutines.flow.i r1 = r7.k
            ir.mservices.market.common.model.a r12 = r7.b
            r11.a = r1
            r11.b = r3
            ww0 r12 = r12.b
            r12.getClass()
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = "reviewId"
            java.lang.String r6 = r11.d
            r4.<init>(r5, r6)
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            r5 = 0
            r3[r5] = r4
            java.util.LinkedHashMap r3 = kotlin.collections.b.O(r3)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = r11.e
            if (r5 == 0) goto L5a
            boolean r6 = defpackage.f88.n0(r5)
            if (r6 == 0) goto L55
            goto L5a
        L55:
            java.lang.String r6 = "parentId"
            r4.put(r6, r5)
        L5a:
            java.lang.String r5 = "reviews/{reviewId}/inappropriateFlags"
            java.util.Map r4 = r12.getCommonQueryParam(r4)
            java.lang.String r6 = "v1/applications"
            z57 r5 = r12.createRequestUrl(r6, r5, r3, r4)
            ir.mservices.market.version2.services.CommentService$reportComment$2 r3 = new ir.mservices.market.version2.services.CommentService$reportComment$2
            r3.<init>()
            java.lang.reflect.Type r4 = r3.getType()
            java.lang.String r3 = "getType(...)"
            defpackage.js3.o(r4, r3)
            defpackage.js3.m(r5)
            r8 = 0
            r10 = 496(0x1f0, float:6.95E-43)
            ir.mservices.market.common.comment.data.request.ReportCommentRequestDto r6 = r11.f
            r9 = r11
            r3 = r12
            java.lang.Object r12 = defpackage.dy3.I(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L85
            goto L90
        L85:
            r3 = 0
            r9.a = r3
            r9.b = r2
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L91
        L90:
            return r0
        L91:
            tx8 r12 = defpackage.tx8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.comment.CommentViewModel$reportComment$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
