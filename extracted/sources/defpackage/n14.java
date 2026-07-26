package defpackage;

import androidx.compose.ui.node.LayoutNode$LayoutState;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.m;
import androidx.compose.ui.node.p;

/* JADX INFO: loaded from: classes.dex */
public final class n14 {
    public final h a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public k q;
    public LayoutNode$LayoutState d = LayoutNode$LayoutState.e;
    public final l p = new l(this);

    public n14(h hVar) {
        this.a = hVar;
    }

    public final m a() {
        return (m) this.a.H.e;
    }

    public final void b() {
        LayoutNode$LayoutState layoutNode$LayoutStateV = this.a.v();
        if (layoutNode$LayoutStateV == LayoutNode$LayoutState.c || layoutNode$LayoutStateV == LayoutNode$LayoutState.d) {
            if (this.p.z) {
                g(true);
            } else {
                f(true);
            }
        }
        if (layoutNode$LayoutStateV == LayoutNode$LayoutState.d) {
            k kVar = this.q;
            if (kVar == null || !kVar.t) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        k kVar = this.q;
        if (kVar != null) {
            LayoutNode$LayoutState layoutNode$LayoutState = LayoutNode$LayoutState.b;
            n14 n14Var = kVar.f;
            n14Var.d = layoutNode$LayoutState;
            l lVar = n14Var.p;
            h hVar = n14Var.a;
            n14Var.e = false;
            kVar.x = j;
            p snapshotObserver = m14.a(hVar).getSnapshotObserver();
            bp2 bp2Var = kVar.y;
            snapshotObserver.a.d(hVar, snapshotObserver.b, bp2Var);
            n14Var.f = true;
            n14Var.g = true;
            if (wu8.D(hVar)) {
                lVar.u = true;
                lVar.v = true;
            } else {
                lVar.t = true;
            }
            n14Var.d = LayoutNode$LayoutState.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            h hVarF = this.a.F();
            n14 n14VarT = hVarF != null ? hVarF.t() : null;
            if (n14VarT != null) {
                if (i == 0) {
                    n14VarT.d(n14VarT.l - 1);
                } else {
                    n14VarT.d(n14VarT.l + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            h hVarF = this.a.F();
            n14 n14VarT = hVarF != null ? hVarF.t() : null;
            if (n14VarT != null) {
                if (i == 0) {
                    n14VarT.e(n14VarT.o - 1);
                } else {
                    n14VarT.e(n14VarT.o + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        l lVar = this.p;
        n14 n14Var = lVar.f;
        Object obj = lVar.q;
        h hVar = this.a;
        if ((obj != null || n14Var.a().v() != null) && lVar.p) {
            lVar.p = false;
            lVar.q = n14Var.a().v();
            h hVarF = hVar.F();
            if (hVarF != null) {
                h.s0(hVarF, false, 7);
            }
        }
        k kVar = this.q;
        if (kVar != null) {
            n14 n14Var2 = kVar.f;
            if (kVar.w == null) {
                ye4 ye4VarH0 = n14Var2.a().H0();
                js3.m(ye4VarH0);
                if (ye4VarH0.p.v() == null) {
                    return;
                }
            }
            if (kVar.v) {
                kVar.v = false;
                ye4 ye4VarH02 = n14Var2.a().H0();
                js3.m(ye4VarH02);
                kVar.w = ye4VarH02.p.v();
                if (wu8.D(hVar)) {
                    h hVarF2 = hVar.F();
                    if (hVarF2 != null) {
                        h.s0(hVarF2, false, 7);
                        return;
                    }
                    return;
                }
                h hVarF3 = hVar.F();
                if (hVarF3 != null) {
                    h.q0(hVarF3, false, 7);
                }
            }
        }
    }
}
