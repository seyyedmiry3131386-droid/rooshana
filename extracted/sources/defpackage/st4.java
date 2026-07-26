package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class st4 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public st4(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(hu4 hu4Var) {
        this.b.remove(hu4Var);
        rt4 rt4Var = (rt4) this.c.remove(hu4Var);
        if (rt4Var != null) {
            rt4Var.a.f(rt4Var.b);
            rt4Var.b = null;
        }
        this.a.run();
    }
}
