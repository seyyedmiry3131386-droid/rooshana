package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import java.util.HashSet;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", l = {417, 418, 420}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements qp2 {
    public HashSet a;
    public lh0 b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r10 != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r9.d
            r2 = 0
            if (r1 == 0) goto L82
            r3 = 1
            if (r1 == r3) goto L6a
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L27
            if (r1 != r4) goto L1f
            java.lang.Object r1 = r9.c
            lh0 r4 = r9.b
            java.util.HashSet r5 = r9.a
            java.lang.Object r6 = r9.e
            rk6 r6 = (defpackage.rk6) r6
            kotlin.b.b(r10)
            r10 = r1
            goto L53
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.c
            lh0 r5 = r9.b
            java.util.HashSet r6 = r9.a
            java.lang.Object r7 = r9.e
            rk6 r7 = (defpackage.rk6) r7
            kotlin.b.b(r10)
            boolean r8 = r6.contains(r10)
            if (r8 != 0) goto L59
            r9.e = r7
            r9.a = r6
            r9.b = r5
            r9.c = r10
            r9.d = r4
            r4 = r7
            ep0 r4 = (defpackage.ep0) r4
            kotlinx.coroutines.channels.a r4 = r4.d
            java.lang.Object r1 = r4.c(r9, r1)
            if (r1 != r0) goto L50
            goto L69
        L50:
            r4 = r5
            r5 = r6
            r6 = r7
        L53:
            r5.add(r10)
            r7 = r6
            r6 = r5
            r5 = r4
        L59:
            r9.e = r7
            r9.a = r6
            r9.b = r5
            r9.c = r2
            r9.d = r3
            java.lang.Object r10 = r5.d(r9)
            if (r10 != r0) goto L73
        L69:
            return r0
        L6a:
            lh0 r5 = r9.b
            java.lang.Object r0 = r9.e
            rk6 r0 = (defpackage.rk6) r0
            kotlin.b.b(r10)
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L7e
            tx8 r10 = defpackage.tx8.a
            return r10
        L7e:
            r5.f()
            throw r2
        L82:
            kotlin.b.b(r10)
            java.lang.Object r10 = r9.e
            rk6 r10 = (defpackage.rk6) r10
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
