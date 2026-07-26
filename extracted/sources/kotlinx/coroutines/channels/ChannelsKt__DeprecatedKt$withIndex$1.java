package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", l = {ErrorDTO.CODE_ACCESS_DENIED, ErrorDTO.CODE_SERVER_SING_OUT}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements qp2 {
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
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4 r5 r9
      0x002b: PHI (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:10:0x0020, B:18:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v1 lh0) = (r4v0 lh0), (r4v2 lh0) binds: [B:10:0x0020, B:18:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r5v2 rk6) = (r5v1 rk6), (r5v3 rk6) binds: [B:10:0x0020, B:18:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r9v4 java.lang.Object) = (r9v0 java.lang.Object), (r9v13 java.lang.Object) binds: [B:10:0x0020, B:18:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.c
            if (r1 == 0) goto L65
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            int r1 = r8.b
            lh0 r4 = r8.a
            java.lang.Object r5 = r8.d
            rk6 r5 = (defpackage.rk6) r5
            kotlin.b.b(r9)
            goto L53
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            int r1 = r8.b
            lh0 r4 = r8.a
            java.lang.Object r5 = r8.d
            rk6 r5 = (defpackage.rk6) r5
            kotlin.b.b(r9)
        L2b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L62
            java.lang.Object r9 = r4.f()
            pm3 r6 = new pm3
            int r7 = r1 + 1
            r6.<init>(r1, r9)
            r8.d = r5
            r8.a = r4
            r8.b = r7
            r8.c = r2
            r9 = r5
            ep0 r9 = (defpackage.ep0) r9
            kotlinx.coroutines.channels.a r9 = r9.d
            java.lang.Object r9 = r9.c(r8, r6)
            if (r9 != r0) goto L52
            goto L61
        L52:
            r1 = r7
        L53:
            r8.d = r5
            r8.a = r4
            r8.b = r1
            r8.c = r3
            java.lang.Object r9 = r4.d(r8)
            if (r9 != r0) goto L2b
        L61:
            return r0
        L62:
            tx8 r9 = defpackage.tx8.a
            return r9
        L65:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.d
            rk6 r9 = (defpackage.rk6) r9
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
