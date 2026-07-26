package kotlinx.coroutines.flow;

import defpackage.qp2;
import defpackage.w61;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kotlinx.coroutines.flow.internal.a {
    public final qp2 d;
    public final qp2 e;

    public b(qp2 qp2Var, w61 w61Var, int i, BufferOverflow bufferOverflow) {
        super(w61Var, i, bufferOverflow);
        this.d = qp2Var;
        this.e = qp2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, rk6] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7, types: [rk6] */
    @Override // kotlinx.coroutines.flow.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.rk6 r6, defpackage.g51 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            rk6 r6 = r0.a
            kotlin.b.b(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.b.b(r7)
            r0.a = r6
            r0.d = r4
            qp2 r7 = r5.d
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            ep0 r6 = (defpackage.ep0) r6
            kotlinx.coroutines.channels.a r6 = r6.d
            boolean r6 = r6.B()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.f(rk6, g51):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.a g(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return new b(this.e, w61Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
