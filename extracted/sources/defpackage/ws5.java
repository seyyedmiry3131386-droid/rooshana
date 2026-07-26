package defpackage;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle$State;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ws5 {
    public final Runnable a;
    public final ai0 b;
    public final us5 c;

    public ws5(Runnable runnable) {
        this.a = runnable;
        ts5 ts5Var = new ts5(0, this);
        ai0 ai0Var = new ai0();
        ai0Var.b = ts5Var;
        ai0Var.a = true;
        ai0Var.c = new kk5();
        new LinkedHashSet();
        ai0Var.d = new LinkedHashSet();
        ai0Var.e = new LinkedHashSet();
        this.b = ai0Var;
        us5 us5Var = new us5();
        this.c = us5Var;
        ai0Var.j(us5Var);
    }

    public final void a(g64 g64Var, rs5 rs5Var) {
        js3.p(rs5Var, "onBackPressedCallback");
        i64 i64VarD = g64Var.D();
        if (i64VarD.d == Lifecycle$State.a) {
            return;
        }
        qs5 qs5Var = new qs5(rs5Var, new ss5(g64Var, rs5Var));
        rs5Var.a.add(qs5Var);
        qs5Var.j(false);
        ai0.d(this.b, qs5Var);
        vs5 vs5Var = new vs5(qs5Var, this, i64VarD);
        i64VarD.a(vs5Var);
        rs5Var.c.add(vs5Var);
    }

    public final void b() {
        this.c.a();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        ns5 ns5Var = new ns5(onBackInvokedDispatcher, 0);
        ai0 ai0Var = this.b;
        ai0Var.l(ns5Var, 1);
        ai0Var.l(new ns5(onBackInvokedDispatcher, 1000000), 0);
    }
}
