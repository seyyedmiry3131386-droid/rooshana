package androidx.compose.animation.core;

import androidx.compose.animation.core.e;
import defpackage.a18;
import defpackage.a49;
import defpackage.dp2;
import defpackage.g51;
import defpackage.jr8;
import defpackage.js3;
import defpackage.l08;
import defpackage.mb5;
import defpackage.ml9;
import defpackage.o06;
import defpackage.ok4;
import defpackage.om0;
import defpackage.pl7;
import defpackage.ql7;
import defpackage.s08;
import defpackage.tt9;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.yi6;
import defpackage.zk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class e extends tt9 {
    public static final zk s = new zk(0.0f);
    public static final zk t = new zk(1.0f);
    public final wb5 c;
    public final wb5 d;
    public Object e;
    public jr8 f;
    public long g;
    public final o06 h;
    public final l08 i;
    public om0 j;
    public final kotlinx.coroutines.sync.a k;
    public final d l;
    public long m;
    public final mb5 n;
    public ql7 o;
    public final pl7 p;
    public float q;
    public final pl7 r;

    /* JADX WARN: Type inference failed for: r3v7, types: [pl7] */
    /* JADX WARN: Type inference failed for: r3v8, types: [pl7] */
    public e(Object obj) {
        super(10);
        this.c = androidx.compose.runtime.g.h(obj);
        this.d = androidx.compose.runtime.g.h(obj);
        this.e = obj;
        this.h = new o06(24, this);
        this.i = androidx.compose.runtime.g.d(0.0f);
        this.k = new kotlinx.coroutines.sync.a();
        this.l = new d();
        this.m = Long.MIN_VALUE;
        this.n = new mb5();
        final int i = 0;
        this.p = new dp2(this) { // from class: pl7
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                Long l = (Long) obj2;
                switch (i) {
                    case 0:
                        this.b.m = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        e eVar = this.b;
                        long j = jLongValue - eVar.m;
                        eVar.m = jLongValue;
                        long jW = ok4.W(j / ((double) eVar.q));
                        mb5 mb5Var = eVar.n;
                        if (mb5Var.e()) {
                            Object[] objArr = mb5Var.a;
                            int i2 = mb5Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                ql7 ql7Var = (ql7) objArr[i4];
                                e.K(ql7Var, jW);
                                ql7Var.c = true;
                            }
                            jr8 jr8Var = eVar.f;
                            if (jr8Var != null) {
                                jr8Var.p();
                            }
                            int i5 = mb5Var.b;
                            Object[] objArr2 = mb5Var.a;
                            uq3 uq3VarZ = ok4.Z(0, i5);
                            int i6 = uq3VarZ.a;
                            int i7 = uq3VarZ.b;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((ql7) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            ew.F0(i5 - i3, i5, null, objArr2);
                            mb5Var.b -= i3;
                        }
                        ql7 ql7Var2 = eVar.o;
                        if (ql7Var2 != null) {
                            ql7Var2.g = eVar.g;
                            e.K(ql7Var2, jW);
                            eVar.N(ql7Var2.d);
                            if (ql7Var2.d == 1.0f) {
                                eVar.o = null;
                            }
                            eVar.M();
                        }
                        break;
                }
                return tx8.a;
            }
        };
        final int i2 = 1;
        this.r = new dp2(this) { // from class: pl7
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                Long l = (Long) obj2;
                switch (i2) {
                    case 0:
                        this.b.m = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        e eVar = this.b;
                        long j = jLongValue - eVar.m;
                        eVar.m = jLongValue;
                        long jW = ok4.W(j / ((double) eVar.q));
                        mb5 mb5Var = eVar.n;
                        if (mb5Var.e()) {
                            Object[] objArr = mb5Var.a;
                            int i22 = mb5Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i22; i4++) {
                                ql7 ql7Var = (ql7) objArr[i4];
                                e.K(ql7Var, jW);
                                ql7Var.c = true;
                            }
                            jr8 jr8Var = eVar.f;
                            if (jr8Var != null) {
                                jr8Var.p();
                            }
                            int i5 = mb5Var.b;
                            Object[] objArr2 = mb5Var.a;
                            uq3 uq3VarZ = ok4.Z(0, i5);
                            int i6 = uq3VarZ.a;
                            int i7 = uq3VarZ.b;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((ql7) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            ew.F0(i5 - i3, i5, null, objArr2);
                            mb5Var.b -= i3;
                        }
                        ql7 ql7Var2 = eVar.o;
                        if (ql7Var2 != null) {
                            ql7Var2.g = eVar.g;
                            e.K(ql7Var2, jW);
                            eVar.N(ql7Var2.d);
                            if (ql7Var2.d == 1.0f) {
                                eVar.o = null;
                            }
                            eVar.M();
                        }
                        break;
                }
                return tx8.a;
            }
        };
    }

    public static final void C(e eVar) {
        jr8 jr8Var = eVar.f;
        if (jr8Var == null) {
            return;
        }
        ql7 ql7Var = eVar.o;
        if (ql7Var == null) {
            if (eVar.g <= 0 || eVar.J() == 1.0f || js3.i(((s08) eVar.d).getValue(), ((s08) eVar.c).getValue())) {
                ql7Var = null;
            } else {
                ql7Var = new ql7();
                ql7Var.d = eVar.J();
                long j = eVar.g;
                ql7Var.g = j;
                ql7Var.h = ok4.W((1.0d - ((double) eVar.J())) * j);
                ql7Var.e.e(0, eVar.J());
            }
        }
        if (ql7Var != null) {
            ql7Var.g = eVar.g;
            eVar.n.g(ql7Var);
            jr8Var.n(ql7Var);
        }
        eVar.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(androidx.compose.animation.core.e r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            mb5 r0 = r11.n
            boolean r1 = r12 instanceof androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            if (r1 == 0) goto L15
            r1 = r12
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r1 = (androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r1 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.c
            r4 = 2
            r5 = 1
            r6 = -9223372036854775808
            tx8 r8 = defpackage.tx8.a
            if (r3 == 0) goto L39
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.b.b(r12)
            goto L73
        L39:
            kotlin.b.b(r12)
            boolean r12 = r0.d()
            if (r12 == 0) goto L47
            ql7 r12 = r11.o
            if (r12 != 0) goto L47
            return r8
        L47:
            w61 r12 = r1.getContext()
            float r12 = androidx.compose.animation.core.f.h(r12)
            r3 = 0
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 != 0) goto L5a
            r11.I()
            r11.m = r6
            return r8
        L5a:
            long r9 = r11.m
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 != 0) goto L73
            pl7 r12 = r11.p
            r1.c = r5
            w61 r3 = r1.getContext()
            qx4 r3 = defpackage.ml9.s(r3)
            java.lang.Object r12 = r3.k0(r1, r12)
            if (r12 != r2) goto L73
            goto L89
        L73:
            boolean r12 = r0.e()
            if (r12 != 0) goto L81
            ql7 r12 = r11.o
            if (r12 == 0) goto L7e
            goto L81
        L7e:
            r11.m = r6
            return r8
        L81:
            r1.c = r4
            java.lang.Object r12 = r11.G(r1)
            if (r12 != r2) goto L73
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.e.D(androidx.compose.animation.core.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E(androidx.compose.animation.core.e r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            kotlinx.coroutines.sync.a r0 = r7.k
            boolean r1 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            if (r1 == 0) goto L15
            r1 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r1 = (androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r1 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            java.lang.Object r0 = r1.a
            kotlin.b.b(r8)
            goto L73
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r3 = r1.a
            kotlin.b.b(r8)
            r8 = r3
            goto L53
        L3d:
            kotlin.b.b(r8)
            wb5 r8 = r7.c
            s08 r8 = (defpackage.s08) r8
            java.lang.Object r8 = r8.getValue()
            r1.a = r8
            r1.d = r5
            java.lang.Object r3 = r0.b(r1)
            if (r3 != r2) goto L53
            goto L6f
        L53:
            r1.a = r8
            r1.d = r4
            om0 r3 = new om0
            g51 r1 = defpackage.ok4.I(r1)
            r3.<init>(r5, r1)
            r3.v()
            r7.j = r3
            r1 = 0
            r0.d(r1)
            java.lang.Object r0 = r3.u()
            if (r0 != r2) goto L70
        L6f:
            return r2
        L70:
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            boolean r8 = defpackage.js3.i(r8, r0)
            if (r8 == 0) goto L7c
            tx8 r7 = defpackage.tx8.a
            return r7
        L7c:
            r0 = -9223372036854775808
            r7.m = r0
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "targetState while waiting for composition"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.e.E(androidx.compose.animation.core.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(androidx.compose.animation.core.e r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            kotlinx.coroutines.sync.a r0 = r8.k
            boolean r1 = r9 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            if (r1 == 0) goto L15
            r1 = r9
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r1 = (androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r1 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            java.lang.Object r0 = r1.a
            kotlin.b.b(r9)
            goto L7f
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r3 = r1.a
            kotlin.b.b(r9)
            r9 = r3
            goto L53
        L3d:
            kotlin.b.b(r9)
            wb5 r9 = r8.c
            s08 r9 = (defpackage.s08) r9
            java.lang.Object r9 = r9.getValue()
            r1.a = r9
            r1.d = r5
            java.lang.Object r3 = r0.b(r1)
            if (r3 != r2) goto L53
            goto L7b
        L53:
            java.lang.Object r3 = r8.e
            boolean r3 = defpackage.js3.i(r9, r3)
            r6 = 0
            if (r3 == 0) goto L60
            r0.d(r6)
            goto L85
        L60:
            r1.a = r9
            r1.d = r4
            om0 r3 = new om0
            g51 r1 = defpackage.ok4.I(r1)
            r3.<init>(r5, r1)
            r3.v()
            r8.j = r3
            r0.d(r6)
            java.lang.Object r0 = r3.u()
            if (r0 != r2) goto L7c
        L7b:
            return r2
        L7c:
            r7 = r0
            r0 = r9
            r9 = r7
        L7f:
            boolean r1 = defpackage.js3.i(r9, r0)
            if (r1 == 0) goto L88
        L85:
            tx8 r8 = defpackage.tx8.a
            return r8
        L88:
            r1 = -9223372036854775808
            r8.m = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.e.F(androidx.compose.animation.core.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object H(e eVar, Object obj, g51 g51Var) {
        Object objA;
        jr8 jr8Var = eVar.f;
        return (jr8Var != null && (objA = d.a(eVar.l, new SeekableTransitionState$animateTo$2(null, jr8Var, eVar, obj), g51Var)) == CoroutineSingletons.a) ? objA : tx8.a;
    }

    public static void K(ql7 ql7Var, long j) {
        long j2 = ql7Var.a;
        zk zkVar = ql7Var.e;
        long j3 = j2 + j;
        ql7Var.a = j3;
        long j4 = ql7Var.h;
        if (j3 >= j4) {
            ql7Var.d = 1.0f;
            return;
        }
        a49 a49Var = ql7Var.b;
        if (a49Var == null) {
            float f = j3 / j4;
            ql7Var.d = (f * 1.0f) + ((1 - f) * zkVar.a(0));
            return;
        }
        zk zkVar2 = ql7Var.f;
        if (zkVar2 == null) {
            zkVar2 = s;
        }
        ql7Var.d = ok4.s(((zk) a49Var.q(j3, zkVar, t, zkVar2)).a(0), 0.0f, 1.0f);
    }

    public final Object G(ContinuationImpl continuationImpl) {
        float fH = f.h(continuationImpl.getContext());
        tx8 tx8Var = tx8.a;
        if (fH <= 0.0f) {
            I();
            return tx8Var;
        }
        this.q = fH;
        Object objK0 = ml9.s(continuationImpl.getContext()).k0(continuationImpl, this.r);
        return objK0 == CoroutineSingletons.a ? objK0 : tx8Var;
    }

    public final void I() {
        jr8 jr8Var = this.f;
        if (jr8Var != null) {
            jr8Var.c();
        }
        this.n.j();
        if (this.o != null) {
            this.o = null;
            N(1.0f);
            M();
        }
    }

    public final float J() {
        return this.i.h();
    }

    public final Object L(float f, Object obj, SuspendLambda suspendLambda) {
        if (0.0f > f || f > 1.0f) {
            yi6.a("Expecting fraction between 0 and 1. Got " + f);
        }
        jr8 jr8Var = this.f;
        if (jr8Var != null) {
            Object objA = d.a(this.l, new SeekableTransitionState$seekTo$3(obj, ((s08) this.c).getValue(), this, jr8Var, f, null), suspendLambda);
            if (objA == CoroutineSingletons.a) {
                return objA;
            }
        }
        return tx8.a;
    }

    public final void M() {
        jr8 jr8Var = this.f;
        if (jr8Var == null) {
            return;
        }
        jr8Var.m(ok4.W(((double) J()) * ((Number) jr8Var.l.getValue()).longValue()));
    }

    public final void N(float f) {
        this.i.i(f);
    }

    public final Object O(g51 g51Var, Object obj) {
        jr8 jr8Var = this.f;
        if (jr8Var != null && (!js3.i(((s08) this.d).getValue(), obj) || !js3.i(((s08) this.c).getValue(), obj))) {
            Object objA = d.a(this.l, new SeekableTransitionState$snapTo$2(null, jr8Var, this, obj), g51Var);
            if (objA == CoroutineSingletons.a) {
                return objA;
            }
        }
        return tx8.a;
    }

    @Override // defpackage.tt9
    public final Object j() {
        return ((s08) this.d).getValue();
    }

    @Override // defpackage.tt9
    public final Object k() {
        return ((s08) this.c).getValue();
    }

    @Override // defpackage.tt9
    public final void s(Object obj) {
        ((s08) this.d).setValue(obj);
    }

    @Override // defpackage.tt9
    public final void t(jr8 jr8Var) {
        jr8 jr8Var2 = this.f;
        if (jr8Var2 != null && !jr8Var.equals(jr8Var2)) {
            yi6.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f + ", new instance: " + jr8Var);
        }
        this.f = jr8Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c24, java.lang.Object] */
    @Override // defpackage.tt9
    public final void u() {
        this.f = null;
        ((a18) h.b.getValue()).b(this);
    }
}
