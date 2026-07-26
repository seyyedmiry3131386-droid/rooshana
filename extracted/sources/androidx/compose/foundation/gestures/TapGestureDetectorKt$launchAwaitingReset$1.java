package androidx.compose.foundation.gestures;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {498, 500}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$launchAwaitingReset$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wt3 c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$launchAwaitingReset$1(wt3 wt3Var, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = wt3Var;
        this.d = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TapGestureDetectorKt$launchAwaitingReset$1 tapGestureDetectorKt$launchAwaitingReset$1 = new TapGestureDetectorKt$launchAwaitingReset$1(this.c, this.d, g51Var);
        tapGestureDetectorKt$launchAwaitingReset$1.b = obj;
        return tapGestureDetectorKt$launchAwaitingReset$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$launchAwaitingReset$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4.d.invoke(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r5)
            goto L43
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r1 = r4.b
            e71 r1 = (defpackage.e71) r1
            kotlin.b.b(r5)
            goto L35
        L20:
            kotlin.b.b(r5)
            java.lang.Object r5 = r4.b
            r1 = r5
            e71 r1 = (defpackage.e71) r1
            r4.b = r1
            r4.a = r3
            wt3 r5 = r4.c
            java.lang.Object r5 = r5.D(r4)
            if (r5 != r0) goto L35
            goto L42
        L35:
            r5 = 0
            r4.b = r5
            r4.a = r2
            kotlin.coroutines.jvm.internal.SuspendLambda r5 = r4.d
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L43
        L42:
            return r0
        L43:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
