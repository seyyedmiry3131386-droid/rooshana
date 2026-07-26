package defpackage;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ff2 implements xe2 {
    public final /* synthetic */ xe2 a;
    public final /* synthetic */ SuspendLambda b;

    /* JADX WARN: Multi-variable type inference failed */
    public ff2(xe2 xe2Var, rp2 rp2Var) {
        this.a = xe2Var;
        this.b = (SuspendLambda) rp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // defpackage.xe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ze2 r9, defpackage.g51 r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.d
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.b.b(r10)
            goto La0
        L44:
            ze2 r9 = r0.e
            java.lang.Object r2 = r0.d
            ff2 r2 = (defpackage.ff2) r2
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            kotlin.b.b(r10)
            xe2 r10 = r8.a     // Catch: java.lang.Throwable -> L8a
            r0.d = r8     // Catch: java.lang.Throwable -> L8a
            r0.e = r9     // Catch: java.lang.Throwable -> L8a
            r0.b = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            w61 r4 = r0.getContext()
            r10.<init>(r9, r4)
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = r2.b     // Catch: java.lang.Throwable -> L82
            r0.d = r10     // Catch: java.lang.Throwable -> L82
            r0.e = r6     // Catch: java.lang.Throwable -> L82
            r0.b = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.a(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            tx8 r9 = defpackage.tx8.a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            el8 r10 = new el8
            r10.<init>(r9)
            kotlin.coroutines.jvm.internal.SuspendLambda r2 = r2.b
            r0.d = r9
            r0.e = r6
            r0.b = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.d.b(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff2.a(ze2, g51):java.lang.Object");
    }
}
