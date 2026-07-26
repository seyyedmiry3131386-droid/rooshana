package defpackage;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ws4 implements ps4, tw1 {
    public final ys4 a;
    public final /* synthetic */ zs4 b;

    public ws4(zs4 zs4Var, ys4 ys4Var) {
        this.b = zs4Var;
        this.a = ys4Var;
    }

    @Override // defpackage.tw1
    public final void G(int i, ks4 ks4Var) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new ts4(this, pairA, 0));
        }
    }

    @Override // defpackage.tw1
    public final void L(int i, ks4 ks4Var) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new ts4(this, pairA, 1));
        }
    }

    @Override // defpackage.ps4
    public final void U(int i, ks4 ks4Var, da4 da4Var, op4 op4Var, int i2) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new ko4(this, pairA, da4Var, op4Var, i2, 2));
        }
    }

    public final Pair a(int i, ks4 ks4Var) {
        ks4 ks4VarA;
        ys4 ys4Var = this.a;
        ks4 ks4Var2 = null;
        if (ks4Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= ys4Var.c.size()) {
                    ks4VarA = null;
                    break;
                }
                if (((ks4) ys4Var.c.get(i2)).d == ks4Var.d) {
                    Object obj = ks4Var.a;
                    Object obj2 = ys4Var.b;
                    int i3 = sg6.n;
                    ks4VarA = ks4Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (ks4VarA == null) {
                return null;
            }
            ks4Var2 = ks4VarA;
        }
        return Pair.create(Integer.valueOf(i + ys4Var.d), ks4Var2);
    }

    @Override // defpackage.tw1
    public final void b(int i, ks4 ks4Var, Exception exc) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new ii(this, pairA, exc, 15));
        }
    }

    @Override // defpackage.ps4
    public final void f(int i, ks4 ks4Var, op4 op4Var) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new ss4(this, pairA, op4Var, 1));
        }
    }

    @Override // defpackage.ps4
    public final void g(int i, ks4 ks4Var, op4 op4Var) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new ss4(this, pairA, op4Var, 0));
        }
    }

    @Override // defpackage.tw1
    public final void k(int i, ks4 ks4Var, int i2) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new cy0(this, pairA, i2, 6));
        }
    }

    @Override // defpackage.ps4
    public final void p(int i, ks4 ks4Var, da4 da4Var, op4 op4Var) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new us4(this, pairA, da4Var, op4Var, 0));
        }
    }

    @Override // defpackage.ps4
    public final void s(int i, ks4 ks4Var, da4 da4Var, op4 op4Var) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new us4(this, pairA, da4Var, op4Var, 1));
        }
    }

    @Override // defpackage.ps4
    public final void u(int i, ks4 ks4Var, final da4 da4Var, final op4 op4Var, final IOException iOException, final boolean z) {
        final Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new Runnable() { // from class: vs4
                @Override // java.lang.Runnable
                public final void run() {
                    hd1 hd1Var = (hd1) this.a.b.i;
                    Pair pair = pairA;
                    hd1Var.u(((Integer) pair.first).intValue(), (ks4) pair.second, da4Var, op4Var, iOException, z);
                }
            });
        }
    }

    @Override // defpackage.tw1
    public final void w(int i, ks4 ks4Var) {
        Pair pairA = a(i, ks4Var);
        if (pairA != null) {
            ((wd8) this.b.j).c(new ts4(this, pairA, 2));
        }
    }
}
