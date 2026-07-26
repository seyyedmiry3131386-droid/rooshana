package kotlinx.coroutines.flow;

import defpackage.xe2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements xe2 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // defpackage.xe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ze2 r7, defpackage.g51 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlinx.coroutines.flow.internal.SafeCollector r7 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.b.b(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            w61 r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.a = r8     // Catch: java.lang.Throwable -> L5e
            r0.d = r4     // Catch: java.lang.Throwable -> L5e
            r7 = r6
            vb7 r7 = (defpackage.vb7) r7     // Catch: java.lang.Throwable -> L5e
            kotlin.coroutines.jvm.internal.SuspendLambda r7 = r7.a     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.releaseIntercepted()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.a(ze2, g51):java.lang.Object");
    }
}
