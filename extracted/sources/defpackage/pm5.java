package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.android.volley.VolleyError;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class pm5 extends Thread {
    public final BlockingQueue a;
    public final do3 b;
    public final nv c;
    public final ca7 d;
    public volatile boolean e = false;

    public pm5(PriorityBlockingQueue priorityBlockingQueue, do3 do3Var, nv nvVar, ca7 ca7Var) {
        this.a = priorityBlockingQueue;
        this.b = do3Var;
        this.c = nvVar;
        this.d = ca7Var;
    }

    private void a() throws InterruptedException {
        x47 x47Var = (x47) this.a.take();
        ca7 ca7Var = this.d;
        SystemClock.elapsedRealtime();
        x47Var.q();
        Object obj = null;
        try {
            try {
                x47Var.a("network-queue-take");
                if (x47Var.l()) {
                    x47Var.e("network-discard-cancelled");
                    x47Var.m();
                    return;
                }
                TrafficStats.setThreadStatsTag(x47Var.d);
                fn5 fn5VarY = this.b.y(x47Var);
                x47Var.a("network-http-complete");
                if (fn5VarY.b && x47Var.k()) {
                    x47Var.e("not-modified");
                    x47Var.m();
                    return;
                }
                ry ryVarP = x47Var.p(fn5VarY);
                x47Var.a("network-parse-complete");
                if (x47Var.h && ((bk0) ryVarP.d) != null) {
                    this.c.g(x47Var.h(), (bk0) ryVarP.d);
                    x47Var.a("network-cache-written");
                }
                synchronized (x47Var.e) {
                    x47Var.j = true;
                }
                ca7Var.i(x47Var, ryVarP, null);
                x47Var.n(ryVarP);
            } catch (VolleyError e) {
                SystemClock.elapsedRealtime();
                VolleyError volleyErrorO = x47Var.o(e);
                ca7Var.getClass();
                x47Var.a("post-error");
                ((vg) ca7Var.b).execute(new w42(x47Var, new ry(volleyErrorO), obj, 0));
                x47Var.m();
            } catch (Exception e2) {
                e2.toString();
                VolleyError volleyError = new VolleyError(e2);
                SystemClock.elapsedRealtime();
                ca7Var.getClass();
                x47Var.a("post-error");
                ((vg) ca7Var.b).execute(new w42(x47Var, new ry(volleyError), obj, 0));
                x47Var.m();
            }
        } finally {
            x47Var.q();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
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
