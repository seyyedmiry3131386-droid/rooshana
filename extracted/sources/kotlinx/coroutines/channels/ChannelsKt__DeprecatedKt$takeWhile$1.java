package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", l = {299, 300, 301}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r8 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.c
            r2 = 0
            if (r1 == 0) goto L71
            r3 = 1
            if (r1 == r3) goto L59
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            lh0 r1 = r7.a
            java.lang.Object r4 = r7.d
            rk6 r4 = (defpackage.rk6) r4
            kotlin.b.b(r8)
            goto L4c
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.lang.Object r1 = r7.b
            lh0 r5 = r7.a
            java.lang.Object r6 = r7.d
            rk6 r6 = (defpackage.rk6) r6
            kotlin.b.b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L36
            goto L6a
        L36:
            r7.d = r6
            r7.a = r5
            r7.b = r2
            r7.c = r4
            r8 = r6
            ep0 r8 = (defpackage.ep0) r8
            kotlinx.coroutines.channels.a r8 = r8.d
            java.lang.Object r8 = r8.c(r7, r1)
            if (r8 != r0) goto L4a
            goto L58
        L4a:
            r1 = r5
            r4 = r6
        L4c:
            r7.d = r4
            r7.a = r1
            r7.c = r3
            java.lang.Object r8 = r1.d(r7)
            if (r8 != r0) goto L62
        L58:
            return r0
        L59:
            lh0 r1 = r7.a
            java.lang.Object r0 = r7.d
            rk6 r0 = (defpackage.rk6) r0
            kotlin.b.b(r8)
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6d
        L6a:
            tx8 r8 = defpackage.tx8.a
            return r8
        L6d:
            r1.f()
            throw r2
        L71:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.d
            rk6 r8 = (defpackage.rk6) r8
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
