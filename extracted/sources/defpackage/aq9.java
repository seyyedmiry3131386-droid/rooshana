package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aq9 implements iv9, tt5, dt5, zs5 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public aq9(Executor executor, zs5 zs5Var) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.d = zs5Var;
    }

    private final void b(bf8 bf8Var) {
        synchronized (this.c) {
        }
        this.b.execute(new zh9(4, this, bf8Var, false));
    }

    private final void c(bf8 bf8Var) {
        if (bf8Var.f() || ((ox9) bf8Var).d) {
            return;
        }
        synchronized (this.c) {
            try {
                if (((dt5) this.d) == null) {
                    return;
                }
                this.b.execute(new zh9(6, this, bf8Var, false));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d(bf8 bf8Var) {
        if (bf8Var.f()) {
            synchronized (this.c) {
                try {
                    if (((tt5) this.d) == null) {
                        return;
                    }
                    this.b.execute(new zh9(7, this, bf8Var, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.iv9
    public final void a(bf8 bf8Var) {
        switch (this.a) {
            case 0:
                if (((ox9) bf8Var).d) {
                    synchronized (this.c) {
                        try {
                            if (((zs5) this.d) != null) {
                                this.b.execute(new fp7(17, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                b(bf8Var);
                return;
            case 2:
                c(bf8Var);
                return;
            case 3:
                d(bf8Var);
                return;
            default:
                this.b.execute(new zh9(9, this, bf8Var, false));
                return;
        }
    }

    @Override // defpackage.zs5
    public void g() {
        ((ox9) this.d).o();
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        ((ox9) this.d).n(exc);
    }

    @Override // defpackage.tt5
    public void onSuccess(Object obj) {
        ((ox9) this.d).m(obj);
    }

    public aq9(Executor executor, at5 at5Var) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.d = at5Var;
    }

    public aq9(Executor executor, dt5 dt5Var) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.d = dt5Var;
    }

    public aq9(Executor executor, tt5 tt5Var) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.d = tt5Var;
    }

    public aq9(Executor executor, hb8 hb8Var, ox9 ox9Var) {
        this.a = 4;
        this.b = executor;
        this.c = hb8Var;
        this.d = ox9Var;
    }
}
