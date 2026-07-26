package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", l = {351, 352, 352}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r7 == r0) goto L18;
     */
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
            r2 = 0
            if (r1 == 0) goto L60
            r3 = 1
            if (r1 == r3) goto L48
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            lh0 r1 = r6.a
            java.lang.Object r4 = r6.c
            rk6 r4 = (defpackage.rk6) r4
            kotlin.b.b(r7)
            goto L3b
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            lh0 r1 = r6.a
            java.lang.Object r5 = r6.c
            rk6 r5 = (defpackage.rk6) r5
            kotlin.b.b(r7)
            pw6 r7 = (defpackage.pw6) r7
            r6.c = r5
            r6.a = r1
            r6.b = r4
            java.lang.Object r7 = kotlinx.coroutines.channels.b.d(r7, r5, r6)
            if (r7 != r0) goto L3a
            goto L47
        L3a:
            r4 = r5
        L3b:
            r6.c = r4
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r1.d(r6)
            if (r7 != r0) goto L51
        L47:
            return r0
        L48:
            lh0 r1 = r6.a
            java.lang.Object r0 = r6.c
            rk6 r0 = (defpackage.rk6) r0
            kotlin.b.b(r7)
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            tx8 r7 = defpackage.tx8.a
            return r7
        L5c:
            r1.f()
            throw r2
        L60:
            kotlin.b.b(r7)
            java.lang.Object r7 = r6.c
            rk6 r7 = (defpackage.rk6) r7
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
