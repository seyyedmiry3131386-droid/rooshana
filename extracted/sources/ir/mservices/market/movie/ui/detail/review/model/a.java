package ir.mservices.market.movie.ui.detail.review.model;

import defpackage.f75;
import defpackage.js3;
import defpackage.pv6;
import defpackage.vy2;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final f75 a;
    public final i b;
    public final pv6 c;

    public a(f75 f75Var) {
        js3.p(f75Var, "movieSubmitReviewRepository");
        this.a = f75Var;
        i iVarE = vy2.e(0, 7, null);
        this.b = iVarE;
        this.c = new pv6(iVarE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (r11.b.emit(r13, r8) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData r12, defpackage.g51 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ir.mservices.market.movie.ui.detail.review.model.MovieReviewManager$movieSubmitReview$1
            if (r0 == 0) goto L14
            r0 = r13
            ir.mservices.market.movie.ui.detail.review.model.MovieReviewManager$movieSubmitReview$1 r0 = (ir.mservices.market.movie.ui.detail.review.model.MovieReviewManager$movieSubmitReview$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            ir.mservices.market.movie.ui.detail.review.model.MovieReviewManager$movieSubmitReview$1 r0 = new ir.mservices.market.movie.ui.detail.review.model.MovieReviewManager$movieSubmitReview$1
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r8.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.d
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L35
            if (r1 != r10) goto L2d
            kotlin.b.b(r13)
            goto Lbc
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData r12 = r8.a
            kotlin.b.b(r13)
            goto L8e
        L3b:
            kotlin.b.b(r13)
            ir.mservices.market.movie.data.webapi.MovieReviewRequestDto r4 = new ir.mservices.market.movie.data.webapi.MovieReviewRequestDto
            boolean r13 = r12.b
            java.lang.String r1 = r12.c
            r4.<init>(r13, r1)
            java.lang.String r13 = r12.a
            java.lang.Object r5 = r12.e
            r8.a = r12
            r8.d = r2
            f75 r1 = r11.a
            q05 r1 = r1.a
            r1.getClass()
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r6 = "movieId"
            r3.<init>(r6, r13)
            kotlin.Pair[] r13 = new kotlin.Pair[r2]
            r2 = 0
            r13[r2] = r3
            java.util.LinkedHashMap r13 = kotlin.collections.b.O(r13)
            java.lang.String r2 = "v1/movies/{movieId}/reviews"
            java.util.Map r3 = r1.getCommonQueryParam()
            java.lang.String r6 = "movie-api"
            z57 r3 = r1.createRequestUrl(r6, r2, r13, r3)
            ir.mservices.market.movie.ui.detail.review.service.MovieCommentService$submitReview$2 r13 = new ir.mservices.market.movie.ui.detail.review.service.MovieCommentService$submitReview$2
            r13.<init>()
            java.lang.reflect.Type r2 = r13.getType()
            java.lang.String r13 = "getType(...)"
            defpackage.js3.o(r2, r13)
            defpackage.js3.m(r3)
            r7 = 0
            r9 = 496(0x1f0, float:6.95E-43)
            r6 = 0
            java.lang.Object r13 = defpackage.dy3.G(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L8e
            goto Lbb
        L8e:
            n99 r13 = (defpackage.n99) r13
            boolean r1 = r13 instanceof defpackage.l99
            r2 = 0
            if (r1 == 0) goto L9b
            l99 r13 = new l99
            r13.<init>(r12)
            goto Laf
        L9b:
            boolean r12 = r13 instanceof defpackage.h99
            if (r12 == 0) goto Laa
            h99 r12 = new h99
            h99 r13 = (defpackage.h99) r13
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r13 = r13.a
            r12.<init>(r13)
            r13 = r12
            goto Laf
        Laa:
            j99 r13 = new j99
            r13.<init>(r2)
        Laf:
            r8.a = r2
            r8.d = r10
            kotlinx.coroutines.flow.i r12 = r11.b
            java.lang.Object r12 = r12.emit(r13, r8)
            if (r12 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            tx8 r12 = defpackage.tx8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.review.model.a.a(ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData, g51):java.lang.Object");
    }
}
