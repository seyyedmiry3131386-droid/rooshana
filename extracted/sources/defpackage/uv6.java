package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class uv6 implements Runnable {
    public final hl0 a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ xv6 c;

    public uv6(xv6 xv6Var, hl0 hl0Var) {
        this.c = xv6Var;
        this.a = hl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vp7 vp7Var;
        String str = "OkHttp " + this.c.b.a.h();
        xv6 xv6Var = this.c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            xv6Var.e.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    vp7 vp7Var2 = xv6Var.a.a;
                    vp7Var2.getClass();
                    vp7.t0(vp7Var2, null, null, this, 3);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.a.b(xv6Var.f());
                vp7Var = xv6Var.a.a;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    k96 k96Var = k96.a;
                    k96 k96Var2 = k96.a;
                    StringBuilder sb = new StringBuilder("Callback failure for ");
                    StringBuilder sb2 = new StringBuilder();
                    t61.y(sb2, xv6Var.q ? "canceled " : "", "call", " to ");
                    sb2.append(xv6Var.b.a.h());
                    sb.append(sb2.toString());
                    k96Var2.j(sb.toString(), 4, e);
                } else {
                    this.a.l(xv6Var, e);
                }
                vp7Var = xv6Var.a.a;
            } catch (Throwable th3) {
                th = th3;
                z = true;
                xv6Var.cancel();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    this.a.l(xv6Var, iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                vp7Var = xv6Var.a.a;
            }
            vp7Var.getClass();
            vp7.t0(vp7Var, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
