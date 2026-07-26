package androidx.compose.ui.node;

import defpackage.b96;
import defpackage.cu7;
import defpackage.dl4;
import defpackage.dt2;
import defpackage.f14;
import defpackage.g14;
import defpackage.gx4;
import defpackage.ib5;
import defpackage.js3;
import defpackage.jx9;
import defpackage.m14;
import defpackage.qu;
import defpackage.rd;
import defpackage.rq3;
import defpackage.tm0;
import defpackage.y97;
import defpackage.ye4;
import defpackage.zq3;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends m {
    public static final jx9 Y;
    public f14 V;
    public g14 W;
    public qu X;

    static {
        jx9 jx9VarC = dt2.c();
        jx9VarC.p(zu0.f);
        jx9VarC.w(1.0f);
        jx9VarC.x(1);
        Y = jx9VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(h hVar, f14 f14Var) {
        super(hVar);
        this.V = f14Var;
        this.W = hVar.j != null ? new g14(this) : null;
        this.X = (((gx4) f14Var).a.c & 512) != 0 ? new qu(this, (cu7) f14Var) : null;
    }

    @Override // androidx.compose.ui.node.m
    public final void E0() {
        if (this.W == null) {
            this.W = new g14(this);
        }
    }

    @Override // androidx.compose.ui.node.m
    public final ye4 H0() {
        return this.W;
    }

    @Override // androidx.compose.ui.node.m
    public final gx4 J0() {
        return ((gx4) this.V).a;
    }

    @Override // defpackage.yk4
    public final int P(int i) {
        if (this.X != null) {
            js3.m(this.r);
            throw null;
        }
        f14 f14Var = this.V;
        m mVar = this.r;
        js3.m(mVar);
        return f14Var.b(this, mVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // defpackage.b96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(long r5, float r7, defpackage.dp2 r8) {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L11
            ye4 r5 = r4.H0()
            defpackage.js3.m(r5)
            long r5 = r5.q
            r4.Z0(r5, r7, r8)
            goto L14
        L11:
            r4.Z0(r5, r7, r8)
        L14:
            boolean r5 = r4.j
            if (r5 == 0) goto L19
            goto L6e
        L19:
            r4.U0()
            androidx.compose.ui.node.m r5 = r4.r
            defpackage.js3.m(r5)
            qu r6 = r4.X
            r7 = 0
            if (r6 == 0) goto L5f
            g14 r6 = r4.W
            defpackage.js3.m(r6)
            long r0 = r4.c
            g14 r6 = r4.W
            r8 = 0
            if (r6 == 0) goto L3c
            long r2 = r6.z0()
            zq3 r6 = new zq3
            r6.<init>(r2)
            goto L3d
        L3c:
            r6 = r8
        L3d:
            boolean r6 = defpackage.zq3.a(r0, r6)
            if (r6 == 0) goto L5c
            long r0 = r5.c
            ye4 r6 = r5.H0()
            if (r6 == 0) goto L54
            long r2 = r6.z0()
            zq3 r8 = new zq3
            r8.<init>(r2)
        L54:
            boolean r6 = defpackage.zq3.a(r0, r8)
            if (r6 == 0) goto L5c
            r6 = 1
            goto L5d
        L5c:
            r6 = r7
        L5d:
            r5.q = r6
        L5f:
            boolean r6 = r4.k
            r5.k = r6
            dl4 r6 = r4.r0()
            r6.d()
            r5.k = r7
            r5.q = r7
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.g.W(long, float, dp2):void");
    }

    @Override // androidx.compose.ui.node.m
    public final void Y0(tm0 tm0Var, androidx.compose.ui.graphics.layer.a aVar) {
        m mVar;
        m mVar2 = this.r;
        js3.m(mVar2);
        mVar2.C0(tm0Var, aVar);
        if (!m14.a(this.p).getShowLayoutBounds() || (mVar = this.r) == null) {
            return;
        }
        if (zq3.b(this.c, mVar.c) && rq3.a(mVar.B, 0L)) {
            return;
        }
        long j = this.c;
        tm0Var.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, Y);
    }

    @Override // defpackage.yk4
    public final int a(int i) {
        if (this.X != null) {
            js3.m(this.r);
            throw null;
        }
        f14 f14Var = this.V;
        m mVar = this.r;
        js3.m(mVar);
        return f14Var.f(this, mVar, i);
    }

    @Override // androidx.compose.ui.node.j
    public final int i0(rd rdVar) {
        g14 g14Var = this.W;
        if (g14Var == null) {
            return y97.g(this, rdVar);
        }
        ib5 ib5Var = g14Var.u;
        int iD = ib5Var.d(rdVar);
        if (iD >= 0) {
            return ib5Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(f14 f14Var) {
        if (!f14Var.equals(this.V)) {
            if ((((gx4) f14Var).a.c & 512) != 0) {
                cu7 cu7Var = (cu7) f14Var;
                qu quVar = this.X;
                if (quVar == null) {
                    quVar = new qu(this, cu7Var);
                }
                this.X = quVar;
            } else {
                this.X = null;
            }
        }
        this.V = f14Var;
    }

    @Override // defpackage.yk4
    public final int l(int i) {
        if (this.X != null) {
            js3.m(this.r);
            throw null;
        }
        f14 f14Var = this.V;
        m mVar = this.r;
        js3.m(mVar);
        return f14Var.a(this, mVar, i);
    }

    @Override // defpackage.yk4
    public final int n(int i) {
        if (this.X != null) {
            js3.m(this.r);
            throw null;
        }
        f14 f14Var = this.V;
        m mVar = this.r;
        js3.m(mVar);
        return f14Var.e(this, mVar, i);
    }

    @Override // defpackage.yk4
    public final b96 t(long j) {
        c0(j);
        qu quVar = this.X;
        if (quVar == null) {
            f14 f14Var = this.V;
            m mVar = this.r;
            js3.m(mVar);
            c1(f14Var.c(this, mVar, j));
            T0();
            return this;
        }
        g14 g14Var = quVar.a.W;
        js3.m(g14Var);
        dl4 dl4VarR0 = g14Var.r0();
        dl4VarR0.b();
        dl4VarR0.a();
        throw null;
    }
}
