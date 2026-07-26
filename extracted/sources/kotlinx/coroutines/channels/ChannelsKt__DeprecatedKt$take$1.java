package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", l = {284, 285}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public int b;
    public int c;
    public /* synthetic */ Object d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$take$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0048 -> B:16:0x004b). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L62
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            int r1 = r7.b
            lh0 r4 = r7.a
            java.lang.Object r5 = r7.d
            rk6 r5 = (defpackage.rk6) r5
            kotlin.b.b(r8)
            goto L4b
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            int r1 = r7.b
            lh0 r4 = r7.a
            java.lang.Object r5 = r7.d
            rk6 r5 = (defpackage.rk6) r5
            kotlin.b.b(r8)
        L2b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r4.f()
            r7.d = r5
            r7.a = r4
            r7.b = r1
            r7.c = r2
            r6 = r5
            ep0 r6 = (defpackage.ep0) r6
            kotlinx.coroutines.channels.a r6 = r6.d
            java.lang.Object r8 = r6.c(r7, r8)
            if (r8 != r0) goto L4b
            goto L5e
        L4b:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L50
            goto L5f
        L50:
            r7.d = r5
            r7.a = r4
            r7.b = r1
            r7.c = r3
            java.lang.Object r8 = r4.d(r7)
            if (r8 != r0) goto L2b
        L5e:
            return r0
        L5f:
            tx8 r8 = defpackage.tx8.a
            return r8
        L62:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.d
            rk6 r8 = (defpackage.rk6) r8
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
