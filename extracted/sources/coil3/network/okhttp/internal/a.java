package coil3.network.okhttp.internal;

import defpackage.hs5;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final hs5 a;

    public /* synthetic */ a(hs5 hs5Var) {
        this.a = hs5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(defpackage.hs5 r8, defpackage.xm5 r9, defpackage.qp2 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.io.IOException {
        /*
            boolean r0 = r11 instanceof coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            if (r0 == 0) goto L13
            r0 = r11
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = (coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = new coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L57
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r8 = r0.b
            java.io.Closeable r8 = (java.io.Closeable) r8
            qp2 r9 = r0.a
            qp2 r9 = (defpackage.qp2) r9
            kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L37
            goto Lb0
        L37:
            r9 = move-exception
            goto Lb8
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            qp2 r8 = r0.a
            qp2 r8 = (defpackage.qp2) r8
            kotlin.b.b(r11)
            goto L98
        L4a:
            java.lang.Object r8 = r0.b
            cl0 r8 = (defpackage.cl0) r8
            qp2 r9 = r0.a
            r10 = r9
            qp2 r10 = (defpackage.qp2) r10
            kotlin.b.b(r11)
            goto L67
        L57:
            kotlin.b.b(r11)
            r0.a = r10
            r0.b = r8
            r0.d = r5
            w47 r11 = coil3.network.okhttp.internal.b.b(r9, r0)
            if (r11 != r1) goto L67
            goto Lae
        L67:
            w47 r11 = (defpackage.w47) r11
            hs5 r8 = (defpackage.hs5) r8
            xv6 r8 = r8.b(r11)
            r9 = r10
            qp2 r9 = (defpackage.qp2) r9
            r0.a = r9
            r0.b = r6
            r0.d = r4
            om0 r9 = new om0
            g51 r11 = defpackage.ok4.I(r0)
            r9.<init>(r5, r11)
            r9.v()
            wb r11 = new wb
            r2 = 2
            r11.<init>(r8, r9, r2)
            r8.c(r11)
            r9.x(r11)
            java.lang.Object r11 = r9.u()
            if (r11 != r1) goto L97
            goto Lae
        L97:
            r8 = r10
        L98:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            g77 r10 = (defpackage.g77) r10     // Catch: java.lang.Throwable -> Lb4
            ym5 r10 = coil3.network.okhttp.internal.b.a(r10)     // Catch: java.lang.Throwable -> Lb4
            r0.a = r6     // Catch: java.lang.Throwable -> Lb4
            r0.b = r9     // Catch: java.lang.Throwable -> Lb4
            r0.d = r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r11 != r1) goto Laf
        Lae:
            return r1
        Laf:
            r8 = r9
        Lb0:
            defpackage.tv8.h(r8, r6)
            return r11
        Lb4:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lb8:
            throw r9     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r10 = move-exception
            defpackage.tv8.h(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.a.a(hs5, xm5, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ')';
    }
}
