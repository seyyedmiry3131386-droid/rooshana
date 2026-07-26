package androidx.compose.runtime;

import defpackage.e71;
import defpackage.w61;
import defpackage.wb5;

/* JADX INFO: loaded from: classes.dex */
public final class h implements wb5, e71 {
    public final /* synthetic */ wb5 a;
    public final w61 b;

    public h(wb5 wb5Var, w61 w61Var) {
        this.a = wb5Var;
        this.b = w61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.d r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            d r5 = r0.a
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L4d
        L31:
            r6 = move-exception
            goto L53
        L33:
            kotlin.b.b(r6)
            r0.a = r5     // Catch: java.lang.Throwable -> L31
            r0.d = r3     // Catch: java.lang.Throwable -> L31
            om0 r6 = new om0     // Catch: java.lang.Throwable -> L31
            g51 r0 = defpackage.ok4.I(r0)     // Catch: java.lang.Throwable -> L31
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L31
            r6.v()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.u()     // Catch: java.lang.Throwable -> L31
            if (r6 != r1) goto L4d
            return
        L4d:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L31
            r6.<init>()     // Catch: java.lang.Throwable -> L31
            throw r6     // Catch: java.lang.Throwable -> L31
        L53:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.h.a(d, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // defpackage.wb5
    public final void setValue(Object obj) {
        this.a.setValue(obj);
    }
}
