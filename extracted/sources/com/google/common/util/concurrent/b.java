package com.google.common.util.concurrent;

import defpackage.b44;
import defpackage.bt2;
import defpackage.c0;
import defpackage.d0;
import defpackage.e0;
import defpackage.f0;
import defpackage.g0;
import defpackage.h0;
import defpackage.n0;
import defpackage.n94;
import defpackage.o0;
import defpackage.wn5;
import defpackage.xr3;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends xr3 implements n94 {
    public static final boolean d;
    public static final b44 e;
    public static final bt2 f;
    public static final Object g;
    public volatile Object a;
    public volatile d0 b;
    public volatile o0 c;

    static {
        boolean z;
        Throwable th;
        bt2 g0Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new b44(b.class);
        int i = 6;
        Throwable th2 = null;
        try {
            g0Var = new n0(i);
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                g0Var = new e0(AtomicReferenceFieldUpdater.newUpdater(o0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(o0.class, o0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, o0.class, ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME), AtomicReferenceFieldUpdater.newUpdater(b.class, d0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                g0Var = new g0(i);
            }
        }
        f = g0Var;
        if (th2 != null) {
            b44 b44Var = e;
            Logger loggerA = b44Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            b44Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void d(b bVar, boolean z) {
        d0 d0Var = null;
        while (true) {
            for (o0 o0VarW = f.w(bVar); o0VarW != null; o0VarW = o0VarW.b) {
                Thread thread = o0VarW.a;
                if (thread != null) {
                    o0VarW.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            bVar.b();
            d0 d0Var2 = d0Var;
            d0 d0VarV = f.v(bVar);
            d0 d0Var3 = d0Var2;
            while (d0VarV != null) {
                d0 d0Var4 = d0VarV.c;
                d0VarV.c = d0Var3;
                d0Var3 = d0VarV;
                d0VarV = d0Var4;
            }
            while (d0Var3 != null) {
                d0Var = d0Var3.c;
                Runnable runnable = d0Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f0) {
                    f0 f0Var = (f0) runnable;
                    bVar = f0Var.a;
                    if (bVar.a == f0Var) {
                        if (f.n(bVar, f0Var, h(f0Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = d0Var3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                d0Var3 = d0Var;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof c0) {
            Throwable th = ((c0) obj).b;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(defpackage.n94 r6) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.b.h(n94):java.lang.Object");
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        c(sb, obj);
        sb.append("]");
    }

    public void b() {
    }

    public final void c(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append(Ssh2PublicKeyAlgorithmName.NULL);
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        c0 c0Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof f0)) {
            return false;
        }
        if (d) {
            c0Var = new c0(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0Var = z ? c0.c : c0.d;
            Objects.requireNonNull(c0Var);
        }
        b bVar = this;
        boolean z2 = false;
        while (true) {
            if (f.n(bVar, obj, c0Var)) {
                d(bVar, z);
                if (!(obj instanceof f0)) {
                    break;
                }
                n94 n94Var = ((f0) obj).b;
                if (!(n94Var instanceof h0)) {
                    n94Var.cancel(z);
                    break;
                }
                bVar = (b) n94Var;
                obj = bVar.a;
                if (!(obj == null) && !(obj instanceof f0)) {
                    break;
                }
                z2 = true;
            } else {
                obj = bVar.a;
                if (!(obj instanceof f0)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // defpackage.n94
    public void e(Runnable runnable, Executor executor) {
        d0 d0Var;
        d0 d0Var2 = d0.d;
        wn5.m(executor, "Executor was null.");
        if (!isDone() && (d0Var = this.b) != d0Var2) {
            d0 d0Var3 = new d0(runnable, executor);
            do {
                d0Var3.c = d0Var;
                if (f.m(this, d0Var, d0Var3)) {
                    return;
                } else {
                    d0Var = this.b;
                }
            } while (d0Var != d0Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c6 -> B:37:0x0083). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.b.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof c0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f0)) & (this.a != null);
    }

    public final void j(o0 o0Var) {
        o0Var.a = null;
        while (true) {
            o0 o0Var2 = this.c;
            if (o0Var2 == o0.c) {
                return;
            }
            o0 o0Var3 = null;
            while (o0Var2 != null) {
                o0 o0Var4 = o0Var2.b;
                if (o0Var2.a != null) {
                    o0Var3 = o0Var2;
                } else if (o0Var3 != null) {
                    o0Var3.b = o0Var4;
                    if (o0Var3.a == null) {
                        break;
                    }
                } else if (!f.o(this, o0Var2, o0Var4)) {
                    break;
                }
                o0Var2 = o0Var4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.n(this, null, obj)) {
            return false;
        }
        d(this, false);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!f.n(this, null, new a(th))) {
            return false;
        }
        d(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(defpackage.n94 r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = h(r6)
            bt2 r0 = com.google.common.util.concurrent.b.f
            boolean r6 = r0.n(r5, r3, r6)
            if (r6 == 0) goto L4f
            d(r5, r1)
            return r2
        L20:
            f0 r0 = new f0
            r0.<init>(r5, r6)
            bt2 r4 = com.google.common.util.concurrent.b.f
            boolean r3 = r4.n(r5, r3, r0)
            if (r3 == 0) goto L42
            com.google.common.util.concurrent.DirectExecutor r1 = com.google.common.util.concurrent.DirectExecutor.a     // Catch: java.lang.Throwable -> L33
            r6.e(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            com.google.common.util.concurrent.a r1 = new com.google.common.util.concurrent.a     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            com.google.common.util.concurrent.a r1 = com.google.common.util.concurrent.a.b
        L3c:
            bt2 r6 = com.google.common.util.concurrent.b.f
            r6.n(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.a
        L44:
            boolean r2 = r0 instanceof defpackage.c0
            if (r2 == 0) goto L4f
            c0 r0 = (defpackage.c0) r0
            boolean r0 = r0.a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.b.m(n94):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.b.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        o0 o0Var = o0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof f0))) {
                return g(obj2);
            }
            o0 o0Var2 = this.c;
            if (o0Var2 != o0Var) {
                o0 o0Var3 = new o0();
                do {
                    bt2 bt2Var = f;
                    bt2Var.M(o0Var3, o0Var2);
                    if (bt2Var.o(this, o0Var2, o0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(o0Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f0))));
                        return g(obj);
                    }
                    o0Var2 = this.c;
                } while (o0Var2 != o0Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
