package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", l = {26, 27}, m = "invokeSuspend")
final class BroadcastKt$broadcast$2 extends SuspendLambda implements qp2 {
    public lh0 a;
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BroadcastKt$broadcast$2) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r1 r4 r7
      0x0027: PHI (r1v2 lh0) = (r1v1 lh0), (r1v3 lh0) binds: [B:10:0x001e, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r4v2 rk6) = (r4v1 rk6), (r4v3 rk6) binds: [B:10:0x001e, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r7v4 java.lang.Object) = (r7v0 java.lang.Object), (r7v10 java.lang.Object) binds: [B:10:0x001e, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0042 -> B:16:0x0045). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.b
            if (r1 == 0) goto L55
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            lh0 r1 = r6.a
            java.lang.Object r4 = r6.c
            rk6 r4 = (defpackage.rk6) r4
            kotlin.b.b(r7)
            goto L45
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            lh0 r1 = r6.a
            java.lang.Object r4 = r6.c
            rk6 r4 = (defpackage.rk6) r4
            kotlin.b.b(r7)
        L27:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L52
            java.lang.Object r7 = r1.f()
            r6.c = r4
            r6.a = r1
            r6.b = r2
            r5 = r4
            ep0 r5 = (defpackage.ep0) r5
            kotlinx.coroutines.channels.a r5 = r5.d
            java.lang.Object r7 = r5.c(r6, r7)
            if (r7 != r0) goto L45
            goto L51
        L45:
            r6.c = r4
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r1.d(r6)
            if (r7 != r0) goto L27
        L51:
            return r0
        L52:
            tx8 r7 = defpackage.tx8.a
            return r7
        L55:
            kotlin.b.b(r7)
            java.lang.Object r7 = r6.c
            rk6 r7 = (defpackage.rk6) r7
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
