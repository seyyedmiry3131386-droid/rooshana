package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", l = {374, 375, 375}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public rk6 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r9 == r0) goto L18;
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
            if (r1 == 0) goto L6f
            r3 = 1
            if (r1 == r3) goto L57
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            int r1 = r8.c
            lh0 r4 = r8.a
            java.lang.Object r5 = r8.e
            rk6 r5 = (defpackage.rk6) r5
            kotlin.b.b(r9)
            goto L48
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            int r1 = r8.c
            rk6 r5 = r8.b
            lh0 r6 = r8.a
            java.lang.Object r7 = r8.e
            rk6 r7 = (defpackage.rk6) r7
            kotlin.b.b(r9)
            r8.e = r7
            r8.a = r6
            r8.b = r2
            r8.c = r1
            r8.d = r4
            ep0 r5 = (defpackage.ep0) r5
            kotlinx.coroutines.channels.a r4 = r5.d
            java.lang.Object r9 = r4.c(r8, r9)
            if (r9 != r0) goto L46
            goto L56
        L46:
            r4 = r6
            r5 = r7
        L48:
            r8.e = r5
            r8.a = r4
            r8.c = r1
            r8.d = r3
            java.lang.Object r9 = r4.d(r8)
            if (r9 != r0) goto L60
        L56:
            return r0
        L57:
            lh0 r4 = r8.a
            java.lang.Object r0 = r8.e
            rk6 r0 = (defpackage.rk6) r0
            kotlin.b.b(r9)
        L60:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6b
            tx8 r9 = defpackage.tx8.a
            return r9
        L6b:
            r4.f()
            throw r2
        L6f:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.e
            rk6 r9 = (defpackage.rk6) r9
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
