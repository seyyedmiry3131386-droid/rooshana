package androidx.tv.material3;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusStateImpl;
import defpackage.ab5;
import defpackage.av;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.by3;
import defpackage.ct2;
import defpackage.dp2;
import defpackage.dt0;
import defpackage.e3;
import defpackage.e71;
import defpackage.et0;
import defpackage.ew;
import defpackage.fe0;
import defpackage.ft0;
import defpackage.g51;
import defpackage.gt0;
import defpackage.gu9;
import defpackage.hn7;
import defpackage.hs9;
import defpackage.ht0;
import defpackage.hx4;
import defpackage.iz0;
import defpackage.jz0;
import defpackage.my6;
import defpackage.nn7;
import defpackage.o40;
import defpackage.ox3;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rf0;
import defpackage.rj6;
import defpackage.rp2;
import defpackage.sj6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug2;
import defpackage.wb5;
import defpackage.xr7;
import defpackage.xt2;
import defpackage.zk8;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class SurfaceKt$Surface$2 extends Lambda implements qp2 {
    public final /* synthetic */ bp2 g;
    public final /* synthetic */ hx4 h;
    public final /* synthetic */ bp2 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ float k;
    public final /* synthetic */ ht0 l;
    public final /* synthetic */ et0 m;
    public final /* synthetic */ gt0 n;
    public final /* synthetic */ dt0 o;
    public final /* synthetic */ ft0 p;
    public final /* synthetic */ ab5 q;
    public final /* synthetic */ androidx.compose.runtime.internal.a r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$2(bp2 bp2Var, hx4 hx4Var, bp2 bp2Var2, boolean z, float f, ht0 ht0Var, et0 et0Var, gt0 gt0Var, dt0 dt0Var, ft0 ft0Var, ab5 ab5Var, androidx.compose.runtime.internal.a aVar, int i, int i2) {
        super(2);
        this.g = bp2Var;
        this.h = hx4Var;
        this.i = bp2Var2;
        this.j = z;
        this.k = f;
        this.l = ht0Var;
        this.m = et0Var;
        this.n = gt0Var;
        this.o = dt0Var;
        this.p = ft0Var;
        this.q = ab5Var;
        this.r = aVar;
        this.s = i;
        this.t = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        final ab5 ab5Var;
        xr7 xr7Var;
        bp2 bp2Var;
        long j;
        long j2;
        long j3;
        ft0 ft0Var;
        dt0 dt0Var;
        et0 et0Var;
        androidx.compose.runtime.internal.a aVar;
        bp2 bp2Var2;
        hx4 hx4Var;
        gt0 gt0Var;
        ht0 ht0Var;
        float f;
        qz0 qz0Var = (qz0) obj;
        ((Number) obj2).intValue();
        int iW = hs9.W(this.s | 1);
        int iW2 = hs9.W(this.t);
        qz0Var.c0(-696519997);
        int i3 = iW & 6;
        final bp2 bp2Var3 = this.g;
        if (i3 == 0) {
            i = (qz0Var.h(bp2Var3) ? 4 : 2) | iW;
        } else {
            i = iW;
        }
        int i4 = iW & 48;
        hx4 hx4Var2 = this.h;
        if (i4 == 0) {
            i |= qz0Var.f(hx4Var2) ? 32 : 16;
        }
        int i5 = iW & 384;
        final bp2 bp2Var4 = this.i;
        if (i5 == 0) {
            i |= qz0Var.h(bp2Var4) ? 256 : 128;
        }
        int i6 = i | 27648;
        int i7 = 196608 & iW;
        ht0 ht0Var2 = this.l;
        if (i7 == 0) {
            i6 |= qz0Var.f(ht0Var2) ? 131072 : 65536;
        }
        int i8 = 1572864 & iW;
        et0 et0Var2 = this.m;
        if (i8 == 0) {
            i6 |= qz0Var.f(et0Var2) ? 1048576 : 524288;
        }
        int i9 = 12582912 & iW;
        gt0 gt0Var2 = this.n;
        if (i9 == 0) {
            i6 |= qz0Var.f(gt0Var2) ? 8388608 : 4194304;
        }
        int i10 = 100663296 & iW;
        dt0 dt0Var2 = this.o;
        if (i10 == 0) {
            i6 |= qz0Var.f(dt0Var2) ? 67108864 : 33554432;
        }
        int i11 = 805306368 & iW;
        ft0 ft0Var2 = this.p;
        if (i11 == 0) {
            i6 |= qz0Var.f(ft0Var2) ? 536870912 : 268435456;
        }
        int i12 = iW2 & 6;
        int i13 = i6;
        ab5 ab5Var2 = this.q;
        if (i12 == 0) {
            i2 = iW2 | (qz0Var.f(ab5Var2) ? 4 : 2);
        } else {
            i2 = iW2;
        }
        int i14 = iW2 & 48;
        androidx.compose.runtime.internal.a aVar2 = this.r;
        if (i14 == 0) {
            i2 |= qz0Var.h(aVar2) ? 32 : 16;
        }
        int i15 = i13 & 306783379;
        final boolean z = this.j;
        float f2 = this.k;
        if (i15 == 306783378 && (i2 & 19) == 18 && qz0Var.B()) {
            qz0Var.U();
            ft0Var = ft0Var2;
            dt0Var = dt0Var2;
            f = f2;
            bp2Var = bp2Var3;
            hx4Var = hx4Var2;
            bp2Var2 = bp2Var4;
            ht0Var = ht0Var2;
            et0Var = et0Var2;
            gt0Var = gt0Var2;
            aVar = aVar2;
        } else {
            qz0Var.W();
            ?? r9 = 0;
            if ((iW & 1) == 0 || qz0Var.z()) {
                f2 = 0;
                z = true;
            } else {
                qz0Var.U();
            }
            qz0Var.r();
            qz0Var.b0(-381762976);
            if (ab5Var2 == null) {
                qz0Var.b0(-381762325);
                Object objM = qz0Var.M();
                if (objM == jz0.a) {
                    objM = o40.r(qz0Var);
                }
                ab5Var = (ab5) objM;
                r9 = 0;
                qz0Var.q(false);
            } else {
                ab5Var = ab5Var2;
            }
            qz0Var.q(r9);
            wb5 wb5VarA = androidx.compose.foundation.interaction.a.a(ab5Var, qz0Var, r9);
            wb5 wb5VarB = androidx.compose.foundation.interaction.a.b(ab5Var, qz0Var, r9);
            int[] iArr = j.a;
            float f3 = f2;
            int i16 = i2;
            hx4 hx4VarA = hn7.a(rf0.u(hx4Var2.d(new iz0(androidx.compose.ui.platform.o.a, new rp2() { // from class: androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.rp2
                public final Object a(Object obj3, Object obj4, Object obj5) {
                    hx4 hx4Var3 = (hx4) obj3;
                    qz0 qz0Var2 = (qz0) obj4;
                    ((Number) obj5).intValue();
                    qz0Var2.b0(-896681958);
                    if (!z) {
                        qz0Var2.q(false);
                        return hx4Var3;
                    }
                    qz0Var2.b0(773894976);
                    qz0Var2.b0(-492369756);
                    Object objM2 = qz0Var2.M();
                    av avVar = jz0.a;
                    if (objM2 == avVar) {
                        androidx.compose.runtime.b bVar = new androidx.compose.runtime.b(zk8.x(EmptyCoroutineContext.a, qz0Var2));
                        qz0Var2.l0(bVar);
                        objM2 = bVar;
                    }
                    qz0Var2.q(false);
                    final e71 e71Var = ((androidx.compose.runtime.b) objM2).a;
                    qz0Var2.q(false);
                    qz0Var2.b0(-1139912697);
                    Object objM3 = qz0Var2.M();
                    if (objM3 == avVar) {
                        objM3 = new rj6(0L);
                        qz0Var2.l0(objM3);
                    }
                    final rj6 rj6Var = (rj6) objM3;
                    qz0Var2.q(false);
                    qz0Var2.b0(-1139910279);
                    Object objM4 = qz0Var2.M();
                    if (objM4 == avVar) {
                        objM4 = androidx.compose.runtime.g.h(Boolean.FALSE);
                        qz0Var2.l0(objM4);
                    }
                    final wb5 wb5Var = (wb5) objM4;
                    qz0Var2.q(false);
                    final ab5 ab5Var3 = ab5Var;
                    final wb5 wb5VarB2 = androidx.compose.foundation.interaction.a.b(ab5Var3, qz0Var2, 0);
                    qz0Var2.b0(-1139905817);
                    boolean zF = qz0Var2.f(wb5VarB2) | qz0Var2.h(e71Var) | qz0Var2.f(ab5Var3) | qz0Var2.h(rj6Var);
                    Object objM5 = qz0Var2.M();
                    if (zF || objM5 == avVar) {
                        objM5 = new dp2() { // from class: androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$1$1

                            /* JADX INFO: renamed from: androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$1$1$1, reason: invalid class name */
                            @tb1(c = "androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$1$1$1", f = "SurfaceImpl.kt", l = {156}, m = "invokeSuspend")
                            final class AnonymousClass1 extends SuspendLambda implements qp2 {
                                public int a;
                                public final /* synthetic */ ab5 b;
                                public final /* synthetic */ rj6 c;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(g51 g51Var, ab5 ab5Var, rj6 rj6Var) {
                                    super(2, g51Var);
                                    this.b = ab5Var;
                                    this.c = rj6Var;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final g51 create(Object obj, g51 g51Var) {
                                    return new AnonymousClass1(g51Var, this.b, this.c);
                                }

                                @Override // defpackage.qp2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                                    int i = this.a;
                                    if (i == 0) {
                                        kotlin.b.b(obj);
                                        sj6 sj6Var = new sj6(this.c);
                                        this.a = 1;
                                        if (this.b.a(sj6Var, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                    return tx8.a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.dp2
                            public final Object invoke(Object obj6) {
                                if (!((FocusStateImpl) ((ug2) obj6)).b() && ((Boolean) wb5VarB2.getValue()).booleanValue()) {
                                    bt2.G(e71Var, null, null, new AnonymousClass1(null, ab5Var3, rj6Var), 3);
                                }
                                return tx8.a;
                            }
                        };
                        qz0Var2.l0(objM5);
                    }
                    qz0Var2.q(false);
                    hx4 hx4VarY = gu9.y(hx4Var3, (dp2) objM5);
                    qz0Var2.b0(-1139895773);
                    boolean zF2 = qz0Var2.f(ab5Var3) | qz0Var2.h(e71Var) | qz0Var2.h(rj6Var) | qz0Var2.f(bp2Var4) | qz0Var2.f(bp2Var3);
                    Object objM6 = qz0Var2.M();
                    if (zF2 || objM6 == avVar) {
                        final bp2 bp2Var5 = bp2Var4;
                        final bp2 bp2Var6 = bp2Var3;
                        final ab5 ab5Var4 = ab5Var;
                        objM6 = new dp2() { // from class: androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$2$1

                            /* JADX INFO: renamed from: androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$2$1$1, reason: invalid class name */
                            @tb1(c = "androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$2$1$1", f = "SurfaceImpl.kt", l = {167}, m = "invokeSuspend")
                            final class AnonymousClass1 extends SuspendLambda implements qp2 {
                                public int a;
                                public final /* synthetic */ ab5 b;
                                public final /* synthetic */ rj6 c;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(g51 g51Var, ab5 ab5Var, rj6 rj6Var) {
                                    super(2, g51Var);
                                    this.b = ab5Var;
                                    this.c = rj6Var;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final g51 create(Object obj, g51 g51Var) {
                                    return new AnonymousClass1(g51Var, this.b, this.c);
                                }

                                @Override // defpackage.qp2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                                    int i = this.a;
                                    if (i == 0) {
                                        kotlin.b.b(obj);
                                        this.a = 1;
                                        if (this.b.a(this.c, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                    return tx8.a;
                                }
                            }

                            /* JADX INFO: renamed from: androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$2$1$3, reason: invalid class name */
                            @tb1(c = "androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$2$1$3", f = "SurfaceImpl.kt", l = {184}, m = "invokeSuspend")
                            final class AnonymousClass3 extends SuspendLambda implements qp2 {
                                public int a;
                                public final /* synthetic */ ab5 b;
                                public final /* synthetic */ rj6 c;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass3(g51 g51Var, ab5 ab5Var, rj6 rj6Var) {
                                    super(2, g51Var);
                                    this.b = ab5Var;
                                    this.c = rj6Var;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final g51 create(Object obj, g51 g51Var) {
                                    return new AnonymousClass3(g51Var, this.b, this.c);
                                }

                                @Override // defpackage.qp2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                                    int i = this.a;
                                    if (i == 0) {
                                        kotlin.b.b(obj);
                                        sj6 sj6Var = new sj6(this.c);
                                        this.a = 1;
                                        if (this.b.a(sj6Var, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                    return tx8.a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.dp2
                            public final Object invoke(Object obj6) {
                                bp2 bp2Var7;
                                KeyEvent keyEvent = ((by3) obj6).a;
                                if (!ew.s0(j.a, keyEvent.getKeyCode())) {
                                    return Boolean.FALSE;
                                }
                                int action = keyEvent.getAction();
                                e71 e71Var2 = e71Var;
                                rj6 rj6Var2 = rj6Var;
                                ab5 ab5Var5 = ab5Var4;
                                wb5 wb5Var2 = wb5Var;
                                if (action == 0) {
                                    int repeatCount = keyEvent.getRepeatCount();
                                    if (repeatCount == 0) {
                                        bt2.G(e71Var2, null, null, new AnonymousClass1(null, ab5Var5, rj6Var2), 3);
                                    } else if (repeatCount == 1 && (bp2Var7 = bp2Var5) != null) {
                                        wb5Var2.setValue(Boolean.TRUE);
                                        bt2.G(e71Var2, null, null, new SurfaceImplKt$handleDPadEnter$2$2$1$2$1(null, ab5Var5, rj6Var2), 3);
                                        bp2Var7.invoke();
                                    }
                                } else if (action == 1) {
                                    if (((Boolean) wb5Var2.getValue()).booleanValue()) {
                                        wb5Var2.setValue(Boolean.FALSE);
                                    } else {
                                        bt2.G(e71Var2, null, null, new AnonymousClass3(null, ab5Var5, rj6Var2), 3);
                                        bp2 bp2Var8 = bp2Var6;
                                        if (bp2Var8 != null) {
                                            bp2Var8.invoke();
                                        }
                                    }
                                }
                                return Boolean.TRUE;
                            }
                        };
                        qz0Var2.l0(objM6);
                    }
                    qz0Var2.q(false);
                    hx4 hx4VarR = ct2.r(hx4VarY, (dp2) objM6);
                    qz0Var2.q(false);
                    return hx4VarR;
                }
            })), true, ab5Var), true, new dp2() { // from class: androidx.tv.material3.SurfaceClickableUtilsKt$tvClickable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj3) {
                    nn7 nn7Var = (nn7) obj3;
                    final bp2 bp2Var5 = bp2Var3;
                    bp2 bp2Var6 = new bp2() { // from class: androidx.tv.material3.SurfaceClickableUtilsKt$tvClickable$1.1
                        {
                            super(0);
                        }

                        @Override // defpackage.bp2
                        public final Object invoke() {
                            bp2 bp2Var7 = bp2Var5;
                            if (bp2Var7 == null) {
                                return Boolean.FALSE;
                            }
                            bp2Var7.invoke();
                            return Boolean.TRUE;
                        }
                    };
                    ox3[] ox3VarArr = androidx.compose.ui.semantics.f.a;
                    nn7Var.a(androidx.compose.ui.semantics.a.b, new e3(null, bp2Var6));
                    final bp2 bp2Var7 = bp2Var4;
                    nn7Var.a(androidx.compose.ui.semantics.a.c, new e3(null, new bp2() { // from class: androidx.tv.material3.SurfaceClickableUtilsKt$tvClickable$1.2
                        {
                            super(0);
                        }

                        @Override // defpackage.bp2
                        public final Object invoke() {
                            bp2 bp2Var8 = bp2Var7;
                            if (bp2Var8 == null) {
                                return Boolean.FALSE;
                            }
                            bp2Var8.invoke();
                            return Boolean.TRUE;
                        }
                    }));
                    boolean z2 = z;
                    tx8 tx8Var = tx8.a;
                    if (!z2) {
                        nn7Var.a(androidx.compose.ui.semantics.d.i, tx8Var);
                    }
                    return tx8Var;
                }
            });
            boolean zBooleanValue = ((Boolean) wb5VarA.getValue()).booleanValue();
            xr7 xr7Var2 = (((Boolean) wb5VarB.getValue()).booleanValue() && z) ? ht0Var2.c : (zBooleanValue && z) ? ht0Var2.b : (!zBooleanValue || z) ? z ? ht0Var2.a : ht0Var2.d : ht0Var2.e;
            boolean zBooleanValue2 = ((Boolean) wb5VarA.getValue()).booleanValue();
            if (((Boolean) wb5VarB.getValue()).booleanValue() && z) {
                xr7Var = xr7Var2;
                bp2Var = bp2Var3;
                j = et0Var2.e;
            } else {
                xr7Var = xr7Var2;
                bp2Var = bp2Var3;
                j = (zBooleanValue2 && z) ? et0Var2.c : z ? et0Var2.a : et0Var2.g;
            }
            long j4 = j;
            boolean zBooleanValue3 = ((Boolean) wb5VarA.getValue()).booleanValue();
            if (((Boolean) wb5VarB.getValue()).booleanValue() && z) {
                j2 = j4;
                j3 = et0Var2.f;
            } else {
                j2 = j4;
                j3 = (zBooleanValue3 && z) ? et0Var2.d : z ? et0Var2.b : et0Var2.h;
            }
            boolean zBooleanValue4 = ((Boolean) wb5VarA.getValue()).booleanValue();
            float f4 = 1.0f;
            if ((!((Boolean) wb5VarB.getValue()).booleanValue() || !z) && zBooleanValue4 && z) {
                f4 = 1.1f;
            }
            boolean zBooleanValue5 = ((Boolean) wb5VarA.getValue()).booleanValue();
            fe0 fe0Var = (((Boolean) wb5VarB.getValue()).booleanValue() && z) ? dt0Var2.c : (zBooleanValue5 && z) ? dt0Var2.b : (!zBooleanValue5 || z) ? z ? dt0Var2.a : dt0Var2.d : dt0Var2.e;
            int i17 = i16 & 112;
            ft0Var = ft0Var2;
            dt0Var = dt0Var2;
            boolean z2 = z;
            et0Var = et0Var2;
            aVar = aVar2;
            bp2Var2 = bp2Var4;
            hx4Var = hx4Var2;
            float f5 = f4;
            gt0Var = gt0Var2;
            ht0Var = ht0Var2;
            j.a(hx4VarA, z2, xr7Var, j2, j3, f5, fe0Var, z ? ((Boolean) wb5VarB.getValue()).booleanValue() ? ft0Var2.c : ((Boolean) wb5VarA.getValue()).booleanValue() ? ft0Var2.b : ft0Var2.a : xt2.c, f3, ab5Var, aVar, qz0Var, ((i13 >> 3) & 896) | 48 | ((i13 << 15) & 1879048192), i17);
            z = z2;
            f = f3;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new SurfaceKt$Surface$2(bp2Var, hx4Var, bp2Var2, z, f, ht0Var, et0Var, gt0Var, dt0Var, ft0Var, ab5Var2, aVar, iW, iW2);
        }
        return tx8.a;
    }
}
