package androidx.media3.ui.compose.state;

import androidx.compose.runtime.g;
import defpackage.gb6;
import defpackage.j29;
import defpackage.js3;
import defpackage.wb5;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final gb6 a;
    public final wb5 b;
    public final wb5 c;

    public a(gb6 gb6Var) {
        js3.p(gb6Var, "player");
        this.a = gb6Var;
        this.b = g.h(Boolean.valueOf(j29.f0(gb6Var)));
        this.c = g.h(Boolean.valueOf(j29.g0(gb6Var, true)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.media3.ui.compose.state.PlayPauseButtonState$observe$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.media3.ui.compose.state.PlayPauseButtonState$observe$1 r0 = (androidx.media3.ui.compose.state.PlayPauseButtonState$observe$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.media3.ui.compose.state.PlayPauseButtonState$observe$1 r0 = new androidx.media3.ui.compose.state.PlayPauseButtonState$observe$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            kotlin.KotlinNothingValueException r5 = defpackage.t61.q(r5)
            throw r5
        L30:
            kotlin.b.b(r5)
            gb6 r5 = r4.a
            boolean r1 = defpackage.j29.g0(r5, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            wb5 r3 = r4.c
            s08 r3 = (defpackage.s08) r3
            r3.setValue(r1)
            boolean r1 = defpackage.j29.f0(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            wb5 r3 = r4.b
            s08 r3 = (defpackage.s08) r3
            r3.setValue(r1)
            g8 r1 = new g8
            r3 = 18
            r1.<init>(r3, r4)
            r0.c = r2
            androidx.media3.common.c.a(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.compose.state.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
