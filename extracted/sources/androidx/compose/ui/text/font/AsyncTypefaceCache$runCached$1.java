package androidx.compose.ui.text.font;

import defpackage.qx;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {412}, m = "runCached", v = 1)
final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    public boolean a;
    public qx b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.c = r7
            int r7 = r6.e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.e = r7
            androidx.compose.ui.text.font.c r7 = r6.d
            r7.getClass()
            boolean r0 = r6 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L1f
            int r0 = r6.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1f
            int r0 = r0 - r1
            r6.e = r0
            r0 = r6
            goto L24
        L1f:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r7, r6)
        L24:
            java.lang.Object r1 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r0.e
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            boolean r2 = r0.a
            qx r0 = r0.b
            kotlin.b.b(r1)
            goto L7d
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            kotlin.b.b(r1)
            qx r1 = new qx
            r3 = 0
            r3.getClass()
            r1.<init>(r3)
            rl3 r3 = r7.c
            monitor-enter(r3)
            lg4 r5 = r7.a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L61
            px r5 = (defpackage.px) r5     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L63
            rb5 r5 = r7.b     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = r5.g(r1)     // Catch: java.lang.Throwable -> L61
            px r5 = (defpackage.px) r5     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r7 = move-exception
            goto Lac
        L63:
            if (r5 == 0) goto L69
            java.lang.Object r2 = r5.a     // Catch: java.lang.Throwable -> L61
            monitor-exit(r3)
            goto La9
        L69:
            monitor-exit(r3)
            r0.b = r1
            r3 = 0
            r0.a = r3
            r0.e = r4
            r4 = 0
            java.lang.Object r0 = r4.invoke(r0)
            if (r0 != r2) goto L79
            goto La9
        L79:
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r3
        L7d:
            rl3 r3 = r7.c
            monitor-enter(r3)
            if (r1 != 0) goto L90
            rb5 r7 = r7.b     // Catch: java.lang.Throwable -> L8e
            px r2 = new px     // Catch: java.lang.Throwable -> L8e
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            r7.m(r0, r2)     // Catch: java.lang.Throwable -> L8e
            goto La7
        L8e:
            r7 = move-exception
            goto Laa
        L90:
            if (r2 == 0) goto L9d
            rb5 r7 = r7.b     // Catch: java.lang.Throwable -> L8e
            px r2 = new px     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            r7.m(r0, r2)     // Catch: java.lang.Throwable -> L8e
            goto La7
        L9d:
            lg4 r7 = r7.a     // Catch: java.lang.Throwable -> L8e
            px r2 = new px     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            r7.put(r0, r2)     // Catch: java.lang.Throwable -> L8e
        La7:
            monitor-exit(r3)
            r2 = r1
        La9:
            return r2
        Laa:
            monitor-exit(r3)
            throw r7
        Lac:
            monitor-exit(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
