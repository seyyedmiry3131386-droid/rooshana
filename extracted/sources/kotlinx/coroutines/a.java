package kotlinx.coroutines;

import defpackage.b47;
import defpackage.bq1;
import defpackage.bt2;
import defpackage.dq1;
import defpackage.em8;
import defpackage.eq;
import defpackage.eu3;
import defpackage.g51;
import defpackage.ne1;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qi1;
import defpackage.qp2;
import defpackage.th0;
import defpackage.tx8;
import defpackage.u61;
import defpackage.w61;
import defpackage.wt3;
import defpackage.x2;
import defpackage.xt3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static xt3 a() {
        return new xt3(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            kotlin.b.b(r4)
            goto L47
        L2f:
            kotlin.b.b(r4)
            r0.b = r3
            om0 r4 = new om0
            g51 r0 = defpackage.ok4.I(r0)
            r4.<init>(r3, r0)
            r4.v()
            java.lang.Object r4 = r4.u()
            if (r4 != r1) goto L47
            return
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.b(kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    public static final void c(w61 w61Var, CancellationException cancellationException) {
        wt3 wt3Var = (wt3) w61Var.r0(th0.n);
        if (wt3Var != null) {
            wt3Var.g(cancellationException);
        }
    }

    public static final Object d(wt3 wt3Var, SuspendLambda suspendLambda) {
        wt3Var.g(null);
        Object objD = wt3Var.D(suspendLambda);
        return objD == CoroutineSingletons.a ? objD : tx8.a;
    }

    public static final Object e(long j, g51 g51Var) {
        if (j > 0) {
            om0 om0Var = new om0(1, ok4.I(g51Var));
            om0Var.v();
            if (j < Long.MAX_VALUE) {
                g(om0Var.e).u(j, om0Var);
            }
            Object objU = om0Var.u();
            if (objU == CoroutineSingletons.a) {
                return objU;
            }
        }
        return tx8.a;
    }

    public static final void f(w61 w61Var) {
        wt3 wt3Var = (wt3) w61Var.r0(th0.n);
        if (wt3Var != null && !wt3Var.b()) {
            throw wt3Var.I();
        }
    }

    public static final qi1 g(w61 w61Var) {
        u61 u61VarR0 = w61Var.r0(eq.u);
        qi1 qi1Var = u61VarR0 instanceof qi1 ? (qi1) u61VarR0 : null;
        return qi1Var == null ? ne1.a : qi1Var;
    }

    public static final wt3 h(w61 w61Var) {
        wt3 wt3Var = (wt3) w61Var.r0(th0.n);
        if (wt3Var != null) {
            return wt3Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + w61Var).toString());
    }

    public static final bq1 i(wt3 wt3Var, boolean z, eu3 eu3Var) {
        return wt3Var instanceof c ? ((c) wt3Var).S(z, eu3Var) : wt3Var.k(eu3Var.k(), z, new JobKt__JobKt$invokeOnCompletion$1(1, eu3Var, eu3.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean j(w61 w61Var) {
        wt3 wt3Var = (wt3) w61Var.r0(th0.n);
        if (wt3Var != null) {
            return wt3Var.b();
        }
        return true;
    }

    public static Object k(x2 x2Var, g51 g51Var) {
        return bt2.Z(EmptyCoroutineContext.a, new InterruptibleKt$runInterruptible$2(x2Var, null), g51Var);
    }

    public static final Object l(em8 em8Var, qp2 qp2Var) {
        i(em8Var, true, new dq1(0, g(em8Var.d.getContext()).d(em8Var.e, em8Var, em8Var.c)));
        return b47.u(em8Var, false, em8Var, qp2Var);
    }

    public static final Object m(long j, qp2 qp2Var, ContinuationImpl continuationImpl) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objL = l(new em8(j, continuationImpl), qp2Var);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objL;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(long r6, defpackage.qp2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.a
            kotlin.b.b(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L29
            return r9
        L29:
            r7 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.b.b(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5d
        L3d:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r0.a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r0.c = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            em8 r2 = new em8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r2.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r9.a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            java.lang.Object r6 = l(r2, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            if (r6 != r1) goto L54
            return r1
        L54:
            return r6
        L55:
            r7 = move-exception
            r6 = r9
        L57:
            wt3 r8 = r7.a
            java.lang.Object r6 = r6.a
            if (r8 != r6) goto L5f
        L5d:
            r6 = 0
            return r6
        L5f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.n(long, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
