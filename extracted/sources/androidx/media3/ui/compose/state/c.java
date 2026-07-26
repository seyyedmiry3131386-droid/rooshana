package androidx.media3.ui.compose.state;

import androidx.compose.runtime.g;
import defpackage.ey7;
import defpackage.gb6;
import defpackage.s08;
import defpackage.uy6;
import defpackage.wb5;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final wb5 a = g.h(null);
    public final wb5 b = g.h(Boolean.TRUE);
    public Object c;

    public static ey7 a(gb6 gb6Var) {
        if (gb6Var == null) {
            return null;
        }
        long jA = uy6.a(gb6Var.r().a, gb6Var.r().b);
        if (ey7.e(jA) == 0.0f || ey7.c(jA) == 0.0f) {
            return null;
        }
        float f = gb6Var.r().c;
        double d = f;
        if (d < 1.0d) {
            jA = ey7.a(jA, ey7.e(jA) * f, 0.0f, 2);
        } else if (d > 1.0d) {
            jA = ey7.a(jA, 0.0f, ey7.c(jA) / f, 1);
        }
        return new ey7(jA);
    }

    public final void b(gb6 gb6Var) {
        wb5 wb5Var = this.b;
        if (gb6Var == null) {
            ((Boolean) ((s08) wb5Var).getValue()).booleanValue();
            ((s08) wb5Var).setValue(true);
            return;
        }
        boolean z = gb6Var.f0(30) && !gb6Var.G().a.isEmpty();
        if (!z) {
            ((s08) wb5Var).setValue(Boolean.TRUE);
        }
        if (z) {
            if (gb6Var.f0(30) && gb6Var.G().a(2)) {
                return;
            }
            ((s08) wb5Var).setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.gb6 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.media3.ui.compose.state.PresentationState$observe$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.media3.ui.compose.state.PresentationState$observe$1 r0 = (androidx.media3.ui.compose.state.PresentationState$observe$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.media3.ui.compose.state.PresentationState$observe$1 r0 = new androidx.media3.ui.compose.state.PresentationState$observe$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            androidx.media3.ui.compose.state.c r5 = r0.a
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L36
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L36
            throw r6     // Catch: java.lang.Throwable -> L36
        L36:
            r6 = move-exception
            goto L64
        L38:
            kotlin.b.b(r6)
            ey7 r6 = a(r5)     // Catch: java.lang.Throwable -> L5a
            wb5 r2 = r4.a     // Catch: java.lang.Throwable -> L62
            s08 r2 = (defpackage.s08) r2     // Catch: java.lang.Throwable -> L62
            r2.setValue(r6)     // Catch: java.lang.Throwable -> L62
            r4.b(r5)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L5d
            iz r6 = new iz     // Catch: java.lang.Throwable -> L5a
            r2 = 15
            r6.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L5a
            r0.a = r4     // Catch: java.lang.Throwable -> L5a
            r0.d = r3     // Catch: java.lang.Throwable -> L5a
            androidx.media3.common.c.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L5a
            return r1
        L5a:
            r6 = move-exception
        L5b:
            r5 = r4
            goto L64
        L5d:
            tx8 r5 = defpackage.tx8.a
            return r5
        L60:
            r6 = r5
            goto L5b
        L62:
            r5 = move-exception
            goto L60
        L64:
            r5.getClass()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.compose.state.c.c(gb6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
