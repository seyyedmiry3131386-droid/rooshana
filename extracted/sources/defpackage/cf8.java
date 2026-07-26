package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cf8 {
    public final ox9 a = new ox9();

    public final void a(Exception exc) {
        this.a.n(exc);
    }

    public final void b(Object obj) {
        this.a.m(obj);
    }

    public final boolean c(Exception exc) {
        ox9 ox9Var = this.a;
        ox9Var.getClass();
        rq4.o(exc, "Exception must not be null");
        synchronized (ox9Var.a) {
            try {
                if (ox9Var.c) {
                    return false;
                }
                ox9Var.c = true;
                ox9Var.f = exc;
                ox9Var.b.j(ox9Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        ox9 ox9Var = this.a;
        synchronized (ox9Var.a) {
            try {
                if (ox9Var.c) {
                    return;
                }
                ox9Var.c = true;
                ox9Var.e = obj;
                ox9Var.b.j(ox9Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
