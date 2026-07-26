package androidx.paging;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {216, 86}, m = "invokeSuspend", v = 1)
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l d;
    public final /* synthetic */ LoadType e;
    public kotlinx.coroutines.sync.a f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(g51 g51Var, l lVar, LoadType loadType) {
        super(3, g51Var);
        this.d = lVar;
        this.e = loadType;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1((g51) obj3, this.d, this.e);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.b = (ze2) obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.c = obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (kotlinx.coroutines.flow.d.m(r8, r2, r11) == r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            androidx.paging.LoadType r0 = r11.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r11.a
            androidx.paging.l r3 = r11.d
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            kotlin.b.b(r12)
            goto La0
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            int r2 = r11.g
            kotlinx.coroutines.sync.a r6 = r11.f
            java.lang.Object r7 = r11.c
            gz5 r7 = (defpackage.gz5) r7
            ze2 r8 = r11.b
            kotlin.b.b(r12)
            goto L4d
        L2b:
            kotlin.b.b(r12)
            ze2 r8 = r11.b
            java.lang.Object r12 = r11.c
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            gz5 r7 = r3.i
            kotlinx.coroutines.sync.a r6 = r7.a
            r11.b = r8
            r11.c = r7
            r11.f = r6
            r11.g = r2
            r11.a = r5
            java.lang.Object r12 = r6.b(r11)
            if (r12 != r1) goto L4d
            goto L9f
        L4d:
            r12 = 0
            hz5 r7 = r7.b     // Catch: java.lang.Throwable -> L6b
            pa2 r7 = r7.j     // Catch: java.lang.Throwable -> L6b
            ja4 r9 = r7.p(r0)     // Catch: java.lang.Throwable -> L6b
            ia4 r10 = defpackage.ia4.b     // Catch: java.lang.Throwable -> L6b
            boolean r9 = defpackage.js3.i(r9, r10)     // Catch: java.lang.Throwable -> L6b
            r10 = 0
            if (r9 == 0) goto L6d
            kr2[] r0 = new defpackage.kr2[r10]     // Catch: java.lang.Throwable -> L6b
            d9 r2 = new d9     // Catch: java.lang.Throwable -> L6b
            r3 = 4
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6b
            r6.d(r12)
            goto L91
        L6b:
            r0 = move-exception
            goto La3
        L6d:
            ja4 r9 = r7.p(r0)     // Catch: java.lang.Throwable -> L6b
            boolean r9 = r9 instanceof defpackage.ga4     // Catch: java.lang.Throwable -> L6b
            if (r9 != 0) goto L7a
            ia4 r9 = defpackage.ia4.c     // Catch: java.lang.Throwable -> L6b
            r7.B(r0, r9)     // Catch: java.lang.Throwable -> L6b
        L7a:
            r6.d(r12)
            ca7 r3 = r3.f
            kotlinx.coroutines.flow.i r0 = r3.g(r0)
            if (r2 != 0) goto L86
            r5 = r10
        L86:
            hf2 r0 = kotlinx.coroutines.flow.d.l(r0, r5)
            hf2 r3 = new hf2
            r5 = 1
            r3.<init>(r0, r2, r5)
            r2 = r3
        L91:
            r11.b = r12
            r11.c = r12
            r11.f = r12
            r11.a = r4
            java.lang.Object r12 = kotlinx.coroutines.flow.d.m(r8, r2, r11)
            if (r12 != r1) goto La0
        L9f:
            return r1
        La0:
            tx8 r12 = defpackage.tx8.a
            return r12
        La3:
            r6.d(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
