package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class w94 extends x94 implements b64 {
    public final g64 e;
    public final /* synthetic */ bb5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w94(bb5 bb5Var, g64 g64Var, ir5 ir5Var) {
        super(bb5Var, ir5Var);
        this.f = bb5Var;
        this.e = g64Var;
    }

    @Override // defpackage.x94
    public final void b() {
        this.e.D().f(this);
    }

    @Override // defpackage.x94
    public final boolean c(g64 g64Var) {
        return this.e == g64Var;
    }

    @Override // defpackage.x94
    public final boolean d() {
        return this.e.D().d.a(Lifecycle$State.d);
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        g64 g64Var2 = this.e;
        Lifecycle$State lifecycle$State = g64Var2.D().d;
        if (lifecycle$State == Lifecycle$State.a) {
            this.f.g(this.a);
            return;
        }
        Lifecycle$State lifecycle$State2 = null;
        while (lifecycle$State2 != lifecycle$State) {
            a(d());
            lifecycle$State2 = lifecycle$State;
            lifecycle$State = g64Var2.D().d;
        }
    }
}
