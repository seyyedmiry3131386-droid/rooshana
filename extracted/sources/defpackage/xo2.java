package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xo2 {
    public final Executor a;
    public final vx0 b;
    public final Object c;
    public boolean d;
    public final ArrayList e;

    public xo2(Executor executor, vx0 vx0Var) {
        js3.p(executor, "executor");
        this.a = executor;
        this.b = vx0Var;
        this.c = new Object();
        this.e = new ArrayList();
        new b7(29, this);
    }

    public final void a() {
        synchronized (this.c) {
            try {
                this.d = true;
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((bp2) it.next()).invoke();
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
