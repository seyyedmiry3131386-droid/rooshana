package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ab5;
import defpackage.ah6;
import defpackage.an3;
import defpackage.at2;
import defpackage.bn3;
import defpackage.bt2;
import defpackage.cn3;
import defpackage.cp0;
import defpackage.ct2;
import defpackage.dh6;
import defpackage.dn3;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.en3;
import defpackage.ew;
import defpackage.f49;
import defpackage.fi1;
import defpackage.fn3;
import defpackage.g51;
import defpackage.gn3;
import defpackage.hh6;
import defpackage.hl5;
import defpackage.hn3;
import defpackage.ia7;
import defpackage.j97;
import defpackage.js3;
import defpackage.ku1;
import defpackage.lu1;
import defpackage.m01;
import defpackage.m91;
import defpackage.mu1;
import defpackage.nq0;
import defpackage.nr5;
import defpackage.nu1;
import defpackage.ou1;
import defpackage.pg;
import defpackage.pu1;
import defpackage.qa1;
import defpackage.qp2;
import defpackage.qu1;
import defpackage.ro8;
import defpackage.ru1;
import defpackage.su1;
import defpackage.ti1;
import defpackage.uu1;
import defpackage.v69;
import defpackage.vg6;
import defpackage.vu1;
import defpackage.wu1;
import defpackage.y40;
import defpackage.y97;
import defpackage.yh0;
import defpackage.ym3;
import defpackage.zm3;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ti1 implements dh6, hn3, m01 {
    public mu1 A;
    public lu1 B;
    public y40 C;
    public hl5 D;
    public nq0 F;
    public fn3 G;
    public Orientation q;
    public dp2 r;
    public boolean s;
    public ab5 t;
    public kotlinx.coroutines.channels.a u;
    public wu1 v;
    public boolean w;
    public boolean x;
    public ku1 y;
    public nu1 z;
    public long E = 9205357640488583168L;
    public long H = 0;

    public e(dp2 dp2Var, boolean z, ab5 ab5Var, Orientation orientation) {
        this.q = orientation;
        this.r = dp2Var;
        this.s = z;
        this.t = ab5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F0(androidx.compose.foundation.gestures.e r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            wu1 r6 = r5.v
            if (r6 == 0) goto L4b
            ab5 r2 = r5.t
            if (r2 == 0) goto L48
            vu1 r4 = new vu1
            r4.<init>(r6)
            r0.c = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r6 = 0
            r5.v = r6
        L4b:
            ru1 r6 = new ru1
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.P0(r6)
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.F0(androidx.compose.foundation.gestures.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G0(androidx.compose.foundation.gestures.e r6, defpackage.qu1 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            wu1 r7 = r0.b
            qu1 r0 = r0.a
            kotlin.b.b(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            qu1 r7 = r0.a
            kotlin.b.b(r8)
            goto L57
        L3c:
            kotlin.b.b(r8)
            wu1 r8 = r6.v
            if (r8 == 0) goto L57
            ab5 r2 = r6.t
            if (r2 == 0) goto L57
            vu1 r5 = new vu1
            r5.<init>(r8)
            r0.a = r7
            r0.e = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L57
            goto L6c
        L57:
            wu1 r8 = new wu1
            r8.<init>()
            ab5 r2 = r6.t
            if (r2 == 0) goto L71
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            r8 = r7
            r7 = r0
        L71:
            r6.v = r8
            long r7 = r7.a
            r6.O0(r7)
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.G0(androidx.compose.foundation.gestures.e, qu1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H0(androidx.compose.foundation.gestures.e r5, defpackage.ru1 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ru1 r6 = r0.a
            kotlin.b.b(r7)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r7)
            wu1 r7 = r5.v
            if (r7 == 0) goto L4f
            ab5 r2 = r5.t
            if (r2 == 0) goto L4c
            xu1 r4 = new xu1
            r4.<init>(r7)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r7 = 0
            r5.v = r7
        L4f:
            r5.P0(r6)
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.H0(androidx.compose.foundation.gestures.e, ru1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void M0(e eVar, ah6 ah6Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        mu1 mu1Var = eVar.A;
        if (mu1Var == null) {
            mu1Var = new mu1();
            mu1Var.s = null;
            mu1Var.t = Long.MAX_VALUE;
            mu1Var.u = false;
            eVar.A = mu1Var;
        }
        mu1Var.s = ah6Var;
        mu1Var.t = j;
        nq0 nq0Var = eVar.F;
        if (nq0Var == null) {
            eVar.F = new nq0(eVar.q, 2);
        } else {
            nq0Var.c = eVar.q;
            nq0Var.b = j2;
        }
        mu1Var.u = false;
        eVar.C = mu1Var;
    }

    @Override // defpackage.dh6
    public final void B() {
        if (this.x) {
            K0();
            if (this.w) {
                Q0().o(ou1.a);
            }
            this.D = null;
        }
        this.x = false;
    }

    @Override // defpackage.dh6
    public final /* synthetic */ void I() {
    }

    public final void I0() {
        wu1 wu1Var = this.v;
        if (wu1Var != null) {
            ab5 ab5Var = this.t;
            if (ab5Var != null) {
                ab5Var.b(new vu1(wu1Var));
            }
            this.v = null;
        }
    }

    public abstract Object J0(qp2 qp2Var, g51 g51Var);

    public final void K0() {
        ku1 ku1Var = this.y;
        if (ku1Var == null) {
            DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop = DragDetectionState$AwaitDown$AwaitTouchSlop.c;
            ku1Var = new ku1();
            ku1Var.s = dragDetectionState$AwaitDown$AwaitTouchSlop;
            ku1Var.t = false;
            this.y = ku1Var;
        }
        ku1Var.s = DragDetectionState$AwaitDown$AwaitTouchSlop.c;
        ku1Var.t = false;
        this.C = ku1Var;
    }

    public final void L0(ah6 ah6Var, long j, nq0 nq0Var) {
        lu1 lu1Var = this.B;
        if (lu1Var == null) {
            lu1Var = new lu1();
            lu1Var.s = null;
            lu1Var.t = Long.MAX_VALUE;
            this.B = lu1Var;
        }
        lu1Var.s = ah6Var;
        lu1Var.t = j;
        nq0Var.b = 0L;
        this.C = lu1Var;
    }

    public final void N0(su1 su1Var) {
        if ((su1Var instanceof qu1) && !this.w) {
            this.w = true;
            V0();
        }
        Q0().o(su1Var);
    }

    public abstract void O0(long j);

    @Override // defpackage.hn3
    public final void P(pg pgVar, PointerEventPass pointerEventPass) {
        Object obj;
        Object obj2;
        float f;
        Object obj3;
        zm3 zm3Var;
        float fIntBitsToFloat;
        nq0 nq0Var;
        Object obj4;
        Object obj5;
        int i = pgVar.b;
        ArrayList arrayList = (ArrayList) pgVar.c;
        if (this.s) {
            if (this.G == null) {
                this.G = new fn3(this);
            }
            fn3 fn3Var = this.G;
            if (fn3Var != null) {
                e eVar = fn3Var.a;
                if (fn3Var.f == null) {
                    an3 an3Var = fn3Var.b;
                    if (an3Var == null) {
                        IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.c;
                        an3Var = new an3();
                        an3Var.u = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;
                        an3Var.v = false;
                        fn3Var.b = an3Var;
                    }
                    fn3Var.f = an3Var;
                }
                yh0 yh0Var = fn3Var.f;
                if (yh0Var == null) {
                    throw new IllegalArgumentException("currentDragState should not be null");
                }
                boolean z = true;
                if (yh0Var instanceof an3) {
                    an3 an3Var2 = (an3) yh0Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        zm3 zm3Var2 = (zm3) arrayList.get(i2);
                        if (zm3Var2.h || !zm3Var2.d) {
                            return;
                        }
                    }
                    zm3 zm3Var3 = (zm3) kotlin.collections.a.o0(arrayList);
                    IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop2 = en3.a[an3Var2.u.ordinal()] == 1 ? !eVar.U0() ? IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.a : IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.b : an3Var2.u;
                    an3Var2.u = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop2;
                    if (pointerEventPass == PointerEventPass.a && indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop2 == IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.b) {
                        zm3Var3.i = true;
                        an3Var2.v = true;
                    }
                    if (pointerEventPass == PointerEventPass.b) {
                        if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop2 == IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.a) {
                            fn3.c(fn3Var, zm3Var3, zm3Var3.a, 0L, 12);
                            return;
                        }
                        if (an3Var2.v) {
                            fn3Var.f(zm3Var3, zm3Var3, new ym3(i), 0L);
                            fn3Var.e(zm3Var3, new ym3(i), 0L);
                            long j = zm3Var3.a;
                            dn3 dn3Var = fn3Var.c;
                            if (dn3Var == null) {
                                dn3Var = new dn3();
                                dn3Var.u = Long.MAX_VALUE;
                                fn3Var.c = dn3Var;
                            }
                            dn3Var.u = j;
                            fn3Var.f = dn3Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(yh0Var instanceof cn3)) {
                    if (yh0Var instanceof bn3) {
                        bn3 bn3Var = (bn3) yh0Var;
                        if (pointerEventPass != PointerEventPass.c) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                break;
                            }
                            if (((zm3) arrayList.get(i3)).i) {
                                z = false;
                                break;
                            }
                            i3++;
                        }
                        int size3 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                break;
                            }
                            if (!((zm3) arrayList.get(i4)).d) {
                                i4++;
                            } else if (!arrayList.isEmpty()) {
                                if (z) {
                                    long jB = m91.B((zm3) kotlin.collections.a.o0(arrayList), eVar.q, new ym3(i));
                                    zm3 zm3Var4 = bn3Var.u;
                                    js3.m(zm3Var4);
                                    long jF = nr5.f(jB, m91.B(zm3Var4, eVar.q, new ym3(i)));
                                    zm3 zm3Var5 = bn3Var.u;
                                    if (zm3Var5 == null) {
                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    fn3.c(fn3Var, zm3Var5, bn3Var.v, jF, 8);
                                    return;
                                }
                                return;
                            }
                        }
                        fn3Var.a();
                        return;
                    }
                    if (!(yh0Var instanceof dn3)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dn3 dn3Var2 = (dn3) yh0Var;
                    if (pointerEventPass != PointerEventPass.b) {
                        return;
                    }
                    long j2 = dn3Var2.u;
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i5);
                        if (ct2.h(((zm3) obj).a, j2)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    zm3 zm3Var6 = (zm3) obj;
                    if (zm3Var6 == null) {
                        return;
                    }
                    boolean zE = m91.e(zm3Var6);
                    ou1 ou1Var = ou1.a;
                    if (!zE) {
                        if (zm3Var6.i) {
                            eVar.N0(ou1Var);
                            return;
                        }
                        Orientation orientation = eVar.q;
                        ym3 ym3Var = new ym3(i);
                        if (nr5.d(nr5.f(m91.B(zm3Var6, orientation, ym3Var), m91.C(zm3Var6, orientation, ym3Var))) == 0.0f) {
                            return;
                        }
                        Orientation orientation2 = eVar.q;
                        ym3 ym3Var2 = new ym3(i);
                        fn3Var.e(zm3Var6, new ym3(i), zm3Var6.i ? 0L : nr5.f(m91.B(zm3Var6, orientation2, ym3Var2), m91.C(zm3Var6, orientation2, ym3Var2)));
                        zm3Var6.i = true;
                        return;
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i6);
                        if (((zm3) obj2).d) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    zm3 zm3Var7 = (zm3) obj2;
                    if (zm3Var7 != null) {
                        dn3Var2.u = zm3Var7.a;
                        return;
                    }
                    if (zm3Var6.i || !m91.e(zm3Var6)) {
                        eVar.N0(ou1Var);
                    } else {
                        m91.d(fn3Var.d(), zm3Var6, eVar.q, new ym3(i), fn3Var.j, fn3Var.l);
                        float fE = ((v69) y97.t(eVar, androidx.compose.ui.platform.l.s)).e();
                        long jA = fn3Var.d().a(j97.a(fE, fE));
                        fi1 fi1Var = (fi1) fn3Var.d().b;
                        f49 f49Var = (f49) fi1Var.b;
                        qa1[] qa1VarArr = f49Var.d;
                        ew.F0(0, qa1VarArr.length, null, qa1VarArr);
                        f49Var.e = 0;
                        f49 f49Var2 = (f49) fi1Var.c;
                        qa1[] qa1VarArr2 = f49Var2.d;
                        ew.F0(0, qa1VarArr2.length, null, qa1VarArr2);
                        f49Var2.e = 0;
                        fi1Var.a = 0L;
                        eVar.N0(new ru1(f.a(jA), true));
                    }
                    fn3Var.a();
                    return;
                }
                cn3 cn3Var = (cn3) yh0Var;
                if (pointerEventPass == PointerEventPass.a) {
                    return;
                }
                int size6 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        f = 0.0f;
                        obj3 = null;
                        break;
                    } else {
                        obj3 = arrayList.get(i7);
                        f = 0.0f;
                        if (ct2.h(((zm3) obj3).a, cn3Var.v)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                zm3 zm3Var8 = (zm3) obj3;
                if (zm3Var8 == null) {
                    int size7 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList.get(i8);
                        if (((zm3) obj5).d) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    zm3Var8 = (zm3) obj5;
                    if (zm3Var8 == null) {
                        fn3Var.a();
                        return;
                    }
                    cn3Var.v = zm3Var8.a;
                }
                zm3 zm3Var9 = zm3Var8;
                if (pointerEventPass != PointerEventPass.b) {
                    zm3Var = zm3Var9;
                } else if (zm3Var9.i) {
                    zm3Var = zm3Var9;
                    zm3 zm3Var10 = cn3Var.u;
                    if (zm3Var10 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j3 = cn3Var.v;
                    nq0 nq0Var2 = fn3Var.i;
                    if (nq0Var2 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    fn3Var.b(zm3Var10, j3, nq0Var2);
                } else if (m91.e(zm3Var9)) {
                    int size8 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size8) {
                            obj4 = null;
                            break;
                        }
                        Object obj6 = arrayList.get(i9);
                        if (((zm3) obj6).d) {
                            obj4 = obj6;
                            break;
                        }
                        i9++;
                    }
                    zm3 zm3Var11 = (zm3) obj4;
                    if (zm3Var11 == null) {
                        fn3Var.a();
                    } else {
                        cn3Var.v = zm3Var11.a;
                    }
                    zm3Var = zm3Var9;
                } else {
                    v69 v69Var = (v69) y97.t(eVar, androidx.compose.ui.platform.l.s);
                    float f2 = d.a;
                    float f3 = v69Var.f();
                    nq0 nq0Var3 = fn3Var.i;
                    if (nq0Var3 == null) {
                        throw new IllegalArgumentException("Touch slop detector not initialized.");
                    }
                    long jB2 = m91.B(zm3Var9, eVar.q, new ym3(i));
                    Orientation orientation3 = eVar.q;
                    long jFloatToRawIntBits = zm3Var9.g;
                    if (orientation3 == null) {
                        nq0Var = nq0Var3;
                        zm3Var = zm3Var9;
                    } else {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        } else {
                            zm3Var = zm3Var9;
                            nq0Var = nq0Var3;
                        }
                        if (orientation3 == Orientation.b) {
                            zm3Var = zm3Var9;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                        } else {
                            zm3Var = zm3Var9;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
                        }
                        nq0Var = nq0Var3;
                    }
                    long jR = nq0Var.r(jB2, jFloatToRawIntBits, f3);
                    if ((9223372034707292159L & jR) != 9205357640488583168L) {
                        zm3Var.i = true;
                        zm3 zm3Var12 = cn3Var.u;
                        js3.m(zm3Var12);
                        fn3Var.f(zm3Var12, zm3Var, new ym3(i), jR);
                        fn3Var.e(zm3Var, new ym3(i), jR);
                        long j4 = zm3Var.a;
                        dn3 dn3Var3 = fn3Var.c;
                        if (dn3Var3 == null) {
                            dn3Var3 = new dn3();
                            dn3Var3.u = Long.MAX_VALUE;
                            fn3Var.c = dn3Var3;
                        }
                        dn3Var3.u = j4;
                        fn3Var.f = dn3Var3;
                    } else {
                        cn3Var.w = true;
                    }
                }
                if (pointerEventPass == PointerEventPass.c && cn3Var.w) {
                    if (!zm3Var.i) {
                        cn3Var.w = false;
                        return;
                    }
                    zm3 zm3Var13 = cn3Var.u;
                    if (zm3Var13 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j5 = cn3Var.v;
                    nq0 nq0Var4 = fn3Var.i;
                    if (nq0Var4 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    fn3Var.b(zm3Var13, j5, nq0Var4);
                }
            }
        }
    }

    public abstract void P0(ru1 ru1Var);

    public final cp0 Q0() {
        kotlinx.coroutines.channels.a aVar = this.u;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    public final hl5 R0() {
        hl5 hl5Var = this.D;
        if (hl5Var != null) {
            return hl5Var;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void S0(ah6 ah6Var, long j) {
        long jQ = y40.G(this.a).q(0L);
        if (!nr5.c(this.E, 9205357640488583168L) && !nr5.c(jQ, this.E)) {
            this.H = nr5.g(this.H, nr5.f(jQ, this.E));
        }
        this.E = jQ;
        ia7.c(R0(), ah6Var, this.H);
        Q0().o(new pu1(j, false));
    }

    public final void T0(ah6 ah6Var, ah6 ah6Var2, long j) {
        if (this.D == null) {
            this.D = new hl5(17);
        }
        ia7.c(R0(), ah6Var, 0L);
        long jF = nr5.f(ah6Var2.c, j);
        this.H = 0L;
        if (((Boolean) this.r.invoke(new hh6(ah6Var.i))).booleanValue()) {
            if (!this.w) {
                if (this.u == null) {
                    this.u = dt2.b(Integer.MAX_VALUE, 6, null);
                }
                V0();
            }
            this.E = y40.G(this).q(0L);
            Q0().o(new qu1(jF));
        }
    }

    public abstract boolean U0();

    @Override // defpackage.hn3
    public final void V() {
        fn3 fn3Var = this.G;
        if (fn3Var != null) {
            fn3Var.a();
            e eVar = fn3Var.a;
            if (eVar.w) {
                eVar.N0(ou1.a);
            }
            fn3Var.g = null;
            gn3 gn3Var = fn3Var.k;
            gn3Var.a = 0;
            gn3Var.b.clear();
        }
    }

    public final void V0() {
        this.w = true;
        if (this.u == null) {
            this.u = dt2.b(Integer.MAX_VALUE, 6, null);
        }
        bt2.G(o0(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    public final void W0(dp2 dp2Var, boolean z, ab5 ab5Var, Orientation orientation, boolean z2) {
        this.r = dp2Var;
        boolean z3 = true;
        if (this.s != z) {
            this.s = z;
            if (!z) {
                I0();
                this.G = null;
            }
            z2 = true;
        }
        if (!js3.i(this.t, ab5Var)) {
            I0();
            this.t = ab5Var;
        }
        if (this.q != orientation) {
            this.q = orientation;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.x;
            ou1 ou1Var = ou1.a;
            if (z4) {
                K0();
                if (this.w) {
                    Q0().o(ou1Var);
                }
                this.D = null;
            }
            fn3 fn3Var = this.G;
            if (fn3Var != null) {
                fn3Var.a();
                e eVar = fn3Var.a;
                if (eVar.w) {
                    eVar.N0(ou1Var);
                }
                fn3Var.g = null;
                gn3 gn3Var = fn3Var.k;
                gn3Var.a = 0;
                gn3Var.b.clear();
            }
        }
    }

    @Override // defpackage.dh6
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // defpackage.dh6
    public final void i0() {
        B();
    }

    @Override // defpackage.dh6
    public final long m() {
        return ro8.a;
    }

    @Override // defpackage.dh6
    public void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z = true;
        this.x = true;
        if (this.s) {
            if (this.C == null) {
                ku1 ku1Var = this.y;
                if (ku1Var == null) {
                    DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop = DragDetectionState$AwaitDown$AwaitTouchSlop.c;
                    ku1Var = new ku1();
                    ku1Var.s = dragDetectionState$AwaitDown$AwaitTouchSlop;
                    ku1Var.t = false;
                    this.y = ku1Var;
                }
                this.C = ku1Var;
            }
            y40 y40Var = this.C;
            if (y40Var == null) {
                throw new IllegalArgumentException("currentDragState should not be null");
            }
            if (y40Var instanceof ku1) {
                ku1 ku1Var2 = (ku1) y40Var;
                if (!vg6Var.a.isEmpty() && p.g(vg6Var, false, false)) {
                    ah6 ah6Var = (ah6) kotlin.collections.a.o0(vg6Var.a);
                    DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop2 = uu1.a[ku1Var2.s.ordinal()] == 1 ? !U0() ? DragDetectionState$AwaitDown$AwaitTouchSlop.a : DragDetectionState$AwaitDown$AwaitTouchSlop.b : ku1Var2.s;
                    ku1Var2.s = dragDetectionState$AwaitDown$AwaitTouchSlop2;
                    if (pointerEventPass == PointerEventPass.a && dragDetectionState$AwaitDown$AwaitTouchSlop2 == DragDetectionState$AwaitDown$AwaitTouchSlop.b) {
                        ah6Var.a();
                        ku1Var2.t = true;
                    }
                    if (pointerEventPass == PointerEventPass.b) {
                        if (dragDetectionState$AwaitDown$AwaitTouchSlop2 == DragDetectionState$AwaitDown$AwaitTouchSlop.a) {
                            M0(this, ah6Var, ah6Var.a, 0L, 12);
                            return;
                        }
                        if (ku1Var2.t) {
                            T0(ah6Var, ah6Var, 0L);
                            S0(ah6Var, 0L);
                            long j2 = ah6Var.a;
                            nu1 nu1Var = this.z;
                            if (nu1Var == null) {
                                nu1Var = new nu1();
                                nu1Var.s = Long.MAX_VALUE;
                                this.z = nu1Var;
                            }
                            nu1Var.s = j2;
                            this.C = nu1Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj5 = null;
            if (y40Var instanceof mu1) {
                mu1 mu1Var = (mu1) y40Var;
                if (pointerEventPass == PointerEventPass.a) {
                    return;
                }
                List list = vg6Var.a;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i);
                    if (ct2.h(((ah6) obj3).a, mu1Var.t)) {
                        break;
                    } else {
                        i++;
                    }
                }
                ah6 ah6Var2 = (ah6) obj3;
                if (ah6Var2 == null) {
                    int size2 = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            obj4 = null;
                            break;
                        }
                        obj4 = list.get(i2);
                        if (((ah6) obj4).d) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    ah6Var2 = (ah6) obj4;
                    if (ah6Var2 == null) {
                        K0();
                        return;
                    }
                    mu1Var.t = ah6Var2.a;
                }
                if (pointerEventPass == PointerEventPass.b) {
                    if (ah6Var2.b()) {
                        ah6 ah6Var3 = mu1Var.s;
                        if (ah6Var3 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                        }
                        long j3 = mu1Var.t;
                        nq0 nq0Var = this.F;
                        if (nq0Var == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        L0(ah6Var3, j3, nq0Var);
                    } else if (at2.Q(ah6Var2)) {
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            Object obj6 = list.get(i3);
                            if (((ah6) obj6).d) {
                                obj5 = obj6;
                                break;
                            }
                            i3++;
                        }
                        ah6 ah6Var4 = (ah6) obj5;
                        if (ah6Var4 == null) {
                            K0();
                        } else {
                            mu1Var.t = ah6Var4.a;
                        }
                    } else {
                        float fH = d.h((v69) y97.t(this, androidx.compose.ui.platform.l.s), ah6Var2.i);
                        nq0 nq0Var2 = this.F;
                        if (nq0Var2 == null) {
                            throw new IllegalArgumentException("Touch slop detector not initialized.");
                        }
                        long jR = nq0Var2.r(ah6Var2.c, ah6Var2.g, fH);
                        if ((9223372034707292159L & jR) != 9205357640488583168L) {
                            ah6Var2.a();
                            ah6 ah6Var5 = mu1Var.s;
                            js3.m(ah6Var5);
                            T0(ah6Var5, ah6Var2, jR);
                            S0(ah6Var2, jR);
                            long j4 = ah6Var2.a;
                            nu1 nu1Var2 = this.z;
                            if (nu1Var2 == null) {
                                nu1Var2 = new nu1();
                                nu1Var2.s = Long.MAX_VALUE;
                                this.z = nu1Var2;
                            }
                            nu1Var2.s = j4;
                            this.C = nu1Var2;
                        } else {
                            mu1Var.u = true;
                        }
                    }
                }
                if (pointerEventPass == PointerEventPass.c && mu1Var.u) {
                    if (!ah6Var2.b()) {
                        mu1Var.u = false;
                        return;
                    }
                    ah6 ah6Var6 = mu1Var.s;
                    if (ah6Var6 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j5 = mu1Var.t;
                    nq0 nq0Var3 = this.F;
                    if (nq0Var3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    L0(ah6Var6, j5, nq0Var3);
                    return;
                }
                return;
            }
            if (y40Var instanceof lu1) {
                lu1 lu1Var = (lu1) y40Var;
                if (pointerEventPass != PointerEventPass.c) {
                    return;
                }
                List list2 = vg6Var.a;
                int size4 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        break;
                    }
                    if (((ah6) list2.get(i4)).b()) {
                        z = false;
                        break;
                    }
                    i4++;
                }
                int size5 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        break;
                    }
                    if (!((ah6) list2.get(i5)).d) {
                        i5++;
                    } else if (!list2.isEmpty()) {
                        if (z) {
                            long j6 = ((ah6) kotlin.collections.a.o0(list2)).c;
                            ah6 ah6Var7 = lu1Var.s;
                            js3.m(ah6Var7);
                            long jF = nr5.f(j6, ah6Var7.c);
                            ah6 ah6Var8 = lu1Var.s;
                            if (ah6Var8 == null) {
                                throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                            }
                            M0(this, ah6Var8, lu1Var.t, jF, 8);
                            return;
                        }
                        return;
                    }
                }
                K0();
                return;
            }
            if (!(y40Var instanceof nu1)) {
                throw new NoWhenBranchMatchedException();
            }
            nu1 nu1Var3 = (nu1) y40Var;
            if (pointerEventPass != PointerEventPass.b) {
                return;
            }
            long j7 = nu1Var3.s;
            List list3 = vg6Var.a;
            int size6 = list3.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size6) {
                    obj = null;
                    break;
                }
                obj = list3.get(i6);
                if (ct2.h(((ah6) obj).a, j7)) {
                    break;
                } else {
                    i6++;
                }
            }
            ah6 ah6Var9 = (ah6) obj;
            if (ah6Var9 == null) {
                return;
            }
            boolean zQ = at2.Q(ah6Var9);
            ou1 ou1Var = ou1.a;
            if (!zQ) {
                if (ah6Var9.b()) {
                    Q0().o(ou1Var);
                    return;
                } else {
                    if (nr5.d(at2.i0(ah6Var9, true)) == 0.0f) {
                        return;
                    }
                    S0(ah6Var9, at2.i0(ah6Var9, false));
                    ah6Var9.a();
                    return;
                }
            }
            List list4 = vg6Var.a;
            int size7 = list4.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    obj2 = null;
                    break;
                }
                obj2 = list4.get(i7);
                if (((ah6) obj2).d) {
                    break;
                } else {
                    i7++;
                }
            }
            ah6 ah6Var10 = (ah6) obj2;
            if (ah6Var10 != null) {
                nu1Var3.s = ah6Var10.a;
                return;
            }
            if (ah6Var9.b() || !at2.Q(ah6Var9)) {
                Q0().o(ou1Var);
            } else {
                ia7.c(R0(), ah6Var9, 0L);
                float fE = ((v69) y97.t(this, androidx.compose.ui.platform.l.s)).e();
                long jA = R0().a(j97.a(fE, fE));
                fi1 fi1Var = (fi1) R0().b;
                f49 f49Var = (f49) fi1Var.b;
                qa1[] qa1VarArr = f49Var.d;
                ew.F0(0, qa1VarArr.length, null, qa1VarArr);
                f49Var.e = 0;
                f49 f49Var2 = (f49) fi1Var.c;
                qa1[] qa1VarArr2 = f49Var2.d;
                ew.F0(0, qa1VarArr2.length, null, qa1VarArr2);
                f49Var2.e = 0;
                fi1Var.a = 0L;
                Q0().o(new ru1(f.a(jA), false));
                this.x = false;
            }
            K0();
        }
    }

    @Override // defpackage.gx4
    public void t0() {
        B();
    }

    @Override // defpackage.gx4
    public final void u0() {
        this.w = false;
        I0();
        this.H = 0L;
    }
}
