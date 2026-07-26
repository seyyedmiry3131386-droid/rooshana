package androidx.compose.foundation.gestures;

import defpackage.qj1;

/* JADX INFO: loaded from: classes.dex */
public final class j implements qj1 {
    public final /* synthetic */ qj1 a;
    public boolean b;
    public boolean c;
    public final kotlinx.coroutines.sync.a d = new kotlinx.coroutines.sync.a();

    public j(qj1 qj1Var) {
        this.a = qj1Var;
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
        return this.a.L(f);
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.a.O();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return this.a.S(f);
    }

    public final void a() {
        this.c = true;
        kotlinx.coroutines.sync.a aVar = this.d;
        if (aVar.f()) {
            aVar.d(null);
        }
    }

    public final void b() {
        this.b = true;
        kotlinx.coroutines.sync.a aVar = this.d;
        if (aVar.f()) {
            aVar.d(null);
        }
    }

    @Override // defpackage.qj1
    public final int b0(float f) {
        return this.a.b0(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.b.b(r5)
            r0.c = r3
            kotlinx.coroutines.sync.a r5 = r4.d
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r5 = 0
            r4.b = r5
            r4.c = r5
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.j.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            kotlinx.coroutines.sync.a r3 = r5.d
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.b.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.b.b(r6)
            boolean r6 = r5.b
            if (r6 != 0) goto L49
            boolean r6 = r5.c
            if (r6 != 0) goto L49
            r0.c = r4
            java.lang.Object r6 = r3.b(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r6 = 0
            r3.d(r6)
        L49:
            boolean r6 = r5.b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.j.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.qj1
    public final long h0(long j) {
        return this.a.h0(j);
    }

    @Override // defpackage.qj1
    public final float j0(long j) {
        return this.a.j0(j);
    }

    @Override // defpackage.qj1
    public final long o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.qj1
    public final float s(long j) {
        return this.a.s(j);
    }
}
