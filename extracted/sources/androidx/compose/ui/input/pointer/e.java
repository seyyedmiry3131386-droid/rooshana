package androidx.compose.ui.input.pointer;

import defpackage.dw1;
import defpackage.g51;
import defpackage.o40;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qj1;
import defpackage.v69;
import defpackage.w61;
import defpackage.y40;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class e implements qj1, g51 {
    public final /* synthetic */ f a;
    public final om0 b;
    public om0 c;
    public PointerEventPass d = PointerEventPass.b;
    public final EmptyCoroutineContext e = EmptyCoroutineContext.a;
    public final /* synthetic */ f f;

    public e(f fVar, om0 om0Var) {
        this.f = fVar;
        this.a = fVar;
        this.b = om0Var;
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return this.a.F(f);
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return this.a.J(i);
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.a.O();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return this.a.getDensity() * f;
    }

    public final Object a(PointerEventPass pointerEventPass, g51 g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        this.d = pointerEventPass;
        this.c = om0Var;
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    public final long b() {
        f fVar = this.f;
        fVar.getClass();
        long jD = o40.d(y40.H(fVar).C.d(), fVar);
        long j = fVar.x;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.qj1
    public final int b0(float f) {
        f fVar = this.a;
        fVar.getClass();
        return o40.a(fVar, f);
    }

    public final v69 c() {
        f fVar = this.f;
        fVar.getClass();
        return y40.H(fVar).C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [wt3] */
    /* JADX WARN: Type inference failed for: r7v4, types: [wt3] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [qp2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r7, defpackage.qp2 r9, kotlin.coroutines.jvm.internal.BaseContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            li1 r7 = r0.a
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L29
            goto L68
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.b.b(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            om0 r10 = r6.c
            if (r10 == 0) goto L4c
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2.<init>(r7)
            kotlin.Result$Failure r2 = kotlin.b.a(r2)
            r10.resumeWith(r2)
        L4c:
            androidx.compose.ui.input.pointer.f r10 = r6.f
            e71 r10 = r10.o0()
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            li1 r7 = defpackage.bt2.G(r10, r4, r4, r2, r7)
            r0.a = r7     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L68
            return r1
        L68:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.a
            r7.g(r8)
            return r10
        L6e:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.a
            r7.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.e.e(long, qp2, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r5, defpackage.qp2 r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r8)
            r0.c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
            java.lang.Object r5 = r4.e(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.e.g(long, qp2, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return this.e;
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.qj1
    public final long h0(long j) {
        f fVar = this.a;
        fVar.getClass();
        return o40.d(j, fVar);
    }

    @Override // defpackage.qj1
    public final float j0(long j) {
        f fVar = this.a;
        fVar.getClass();
        return o40.c(j, fVar);
    }

    @Override // defpackage.qj1
    public final long o(long j) {
        f fVar = this.a;
        fVar.getClass();
        return o40.b(j, fVar);
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        f fVar = this.f;
        synchronized (fVar.u) {
            fVar.t.k(this);
        }
        this.b.resumeWith(obj);
    }

    @Override // defpackage.qj1
    public final float s(long j) {
        f fVar = this.a;
        fVar.getClass();
        return dw1.b(j, fVar);
    }
}
