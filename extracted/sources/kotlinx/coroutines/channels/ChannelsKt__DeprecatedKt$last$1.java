package kotlinx.coroutines.channels;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {127, 130}, m = "last")
final class ChannelsKt__DeprecatedKt$last$1<E> extends ContinuationImpl {
    public pw6 a;
    public lh0 b;
    public Object c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #4 {all -> 0x006d, blocks: (B:23:0x005b, B:25:0x0063), top: B:49:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:49:0x005b). Please report as a decompilation issue!!! */
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
            if (r0 == 0) goto L7f
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L2f
            if (r0 != r3) goto L27
            java.lang.Object r0 = r8.c
            lh0 r4 = r8.b
            pw6 r5 = r8.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L23
            r6 = r5
            r5 = r4
            r4 = r0
            r0 = r8
            goto L5b
        L23:
            r9 = move-exception
            r2 = r5
            goto L84
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            lh0 r0 = r8.b
            pw6 r4 = r8.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L74
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L74
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L74
            if (r9 == 0) goto L77
            java.lang.Object r9 = r0.f()     // Catch: java.lang.Throwable -> L74
            r5 = r4
            r4 = r0
            r0 = r9
            r9 = r8
        L46:
            r9.a = r5     // Catch: java.lang.Throwable -> L23
            r9.b = r4     // Catch: java.lang.Throwable -> L23
            r9.c = r0     // Catch: java.lang.Throwable -> L23
            r9.e = r3     // Catch: java.lang.Throwable -> L23
            java.lang.Object r6 = r4.d(r9)     // Catch: java.lang.Throwable -> L23
            if (r6 != r1) goto L55
            return r1
        L55:
            r7 = r0
            r0 = r9
            r9 = r6
            r6 = r5
            r5 = r4
            r4 = r7
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L6d
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L70
            java.lang.Object r9 = r5.f()     // Catch: java.lang.Throwable -> L6d
            r4 = r0
            r0 = r9
            r9 = r4
            r4 = r5
            r5 = r6
            goto L46
        L6d:
            r9 = move-exception
            r2 = r6
            goto L84
        L70:
            r6.g(r2)
            return r4
        L74:
            r9 = move-exception
            r2 = r4
            goto L84
        L77:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "ReceiveChannel is empty."
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r9     // Catch: java.lang.Throwable -> L74
        L7f:
            kotlin.b.b(r9)
            throw r2     // Catch: java.lang.Throwable -> L83
        L83:
            r9 = move-exception
        L84:
            throw r9     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            kotlinx.coroutines.channels.b.b(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
