package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend")
final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(2, g51Var);
        flowKt__DelayKt$fixedPeriodTicker$1.b = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((FlowKt__DelayKt$fixedPeriodTicker$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[PHI: r1
      0x0052: PHI (r1v4 rk6) = (r1v3 rk6), (r1v8 rk6) binds: [B:16:0x004f, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.a
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.b
            rk6 r1 = (defpackage.rk6) r1
            kotlin.b.b(r8)
            goto L52
        L22:
            java.lang.Object r1 = r7.b
            rk6 r1 = (defpackage.rk6) r1
            kotlin.b.b(r8)
            goto L3d
        L2a:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.b
            r1 = r8
            rk6 r1 = (defpackage.rk6) r1
            r7.b = r1
            r7.a = r6
            java.lang.Object r8 = kotlinx.coroutines.a.e(r2, r7)
            if (r8 != r0) goto L3d
            goto L5c
        L3d:
            r8 = r1
            qk6 r8 = (defpackage.qk6) r8
            r8.getClass()
            r7.b = r1
            r7.a = r5
            kotlinx.coroutines.channels.a r8 = r8.d
            tx8 r6 = defpackage.tx8.a
            java.lang.Object r8 = r8.c(r7, r6)
            if (r8 != r0) goto L52
            goto L5c
        L52:
            r7.b = r1
            r7.a = r4
            java.lang.Object r8 = kotlinx.coroutines.a.e(r2, r7)
            if (r8 != r0) goto L3d
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
