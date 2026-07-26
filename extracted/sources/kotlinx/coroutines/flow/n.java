package kotlinx.coroutines.flow;

import defpackage.fu7;
import defpackage.qp2;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements fu7 {
    public final i a;
    public final qp2 b;

    public n(i iVar, qp2 qp2Var) {
        this.a = iVar;
        this.b = qp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.xe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ze2 r5, defpackage.g51 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = (kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.KotlinNothingValueException r5 = defpackage.t61.q(r6)
            throw r5
        L30:
            kotlin.b.b(r6)
            kotlinx.coroutines.flow.m r6 = new kotlinx.coroutines.flow.m
            qp2 r2 = r4.b
            r6.<init>(r5, r2)
            r0.c = r3
            kotlinx.coroutines.flow.i r5 = r4.a
            r5.a(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.a(ze2, g51):java.lang.Object");
    }
}
