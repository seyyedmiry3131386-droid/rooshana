package androidx.compose.foundation.gestures;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {135, 138}, m = "invokeSuspend", v = 1)
final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(i iVar, g51 g51Var) {
        super(2, g51Var);
        this.c = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.c, g51Var);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.b = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (androidx.compose.foundation.gestures.i.a(r5, r6, r7, r8, r9, r12) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0032, B:19:0x003c, B:23:0x004c, B:14:0x0027), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006a -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r12.a
            r2 = 0
            r3 = 2
            r4 = 1
            androidx.compose.foundation.gestures.i r5 = r12.c
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r1 = r12.b
            e71 r1 = (defpackage.e71) r1
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L18
        L16:
            r13 = r1
            goto L32
        L18:
            r0 = move-exception
            r13 = r0
            goto L72
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.b
            e71 r1 = (defpackage.e71) r1
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L18
            goto L4c
        L2b:
            kotlin.b.b(r13)
            java.lang.Object r13 = r12.b
            e71 r13 = (defpackage.e71) r13
        L32:
            w61 r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L18
            boolean r1 = kotlinx.coroutines.a.j(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L6d
            kotlinx.coroutines.channels.a r1 = r5.e     // Catch: java.lang.Throwable -> L18
            r12.b = r13     // Catch: java.lang.Throwable -> L18
            r12.a = r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.l(r12)     // Catch: java.lang.Throwable -> L18
            if (r1 != r0) goto L49
            goto L6c
        L49:
            r11 = r1
            r1 = r13
            r13 = r11
        L4c:
            r7 = r13
            iz4 r7 = (defpackage.iz4) r7     // Catch: java.lang.Throwable -> L18
            qj1 r13 = r5.d     // Catch: java.lang.Throwable -> L18
            float r6 = defpackage.hz4.a     // Catch: java.lang.Throwable -> L18
            float r8 = r13.S(r6)     // Catch: java.lang.Throwable -> L18
            qj1 r13 = r5.d     // Catch: java.lang.Throwable -> L18
            float r6 = defpackage.hz4.b     // Catch: java.lang.Throwable -> L18
            float r9 = r13.S(r6)     // Catch: java.lang.Throwable -> L18
            androidx.compose.foundation.gestures.o r6 = r5.a     // Catch: java.lang.Throwable -> L18
            r12.b = r1     // Catch: java.lang.Throwable -> L18
            r12.a = r3     // Catch: java.lang.Throwable -> L18
            r10 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.i.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L18
            if (r13 != r0) goto L16
        L6c:
            return r0
        L6d:
            r5.g = r2
            tx8 r13 = defpackage.tx8.a
            return r13
        L72:
            r5.g = r2
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
