package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.a;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import ir.myket.movie.common.domain.models.SampleWatch;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class sy7 implements ty7 {
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static boolean d = true;
    public static Method e;
    public static boolean f;
    public final /* synthetic */ int a;

    public static final void c(hx4 hx4Var, String str, qz0 qz0Var, int i) {
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-424761658);
        int i2 = i | (qz0Var2.f(hx4Var) ? 4 : 2) | (qz0Var2.f(str) ? 32 : 16);
        if (qz0Var2.R(i2 & 1, (i2 & 19) != 18)) {
            hx4 hx4VarD = yh0.D(hx4Var.d(b.b), 0.0f, 0.0f, 0.0f, ml9.q(hq6.space_24, qz0Var2), 7);
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarM = b.m(yh0.B(rq4.f(hx4VarD, ((tj8) objJ).i, la7.b(ml9.q(hq6.radius_4, qz0Var2), 0.0f, ml9.q(hq6.radius_4, qz0Var2), 6)), ml9.q(hq6.space_8, qz0Var2), 0.0f, 2), ml9.q(hq6.sample_watch_flag_width, qz0Var2));
            cl4 cl4VarD = bg0.d(eq.g, false);
            long j = qz0Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarM);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cl4VarD);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i3), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).h;
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            mi8.b(str, null, ((tj8) objJ2).j, 0L, 0L, null, 0L, 2, false, 0, 0, gj8Var, qz0Var, 0, 384, 126970);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new c20(hx4Var, str, i, 2);
        }
    }

    public static final void d(hx4 hx4Var, final SampleWatch sampleWatch, final long j, final float f2, qz0 qz0Var, final int i) {
        qz0 qz0Var2;
        js3.p(sampleWatch, "sampleWatch");
        qz0Var.c0(-1803304315);
        int i2 = i | 6 | (qz0Var.f(sampleWatch) ? 32 : 16) | (qz0Var.e(j) ? 256 : 128) | (qz0Var.c(f2) ? 2048 : 1024);
        if (qz0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            ex4 ex4Var = ex4.b;
            qz0Var2 = qz0Var;
            yq2.G(b.c(ex4Var, 1.0f), eq.j, s7.X(1643115631, new rp2() { // from class: qc7
                @Override // defpackage.rp2
                public final Object a(Object obj, Object obj2, Object obj3) {
                    pg0 pg0Var = (pg0) obj;
                    qz0 qz0Var3 = (qz0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    js3.p(pg0Var, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= qz0Var3.f(pg0Var) ? 4 : 2;
                    }
                    if (qz0Var3.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        qj1 qj1Var = (qj1) qz0Var3.j(l.h);
                        boolean z = au1.a(pg0Var.b(), ml9.q(hq6.sample_watch_max_width, qz0Var3)) > 0;
                        boolean zC = qz0Var3.c(pg0Var.b());
                        long j2 = j;
                        boolean zE = zC | qz0Var3.e(j2);
                        Object objM = qz0Var3.M();
                        av avVar = jz0.a;
                        if (zE || objM == avVar) {
                            objM = new au1(pg0Var.b() * (600000.0f / j2));
                            qz0Var3.l0(objM);
                        }
                        final float f3 = ((au1) objM).a;
                        final float fQ = ml9.q(hq6.size_2, qz0Var3);
                        boolean zC2 = qz0Var3.c(pg0Var.b());
                        Object objM2 = qz0Var3.M();
                        if (zC2 || objM2 == avVar) {
                            objM2 = g.h(new au1(0));
                            qz0Var3.l0(objM2);
                        }
                        final wb5 wb5Var = (wb5) objM2;
                        IntrinsicSize intrinsicSize = IntrinsicSize.a;
                        hx4 hx4VarA = ng0.a.a(yq2.k0(), eq.i);
                        boolean zC3 = qz0Var3.c(f3) | qz0Var3.f(wb5Var) | qz0Var3.c(fQ);
                        final float f4 = f2;
                        boolean zC4 = zC3 | qz0Var3.c(f4);
                        Object objM3 = qz0Var3.M();
                        if (zC4 || objM3 == avVar) {
                            objM3 = new dp2() { // from class: sc7
                                @Override // defpackage.dp2
                                public final Object invoke(Object obj4) {
                                    qj1 qj1Var2 = (qj1) obj4;
                                    js3.p(qj1Var2, "$this$absoluteOffset");
                                    return new rq3((((long) ((int) ((qj1Var2.S(f3) - qj1Var2.S(((au1) wb5Var.getValue()).a)) - qj1Var2.S(fQ / 2)))) << 32) | (((long) ((int) qj1Var2.S(f4))) & 4294967295L));
                                }
                            };
                            qz0Var3.l0(objM3);
                        }
                        dp2 dp2Var = (dp2) objM3;
                        hx4 hx4VarD = hx4VarA.d(new ur5(dp2Var, new y8(5, dp2Var), false));
                        cb7 cb7VarA = bb7.a(jv.a, eq.l, qz0Var3, 48);
                        long j3 = qz0Var3.T;
                        int i3 = (int) (j3 ^ (j3 >>> 32));
                        j56 j56VarL = qz0Var3.l();
                        hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var3, hx4VarD);
                        hz0.d0.getClass();
                        bp2 bp2Var = d.b;
                        qz0Var3.e0();
                        if (qz0Var3.S) {
                            qz0Var3.k(bp2Var);
                        } else {
                            qz0Var3.o0();
                        }
                        ia7.o(qz0Var3, d.f, cb7VarA);
                        ia7.o(qz0Var3, d.e, j56VarL);
                        ia7.g(qz0Var3, Integer.valueOf(i3), d.g);
                        ia7.n(qz0Var3, d.h);
                        ia7.o(qz0Var3, d.d, hx4VarC);
                        boolean zF = qz0Var3.f(wb5Var) | qz0Var3.f(qj1Var);
                        Object objM4 = qz0Var3.M();
                        if (zF || objM4 == avVar) {
                            objM4 = new tc7(qj1Var, wb5Var, 0);
                            qz0Var3.l0(objM4);
                        }
                        ex4 ex4Var2 = ex4.b;
                        hx4 hx4VarC2 = y40.C(ex4Var2, (dp2) objM4);
                        SampleWatch sampleWatch2 = sampleWatch;
                        String str = sampleWatch2.b;
                        if (str == null) {
                            str = "";
                        }
                        sy7.c(hx4VarC2, str, qz0Var3, 0);
                        hx4 hx4VarL = b.l(b.b, fQ);
                        Object objJ = qz0Var3.j(uj8.a);
                        js3.m(objJ);
                        tt3.i(rq4.f(hx4VarL, ((tj8) objJ).r, la7.a(ml9.q(hq6.radius_4, qz0Var3))), fQ, 0L, qz0Var3, 0, 4);
                        z27.a(qz0Var3, b.l(ex4Var2, ml9.q(hq6.size_8, qz0Var3)));
                        sy7.e(z, sampleWatch2, qz0Var3, 0);
                        qz0Var3.q(true);
                    } else {
                        qz0Var3.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var2, 3120, 4);
            hx4Var = ex4Var;
        } else {
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            final hx4 hx4Var2 = hx4Var;
            my6VarS.d = new qp2(sampleWatch, j, f2, i) { // from class: rc7
                public final /* synthetic */ SampleWatch b;
                public final /* synthetic */ long c;
                public final /* synthetic */ float d;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(1);
                    sy7.d(this.a, this.b, this.c, this.d, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void e(boolean z, SampleWatch sampleWatch, qz0 qz0Var, int i) {
        SampleWatch sampleWatch2;
        SampleWatch sampleWatch3;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-1894781746);
        int i2 = i | (qz0Var2.g(z) ? 4 : 2) | (qz0Var2.f(sampleWatch) ? 32 : 16);
        int i3 = 0;
        if (qz0Var2.R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) qz0Var2.j(e.b);
            av avVar = jz0.a;
            ex4 ex4Var = ex4.b;
            if (z || yq2.n0(context)) {
                qz0Var2.a0(1312387478);
                bb0 bb0Var = eq.m;
                hx4 hx4VarD = yh0.D(ex4Var, 0.0f, 0.0f, 0.0f, ml9.q(hq6.space_24, qz0Var2), 7).d(b.b);
                u58 u58Var = uj8.a;
                Object objJ = qz0Var2.j(u58Var);
                js3.m(objJ);
                hx4 hx4VarZ = yh0.z(rq4.f(hx4VarD, ((tj8) objJ).i, la7.a(ml9.q(hq6.radius_4, qz0Var2))), ml9.q(hq6.space_8, qz0Var2));
                fv fvVar = jv.a;
                cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.size_8, qz0Var2)), bb0Var, qz0Var2, 48);
                long j = qz0Var2.T;
                int i4 = (int) (j ^ (j >>> 32));
                j56 j56VarL = qz0Var2.l();
                hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarZ);
                hz0.d0.getClass();
                bp2 bp2Var = d.b;
                qz0Var2.e0();
                if (qz0Var2.S) {
                    qz0Var2.k(bp2Var);
                } else {
                    qz0Var2.o0();
                }
                ia7.o(qz0Var2, d.f, cb7VarA);
                ia7.o(qz0Var2, d.e, j56VarL);
                ia7.g(qz0Var2, Integer.valueOf(i4), d.g);
                ia7.n(qz0Var2, d.h);
                ia7.o(qz0Var2, d.d, hx4VarC);
                boolean zH = ((i2 & 112) == 32) | qz0Var2.h(context);
                Object objM = qz0Var2.M();
                if (zH || objM == avVar) {
                    objM = new uc7(context, sampleWatch, i3);
                    qz0Var2.l0(objM);
                }
                bp2 bp2Var2 = (bp2) objM;
                ka7 ka7Var = la7.a;
                wy5 wy5Var = ci0.a;
                Object objJ2 = qz0Var2.j(u58Var);
                js3.m(objJ2);
                long j2 = ((tj8) objJ2).g;
                Object objJ3 = qz0Var2.j(u58Var);
                js3.m(objJ3);
                a.a(bp2Var2, null, false, ka7Var, ci0.a(j2, ((tj8) objJ3).J.a, 0L, 0L, qz0Var, 12), null, null, null, s7.X(1507406975, new vc7(sampleWatch, i3), qz0Var), qz0Var, 805306368, 486);
                String str = sampleWatch.a;
                if (str == null) {
                    str = "";
                }
                gj8 gj8Var = ((wf5) qz0Var.j(aw8.a)).h;
                Object objJ4 = qz0Var.j(u58Var);
                js3.m(objJ4);
                long j3 = ((tj8) objJ4).j;
                sampleWatch2 = sampleWatch;
                mi8.b(str, null, j3, 0L, 0L, null, 0L, 2, false, 0, 0, gj8Var, qz0Var, 0, 384, 126970);
                qz0Var2 = qz0Var;
                qz0Var2.q(true);
                qz0Var2.q(false);
            } else {
                qz0Var2.a0(1313479422);
                ab0 ab0Var = eq.p;
                hx4 hx4VarD2 = yh0.D(ex4Var, 0.0f, 0.0f, 0.0f, ml9.q(hq6.space_24, qz0Var2), 7).d(b.b);
                u58 u58Var2 = uj8.a;
                Object objJ5 = qz0Var2.j(u58Var2);
                js3.m(objJ5);
                hx4 hx4VarZ2 = yh0.z(rq4.f(hx4VarD2, ((tj8) objJ5).i, la7.a(ml9.q(hq6.radius_4, qz0Var2))), ml9.q(hq6.space_8, qz0Var2));
                fv fvVar2 = jv.a;
                vv0 vv0VarA = tv0.a(jv.g(ml9.q(hq6.size_8, qz0Var2)), ab0Var, qz0Var2, 48);
                long j4 = qz0Var2.T;
                int i5 = (int) (j4 ^ (j4 >>> 32));
                j56 j56VarL2 = qz0Var2.l();
                hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarZ2);
                hz0.d0.getClass();
                bp2 bp2Var3 = d.b;
                qz0Var2.e0();
                if (qz0Var2.S) {
                    qz0Var2.k(bp2Var3);
                } else {
                    qz0Var2.o0();
                }
                ia7.o(qz0Var2, d.f, vv0VarA);
                ia7.o(qz0Var2, d.e, j56VarL2);
                ia7.g(qz0Var2, Integer.valueOf(i5), d.g);
                ia7.n(qz0Var2, d.h);
                ia7.o(qz0Var2, d.d, hx4VarC2);
                String str2 = sampleWatch.a;
                String str3 = str2 != null ? str2 : "";
                gj8 gj8Var2 = ((wf5) qz0Var2.j(aw8.a)).h;
                Object objJ6 = qz0Var2.j(u58Var2);
                js3.m(objJ6);
                mi8.b(str3, null, ((tj8) objJ6).j, 0L, 0L, null, 0L, 2, false, 0, 0, gj8Var2, qz0Var, 0, 384, 126970);
                boolean zH2 = qz0Var.h(context) | ((i2 & 112) == 32);
                Object objM2 = qz0Var.M();
                if (zH2 || objM2 == avVar) {
                    sampleWatch3 = sampleWatch;
                    objM2 = new uc7(context, sampleWatch3, 1);
                    qz0Var.l0(objM2);
                } else {
                    sampleWatch3 = sampleWatch;
                }
                bp2 bp2Var4 = (bp2) objM2;
                ka7 ka7Var2 = la7.a;
                wy5 wy5Var2 = ci0.a;
                Object objJ7 = qz0Var.j(u58Var2);
                js3.m(objJ7);
                long j5 = ((tj8) objJ7).g;
                Object objJ8 = qz0Var.j(u58Var2);
                js3.m(objJ8);
                a.a(bp2Var4, null, false, ka7Var2, ci0.a(j5, ((tj8) objJ8).J.a, 0L, 0L, qz0Var, 12), null, null, null, s7.X(1481347076, new vc7(sampleWatch3, 1), qz0Var), qz0Var, 805306368, 486);
                qz0Var.q(true);
                qz0Var.q(false);
                qz0Var2 = qz0Var;
                sampleWatch2 = sampleWatch3;
            }
        } else {
            sampleWatch2 = sampleWatch;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new h8(z, sampleWatch2, i);
        }
    }

    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ew.C0(0, i, 6, objArr, objArr2);
        ew.y0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ew.C0(0, i, 6, objArr, objArr2);
        ew.y0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ew.C0(0, i, 6, objArr, objArr2);
        ew.y0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final boolean i(RecyclerView recyclerView) {
        k layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.p) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (!recyclerView.canScrollHorizontally(1) && !recyclerView.canScrollHorizontally(-1)) {
                return false;
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1 && !recyclerView.canScrollVertically(1) && !recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public static final int j(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean k(defpackage.vg6 r7) {
        /*
            java.util.List r0 = r7.a
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L39
            java.lang.Object r5 = r0.get(r3)
            ah6 r5 = (defpackage.ah6) r5
            int r5 = r5.i
            r6 = 2
            if (r5 != r6) goto L19
            int r3 = r3 + 1
            goto L8
        L19:
            android.view.MotionEvent r0 = r7.a()
            if (r0 == 0) goto L28
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = r0.isFromSource(r1)
            if (r0 != r4) goto L28
            goto L39
        L28:
            android.view.MotionEvent r7 = r7.a()
            if (r7 == 0) goto L38
            r0 = 1048584(0x100008, float:1.469379E-39)
            boolean r7 = r7.isFromSource(r0)
            if (r7 != r4) goto L38
            goto L39
        L38:
            return r2
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy7.k(vg6):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.gj8 l(defpackage.gj8 r30, androidx.compose.ui.unit.LayoutDirection r31) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy7.l(gj8, androidx.compose.ui.unit.LayoutDirection):gj8");
    }

    public static final void m(RecyclerView recyclerView) {
        recyclerView.setOverScrollMode(i(recyclerView) ? 1 : 2);
    }

    public static void n(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            te.T(viewGroup, z);
        } else if (d) {
            try {
                te.T(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public static void o(int i, int i2) {
        String strJ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strJ = w07.j("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(rm7.o(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                }
                strJ = w07.j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void p(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? q("start index", i, i3) : (i2 < 0 || i2 > i3) ? q("end index", i2, i3) : w07.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String q(String str, int i, int i2) {
        if (i < 0) {
            return w07.j("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return w07.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(rm7.o(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
    }

    @Override // defpackage.ty7
    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    @Override // defpackage.ty7
    public final float b(View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
