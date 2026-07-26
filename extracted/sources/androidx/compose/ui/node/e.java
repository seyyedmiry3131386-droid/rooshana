package androidx.compose.ui.node;

import defpackage.b96;
import defpackage.cl4;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.gx4;
import defpackage.hh2;
import defpackage.js3;
import defpackage.jx9;
import defpackage.l14;
import defpackage.m14;
import defpackage.rd;
import defpackage.tm0;
import defpackage.ue8;
import defpackage.ye4;
import defpackage.yn3;
import defpackage.zb5;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m {
    public static final jx9 X;
    public final ue8 V;
    public yn3 W;

    static {
        jx9 jx9VarC = dt2.c();
        jx9VarC.p(zu0.e);
        jx9VarC.w(1.0f);
        jx9VarC.x(1);
        X = jx9VarC;
    }

    public e(h hVar) {
        super(hVar);
        ue8 ue8Var = new ue8();
        ue8Var.d = 0;
        this.V = ue8Var;
        ue8Var.h = this;
        this.W = hVar.j != null ? new yn3(this) : null;
    }

    @Override // androidx.compose.ui.node.m
    public final void E0() {
        if (this.W == null) {
            this.W = new yn3(this);
        }
    }

    @Override // androidx.compose.ui.node.m
    public final ye4 H0() {
        return this.W;
    }

    @Override // androidx.compose.ui.node.m
    public final gx4 J0() {
        return this.V;
    }

    @Override // defpackage.yk4
    public final int P(int i) {
        hh2 hh2VarE = this.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.i((m) hVar.H.e, hVar.o(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.node.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P0(defpackage.go5 r18, long r19, defpackage.tz2 r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.e.P0(go5, long, tz2, int, boolean):void");
    }

    @Override // defpackage.b96
    public final void W(long j, float f, dp2 dp2Var) {
        if (this.q) {
            ye4 ye4VarH0 = H0();
            js3.m(ye4VarH0);
            Z0(ye4VarH0.q, f, dp2Var);
        } else {
            Z0(j, f, dp2Var);
        }
        if (this.j) {
            return;
        }
        this.p.z().o0();
    }

    @Override // androidx.compose.ui.node.m
    public final void Y0(tm0 tm0Var, androidx.compose.ui.graphics.layer.a aVar) {
        h hVar = this.p;
        Owner ownerA = m14.a(hVar);
        zb5 zb5VarK = hVar.K();
        Object[] objArr = zb5VarK.a;
        int i = zb5VarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar2 = (h) objArr[i2];
            if (hVar2.V()) {
                hVar2.j(tm0Var, aVar);
            }
        }
        if (ownerA.getShowLayoutBounds()) {
            long j = this.c;
            tm0Var.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, X);
        }
    }

    @Override // defpackage.yk4
    public final int a(int i) {
        hh2 hh2VarE = this.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.g((m) hVar.H.e, hVar.o(), i);
    }

    @Override // androidx.compose.ui.node.j
    public final int i0(rd rdVar) {
        yn3 yn3Var = this.W;
        if (yn3Var != null) {
            return yn3Var.i0(rdVar);
        }
        l lVar = this.p.t().p;
        l14 l14Var = lVar.w;
        if (lVar.f.d == LayoutNode$LayoutState.a) {
            l14Var.d = true;
            if (l14Var.b) {
                lVar.u = true;
                lVar.v = true;
            }
        } else {
            l14Var.e = true;
        }
        e eVarF = lVar.f();
        boolean z = eVarF.k;
        eVarF.k = true;
        lVar.B();
        eVarF.k = z;
        Integer num = (Integer) l14Var.g.get(rdVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.yk4
    public final int l(int i) {
        hh2 hh2VarE = this.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.e((m) hVar.H.e, hVar.o(), i);
    }

    @Override // defpackage.yk4
    public final int n(int i) {
        hh2 hh2VarE = this.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.b((m) hVar.H.e, hVar.o(), i);
    }

    @Override // defpackage.yk4
    public final b96 t(long j) {
        c0(j);
        h hVar = this.p;
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((h) objArr[i2]).z().l = LayoutNode$UsageByParent.c;
        }
        c1(hVar.y.d(this, hVar.o(), j));
        T0();
        return this;
    }
}
