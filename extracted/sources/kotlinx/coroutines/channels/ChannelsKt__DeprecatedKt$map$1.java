package kotlinx.coroutines.channels;

import defpackage.g51;
import defpackage.lh0;
import defpackage.pw6;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", l = {514, 363, 363}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements qp2 {
    public qp2 a;
    public pw6 b;
    public lh0 c;
    public rk6 d;
    public int e;
    public /* synthetic */ Object f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$map$1) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: all -> 0x0021, PHI: r1 r6 r7 r8 r12
      0x0051: PHI (r1v6 lh0) = (r1v1 lh0), (r1v8 lh0) binds: [B:21:0x004e, B:33:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r6v6 pw6) = (r6v2 pw6), (r6v8 pw6) binds: [B:21:0x004e, B:33:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r7v5 qp2) = (r7v1 qp2), (r7v7 qp2) binds: [B:21:0x004e, B:33:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r8v4 rk6) = (r8v1 rk6), (r8v6 rk6) binds: [B:21:0x004e, B:33:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r12v8 java.lang.Object) = (r12v0 java.lang.Object), (r12v16 java.lang.Object) binds: [B:21:0x004e, B:33:0x00a7] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0021, blocks: (B:9:0x001c, B:32:0x0096, B:22:0x0051, B:24:0x0059, B:21:0x004e), top: B:45:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #1 {all -> 0x0021, blocks: (B:9:0x001c, B:32:0x0096, B:22:0x0051, B:24:0x0059, B:21:0x004e), top: B:45:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:32:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r11.e
            r2 = 0
            if (r1 == 0) goto Lb6
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L42
            if (r1 == r4) goto L2c
            if (r1 != r3) goto L24
            lh0 r1 = r11.c
            pw6 r6 = r11.b
            qp2 r7 = r11.a
            qp2 r7 = (defpackage.qp2) r7
            java.lang.Object r8 = r11.f
            rk6 r8 = (defpackage.rk6) r8
            kotlin.b.b(r12)     // Catch: java.lang.Throwable -> L21
            goto L96
        L21:
            r12 = move-exception
            goto Lb0
        L24:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2c:
            rk6 r1 = r11.d
            lh0 r6 = r11.c
            pw6 r7 = r11.b
            qp2 r8 = r11.a
            qp2 r8 = (defpackage.qp2) r8
            java.lang.Object r9 = r11.f
            rk6 r9 = (defpackage.rk6) r9
            kotlin.b.b(r12)     // Catch: java.lang.Throwable -> L3e
            goto L78
        L3e:
            r12 = move-exception
            r6 = r7
            goto Lb0
        L42:
            lh0 r1 = r11.c
            pw6 r6 = r11.b
            qp2 r7 = r11.a
            qp2 r7 = (defpackage.qp2) r7
            java.lang.Object r8 = r11.f
            rk6 r8 = (defpackage.rk6) r8
            kotlin.b.b(r12)     // Catch: java.lang.Throwable -> L21
        L51:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L21
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L21
            if (r12 == 0) goto Laa
            java.lang.Object r12 = r1.f()     // Catch: java.lang.Throwable -> L21
            r11.f = r8     // Catch: java.lang.Throwable -> L21
            r9 = r7
            qp2 r9 = (defpackage.qp2) r9     // Catch: java.lang.Throwable -> L21
            r11.a = r9     // Catch: java.lang.Throwable -> L21
            r11.b = r6     // Catch: java.lang.Throwable -> L21
            r11.c = r1     // Catch: java.lang.Throwable -> L21
            r11.d = r8     // Catch: java.lang.Throwable -> L21
            r11.e = r4     // Catch: java.lang.Throwable -> L21
            java.lang.Object r12 = r7.invoke(r12, r11)     // Catch: java.lang.Throwable -> L21
            if (r12 != r0) goto L73
            goto La9
        L73:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L78:
            r11.f = r9     // Catch: java.lang.Throwable -> L3e
            r10 = r8
            qp2 r10 = (defpackage.qp2) r10     // Catch: java.lang.Throwable -> L3e
            r11.a = r10     // Catch: java.lang.Throwable -> L3e
            r11.b = r7     // Catch: java.lang.Throwable -> L3e
            r11.c = r6     // Catch: java.lang.Throwable -> L3e
            r11.d = r2     // Catch: java.lang.Throwable -> L3e
            r11.e = r3     // Catch: java.lang.Throwable -> L3e
            ep0 r1 = (defpackage.ep0) r1     // Catch: java.lang.Throwable -> L3e
            kotlinx.coroutines.channels.a r1 = r1.d     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r12 = r1.c(r11, r12)     // Catch: java.lang.Throwable -> L3e
            if (r12 != r0) goto L92
            goto La9
        L92:
            r1 = r6
            r6 = r7
            r7 = r8
            r8 = r9
        L96:
            r11.f = r8     // Catch: java.lang.Throwable -> L21
            r12 = r7
            qp2 r12 = (defpackage.qp2) r12     // Catch: java.lang.Throwable -> L21
            r11.a = r12     // Catch: java.lang.Throwable -> L21
            r11.b = r6     // Catch: java.lang.Throwable -> L21
            r11.c = r1     // Catch: java.lang.Throwable -> L21
            r11.e = r5     // Catch: java.lang.Throwable -> L21
            java.lang.Object r12 = r1.d(r11)     // Catch: java.lang.Throwable -> L21
            if (r12 != r0) goto L51
        La9:
            return r0
        Laa:
            r6.g(r2)
            tx8 r12 = defpackage.tx8.a
            return r12
        Lb0:
            throw r12     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            kotlinx.coroutines.channels.b.b(r6, r12)
            throw r0
        Lb6:
            kotlin.b.b(r12)
            java.lang.Object r12 = r11.f
            rk6 r12 = (defpackage.rk6) r12
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
