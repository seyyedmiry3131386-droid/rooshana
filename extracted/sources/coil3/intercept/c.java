package coil3.intercept;

import android.content.Context;
import defpackage.dy7;
import defpackage.hy2;
import defpackage.ir3;
import defpackage.pi3;
import defpackage.tp5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final pi3 a;
    public final List b;
    public final int c;
    public final pi3 d;
    public final dy7 e;
    public final hy2 f;
    public final boolean g;

    public c(pi3 pi3Var, List list, int i, pi3 pi3Var2, dy7 dy7Var, hy2 hy2Var, boolean z) {
        this.a = pi3Var;
        this.b = list;
        this.c = i;
        this.d = pi3Var2;
        this.e = dy7Var;
        this.f = hy2Var;
        this.g = z;
    }

    public static c b(c cVar, int i, pi3 pi3Var, int i2) {
        if ((i2 & 1) != 0) {
            i = cVar.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            pi3Var = cVar.d;
        }
        dy7 dy7Var = cVar.e;
        return new c(cVar.a, cVar.b, i3, pi3Var, dy7Var, cVar.f, cVar.g);
    }

    public final void a(pi3 pi3Var, ir3 ir3Var) {
        Context context = pi3Var.a;
        pi3 pi3Var2 = this.a;
        if (context != pi3Var2.a) {
            throw new IllegalStateException(("Interceptor '" + ir3Var + "' cannot modify the request's context.").toString());
        }
        if (pi3Var.b == tp5.a) {
            throw new IllegalStateException(("Interceptor '" + ir3Var + "' cannot set the request's data to null.").toString());
        }
        if (pi3Var.c != pi3Var2.c) {
            throw new IllegalStateException(("Interceptor '" + ir3Var + "' cannot modify the request's target.").toString());
        }
        if (pi3Var.p == pi3Var2.p) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + ir3Var + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = (coil3.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = new coil3.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ir3 r0 = r0.a
            kotlin.b.b(r8)
            goto L53
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.b.b(r8)
            java.util.List r8 = r7.b
            int r2 = r7.c
            java.lang.Object r8 = r8.get(r2)
            ir3 r8 = (defpackage.ir3) r8
            int r2 = r2 + r3
            r4 = 0
            r5 = 6
            coil3.intercept.c r2 = b(r7, r2, r4, r5)
            r0.a = r8
            r0.d = r3
            java.lang.Object r0 = r8.a(r2, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r6 = r0
            r0 = r8
            r8 = r6
        L53:
            ti3 r8 = (defpackage.ti3) r8
            pi3 r1 = r8.a()
            r7.a(r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.c.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
