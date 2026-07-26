package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka4 extends g {
    public ja4 d = new ia4(false);

    public static boolean x(ja4 ja4Var) {
        js3.p(ja4Var, "loadState");
        return (ja4Var instanceof ha4) || (ja4Var instanceof ga4);
    }

    public final void A(ja4 ja4Var) {
        js3.p(ja4Var, "loadState");
        if (js3.i(this.d, ja4Var)) {
            return;
        }
        boolean zX = x(this.d);
        boolean zX2 = x(ja4Var);
        lz6 lz6Var = this.a;
        if (zX && !zX2) {
            lz6Var.f(0, 1);
        } else if (zX2 && !zX) {
            lz6Var.e(0, 1);
        } else if (zX && zX2) {
            lz6Var.d(0, 1, null);
        }
        this.d = ja4Var;
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        return x(this.d) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final int e(int i) {
        js3.p(this.d, "loadState");
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(o oVar, int i) {
        y(oVar, this.d);
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        return z(viewGroup, this.d);
    }

    public abstract void y(o oVar, ja4 ja4Var);

    public abstract o z(ViewGroup viewGroup, ja4 ja4Var);
}
