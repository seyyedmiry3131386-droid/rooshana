package kotlinx.coroutines.channels;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import defpackage.wn7;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 272}, m = "filterNotNullTo")
final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends wn7> extends ContinuationImpl {
    public wn7 a;
    public pw6 b;
    public lh0 c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: Path cross not found for [B:20:0x0043, B:23:0x0052], limit reached: 41 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[Catch: all -> 0x0020, PHI: r0 r5 r6 r7 r9
      0x0035: PHI (r0v5 lh0) = (r0v4 lh0), (r0v6 lh0) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r5v2 pw6) = (r5v1 pw6), (r5v3 pw6) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r6v1 wn7) = (r6v0 wn7), (r6v2 wn7) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r7v1 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends wn7>) = 
      (r7v0 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends wn7>)
      (r7v2 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends wn7>)
     binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r9v4 java.lang.Object) = (r9v0 java.lang.Object), (r9v9 java.lang.Object) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:23:0x0052, B:16:0x0035, B:18:0x003d, B:20:0x0043, B:15:0x0031), top: B:35:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:23:0x0052, B:16:0x0035, B:18:0x003d, B:20:0x0043, B:15:0x0031), top: B:35:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:23:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004f -> B:23:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r8.d = r9
            int r0 = r8.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r8.e = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            r2 = 0
            if (r0 == 0) goto L65
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L2b
            if (r0 != r3) goto L23
            lh0 r0 = r8.c
            pw6 r5 = r8.b
            wn7 r6 = r8.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L20
            r7 = r8
            goto L52
        L20:
            r9 = move-exception
            r2 = r5
            goto L6a
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2b:
            lh0 r0 = r8.c
            pw6 r5 = r8.b
            wn7 r6 = r8.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L20
            r7 = r8
        L35:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L20
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r9 == 0) goto L61
            java.lang.Object r9 = r0.f()     // Catch: java.lang.Throwable -> L20
            if (r9 == 0) goto L52
            r7.a = r6     // Catch: java.lang.Throwable -> L20
            r7.b = r5     // Catch: java.lang.Throwable -> L20
            r7.c = r0     // Catch: java.lang.Throwable -> L20
            r7.e = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r9 = r6.c(r7, r9)     // Catch: java.lang.Throwable -> L20
            if (r9 != r1) goto L52
            goto L60
        L52:
            r7.a = r6     // Catch: java.lang.Throwable -> L20
            r7.b = r5     // Catch: java.lang.Throwable -> L20
            r7.c = r0     // Catch: java.lang.Throwable -> L20
            r7.e = r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r9 = r0.d(r7)     // Catch: java.lang.Throwable -> L20
            if (r9 != r1) goto L35
        L60:
            return r1
        L61:
            r5.g(r2)
            return r6
        L65:
            kotlin.b.b(r9)
            throw r2     // Catch: java.lang.Throwable -> L69
        L69:
            r9 = move-exception
        L6a:
            throw r9     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            kotlinx.coroutines.channels.b.b(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
