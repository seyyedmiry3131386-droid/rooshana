package defpackage;

import androidx.concurrent.futures.a;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 implements n94 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(h2.class.getName());
    public static final tt3 f;
    public static final Object g;
    public volatile Object a;
    public volatile d2 b;
    public volatile g2 c;

    static {
        tt3 f2Var;
        try {
            f2Var = new e2(AtomicReferenceFieldUpdater.newUpdater(g2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g2.class, g2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h2.class, g2.class, ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME), AtomicReferenceFieldUpdater.newUpdater(h2.class, d2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h2.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            f2Var = new f2();
        }
        f = f2Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void c(h2 h2Var) {
        g2 g2Var;
        d2 d2Var;
        d2 d2Var2;
        d2 d2Var3;
        do {
            g2Var = h2Var.c;
        } while (!f.m(h2Var, g2Var, g2.c));
        while (true) {
            d2Var = null;
            if (g2Var == null) {
                break;
            }
            Thread thread = g2Var.a;
            if (thread != null) {
                g2Var.a = null;
                LockSupport.unpark(thread);
            }
            g2Var = g2Var.b;
        }
        h2Var.b();
        do {
            d2Var2 = h2Var.b;
        } while (!f.k(h2Var, d2Var2, d2.d));
        while (true) {
            d2Var3 = d2Var;
            d2Var = d2Var2;
            if (d2Var == null) {
                break;
            }
            d2Var2 = d2Var.c;
            d2Var.c = d2Var3;
        }
        while (d2Var3 != null) {
            d2 d2Var4 = d2Var3.c;
            d(d2Var3.a, d2Var3.b);
            d2Var3 = d2Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof c2) {
            Throwable th = ((c2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a) {
            throw new ExecutionException(((a) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object g(h2 h2Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = h2Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            if (f.l(this, obj, d ? new c2(new CancellationException("Future.cancel() was called."), z) : z ? c2.c : c2.d)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n94
    public final void e(Runnable runnable, Executor executor) {
        d2 d2Var = this.b;
        d2 d2Var2 = d2.d;
        if (d2Var != d2Var2) {
            d2 d2Var3 = new d2(runnable, executor);
            do {
                d2Var3.c = d2Var;
                if (f.k(this, d2Var, d2Var3)) {
                    return;
                } else {
                    d2Var = this.b;
                }
            } while (d2Var != d2Var2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        g2 g2Var = g2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g2 g2Var2 = this.c;
            if (g2Var2 != g2Var) {
                g2 g2Var3 = new g2();
                do {
                    tt3 tt3Var = f;
                    tt3Var.F(g2Var3, g2Var2);
                    if (tt3Var.m(this, g2Var2, g2Var3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(g2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                i(g2Var3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        g2Var2 = this.c;
                    }
                } while (g2Var2 != g2Var);
            }
            return f(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbS = rm7.s(j, "Waited ", " ");
        sbS.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbS.toString();
        if (nanos + 1000 < 0) {
            String strI = t61.i(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strI2 = strI + jConvert + " " + lowerCase;
                if (z) {
                    strI2 = t61.i(strI2, ",");
                }
                strI = t61.i(strI2, " ");
            }
            if (z) {
                strI = strI + nanos2 + " nanoseconds ";
            }
            string3 = t61.i(strI, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(t61.i(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(t61.j(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(g2 g2Var) {
        g2Var.a = null;
        while (true) {
            g2 g2Var2 = this.c;
            if (g2Var2 == g2.c) {
                return;
            }
            g2 g2Var3 = null;
            while (g2Var2 != null) {
                g2 g2Var4 = g2Var2.b;
                if (g2Var2.a != null) {
                    g2Var3 = g2Var2;
                } else if (g2Var3 != null) {
                    g2Var3.b = g2Var4;
                    if (g2Var3.a == null) {
                        break;
                    }
                } else if (!f.m(this, g2Var2, g2Var4)) {
                    break;
                }
                g2Var2 = g2Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof c2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.l(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f.l(this, null, new a(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof c2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e2) {
                strH = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                t61.y(sb, "PENDING, info=[", strH, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g2 g2Var = g2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            g2 g2Var2 = this.c;
            if (g2Var2 != g2Var) {
                g2 g2Var3 = new g2();
                do {
                    tt3 tt3Var = f;
                    tt3Var.F(g2Var3, g2Var2);
                    if (tt3Var.m(this, g2Var2, g2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(g2Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    g2Var2 = this.c;
                } while (g2Var2 != g2Var);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
