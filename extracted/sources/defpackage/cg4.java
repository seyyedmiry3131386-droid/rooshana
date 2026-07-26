package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class cg4 {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile bg4 d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new qa(0);
        } else {
            e = Executors.newCachedThreadPool(new dg4());
        }
    }

    public cg4(gf4 gf4Var) {
        f(new bg4(gf4Var));
    }

    public final synchronized void a(zf4 zf4Var) {
        Throwable th;
        try {
            bg4 bg4Var = this.d;
            if (bg4Var != null && (th = bg4Var.b) != null) {
                zf4Var.onResult(th);
            }
            this.b.add(zf4Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(zf4 zf4Var) {
        gf4 gf4Var;
        try {
            bg4 bg4Var = this.d;
            if (bg4Var != null && (gf4Var = bg4Var.a) != null) {
                zf4Var.onResult(gf4Var);
            }
            this.a.add(zf4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            qd4.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zf4) it.next()).onResult(th);
        }
    }

    public final void d() {
        bg4 bg4Var = this.d;
        if (bg4Var == null) {
            return;
        }
        gf4 gf4Var = bg4Var.a;
        if (gf4Var == null) {
            c(bg4Var.b);
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.a).iterator();
            while (it.hasNext()) {
                ((zf4) it.next()).onResult(gf4Var);
            }
        }
    }

    public final synchronized void e(ff4 ff4Var) {
        this.b.remove(ff4Var);
    }

    public final void f(bg4 bg4Var) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = bg4Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.c.post(new u03(4, this));
        }
    }

    public cg4(Callable callable, boolean z) {
        if (z) {
            try {
                f((bg4) callable.call());
                return;
            } catch (Throwable th) {
                f(new bg4(th));
                return;
            }
        }
        Executor executor = e;
        gx gxVar = new gx(callable);
        gxVar.b = this;
        executor.execute(gxVar);
    }
}
