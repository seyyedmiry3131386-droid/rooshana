package ir.mservices.market.common.model;

import android.content.Context;
import defpackage.c5;
import defpackage.fw4;
import defpackage.gf2;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pv6;
import defpackage.rv6;
import defpackage.vy2;
import defpackage.ww0;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final ww0 b;
    public final c5 c;
    public final fw4 d;
    public final l e;
    public final rv6 f;
    public final l g;
    public final gf2 h;
    public final l i;
    public final rv6 j;
    public final i k;
    public final pv6 l;

    public a(Context context, ww0 ww0Var, c5 c5Var, fw4 fw4Var) {
        js3.p(ww0Var, "commentService");
        js3.p(c5Var, "accountManager");
        js3.p(fw4Var, "miuiUtils");
        this.a = context;
        this.b = ww0Var;
        this.c = c5Var;
        this.d = fw4Var;
        l lVarB = ja1.b(new LinkedHashMap());
        this.e = lVarB;
        this.f = new rv6(lVarB);
        l lVarB2 = ja1.b(new Pair("", null));
        this.g = lVarB2;
        this.h = new gf2(new rv6(lVarB2), new SubmitCommentRepository$currentCommentScenario$1(2, null), 4);
        l lVarB3 = ja1.b(null);
        this.i = lVarB3;
        this.j = new rv6(lVarB3);
        i iVarE = vy2.e(0, 7, null);
        this.k = iVarE;
        this.l = new pv6(iVarE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (kotlinx.coroutines.a.e(100, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ir.mservices.market.common.model.SubmitCommentRepository$cancelCommentFlow$1
            if (r0 == 0) goto L13
            r0 = r9
            ir.mservices.market.common.model.SubmitCommentRepository$cancelCommentFlow$1 r0 = (ir.mservices.market.common.model.SubmitCommentRepository$cancelCommentFlow$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ir.mservices.market.common.model.SubmitCommentRepository$cancelCommentFlow$1 r0 = new ir.mservices.market.common.model.SubmitCommentRepository$cancelCommentFlow$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            tx8 r3 = defpackage.tx8.a
            kotlinx.coroutines.flow.l r4 = r7.g
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            java.lang.String r8 = r0.a
            kotlin.b.b(r9)
            goto L5f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.String r8 = r0.a
            kotlin.b.b(r9)
            goto L52
        L3e:
            kotlin.b.b(r9)
            kotlin.Pair r9 = new kotlin.Pair
            ir.mservices.market.common.comment.data.CommentResultState$Cancel r2 = ir.mservices.market.common.comment.data.CommentResultState.Cancel.INSTANCE
            r9.<init>(r8, r2)
            r0.a = r8
            r0.d = r6
            r4.emit(r9, r0)
            if (r3 != r1) goto L52
            goto L5e
        L52:
            r0.a = r8
            r0.d = r5
            r5 = 100
            java.lang.Object r9 = kotlinx.coroutines.a.e(r5, r0)
            if (r9 != r1) goto L5f
        L5e:
            return r1
        L5f:
            java.lang.Object r9 = r4.getValue()
            r0 = r9
            kotlin.Pair r0 = (kotlin.Pair) r0
            kotlin.Pair r0 = new kotlin.Pair
            r1 = 0
            r0.<init>(r8, r1)
            boolean r9 = r4.n(r9, r0)
            if (r9 == 0) goto L5f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.model.a.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof ir.mservices.market.common.model.SubmitCommentRepository$removeSubComment$1
            if (r0 == 0) goto L14
            r0 = r14
            ir.mservices.market.common.model.SubmitCommentRepository$removeSubComment$1 r0 = (ir.mservices.market.common.model.SubmitCommentRepository$removeSubComment$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ir.mservices.market.common.model.SubmitCommentRepository$removeSubComment$1 r0 = new ir.mservices.market.common.model.SubmitCommentRepository$removeSubComment$1
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L36
            if (r1 != r7) goto L2e
            java.lang.Object r9 = r6.b
            kotlin.b.b(r14)
            return r9
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.String r10 = r6.a
            kotlin.b.b(r14)
            goto L9b
        L3c:
            kotlin.b.b(r14)
            r6.a = r10
            r6.e = r2
            ww0 r1 = r8.b
            r1.getClass()
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r3 = "packageName"
            r14.<init>(r3, r9)
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r3 = "commentId"
            r9.<init>(r3, r10)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r4 = "accountId"
            r3.<init>(r4, r12)
            kotlin.Pair r12 = new kotlin.Pair
            java.lang.String r4 = "reviewId"
            r12.<init>(r4, r11)
            r11 = 4
            kotlin.Pair[] r11 = new kotlin.Pair[r11]
            r4 = 0
            r11[r4] = r14
            r11[r2] = r9
            r11[r7] = r3
            r9 = 3
            r11[r9] = r12
            java.util.LinkedHashMap r9 = kotlin.collections.b.O(r11)
            java.lang.String r11 = "{packageName}/reviews/{reviewId}/comments/{commentId}/account/{accountId}"
            java.util.Map r12 = r1.getCommonQueryParam()
            java.lang.String r14 = "v1/applications"
            z57 r3 = r1.createRequestUrl(r14, r11, r9, r12)
            ir.mservices.market.version2.services.CommentService$removeSubComment$2 r9 = new ir.mservices.market.version2.services.CommentService$removeSubComment$2
            r9.<init>()
            java.lang.reflect.Type r2 = r9.getType()
            java.lang.String r9 = "getType(...)"
            defpackage.js3.o(r2, r9)
            defpackage.js3.m(r3)
            r4 = 0
            r5 = r13
            java.lang.Object r14 = defpackage.dy3.r(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L9b
            goto Lb1
        L9b:
            r9 = r14
            n99 r9 = (defpackage.n99) r9
            boolean r9 = r9 instanceof defpackage.l99
            if (r9 == 0) goto Lb2
            r9 = 0
            r6.a = r9
            r6.b = r14
            r6.e = r7
            kotlinx.coroutines.flow.i r9 = r8.k
            java.lang.Object r9 = r9.emit(r10, r6)
            if (r9 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.model.a.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x019f A[PHI: r14
      0x019f: PHI (r14v3 tx8) = (r14v2 tx8), (r14v2 tx8), (r14v4 tx8) binds: [B:49:0x019d, B:46:0x0198, B:41:0x0175] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.String, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r27, java.lang.Integer r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.Object r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.model.a.c(java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
