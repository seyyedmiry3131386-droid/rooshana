package defpackage;

import android.os.Process;
import com.android.volley.VolleyError;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class mk0 extends Thread {
    public final BlockingQueue a;
    public final BlockingQueue b;
    public final nv c;
    public final ca7 d;
    public volatile boolean e = false;
    public final o77 f;

    static {
        boolean z = cb9.a;
    }

    public mk0(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, nv nvVar, ca7 ca7Var) {
        this.a = priorityBlockingQueue;
        this.b = priorityBlockingQueue2;
        this.c = nvVar;
        this.d = ca7Var;
        o77 o77Var = new o77();
        o77Var.a = new HashMap();
        o77Var.b = ca7Var;
        o77Var.c = this;
        o77Var.d = priorityBlockingQueue2;
        this.f = o77Var;
    }

    private void a() throws InterruptedException {
        x47 x47Var = (x47) this.a.take();
        nv nvVar = this.c;
        x47Var.a("cache-queue-take");
        x47Var.q();
        try {
            if (x47Var.l()) {
                x47Var.e("cache-discard-canceled");
                return;
            }
            bk0 bk0VarA = nvVar.a(x47Var.h());
            BlockingQueue blockingQueue = this.b;
            o77 o77Var = this.f;
            if (bk0VarA == null) {
                x47Var.a("cache-miss");
                if (!o77Var.w(x47Var)) {
                    blockingQueue.put(x47Var);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (bk0VarA.e < jCurrentTimeMillis) {
                x47Var.a("cache-hit-expired");
                x47Var.l = bk0VarA;
                if (!o77Var.w(x47Var)) {
                    blockingQueue.put(x47Var);
                }
                return;
            }
            x47Var.a("cache-hit");
            ry ryVarP = x47Var.p(new fn5(bk0VarA.a, bk0VarA.g));
            x47Var.a("cache-hit-parsed");
            if (!(((VolleyError) ryVarP.e) == null)) {
                x47Var.a("cache-parsing-failed");
                nvVar.e(x47Var.h());
                x47Var.l = null;
                if (!o77Var.w(x47Var)) {
                    blockingQueue.put(x47Var);
                }
                return;
            }
            long j = bk0VarA.f;
            ca7 ca7Var = this.d;
            if (j < jCurrentTimeMillis) {
                x47Var.a("cache-hit-refresh-needed");
                x47Var.l = bk0VarA;
                ryVarP.b = true;
                if (o77Var.w(x47Var)) {
                    ca7Var.i(x47Var, ryVarP, null);
                } else {
                    ca7Var.i(x47Var, ryVarP, new g6(this, x47Var, 8));
                }
            } else {
                ca7Var.i(x47Var, ryVarP, null);
            }
        } finally {
            x47Var.q();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.c.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
