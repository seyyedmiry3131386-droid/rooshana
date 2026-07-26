package androidx.compose.ui.graphics;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import androidx.compose.ui.node.m;
import defpackage.a96;
import defpackage.b96;
import defpackage.c08;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.f14;
import defpackage.gx4;
import defpackage.in7;
import defpackage.js3;
import defpackage.nn7;
import defpackage.o87;
import defpackage.ql3;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.xr7;
import defpackage.y40;
import defpackage.yk4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gx4 implements f14, in7 {
    public dp2 o;

    public b(dp2 dp2Var) {
        this.o = dp2Var;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.f14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        final b96 b96VarT = yk4Var.t(j);
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96.l((a96) obj, b96VarT, 0, 0, this.o, 4);
                return tx8.a;
            }
        });
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }

    @Override // defpackage.in7
    public final boolean h() {
        return false;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        boolean z;
        xr7 xr7Var;
        m mVarE = y40.E(this, 2);
        if (mVarE.H) {
            xr7 xr7Var2 = mVarE.F;
            z = mVarE.G;
            xr7Var = xr7Var2;
        } else {
            o87 o87Var = d.a;
            if (o87Var == null) {
                d.a = new o87();
            } else {
                o87Var.a();
            }
            o87 o87Var2 = d.a;
            js3.m(o87Var2);
            o87Var2.o = mVarE.p.A;
            o87Var2.n = tt3.M(mVarE.c);
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            try {
                this.o.invoke(o87Var2);
                ql3.u(c08VarK, c08VarM, dp2VarE);
                xr7Var = o87Var2.k;
                z = o87Var2.l;
            } catch (Throwable th) {
                ql3.u(c08VarK, c08VarM, dp2VarE);
                throw th;
            }
        }
        if (z) {
            androidx.compose.ui.semantics.f.g(nn7Var, xr7Var);
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.o + ')';
    }
}
