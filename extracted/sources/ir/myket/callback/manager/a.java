package ir.myket.callback.manager;

import defpackage.a27;
import defpackage.bt2;
import defpackage.e51;
import defpackage.e71;
import defpackage.fj1;
import defpackage.im3;
import defpackage.js3;
import defpackage.kf1;
import defpackage.ko3;
import defpackage.ql0;
import defpackage.rr2;
import defpackage.ub8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.vn7;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final ir.myket.analytics.spix.domain.usecase.a a;
    public final vn7 b;
    public final ko3 c;
    public final rr2 d;
    public final fj1 e;
    public final im3 f;
    public final e71 g;

    public a(ir.myket.analytics.spix.domain.usecase.a aVar, vn7 vn7Var, ko3 ko3Var, rr2 rr2Var, fj1 fj1Var, im3 im3Var) {
        ub8 ub8VarA = a27.a();
        ug1 ug1Var = up1.a;
        e51 e51VarA = js3.a(bt2.L(ub8VarA, kf1.c));
        this.a = aVar;
        this.b = vn7Var;
        this.c = ko3Var;
        this.d = rr2Var;
        this.e = fj1Var;
        this.f = im3Var;
        this.g = e51VarA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (defpackage.bt2.Z(defpackage.kf1.c, new ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$deleteCallbackUrl$$inlined$safeDbCall$default$1(null, r9, r3), r1) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        if (r15 == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        if (r15 == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if (r15 == r2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ir.myket.callback.manager.a r13, defpackage.ql0 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.callback.manager.a.a(ir.myket.callback.manager.a, ql0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(ql0 ql0Var) {
        bt2.G(this.g, null, null, new CallbackUrlManager$sendCallbackUrl$1(this, ql0Var, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (r17.a.z0(r5, r3) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ql0 r18, int r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$1
            if (r3 == 0) goto L19
            r3 = r2
            ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$1 r3 = (ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$1) r3
            int r4 = r3.g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.g = r4
            goto L1e
        L19:
            ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$1 r3 = new ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r5 = r3.g
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L4a
            if (r5 == r7) goto L3a
            if (r5 != r6) goto L32
            kotlin.b.b(r2)
            goto La3
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            int r1 = r3.d
            int r5 = r3.c
            ql0 r7 = r3.b
            ql0 r9 = r3.a
            kotlin.b.b(r2)
            r14 = r5
            r5 = r2
            r2 = r1
            r1 = r7
            goto L6e
        L4a:
            kotlin.b.b(r2)
            ug1 r2 = defpackage.up1.a
            kf1 r2 = defpackage.kf1.c
            ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$2$ip$1 r5 = new ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$2$ip$1
            r5.<init>(r1, r8)
            r3.a = r1
            r3.b = r1
            r9 = r19
            r3.c = r9
            r10 = 0
            r3.d = r10
            r3.g = r7
            java.lang.Object r2 = defpackage.bt2.Z(r2, r5, r3)
            if (r2 != r4) goto L6a
            goto La2
        L6a:
            r5 = r2
            r14 = r9
            r2 = r10
            r9 = r1
        L6e:
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
            eo7 r5 = new eo7
            am0 r10 = new am0
            ir.myket.callback.domain.models.CallbackUrlType r7 = r1.b
            java.lang.String r11 = r7.name()
            java.lang.String r12 = r1.a
            int r13 = r1.c
            java.lang.String r1 = r9.a
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r15 = r1.getHost()
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r5.<init>(r10)
            r3.a = r8
            r3.b = r8
            r3.c = r14
            r3.d = r2
            r3.g = r6
            ir.myket.analytics.spix.domain.usecase.a r1 = r0.a
            java.lang.Object r1 = r1.z0(r5, r3)
            if (r1 != r4) goto La3
        La2:
            return r4
        La3:
            tx8 r1 = defpackage.tx8.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.callback.manager.a.c(ql0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void d() {
        bt2.G(this.g, null, null, new CallbackUrlManager$syncDbCallbackUrls$1(this, null), 3);
    }
}
