package ir.myket.analytics.spix.domain.usecase;

import defpackage.y28;
import defpackage.yq2;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends yq2 {
    public final y28 g;

    public a(y28 y28Var) {
        this.g = y28Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z0(defpackage.eo7 r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof ir.myket.analytics.spix.domain.usecase.SendSpixLogUseCase$executeUseCase$1
            if (r2 == 0) goto L17
            r2 = r1
            ir.myket.analytics.spix.domain.usecase.SendSpixLogUseCase$executeUseCase$1 r2 = (ir.myket.analytics.spix.domain.usecase.SendSpixLogUseCase$executeUseCase$1) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            ir.myket.analytics.spix.domain.usecase.SendSpixLogUseCase$executeUseCase$1 r2 = new ir.myket.analytics.spix.domain.usecase.SendSpixLogUseCase$executeUseCase$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r4 = r2.c
            tx8 r5 = defpackage.tx8.a
            r6 = 1
            if (r4 == 0) goto L35
            if (r4 != r6) goto L2d
            kotlin.b.b(r1)
            return r5
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            kotlin.b.b(r1)
            r1 = r20
            a38 r1 = r1.a
            r2.c = r6
            y28 r4 = r0.g
            z28 r4 = (defpackage.z28) r4
            d38 r7 = new d38
            j10 r8 = r4.b
            ir.myket.persistent.datasource.a r9 = r8.a
            ir.myket.persistent.datasource.b r10 = r9.c
            ox3[] r11 = ir.myket.persistent.datasource.a.n
            r6 = r11[r6]
            java.lang.Object r6 = r10.a(r9, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L58
            java.lang.String r6 = ""
        L58:
            java.lang.String r9 = r8.a()
            java.lang.String r10 = defpackage.wq2.A()
            java.lang.String r11 = defpackage.wq2.I()
            java.lang.String r12 = defpackage.wq2.x()
            java.util.List r13 = defpackage.wq2.C()
            r17 = 0
            r18 = 62
            java.lang.String r14 = "|"
            r15 = 0
            r16 = 0
            java.lang.String r13 = kotlin.collections.a.t0(r13, r14, r15, r16, r17, r18)
            r8 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            tv3 r6 = defpackage.cv3.a
            r6.getClass()
            c38 r8 = defpackage.d38.Companion
            px3 r8 = r8.serializer()
            px3 r8 = defpackage.ct2.n(r8)
            px3 r8 = (defpackage.px3) r8
            kv3 r6 = r6.b(r8, r7)
            ug1 r7 = defpackage.up1.a
            kf1 r7 = defpackage.kf1.c
            ir.myket.analytics.spix.data.repository.SpixRepositoryImpl$sendSpixLog$$inlined$safeCall$default$1 r8 = new ir.myket.analytics.spix.data.repository.SpixRepositoryImpl$sendSpixLog$$inlined$safeCall$default$1
            r9 = 0
            r8.<init>(r9, r4, r1, r6)
            java.lang.Object r1 = defpackage.bt2.Z(r7, r8, r2)
            if (r1 != r3) goto La3
            goto La4
        La3:
            r1 = r5
        La4:
            if (r1 != r3) goto La7
            return r3
        La7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.analytics.spix.domain.usecase.a.z0(eo7, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
