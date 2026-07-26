package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ec9 {
    public final kb9 a;
    public final Context b;

    public ec9(kb9 kb9Var, Context context) {
        js3.p(kb9Var, "vpnController");
        this.a = kb9Var;
        this.b = context;
    }

    public final boolean a() {
        if (!s7.H(this.b)) {
            return false;
        }
        ((lb9) this.a).getClass();
        return !(ub9.b.a.getValue() instanceof pb9);
    }
}
