package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bt2;
import defpackage.c08;
import defpackage.c26;
import defpackage.d26;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.fy5;
import defpackage.go5;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.hh2;
import defpackage.ho5;
import defpackage.hy5;
import defpackage.ib5;
import defpackage.is3;
import defpackage.js3;
import defpackage.lq8;
import defpackage.m14;
import defpackage.mb5;
import defpackage.n14;
import defpackage.nr5;
import defpackage.o87;
import defpackage.ol3;
import defpackage.pk4;
import defpackage.qb5;
import defpackage.qj1;
import defpackage.qk4;
import defpackage.ql3;
import defpackage.qp2;
import defpackage.rd;
import defpackage.rn3;
import defpackage.rn6;
import defpackage.rq3;
import defpackage.s04;
import defpackage.sl3;
import defpackage.sy6;
import defpackage.t04;
import defpackage.t61;
import defpackage.ti1;
import defpackage.tm0;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.tz2;
import defpackage.ue8;
import defpackage.v04;
import defpackage.xq5;
import defpackage.xr7;
import defpackage.y40;
import defpackage.y97;
import defpackage.ye4;
import defpackage.yk4;
import defpackage.z4;
import defpackage.zb5;
import defpackage.ze4;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends j implements yk4, v04, hy5 {
    public static final dp2 O = new dp2() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) throws Throwable {
            m mVar = (m) obj;
            h hVar = mVar.p;
            try {
                if (mVar.p()) {
                    mVar.i1(true);
                }
                return tx8.a;
            } catch (Throwable th) {
                hVar.v0(th);
                throw null;
            }
        }
    };
    public static final dp2 P = new dp2() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            fy5 fy5Var = ((m) obj).N;
            if (fy5Var != null) {
                fy5Var.invalidate();
            }
            return tx8.a;
        }
    };
    public static final o87 Q = new o87();
    public static final s04 R = new s04();
    public static final float[] S = pk4.a();
    public static final sl3 T = new sl3(11);
    public static final ol3 U = new ol3(12);
    public ib5 A;
    public float C;
    public qb5 D;
    public s04 E;
    public boolean G;
    public boolean H;
    public androidx.compose.ui.graphics.layer.a I;
    public tm0 J;
    public qp2 K;
    public boolean M;
    public fy5 N;
    public final h p;
    public boolean q;
    public m r;
    public m s;
    public boolean t;
    public boolean u;
    public dp2 v;
    public qj1 w;
    public LayoutDirection x;
    public dl4 z;
    public float y = 0.8f;
    public long B = 0;
    public xr7 F = tt3.d;
    public final bp2 L = new NodeCoordinator$invalidateParentLayer$1(this);

    public m(h hVar) {
        this.p = hVar;
        this.w = hVar.A;
        this.x = hVar.B;
    }

    public static m d1(v04 v04Var) {
        m mVar;
        ze4 ze4Var = v04Var instanceof ze4 ? (ze4) v04Var : null;
        if (ze4Var != null && (mVar = ze4Var.a.p) != null) {
            return mVar;
        }
        js3.n(v04Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (m) v04Var;
    }

    public final long A0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - U();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - T();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float B0(long j, long j2) {
        if (U() >= Float.intBitsToFloat((int) (j2 >> 32)) && T() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jA0 = A0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - U());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - T()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.v04
    public final long C(v04 v04Var, long j) {
        return H(v04Var, j);
    }

    public final void C0(tm0 tm0Var, androidx.compose.ui.graphics.layer.a aVar) {
        fy5 fy5Var = this.N;
        if (fy5Var != null) {
            fy5Var.c(tm0Var, aVar);
            return;
        }
        long j = this.B;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        tm0Var.n(f, f2);
        D0(tm0Var, aVar);
        tm0Var.n(-f, -f2);
    }

    public final void D0(tm0 tm0Var, androidx.compose.ui.graphics.layer.a aVar) {
        tm0 tm0Var2;
        androidx.compose.ui.graphics.layer.a aVar2;
        gx4 gx4VarK0 = K0(4);
        if (gx4VarK0 == null) {
            Y0(tm0Var, aVar);
            return;
        }
        h hVar = this.p;
        hVar.getClass();
        i sharedDrawScope = m14.a(hVar).getSharedDrawScope();
        long jM = tt3.M(this.c);
        sharedDrawScope.getClass();
        zb5 zb5Var = null;
        while (gx4VarK0 != null) {
            if (gx4VarK0 instanceof gv1) {
                tm0Var2 = tm0Var;
                aVar2 = aVar;
                sharedDrawScope.b(tm0Var2, jM, this, (gv1) gx4VarK0, aVar2);
            } else {
                tm0Var2 = tm0Var;
                aVar2 = aVar;
                if ((gx4VarK0.c & 4) != 0 && (gx4VarK0 instanceof ti1)) {
                    int i = 0;
                    for (gx4 gx4Var = ((ti1) gx4VarK0).p; gx4Var != null; gx4Var = gx4Var.f) {
                        if ((gx4Var.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                gx4VarK0 = gx4Var;
                            } else {
                                if (zb5Var == null) {
                                    zb5Var = new zb5(0, new gx4[16]);
                                }
                                if (gx4VarK0 != null) {
                                    zb5Var.b(gx4VarK0);
                                    gx4VarK0 = null;
                                }
                                zb5Var.b(gx4Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                tm0Var = tm0Var2;
                aVar = aVar2;
            }
            gx4VarK0 = y40.j(zb5Var);
            tm0Var = tm0Var2;
            aVar = aVar2;
        }
    }

    public abstract void E0();

    public final m F0(m mVar) {
        h hVarF = mVar.p;
        h hVar = this.p;
        if (hVarF == hVar) {
            gx4 gx4VarJ0 = mVar.J0();
            gx4 gx4VarJ02 = J0();
            if (!gx4VarJ02.a.n) {
                rn3.b("visitLocalAncestors called on an unattached node");
            }
            for (gx4 gx4Var = gx4VarJ02.a.e; gx4Var != null; gx4Var = gx4Var.e) {
                if ((gx4Var.c & 2) != 0 && gx4Var == gx4VarJ0) {
                    return mVar;
                }
            }
            return this;
        }
        while (hVarF.r > hVar.r) {
            hVarF = hVarF.F();
            js3.m(hVarF);
        }
        h hVarF2 = hVar;
        while (hVarF2.r > hVarF.r) {
            hVarF2 = hVarF2.F();
            js3.m(hVarF2);
        }
        while (hVarF != hVarF2) {
            hVarF = hVarF.F();
            hVarF2 = hVarF2.F();
            if (hVarF == null || hVarF2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (hVarF2 != hVar) {
            if (hVarF != mVar.p) {
                return (e) hVarF.H.d;
            }
            return mVar;
        }
        return this;
    }

    @Override // defpackage.v04
    public final long G(long j) {
        if (!J0().n) {
            rn3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return H(c26.t(this), ((AndroidComposeView) m14.a(this.p)).G(j));
    }

    public final long G0(long j) {
        long j2 = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        fy5 fy5Var = this.N;
        return fy5Var != null ? fy5Var.f(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    @Override // defpackage.v04
    public final long H(v04 v04Var, long j) {
        if (v04Var instanceof ze4) {
            ze4 ze4Var = (ze4) v04Var;
            ze4Var.a.p.S0();
            return ze4Var.H(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        m mVarD1 = d1(v04Var);
        mVarD1.S0();
        m mVarF0 = F0(mVarD1);
        while (mVarD1 != mVarF0) {
            fy5 fy5Var = mVarD1.N;
            if (fy5Var != null) {
                j = fy5Var.f(j, false);
            }
            j = is3.D(j, mVarD1.B);
            mVarD1 = mVarD1.s;
            js3.m(mVarD1);
        }
        return z0(mVarF0, j);
    }

    public abstract ye4 H0();

    @Override // defpackage.v04
    public final sy6 I(v04 v04Var, boolean z) {
        if (!J0().n) {
            rn3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!v04Var.h()) {
            rn3.b("LayoutCoordinates " + v04Var + " is not attached!");
        }
        m mVarD1 = d1(v04Var);
        mVarD1.S0();
        m mVarF0 = F0(mVarD1);
        qb5 qb5Var = this.D;
        if (qb5Var == null) {
            qb5Var = new qb5();
            this.D = qb5Var;
        }
        qb5Var.b = 0.0f;
        qb5Var.c = 0.0f;
        qb5Var.d = (int) (v04Var.k() >> 32);
        qb5Var.e = (int) (v04Var.k() & 4294967295L);
        while (mVarD1 != mVarF0) {
            mVarD1.a1(qb5Var, z, false);
            if (qb5Var.b()) {
                return sy6.e;
            }
            mVarD1 = mVarD1.s;
            js3.m(mVarD1);
        }
        y0(mVarF0, qb5Var, z);
        return new sy6(qb5Var.b, qb5Var.c, qb5Var.d, qb5Var.e);
    }

    public final long I0() {
        return this.w.h0(this.p.C.d());
    }

    public abstract gx4 J0();

    @Override // defpackage.v04
    public final long K(long j) {
        if (!J0().n) {
            rn3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        S0();
        for (m mVar = this; mVar != null; mVar = mVar.s) {
            h hVar = mVar.p;
            if (mVar == ((m) hVar.H.e) && !hVar.c) {
                long jB = m14.a(hVar).getRectManager().b(hVar);
                if (!rq3.a(jB, 9223372034707292159L)) {
                    return is3.D(j, jB);
                }
            }
            fy5 fy5Var = mVar.N;
            if (fy5Var != null) {
                j = fy5Var.f(j, false);
            }
            j = is3.D(j, mVar.B);
        }
        return j;
    }

    public final gx4 K0(int i) {
        boolean zG = ho5.g(i);
        gx4 gx4VarJ0 = J0();
        if (!zG && (gx4VarJ0 = gx4VarJ0.e) == null) {
            return null;
        }
        for (gx4 gx4VarL0 = L0(zG); gx4VarL0 != null && (gx4VarL0.d & i) != 0; gx4VarL0 = gx4VarL0.f) {
            if ((gx4VarL0.c & i) != 0) {
                return gx4VarL0;
            }
            if (gx4VarL0 == gx4VarJ0) {
                return null;
            }
        }
        return null;
    }

    public final gx4 L0(boolean z) {
        gx4 gx4VarJ0;
        z4 z4Var = this.p.H;
        if (((m) z4Var.e) == this) {
            return (gx4) z4Var.g;
        }
        if (!z) {
            m mVar = this.s;
            if (mVar != null) {
                return mVar.J0();
            }
            return null;
        }
        m mVar2 = this.s;
        if (mVar2 == null || (gx4VarJ0 = mVar2.J0()) == null) {
            return null;
        }
        return gx4VarJ0.f;
    }

    public final void M0(gx4 gx4Var, go5 go5Var, long j, tz2 tz2Var, int i, boolean z) {
        if (gx4Var == null) {
            P0(go5Var, j, tz2Var, i, z);
            return;
        }
        int i2 = tz2Var.c;
        mb5 mb5Var = tz2Var.a;
        tz2Var.c(i2 + 1, mb5Var.b);
        tz2Var.c++;
        mb5Var.g(gx4Var);
        tz2Var.b.a(br9.e(-1.0f, z, false));
        M0(y97.h(gx4Var, go5Var.f()), go5Var, j, tz2Var, i, z);
        tz2Var.c = i2;
    }

    public final void N0(gx4 gx4Var, go5 go5Var, long j, tz2 tz2Var, int i, boolean z, float f) {
        if (gx4Var == null) {
            P0(go5Var, j, tz2Var, i, z);
            return;
        }
        int i2 = tz2Var.c;
        mb5 mb5Var = tz2Var.a;
        tz2Var.c(i2 + 1, mb5Var.b);
        tz2Var.c++;
        mb5Var.g(gx4Var);
        tz2Var.b.a(br9.e(f, z, false));
        X0(y97.h(gx4Var, go5Var.f()), go5Var, j, tz2Var, i, z, f, true);
        tz2Var.c = i2;
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.p.A.O();
    }

    public final void O0(go5 go5Var, long j, tz2 tz2Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        gx4 gx4VarK0 = K0(go5Var.f());
        if (!j1(j)) {
            if (i == 1) {
                float fB0 = B0(j, I0());
                if ((Float.floatToRawIntBits(fB0) & Integer.MAX_VALUE) < 2139095040) {
                    if (tz2Var.c != br9.y(tz2Var)) {
                        if (js3.t(tz2Var.a(), br9.e(fB0, false, false)) <= 0) {
                            return;
                        }
                    }
                    N0(gx4VarK0, go5Var, j, tz2Var, i, false, fB0);
                    return;
                }
                return;
            }
            return;
        }
        if (gx4VarK0 == null) {
            P0(go5Var, j, tz2Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < U() && fIntBitsToFloat2 < T()) {
            M0(gx4VarK0, go5Var, j, tz2Var, i, z);
            return;
        }
        float fB02 = i == 1 ? B0(j, I0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fB02) & Integer.MAX_VALUE) < 2139095040) {
            if (tz2Var.c != br9.y(tz2Var)) {
                z2 = z;
                if (js3.t(tz2Var.a(), br9.e(fB02, z2, false)) > 0) {
                }
                X0(gx4VarK0, go5Var, j, tz2Var, i, z2, fB02, z3);
            }
            z2 = z;
            z3 = true;
            X0(gx4VarK0, go5Var, j, tz2Var, i, z2, fB02, z3);
        }
        z2 = z;
        z3 = false;
        X0(gx4VarK0, go5Var, j, tz2Var, i, z2, fB02, z3);
    }

    public void P0(go5 go5Var, long j, tz2 tz2Var, int i, boolean z) {
        m mVar = this.r;
        if (mVar != null) {
            mVar.O0(go5Var, mVar.G0(j), tz2Var, i, z);
        }
    }

    public final void Q0() {
        fy5 fy5Var = this.N;
        if (fy5Var != null) {
            fy5Var.invalidate();
            return;
        }
        m mVar = this.s;
        if (mVar != null) {
            mVar.Q0();
        }
    }

    public final boolean R0() {
        if (this.N != null && this.y <= 0.0f) {
            return true;
        }
        m mVar = this.s;
        if (mVar != null) {
            return mVar.R0();
        }
        return false;
    }

    public final void S0() {
        this.p.t().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [gx4] */
    /* JADX WARN: Type inference failed for: r7v7, types: [gx4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void T0() {
        gx4 gx4VarJ0;
        boolean zG = ho5.g(128);
        gx4 gx4VarL0 = L0(zG);
        if (gx4VarL0 == null || (gx4VarL0.a.d & 128) == 0) {
            return;
        }
        c08 c08VarK = ql3.k();
        dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
        c08 c08VarM = ql3.m(c08VarK);
        try {
            if (!zG) {
                gx4VarJ0 = J0().e;
                if (gx4VarJ0 == null) {
                }
            }
            gx4VarJ0 = J0();
            for (gx4 gx4VarL02 = L0(zG); gx4VarL02 != null; gx4VarL02 = gx4VarL02.f) {
                if ((gx4VarL02.d & 128) == 0) {
                    break;
                }
                if ((gx4VarL02.c & 128) != 0) {
                    ?? J = gx4VarL02;
                    ?? zb5Var = 0;
                    while (J != 0) {
                        if (J instanceof t04) {
                            ((t04) J).n(this.c);
                        } else if ((J.c & 128) != 0 && (J instanceof ti1)) {
                            gx4 gx4Var = ((ti1) J).p;
                            int i = 0;
                            J = J;
                            zb5Var = zb5Var;
                            while (gx4Var != null) {
                                if ((gx4Var.c & 128) != 0) {
                                    i++;
                                    zb5Var = zb5Var;
                                    if (i == 1) {
                                        J = gx4Var;
                                    } else {
                                        if (zb5Var == 0) {
                                            zb5Var = new zb5(0, new gx4[16]);
                                        }
                                        if (J != 0) {
                                            zb5Var.b(J);
                                            J = 0;
                                        }
                                        zb5Var.b(gx4Var);
                                    }
                                }
                                gx4Var = gx4Var.f;
                                J = J;
                                zb5Var = zb5Var;
                            }
                            if (i == 1) {
                            }
                        }
                        J = y40.j(zb5Var);
                    }
                }
                if (gx4VarL02 == gx4VarJ0) {
                    break;
                }
            }
        } finally {
            ql3.u(c08VarK, c08VarM, dp2VarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void U0() {
        boolean zG = ho5.g(4194304);
        gx4 gx4VarJ0 = J0();
        if (!zG && (gx4VarJ0 = gx4VarJ0.e) == null) {
            return;
        }
        for (gx4 gx4VarL0 = L0(zG); gx4VarL0 != null && (gx4VarL0.d & 4194304) != 0; gx4VarL0 = gx4VarL0.f) {
            if ((gx4VarL0.c & 4194304) != 0) {
                ?? J = gx4VarL0;
                ?? zb5Var = 0;
                while (J != 0) {
                    if (J instanceof t04) {
                        ((t04) J).k(this);
                    } else if ((J.c & 4194304) != 0 && (J instanceof ti1)) {
                        gx4 gx4Var = ((ti1) J).p;
                        int i = 0;
                        J = J;
                        zb5Var = zb5Var;
                        while (gx4Var != null) {
                            if ((gx4Var.c & 4194304) != 0) {
                                i++;
                                zb5Var = zb5Var;
                                if (i == 1) {
                                    J = gx4Var;
                                } else {
                                    if (zb5Var == 0) {
                                        zb5Var = new zb5(0, new gx4[16]);
                                    }
                                    if (J != 0) {
                                        zb5Var.b(J);
                                        J = 0;
                                    }
                                    zb5Var.b(gx4Var);
                                }
                            }
                            gx4Var = gx4Var.f;
                            J = J;
                            zb5Var = zb5Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J = y40.j(zb5Var);
                }
            }
            if (gx4VarL0 == gx4VarJ0) {
                return;
            }
        }
    }

    public final void V0() {
        this.t = true;
        ((NodeCoordinator$invalidateParentLayer$1) this.L).invoke();
        b1();
        if (rq3.a(this.B, 0L)) {
            return;
        }
        this.p.h0();
    }

    public final void W0() {
        boolean zG = ho5.g(1048576);
        gx4 gx4VarL0 = L0(zG);
        if (gx4VarL0 == null || (gx4VarL0.a.d & 1048576) == 0) {
            return;
        }
        gx4 gx4VarJ0 = J0();
        if (!zG && (gx4VarJ0 = gx4VarJ0.e) == null) {
            return;
        }
        for (gx4 gx4VarL02 = L0(zG); gx4VarL02 != null && (gx4VarL02.d & 1048576) != 0; gx4VarL02 = gx4VarL02.f) {
            if ((gx4VarL02.c & 1048576) != 0) {
                gx4 gx4VarJ = gx4VarL02;
                zb5 zb5Var = null;
                while (gx4VarJ != null) {
                    if ((gx4VarJ.c & 1048576) != 0 && (gx4VarJ instanceof ti1)) {
                        int i = 0;
                        for (gx4 gx4Var = ((ti1) gx4VarJ).p; gx4Var != null; gx4Var = gx4Var.f) {
                            if ((gx4Var.c & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    gx4VarJ = gx4Var;
                                } else {
                                    if (zb5Var == null) {
                                        zb5Var = new zb5(0, new gx4[16]);
                                    }
                                    if (gx4VarJ != null) {
                                        zb5Var.b(gx4VarJ);
                                        gx4VarJ = null;
                                    }
                                    zb5Var.b(gx4Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    gx4VarJ = y40.j(zb5Var);
                }
            }
            if (gx4VarL02 == gx4VarJ0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d A[PHI: r2
      0x018d: PHI (r2v7 ??) = (r2v1 ??), (r2v1 ??), (r2v9 ??) binds: [B:52:0x0159, B:54:0x015d, B:68:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [zb5] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v7, types: [zb5] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X0(final defpackage.gx4 r19, final defpackage.go5 r20, final long r21, final defpackage.tz2 r23, final int r24, final boolean r25, final float r26, final boolean r27) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.m.X0(gx4, go5, long, tz2, int, boolean, float, boolean):void");
    }

    public abstract void Y0(tm0 tm0Var, androidx.compose.ui.graphics.layer.a aVar);

    public final void Z0(long j, float f, dp2 dp2Var) {
        h1(dp2Var, false);
        boolean zA = rq3.a(this.B, j);
        h hVar = this.p;
        if (!zA) {
            ((AndroidComposeView) m14.a(hVar)).M(-4.0f);
            this.B = j;
            hVar.t().p.m0();
            fy5 fy5Var = this.N;
            if (fy5Var != null) {
                fy5Var.j(j);
            } else {
                m mVar = this.s;
                if (mVar != null) {
                    mVar.Q0();
                }
            }
            hVar.h0();
            j.v0(this);
            Owner owner = hVar.p;
            if (owner != null) {
                ((AndroidComposeView) owner).y(hVar);
            }
        }
        this.C = f;
        if (this == ((m) hVar.H.e)) {
            m14.a(hVar).getRectManager().e(hVar, false);
        }
        if (this.k) {
            return;
        }
        m0(r0());
    }

    public final void a1(qb5 qb5Var, boolean z, boolean z2) {
        fy5 fy5Var = this.N;
        if (fy5Var != null) {
            if (this.u) {
                if (z2) {
                    long jI0 = I0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI0 & 4294967295L)) / 2.0f;
                    long j = this.c;
                    qb5Var.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    qb5Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (qb5Var.b()) {
                    return;
                }
            }
            fy5Var.b(qb5Var, false);
        }
        long j3 = this.B;
        float f = (int) (j3 >> 32);
        qb5Var.b += f;
        qb5Var.d += f;
        float f2 = (int) (j3 & 4294967295L);
        qb5Var.c += f2;
        qb5Var.e += f2;
    }

    @Override // defpackage.v04
    public final long b(long j) {
        long jK = K(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) m14.a(this.p);
        androidComposeView.C();
        return pk4.b(jK, androidComposeView.y0);
    }

    public final void b1() {
        if (this.N != null) {
            h1(null, false);
            this.p.r0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [gx4] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [zb5] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [zb5] */
    public final void c1(dl4 dl4Var) {
        m mVar;
        dl4 dl4Var2 = this.z;
        if (dl4Var != dl4Var2) {
            this.z = dl4Var;
            h hVar = this.p;
            int i = 0;
            if (dl4Var2 == null || dl4Var.b() != dl4Var2.b() || dl4Var.a() != dl4Var2.a()) {
                int iB = dl4Var.b();
                int iA = dl4Var.a();
                fy5 fy5Var = this.N;
                if (fy5Var != null) {
                    fy5Var.g((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (hVar.V() && (mVar = this.s) != null) {
                    mVar.Q0();
                }
                Y((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.v != null) {
                    i1(false);
                }
                boolean zG = ho5.g(4);
                gx4 gx4VarJ0 = J0();
                if (zG || (gx4VarJ0 = gx4VarJ0.e) != null) {
                    for (gx4 gx4VarL0 = L0(zG); gx4VarL0 != null && (gx4VarL0.d & 4) != 0; gx4VarL0 = gx4VarL0.f) {
                        if ((gx4VarL0.c & 4) != 0) {
                            ?? J = gx4VarL0;
                            ?? zb5Var = 0;
                            while (J != 0) {
                                if (J instanceof gv1) {
                                    ((gv1) J).H();
                                } else if ((J.c & 4) != 0 && (J instanceof ti1)) {
                                    gx4 gx4Var = ((ti1) J).p;
                                    int i2 = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var != null) {
                                        if ((gx4Var.c & 4) != 0) {
                                            i2++;
                                            zb5Var = zb5Var;
                                            if (i2 == 1) {
                                                J = gx4Var;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var);
                                            }
                                        }
                                        gx4Var = gx4Var.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = y40.j(zb5Var);
                            }
                        }
                        if (gx4VarL0 == gx4VarJ0) {
                            break;
                        }
                    }
                }
                Owner owner = hVar.p;
                if (owner != null) {
                    ((AndroidComposeView) owner).y(hVar);
                }
            }
            ib5 ib5Var = this.A;
            if ((ib5Var == null || ib5Var.e == 0) && dl4Var.c().isEmpty()) {
                return;
            }
            ib5 ib5Var2 = this.A;
            Map mapC = dl4Var.c();
            if (ib5Var2 != null && ib5Var2.e == mapC.size()) {
                Object[] objArr = ib5Var2.b;
                int[] iArr = ib5Var2.c;
                long[] jArr = ib5Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapC.get((rd) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            hVar.t().p.w.g();
            ib5 ib5Var3 = this.A;
            if (ib5Var3 == null) {
                ib5 ib5Var4 = xq5.a;
                ib5Var3 = new ib5();
                this.A = ib5Var3;
            }
            ib5Var3.a();
            for (Map.Entry entry : dl4Var.c().entrySet()) {
                ib5Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final sy6 e1() {
        if (J0().n) {
            v04 v04VarT = c26.t(this);
            qb5 qb5Var = this.D;
            if (qb5Var == null) {
                qb5Var = new qb5();
                this.D = qb5Var;
            }
            long jA0 = A0(I0());
            int i = (int) (jA0 >> 32);
            qb5Var.b = -Float.intBitsToFloat(i);
            int i2 = (int) (jA0 & 4294967295L);
            qb5Var.c = -Float.intBitsToFloat(i2);
            qb5Var.d = Float.intBitsToFloat(i) + U();
            qb5Var.e = Float.intBitsToFloat(i2) + T();
            m mVar = this;
            while (mVar != v04VarT) {
                mVar.a1(qb5Var, false, true);
                if (!qb5Var.b()) {
                    mVar = mVar.s;
                    js3.m(mVar);
                }
            }
            return new sy6(qb5Var.b, qb5Var.c, qb5Var.d, qb5Var.e);
        }
        return sy6.e;
    }

    @Override // androidx.compose.ui.node.j, defpackage.fl4
    public final h f0() {
        return this.p;
    }

    public final void f1(m mVar, float[] fArr) {
        if (js3.i(mVar, this)) {
            return;
        }
        m mVar2 = this.s;
        js3.m(mVar2);
        mVar2.f1(mVar, fArr);
        if (!rq3.a(this.B, 0L)) {
            float[] fArr2 = S;
            pk4.d(fArr2);
            long j = this.B;
            pk4.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            pk4.e(fArr, fArr2);
        }
        fy5 fy5Var = this.N;
        if (fy5Var != null) {
            fy5Var.i(fArr);
        }
    }

    public final void g1(m mVar, float[] fArr) {
        m mVar2 = this;
        while (!mVar2.equals(mVar)) {
            fy5 fy5Var = mVar2.N;
            if (fy5Var != null) {
                fy5Var.a(fArr);
            }
            if (!rq3.a(mVar2.B, 0L)) {
                float[] fArr2 = S;
                pk4.d(fArr2);
                pk4.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                pk4.e(fArr, fArr2);
            }
            mVar2 = mVar2.s;
            js3.m(mVar2);
        }
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.p.A.getDensity();
    }

    @Override // defpackage.es3
    public final LayoutDirection getLayoutDirection() {
        return this.p.B;
    }

    @Override // defpackage.v04
    public final boolean h() {
        return J0().n;
    }

    public final void h1(dp2 dp2Var, boolean z) {
        Owner owner;
        qp2 qp2Var;
        zb5 zb5Var;
        Reference referencePoll;
        Object obj;
        h hVar = this.p;
        boolean z2 = (!z && this.v == dp2Var && js3.i(this.w, hVar.A) && this.x == hVar.B) ? false : true;
        this.w = hVar.A;
        this.x = hVar.B;
        boolean zU = hVar.U();
        bp2 bp2Var = this.L;
        if (!zU || dp2Var == null) {
            this.v = null;
            fy5 fy5Var = this.N;
            if (fy5Var != null) {
                if (!bt2.E(fy5Var.mo7getUnderlyingMatrixsQKQjiQ())) {
                    hVar.h0();
                }
                fy5Var.destroy();
                hVar.K = true;
                ((NodeCoordinator$invalidateParentLayer$1) bp2Var).invoke();
                if (J0().n && hVar.V() && (owner = hVar.p) != null) {
                    ((AndroidComposeView) owner).y(hVar);
                }
            }
            this.N = null;
            this.M = false;
            return;
        }
        this.v = dp2Var;
        if (this.N != null) {
            if (z2) {
                i1(true);
                return;
            }
            return;
        }
        Owner ownerA = m14.a(hVar);
        qp2 qp2Var2 = this.K;
        if (qp2Var2 == null) {
            final bp2 bp2Var2 = new bp2() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    m mVar = this.g;
                    tm0 tm0Var = mVar.J;
                    js3.m(tm0Var);
                    mVar.D0(tm0Var, mVar.I);
                    return tx8.a;
                }
            };
            qp2 qp2Var3 = new qp2() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    tm0 tm0Var = (tm0) obj2;
                    androidx.compose.ui.graphics.layer.a aVar = (androidx.compose.ui.graphics.layer.a) obj3;
                    m mVar = this;
                    h hVar2 = mVar.p;
                    if (hVar2.V()) {
                        mVar.J = tm0Var;
                        mVar.I = aVar;
                        p snapshotObserver = m14.a(hVar2).getSnapshotObserver();
                        snapshotObserver.a.d(mVar, m.P, bp2Var2);
                        mVar.M = false;
                    } else {
                        mVar.M = true;
                    }
                    return tx8.a;
                }
            };
            this.K = qp2Var3;
            qp2Var = qp2Var3;
        } else {
            qp2Var = qp2Var2;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) ownerA;
        rn6 rn6Var = androidComposeView.T0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) rn6Var.c;
            zb5Var = (zb5) rn6Var.b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                zb5Var.k(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i = zb5Var.c;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) zb5Var.l(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        fy5 mVar = (fy5) obj;
        if (mVar != null) {
            mVar.h(qp2Var, bp2Var);
        } else {
            mVar = new androidx.compose.ui.platform.m(androidComposeView.getGraphicsContext().b(), androidComposeView.getGraphicsContext(), androidComposeView, qp2Var, bp2Var);
        }
        mVar.g(this.c);
        mVar.j(this.B);
        this.N = mVar;
        i1(true);
        hVar.K = true;
        ((NodeCoordinator$invalidateParentLayer$1) bp2Var).invoke();
    }

    @Override // defpackage.v04
    public final void i(float[] fArr) {
        Owner ownerA = m14.a(this.p);
        m mVarD1 = d1(c26.t(this));
        g1(mVarD1, fArr);
        if (ownerA instanceof qk4) {
            ((AndroidComposeView) ((qk4) ownerA)).r(fArr);
            return;
        }
        long jQ = mVarD1.q(0L);
        if ((9223372034707292159L & jQ) != 9205357640488583168L) {
            pk4.f(fArr, Float.intBitsToFloat((int) (jQ >> 32)), Float.intBitsToFloat((int) (jQ & 4294967295L)));
        }
    }

    public final void i1(boolean z) {
        Owner owner;
        fy5 fy5Var = this.N;
        if (fy5Var == null) {
            if (this.v == null) {
                return;
            }
            rn3.b("null layer with a non-null layerBlock");
            return;
        }
        final dp2 dp2Var = this.v;
        if (dp2Var == null) {
            throw t61.r("updateLayerParameters requires a non-null layerBlock");
        }
        o87 o87Var = Q;
        o87Var.a();
        h hVar = this.p;
        o87Var.o = hVar.A;
        o87Var.p = hVar.B;
        o87Var.n = tt3.M(this.c);
        m14.a(hVar).getSnapshotObserver().a.d(this, O, new bp2() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                o87 o87Var2 = m.Q;
                dp2Var.invoke(o87Var2);
                m mVar = this;
                xr7 xr7Var = mVar.F;
                xr7 xr7Var2 = o87Var2.k;
                boolean z2 = xr7Var != xr7Var2;
                boolean z3 = mVar.G;
                boolean z4 = o87Var2.l;
                boolean z5 = z3 != z4;
                if (z2 || z5) {
                    mVar.F = xr7Var2;
                    mVar.G = z4;
                    if (mVar.H && (z5 || (z4 && z2))) {
                        mVar.p.S();
                    }
                }
                mVar.H = true;
                o87Var2.s = o87Var2.k.a(o87Var2.n, o87Var2.p, o87Var2.o);
                return tx8.a;
            }
        });
        s04 s04Var = this.E;
        if (s04Var == null) {
            s04Var = new s04();
            this.E = s04Var;
        }
        s04 s04Var2 = R;
        s04Var2.getClass();
        s04Var2.a = s04Var.a;
        s04Var2.b = s04Var.b;
        s04Var2.c = s04Var.c;
        s04Var2.d = s04Var.d;
        s04Var2.e = s04Var.e;
        s04Var.a = o87Var.b;
        s04Var.b = o87Var.c;
        s04Var.c = o87Var.h;
        s04Var.d = o87Var.i;
        s04Var.e = o87Var.j;
        fy5Var.e(o87Var);
        boolean z2 = this.u;
        this.u = o87Var.l;
        this.y = o87Var.d;
        boolean z3 = s04Var2.a == s04Var.a && s04Var2.b == s04Var.b && s04Var2.c == s04Var.c && s04Var2.d == s04Var.d && lq8.a(s04Var2.e, s04Var.e);
        if (z && ((!z3 || z2 != this.u) && (owner = hVar.p) != null)) {
            ((AndroidComposeView) owner).y(hVar);
        }
        if (z3) {
            return;
        }
        n14 n14VarT = hVar.t();
        if (n14VarT.l > 0) {
            if (n14VarT.k || n14VarT.j) {
                hVar.r0(false);
            }
            n14VarT.p.m0();
        }
        hVar.h0();
        Owner ownerA = m14.a(hVar);
        androidx.compose.ui.spatial.a rectManager = ownerA.getRectManager();
        if (this == ((m) hVar.H.e)) {
            rectManager.e(hVar, false);
        } else {
            rectManager.getClass();
            if (hVar.V()) {
                long jF = androidx.compose.ui.spatial.a.f(hVar);
                if (rq3.a(jF, 9223372034707292159L)) {
                    rectManager.c(hVar);
                } else {
                    hVar.f = jF;
                    hVar.g = false;
                    zb5 zb5VarL = hVar.L();
                    Object[] objArr = zb5VarL.a;
                    int i = zb5VarL.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        rectManager.e((h) objArr[i2], false);
                    }
                    rectManager.d(hVar);
                }
            }
        }
        if (hVar.Q > 0) {
            AndroidComposeView androidComposeView = (AndroidComposeView) ownerA;
            hh2 hh2Var = androidComposeView.U.e;
            hh2Var.getClass();
            if (hVar.Q > 0) {
                ((zb5) hh2Var.b).b(hVar);
                hVar.P = true;
            }
            androidComposeView.F(null);
        }
    }

    @Override // defpackage.v04
    public final void j(v04 v04Var, float[] fArr) {
        m mVarD1 = d1(v04Var);
        mVarD1.S0();
        m mVarF0 = F0(mVarD1);
        pk4.d(fArr);
        mVarD1.g1(mVarF0, fArr);
        f1(mVarF0, fArr);
    }

    public final boolean j1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        fy5 fy5Var = this.N;
        return fy5Var == null || !this.u || fy5Var.d(j);
    }

    @Override // defpackage.v04
    public final long k() {
        return this.c;
    }

    @Override // androidx.compose.ui.node.j
    public final j o0() {
        return this.r;
    }

    @Override // defpackage.hy5
    public final boolean p() {
        return (this.N == null || this.t || !this.p.U()) ? false : true;
    }

    @Override // defpackage.v04
    public final long q(long j) {
        if (!J0().n) {
            rn3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) m14.a(this.p)).s(K(j));
    }

    @Override // androidx.compose.ui.node.j
    public final boolean q0() {
        return this.z != null;
    }

    @Override // androidx.compose.ui.node.j
    public final dl4 r0() {
        dl4 dl4Var = this.z;
        if (dl4Var != null) {
            return dl4Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // androidx.compose.ui.node.j
    public final j s0() {
        return this.s;
    }

    @Override // androidx.compose.ui.node.j
    public final long t0() {
        return this.B;
    }

    @Override // defpackage.v04
    public final long u(long j) {
        if (!J0().n) {
            rn3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        v04 v04VarT = c26.t(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) m14.a(this.p);
        androidComposeView.C();
        return H(v04VarT, nr5.f(pk4.b(j, androidComposeView.z0), v04VarT.K(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.b96, defpackage.yk4
    public final Object v() {
        h hVar = this.p;
        if (!hVar.H.f(64)) {
            return null;
        }
        J0();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (gx4 gx4Var = (ue8) hVar.H.f; gx4Var != null; gx4Var = gx4Var.e) {
            if ((gx4Var.c & 64) != 0) {
                ?? zb5Var = 0;
                ?? J = gx4Var;
                while (J != 0) {
                    if (J instanceof d26) {
                        ref$ObjectRef.a = ((d26) J).q(hVar.A, ref$ObjectRef.a);
                    } else if ((J.c & 64) != 0 && (J instanceof ti1)) {
                        gx4 gx4Var2 = ((ti1) J).p;
                        int i = 0;
                        J = J;
                        zb5Var = zb5Var;
                        while (gx4Var2 != null) {
                            if ((gx4Var2.c & 64) != 0) {
                                i++;
                                zb5Var = zb5Var;
                                if (i == 1) {
                                    J = gx4Var2;
                                } else {
                                    if (zb5Var == 0) {
                                        zb5Var = new zb5(0, new gx4[16]);
                                    }
                                    if (J != 0) {
                                        zb5Var.b(J);
                                        J = 0;
                                    }
                                    zb5Var.b(gx4Var2);
                                }
                            }
                            gx4Var2 = gx4Var2.f;
                            J = J;
                            zb5Var = zb5Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J = y40.j(zb5Var);
                }
            }
        }
        return ref$ObjectRef.a;
    }

    @Override // defpackage.v04
    public final v04 w() {
        boolean z = J0().n;
        h hVar = this.p;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (h hVarF = hVar; hVarF != null; hVarF = hVarF.F()) {
                sb.append("\n|");
                sb.append(hVarF);
                sb.append(" isAttached=");
                sb.append(hVarF.U());
                sb.append(" modifier=");
                sb.append(hVarF.L);
                sb.append(" tail=");
                sb.append(J0());
            }
            rn3.b(sb.toString());
        }
        S0();
        return ((m) hVar.H.e).s;
    }

    @Override // androidx.compose.ui.node.j
    public final void x0() {
        W(this.B, this.C, this.v);
    }

    public final void y0(m mVar, qb5 qb5Var, boolean z) {
        if (mVar == this) {
            return;
        }
        m mVar2 = this.s;
        if (mVar2 != null) {
            mVar2.y0(mVar, qb5Var, z);
        }
        long j = this.B;
        float f = (int) (j >> 32);
        qb5Var.b -= f;
        qb5Var.d -= f;
        float f2 = (int) (j & 4294967295L);
        qb5Var.c -= f2;
        qb5Var.e -= f2;
        fy5 fy5Var = this.N;
        if (fy5Var != null) {
            fy5Var.b(qb5Var, true);
            if (this.u && z) {
                long j2 = this.c;
                qb5Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long z0(m mVar, long j) {
        if (mVar == this) {
            return j;
        }
        m mVar2 = this.s;
        return (mVar2 == null || js3.i(mVar, mVar2)) ? G0(j) : G0(mVar2.z0(mVar, j));
    }

    @Override // androidx.compose.ui.node.j
    public final v04 p0() {
        return this;
    }
}
