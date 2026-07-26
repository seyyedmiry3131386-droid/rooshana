package defpackage;

import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.LayoutNode$LayoutState;
import androidx.compose.ui.node.h;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class r14 implements w98 {
    public LayoutDirection a = LayoutDirection.b;
    public float b;
    public float c;
    public final /* synthetic */ g d;

    public r14(g gVar) {
        this.d = gVar;
    }

    @Override // defpackage.el4
    public final dl4 D(int i, int i2, Map map, dp2 dp2Var) {
        return Z(i, i2, map, null, dp2Var);
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return dw1.d(this, L(f));
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.c;
    }

    @Override // defpackage.es3
    public final boolean Q() {
        g gVar = this.d;
        return gVar.a.v() == LayoutNode$LayoutState.d || gVar.a.v() == LayoutNode$LayoutState.b;
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.el4
    public final dl4 Z(int i, int i2, Map map, dp2 dp2Var, dp2 dp2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            rn3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new q14(i, i2, map, dp2Var, this, this.d, dp2Var2);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.b;
    }

    @Override // defpackage.es3
    public final LayoutDirection getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.w98
    public final List r(qp2 qp2Var, Object obj) {
        g gVar = this.d;
        gVar.h();
        h hVar = gVar.a;
        LayoutNode$LayoutState layoutNode$LayoutStateV = hVar.v();
        LayoutNode$LayoutState layoutNode$LayoutState = LayoutNode$LayoutState.a;
        if (layoutNode$LayoutStateV != layoutNode$LayoutState && layoutNode$LayoutStateV != LayoutNode$LayoutState.c && layoutNode$LayoutStateV != LayoutNode$LayoutState.b && layoutNode$LayoutStateV != LayoutNode$LayoutState.d) {
            rn3.b("subcompose can only be used inside the measure or layout blocks");
        }
        rb5 rb5Var = gVar.g;
        Object objG = rb5Var.g(obj);
        if (objG == null) {
            objG = (h) gVar.j.k(obj);
            if (objG != null) {
                if (gVar.o <= 0) {
                    rn3.b("Check failed.");
                }
                gVar.o--;
            } else {
                objG = gVar.n(obj);
                if (objG == null) {
                    int i = gVar.d;
                    h hVar2 = new h(2);
                    hVar.s = true;
                    hVar.N(i, hVar2);
                    hVar.s = false;
                    objG = hVar2;
                }
            }
            rb5Var.m(obj, objG);
        }
        h hVar3 = (h) objG;
        if (a.q0(gVar.d, hVar.r()) != hVar3) {
            int iJ = ((zb5) ((kb5) hVar.r()).b).j(hVar3);
            if (iJ < gVar.d) {
                rn3.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = gVar.d;
            if (i2 != iJ) {
                gVar.j(iJ, i2);
            }
        }
        gVar.d++;
        gVar.m(hVar3, obj, false, qp2Var);
        return (layoutNode$LayoutStateV == layoutNode$LayoutState || layoutNode$LayoutStateV == LayoutNode$LayoutState.c) ? hVar3.o() : hVar3.n();
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }
}
