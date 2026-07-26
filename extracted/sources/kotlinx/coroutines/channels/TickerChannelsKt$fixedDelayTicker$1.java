package kotlinx.coroutines.channels;

import defpackage.tb1;
import defpackage.wn7;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {102, 104, 105}, m = "fixedDelayTicker")
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    public wn7 a;
    public /* synthetic */ Object b;
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[PHI: r2
      0x005b: PHI (r2v3 wn7) = (r2v2 wn7), (r2v5 wn7) binds: [B:20:0x0058, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0063 -> B:19:0x004e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r8.b = r9
            int r9 = r8.c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.c = r9
            r1 = r9 & r0
            if (r1 == 0) goto L12
            int r9 = r9 - r0
            r8.c = r9
            r9 = r8
            goto L17
        L12:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r9 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r9.<init>(r8)
        L17:
            java.lang.Object r0 = r9.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r9.c
            r3 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3f
            if (r2 == r7) goto L39
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2b
            goto L39
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            wn7 r2 = r9.a
            kotlin.b.b(r0)
            goto L5b
        L39:
            wn7 r2 = r9.a
            kotlin.b.b(r0)
            goto L4e
        L3f:
            kotlin.b.b(r0)
            r2 = 0
            r9.a = r2
            r9.c = r7
            java.lang.Object r0 = kotlinx.coroutines.a.e(r3, r9)
            if (r0 != r1) goto L4e
            goto L65
        L4e:
            r9.a = r2
            r9.c = r6
            tx8 r0 = defpackage.tx8.a
            java.lang.Object r0 = r2.c(r9, r0)
            if (r0 != r1) goto L5b
            goto L65
        L5b:
            r9.a = r2
            r9.c = r5
            java.lang.Object r0 = kotlinx.coroutines.a.e(r3, r9)
            if (r0 != r1) goto L4e
        L65:
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
