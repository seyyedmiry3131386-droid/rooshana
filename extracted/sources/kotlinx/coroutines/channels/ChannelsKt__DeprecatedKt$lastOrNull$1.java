package kotlinx.coroutines.channels;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {153, 156}, m = "lastOrNull")
final class ChannelsKt__DeprecatedKt$lastOrNull$1<E> extends ContinuationImpl {
    public pw6 a;
    public lh0 b;
    public Object c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #1 {all -> 0x0071, blocks: (B:25:0x005f, B:27:0x0067), top: B:44:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:44:0x005f). Please report as a decompilation issue!!! */
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
            if (r0 == 0) goto L7b
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
            goto L5f
        L23:
            r9 = move-exception
            r2 = r5
            goto L80
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            lh0 r0 = r8.b
            pw6 r4 = r8.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L78
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L78
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L78
            if (r9 != 0) goto L42
            r4.g(r2)
            return r2
        L42:
            java.lang.Object r9 = r0.f()     // Catch: java.lang.Throwable -> L78
            r5 = r4
            r4 = r0
            r0 = r9
            r9 = r8
        L4a:
            r9.a = r5     // Catch: java.lang.Throwable -> L23
            r9.b = r4     // Catch: java.lang.Throwable -> L23
            r9.c = r0     // Catch: java.lang.Throwable -> L23
            r9.e = r3     // Catch: java.lang.Throwable -> L23
            java.lang.Object r6 = r4.d(r9)     // Catch: java.lang.Throwable -> L23
            if (r6 != r1) goto L59
            return r1
        L59:
            r7 = r0
            r0 = r9
            r9 = r6
            r6 = r5
            r5 = r4
            r4 = r7
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L74
            java.lang.Object r9 = r5.f()     // Catch: java.lang.Throwable -> L71
            r4 = r0
            r0 = r9
            r9 = r4
            r4 = r5
            r5 = r6
            goto L4a
        L71:
            r9 = move-exception
            r2 = r6
            goto L80
        L74:
            r6.g(r2)
            return r4
        L78:
            r9 = move-exception
            r2 = r4
            goto L80
        L7b:
            kotlin.b.b(r9)
            throw r2     // Catch: java.lang.Throwable -> L7f
        L7f:
            r9 = move-exception
        L80:
            throw r9     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            kotlinx.coroutines.channels.b.b(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
