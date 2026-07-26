package ir.mservices.market.movie.ui.detail.review.useCases;

import defpackage.at2;
import defpackage.js3;
import defpackage.p05;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends at2 {
    public final p05 D;

    public a(p05 p05Var, int i) {
        switch (i) {
            case 1:
                js3.p(p05Var, "movieCommentRepository");
                this.D = p05Var;
                break;
            default:
                js3.p(p05Var, "movieCommentRepository");
                this.D = p05Var;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o0(defpackage.sz1 r6, defpackage.g51 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ir.mservices.market.movie.ui.detail.review.useCases.EmitLikeOrDislikeEventUseCase$executeUseCase$1
            if (r0 == 0) goto L13
            r0 = r7
            ir.mservices.market.movie.ui.detail.review.useCases.EmitLikeOrDislikeEventUseCase$executeUseCase$1 r0 = (ir.mservices.market.movie.ui.detail.review.useCases.EmitLikeOrDislikeEventUseCase$executeUseCase$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.movie.ui.detail.review.useCases.EmitLikeOrDislikeEventUseCase$executeUseCase$1 r0 = new ir.mservices.market.movie.ui.detail.review.useCases.EmitLikeOrDislikeEventUseCase$executeUseCase$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.b.b(r7)
            goto L42
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.b.b(r7)
            ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData r6 = r6.a
            r0.c = r4
            p05 r7 = r5.D
            kotlinx.coroutines.flow.l r7 = r7.b
            r7.emit(r6, r0)
            if (r3 != r1) goto L42
            return r1
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.review.useCases.a.o0(sz1, g51):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p0(defpackage.zn7 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof ir.mservices.market.movie.ui.detail.review.useCases.SendLikeOrDislikeUseCase$executeUseCase$1
            if (r3 == 0) goto L1a
            r3 = r2
            ir.mservices.market.movie.ui.detail.review.useCases.SendLikeOrDislikeUseCase$executeUseCase$1 r3 = (ir.mservices.market.movie.ui.detail.review.useCases.SendLikeOrDislikeUseCase$executeUseCase$1) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.d = r4
        L18:
            r10 = r3
            goto L20
        L1a:
            ir.mservices.market.movie.ui.detail.review.useCases.SendLikeOrDislikeUseCase$executeUseCase$1 r3 = new ir.mservices.market.movie.ui.detail.review.useCases.SendLikeOrDislikeUseCase$executeUseCase$1
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r10.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r4 = r10.d
            p05 r5 = r0.D
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L42
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L34
            kotlin.b.b(r2)
            return r2
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            zn7 r1 = r10.a
            kotlin.b.b(r2)
            goto L64
        L42:
            kotlin.b.b(r2)
            ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData r11 = new ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData
            java.lang.String r12 = r1.a
            int r13 = r1.b
            boolean r14 = r1.d
            int r15 = r1.e
            int r2 = r1.f
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r10.a = r1
            r10.d = r7
            kotlinx.coroutines.flow.l r2 = r5.b
            r2.emit(r11, r10)
            tx8 r2 = defpackage.tx8.a
            if (r2 != r3) goto L64
            goto Lc5
        L64:
            java.lang.String r2 = r1.a
            int r4 = r1.b
            ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel r8 = r1.c
            boolean r1 = r1.d
            r9 = 0
            r10.a = r9
            r10.d = r6
            q05 r5 = r5.a
            r5.getClass()
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r11 = "movieId"
            r9.<init>(r11, r2)
            java.lang.String r2 = java.lang.String.valueOf(r4)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r11 = "reviewId"
            r4.<init>(r11, r2)
            kotlin.Pair[] r2 = new kotlin.Pair[r6]
            r6 = 0
            r2[r6] = r9
            r2[r7] = r4
            java.util.LinkedHashMap r2 = kotlin.collections.b.O(r2)
            if (r1 == 0) goto L98
            java.lang.String r1 = "v1/movies/{movieId}/reviews/{reviewId}/like"
            goto L9a
        L98:
            java.lang.String r1 = "v1/movies/{movieId}/reviews/{reviewId}/dislike"
        L9a:
            java.lang.String r4 = "movie-api"
            java.util.Map r6 = r5.getCommonQueryParam()
            z57 r6 = r5.createRequestUrl(r4, r1, r2, r6)
            ir.mservices.market.movie.ui.detail.review.service.MovieCommentService$likeReview$2 r1 = new ir.mservices.market.movie.ui.detail.review.service.MovieCommentService$likeReview$2
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.String r2 = "getType(...)"
            defpackage.js3.o(r1, r2)
            defpackage.js3.m(r6)
            ql3 r7 = new ql3
            r7.<init>()
            r9 = 0
            r11 = 496(0x1f0, float:6.95E-43)
            r4 = r5
            r5 = r1
            java.lang.Object r1 = defpackage.dy3.I(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r3) goto Lc6
        Lc5:
            return r3
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.review.useCases.a.p0(zn7, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
