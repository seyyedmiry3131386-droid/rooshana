package defpackage;

import ir.mservices.market.core.notification.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ul3 {
    public static final /* synthetic */ int e = 0;
    public a a;
    public int b = 0;
    public final jl3 c;
    public final lu7 d;

    static {
        rk1.a("InboxManager");
    }

    public ul3(lu7 lu7Var, jl3 jl3Var) {
        this.d = lu7Var;
        this.c = jl3Var;
        b(null);
    }

    public final boolean a() {
        return this.d.b(lu7.P, false);
    }

    public final void b(q6 q6Var) {
        nc2 nc2Var = new nc2(9, this, q6Var, false);
        rl3 rl3Var = new rl3();
        jl3 jl3Var = this.c;
        ArrayList arrayList = (ArrayList) jl3Var.b;
        il3 il3Var = new il3(jl3Var, nc2Var, rl3Var, this);
        il3Var.b(new Void[0]);
        arrayList.add(il3Var);
    }
}
