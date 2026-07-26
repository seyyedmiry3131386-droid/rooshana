package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dw6 {
    public final fi1 a;
    public final dc0 b;
    public final Object c = new Object();

    public dw6(fi1 fi1Var, dc0 dc0Var) {
        this.a = fi1Var;
        this.b = dc0Var;
    }

    public final void a() {
        synchronized (this.c) {
            ((hg0) this.a.c).j(-1L);
            dc0 dc0Var = this.b;
            dc0Var.b = 0;
            ((LinkedHashMap) dc0Var.c).clear();
        }
    }

    public final long b() {
        long jC;
        synchronized (this.c) {
            jC = ((hg0) this.a.c).c();
        }
        return jC;
    }

    public final void c(ht4 ht4Var) {
        synchronized (this.c) {
            hg0 hg0Var = (hg0) this.a.c;
            Object objRemove = ((LinkedHashMap) hg0Var.c).remove(ht4Var);
            if (objRemove != null) {
                hg0Var.b = hg0Var.c() - hg0Var.g(ht4Var, objRemove);
                hg0Var.b(ht4Var, objRemove, null);
            }
            if (objRemove != null) {
            }
            if (((LinkedHashMap) this.b.c).remove(ht4Var) != null) {
            }
        }
    }

    public final void d(long j) {
        synchronized (this.c) {
            hg0 hg0Var = (hg0) this.a.c;
            hg0Var.a = j;
            hg0Var.j(j);
        }
    }

    public final void e(long j) {
        synchronized (this.c) {
            ((hg0) this.a.c).j(j);
        }
    }
}
