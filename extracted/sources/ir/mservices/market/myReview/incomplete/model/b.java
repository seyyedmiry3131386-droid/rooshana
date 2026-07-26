package ir.mservices.market.myReview.incomplete.model;

import defpackage.a06;
import defpackage.bz6;
import defpackage.js3;
import defpackage.sl3;
import defpackage.wd5;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final a06 c = sl3.x(bz6.e);
    public final ir.mservices.market.common.install.a a;
    public final wd5 b;

    public b(ir.mservices.market.common.install.a aVar, wd5 wd5Var) {
        js3.p(aVar, "installedAppsManager");
        js3.p(wd5Var, "myReviewService");
        this.a = aVar;
        this.b = wd5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.dx4 r7, final java.lang.String r8, boolean r9, final java.lang.Object r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$1
            if (r0 == 0) goto L13
            r0 = r11
            ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$1 r0 = (ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$1 r0 = new ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r10 = r0.c
            java.lang.String r8 = r0.b
            dx4 r7 = r0.a
            kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L2d
            goto L4d
        L2d:
            r0 = move-exception
            r9 = r0
            goto L50
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.b.b(r11)
            ir.mservices.market.common.install.a r11 = r6.a     // Catch: java.lang.Throwable -> L2d
            r0.a = r7     // Catch: java.lang.Throwable -> L2d
            r0.b = r8     // Catch: java.lang.Throwable -> L2d
            r0.c = r10     // Catch: java.lang.Throwable -> L2d
            r0.f = r3     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            java.lang.Object r11 = r11.a(r2, r9, r0)     // Catch: java.lang.Throwable -> L2d
            if (r11 != r1) goto L4d
            return r1
        L4d:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L2d
            goto L54
        L50:
            kotlin.Result$Failure r11 = kotlin.b.a(r9)
        L54:
            boolean r9 = r11 instanceof kotlin.Result.Failure
            r0 = 0
            if (r9 == 0) goto L5a
            r11 = r0
        L5a:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L6a
            ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2 r7 = new ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2
            r8 = 2
            r7.<init>(r8, r0)
            vb7 r8 = new vb7
            r8.<init>(r7)
            return r8
        L6a:
            java.util.ArrayList r1 = r7.a(r11)
            long r4 = defpackage.wq2.D()
            long r2 = defpackage.wq2.E()
            ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto r0 = new ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto
            r0.<init>(r1, r2, r4)
            androidx.paging.m r7 = new androidx.paging.m
            rz5 r9 = defpackage.gu9.B()
            ir.mservices.market.myReview.incomplete.model.a r11 = new ir.mservices.market.myReview.incomplete.model.a
            r11.<init>()
            r7.<init>(r9, r11)
            java.lang.Object r7 = r7.a
            xe2 r7 = (defpackage.xe2) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myReview.incomplete.model.b.a(dx4, java.lang.String, boolean, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
