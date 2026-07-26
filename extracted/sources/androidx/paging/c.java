package androidx.paging;

import defpackage.ze2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r8.b(r7, r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(defpackage.pm3 r7, defpackage.g51 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            androidx.paging.d r0 = (androidx.paging.d) r0
            boolean r1 = r8 instanceof androidx.paging.CachedPageEventFlow$job$1$1$emit$1
            if (r1 == 0) goto L17
            r1 = r8
            androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r1 = (androidx.paging.CachedPageEventFlow$job$1$1$emit$1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r1 = new androidx.paging.CachedPageEventFlow$job$1$1$emit$1
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r1.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            kotlin.b.b(r8)
            goto L5a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            pm3 r7 = r1.a
            kotlin.b.b(r8)
            goto L4c
        L3c:
            kotlin.b.b(r8)
            kotlinx.coroutines.flow.i r8 = r0.b
            r1.a = r7
            r1.d = r5
            java.lang.Object r8 = r8.emit(r7, r1)
            if (r8 != r2) goto L4c
            goto L59
        L4c:
            androidx.paging.f r8 = r0.a
            r0 = 0
            r1.a = r0
            r1.d = r4
            java.lang.Object r7 = r8.b(r7, r1)
            if (r7 != r2) goto L5a
        L59:
            return r2
        L5a:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.c.a(pm3, g51):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(defpackage.az5 r5, defpackage.g51 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            java.lang.Object r6 = r4.b     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
            pw7 r6 = (defpackage.pw7) r6     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
            r0.c = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
            kotlinx.coroutines.channels.a r6 = r6.b     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
            java.lang.Object r5 = r6.c(r0, r5)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
            if (r5 != r1) goto L41
            return r1
        L41:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.c.c(az5, g51):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    @Override // defpackage.ze2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r10, defpackage.g51 r11) {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L7b;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            az5 r10 = (defpackage.az5) r10
            java.lang.Object r10 = r9.c(r10, r11)
            return r10
        Lc:
            boolean r0 = r11 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
            if (r0 == 0) goto L1f
            r0 = r11
            androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L1f
            int r1 = r1 - r2
            r0.b = r1
            goto L24
        L1f:
            androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
            r0.<init>(r9, r11)
        L24:
            java.lang.Object r11 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlin.b.b(r11)
            goto L78
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            kotlin.b.b(r11)
            java.lang.Object r11 = r9.b
            ze2 r11 = (defpackage.ze2) r11
            ea5 r10 = (defpackage.ea5) r10
            a06 r2 = new a06
            androidx.paging.d r4 = r10.b
            vb7 r4 = r4.e
            androidx.paging.MulticastedPagingData$asPagingData$1 r5 = new androidx.paging.MulticastedPagingData$asPagingData$1
            r6 = 0
            r5.<init>(r10, r6)
            gf2 r7 = new gf2
            r7.<init>(r4, r5)
            androidx.paging.MulticastedPagingData$asPagingData$2 r4 = new androidx.paging.MulticastedPagingData$asPagingData$2
            r4.<init>(r10, r6)
            ff2 r5 = new ff2
            r5.<init>(r7, r4)
            a06 r4 = r10.a
            fx8 r6 = r4.b
            pz2 r4 = r4.c
            hk3 r7 = new hk3
            r8 = 20
            r7.<init>(r8, r10)
            r2.<init>(r5, r6, r4, r7)
            r0.b = r3
            java.lang.Object r10 = r11.emit(r2, r0)
            if (r10 != r1) goto L78
            goto L7a
        L78:
            tx8 r1 = defpackage.tx8.a
        L7a:
            return r1
        L7b:
            pm3 r10 = (defpackage.pm3) r10
            java.lang.Object r10 = r9.a(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.c.emit(java.lang.Object, g51):java.lang.Object");
    }
}
