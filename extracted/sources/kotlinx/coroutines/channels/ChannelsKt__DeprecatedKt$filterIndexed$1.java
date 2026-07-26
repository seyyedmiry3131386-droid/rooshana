package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", l = {241, 242, 242}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public Object b;
    public int c;
    public int d;
    public /* synthetic */ Object e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r9 != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.d
            r2 = 0
            if (r1 == 0) goto L7c
            r3 = 1
            if (r1 == r3) goto L64
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            int r1 = r8.c
            lh0 r4 = r8.a
            java.lang.Object r5 = r8.e
            rk6 r5 = (defpackage.rk6) r5
            kotlin.b.b(r9)
            goto L51
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            int r1 = r8.c
            java.lang.Object r5 = r8.b
            lh0 r6 = r8.a
            java.lang.Object r7 = r8.e
            rk6 r7 = (defpackage.rk6) r7
            kotlin.b.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L53
            r8.e = r7
            r8.a = r6
            r8.b = r2
            r8.c = r1
            r8.d = r4
            r9 = r7
            ep0 r9 = (defpackage.ep0) r9
            kotlinx.coroutines.channels.a r9 = r9.d
            java.lang.Object r9 = r9.c(r8, r5)
            if (r9 != r0) goto L4f
            goto L63
        L4f:
            r4 = r6
            r5 = r7
        L51:
            r6 = r4
            r7 = r5
        L53:
            r8.e = r7
            r8.a = r6
            r8.b = r2
            r8.c = r1
            r8.d = r3
            java.lang.Object r9 = r6.d(r8)
            if (r9 != r0) goto L6d
        L63:
            return r0
        L64:
            lh0 r6 = r8.a
            java.lang.Object r0 = r8.e
            rk6 r0 = (defpackage.rk6) r0
            kotlin.b.b(r9)
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L78
            tx8 r9 = defpackage.tx8.a
            return r9
        L78:
            r6.f()
            throw r2
        L7c:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.e
            rk6 r9 = (defpackage.rk6) r9
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
