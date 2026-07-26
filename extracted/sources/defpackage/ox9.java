package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ox9 extends bf8 {
    public final Object a = new Object();
    public final ir9 b = new ir9(6);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // defpackage.bf8
    public final ox9 a(Executor executor, dt5 dt5Var) {
        this.b.h(new aq9(executor, dt5Var));
        q();
        return this;
    }

    @Override // defpackage.bf8
    public final ox9 b(Executor executor, tt5 tt5Var) {
        this.b.h(new aq9(executor, tt5Var));
        q();
        return this;
    }

    @Override // defpackage.bf8
    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.bf8
    public final Object d() {
        Object obj;
        synchronized (this.a) {
            try {
                rq4.q("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.bf8
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.bf8
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final ox9 g(at5 at5Var) {
        this.b.h(new aq9(df8.a, at5Var));
        q();
        return this;
    }

    public final ox9 h(Executor executor, at5 at5Var) {
        this.b.h(new aq9(executor, at5Var));
        q();
        return this;
    }

    public final ox9 i(dt5 dt5Var) {
        a(df8.a, dt5Var);
        return this;
    }

    public final ox9 j(Executor executor, h51 h51Var) {
        ox9 ox9Var = new ox9();
        this.b.h(new ln9(executor, h51Var, ox9Var, 0));
        q();
        return ox9Var;
    }

    public final ox9 k(Executor executor, h51 h51Var) {
        ox9 ox9Var = new ox9();
        this.b.h(new ln9(executor, h51Var, ox9Var, 1));
        q();
        return ox9Var;
    }

    public final ox9 l(Executor executor, hb8 hb8Var) {
        ox9 ox9Var = new ox9();
        this.b.h(new aq9(executor, hb8Var, ox9Var));
        q();
        return ox9Var;
    }

    public final void m(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.j(this);
    }

    public final void n(Exception exc) {
        rq4.o(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.j(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.j(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        if (this.c) {
            int i = DuplicateTaskCompletionException.a;
            if (!e()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excC = c();
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
