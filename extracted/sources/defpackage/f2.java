package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends tt3 {
    @Override // defpackage.tt3
    public final void F(g2 g2Var, g2 g2Var2) {
        g2Var.b = g2Var2;
    }

    @Override // defpackage.tt3
    public final void G(g2 g2Var, Thread thread) {
        g2Var.a = thread;
    }

    @Override // defpackage.tt3
    public final boolean k(h2 h2Var, d2 d2Var, d2 d2Var2) {
        synchronized (h2Var) {
            try {
                if (h2Var.b != d2Var) {
                    return false;
                }
                h2Var.b = d2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tt3
    public final boolean l(h2 h2Var, Object obj, Object obj2) {
        synchronized (h2Var) {
            try {
                if (h2Var.a != obj) {
                    return false;
                }
                h2Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tt3
    public final boolean m(h2 h2Var, g2 g2Var, g2 g2Var2) {
        synchronized (h2Var) {
            try {
                if (h2Var.c != g2Var) {
                    return false;
                }
                h2Var.c = g2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
