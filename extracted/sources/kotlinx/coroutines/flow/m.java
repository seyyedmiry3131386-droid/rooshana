package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.qp2;
import defpackage.ze2;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ze2 {
    public final ze2 a;
    public final qp2 b;

    public m(ze2 ze2Var, qp2 qp2Var) {
        this.a = ze2Var;
        this.b = qp2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            tx8 r3 = defpackage.tx8.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.b.b(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            kotlinx.coroutines.flow.internal.SafeCollector r2 = r0.b
            kotlinx.coroutines.flow.m r5 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5c
        L3c:
            r8 = move-exception
            goto L76
        L3e:
            kotlin.b.b(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            ze2 r8 = r7.a
            w61 r6 = r0.getContext()
            r2.<init>(r8, r6)
            qp2 r8 = r7.b     // Catch: java.lang.Throwable -> L3c
            r0.a = r7     // Catch: java.lang.Throwable -> L3c
            r0.b = r2     // Catch: java.lang.Throwable -> L3c
            r0.e = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r8 != r1) goto L5b
            goto L74
        L5b:
            r5 = r7
        L5c:
            r2.releaseIntercepted()
            ze2 r8 = r5.a
            boolean r2 = r8 instanceof kotlinx.coroutines.flow.m
            if (r2 == 0) goto L75
            kotlinx.coroutines.flow.m r8 = (kotlinx.coroutines.flow.m) r8
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            return r3
        L76:
            r2.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        return this.a.emit(obj, g51Var);
    }
}
