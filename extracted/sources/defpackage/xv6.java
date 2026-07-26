package defpackage;

import io.sentry.okhttp.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class xv6 implements Cloneable {
    public final hs5 a;
    public final w47 b;
    public final lz1 c;
    public final z32 d;
    public final wv6 e;
    public final AtomicBoolean f;
    public Object g;
    public p42 h;
    public yv6 i;
    public boolean j;
    public ai0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public volatile boolean q;
    public volatile ai0 r;
    public final CopyOnWriteArrayList s;

    public xv6(hs5 hs5Var, w47 w47Var) {
        js3.p(w47Var, "originalRequest");
        this.a = hs5Var;
        this.b = w47Var;
        this.c = (lz1) hs5Var.E.b;
        this.d = (z32) hs5Var.d.b;
        wv6 wv6Var = new wv6(this);
        long j = hs5Var.w;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wv6Var.g(j);
        this.e = wv6Var;
        this.f = new AtomicBoolean();
        this.p = true;
        this.s = new CopyOnWriteArrayList();
        new AtomicReference(w47Var.e);
    }

    public final void a(yv6 yv6Var) {
        js3.p(yv6Var, "connection");
        TimeZone timeZone = ih9.a;
        if (this.i != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.i = yv6Var;
        yv6Var.p.add(new vv6(this, this.g));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketI;
        TimeZone timeZone = ih9.a;
        yv6 yv6Var = this.i;
        if (yv6Var != null) {
            synchronized (yv6Var) {
                socketI = i();
            }
            if (this.i == null) {
                if (socketI != null) {
                    ih9.c(socketI);
                }
                this.d.l(this, yv6Var);
            } else if (socketI != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.j && this.e.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.d.d(this);
            return interruptedIOException;
        }
        z32 z32Var = this.d;
        js3.m(interruptedIOException);
        z32Var.e(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void c(hl0 hl0Var) {
        if (!this.f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        k96 k96Var = k96.a;
        this.g = k96.a.h();
        this.d.f(this);
        vp7 vp7Var = this.a.a;
        uv6 uv6Var = new uv6(this, hl0Var);
        vp7Var.getClass();
        vp7.t0(vp7Var, uv6Var, null, null, 6);
    }

    public final void cancel() {
        if (this.q) {
            return;
        }
        this.q = true;
        ai0 ai0Var = this.r;
        if (ai0Var != null) {
            ((o42) ai0Var.e).cancel();
        }
        Iterator it = this.s.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((va7) it.next()).cancel();
        }
        this.d.g(this);
    }

    public final Object clone() {
        return new xv6(this.a, this.b);
    }

    public final g77 d() {
        if (!this.f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.e.h();
        k96 k96Var = k96.a;
        this.g = k96.a.h();
        this.d.f(this);
        try {
            vp7 vp7Var = this.a.a;
            synchronized (vp7Var) {
                ((ArrayDeque) vp7Var.d).add(this);
            }
            return f();
        } finally {
            vp7 vp7Var2 = this.a.a;
            vp7Var2.getClass();
            vp7.t0(vp7Var2, null, this, null, 5);
        }
    }

    public final void e(boolean z) {
        ai0 ai0Var;
        synchronized (this) {
            if (!this.p) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (ai0Var = this.r) != null) {
            ((o42) ai0Var.e).cancel();
            ((xv6) ai0Var.b).g(ai0Var, true, true, true, true, null);
        }
        this.k = null;
    }

    public final g77 f() {
        Object next;
        ArrayList arrayList = new ArrayList();
        a.b0(this.a.b, arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((hr3) next) instanceof c) {
                break;
            }
        }
        if (next == null) {
            arrayList.add(new c(28));
        }
        arrayList.add(new h10(3, this.a));
        arrayList.add(new h10(this.a.j));
        arrayList.add(new h10(2, this.a.k));
        arrayList.add(gl0.c);
        a.b0(this.a.c, arrayList);
        arrayList.add(gl0.b);
        w47 w47Var = this.b;
        hs5 hs5Var = this.a;
        try {
            try {
                g77 g77VarB = new cw6(this, arrayList, 0, null, w47Var, hs5Var.x, hs5Var.y, hs5Var.z).b(this.b);
                if (this.q) {
                    gh9.b(g77VarB);
                    throw new IOException("Canceled");
                }
                h(null);
                return g77VarB;
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                js3.n(iOExceptionH, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionH;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
            }
            throw th;
        }
    }

    public final IOException g(ai0 ai0Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        js3.p(ai0Var, "exchange");
        if (ai0Var.equals(this.r)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.l) {
                            if ((z2 || !this.m) && ((!z4 || !this.n) && (!z3 || !this.o))) {
                            }
                        }
                        if (z) {
                            this.l = false;
                        }
                        if (z2) {
                            this.m = false;
                        }
                        if (z4) {
                            this.n = false;
                        }
                        if (z3) {
                            this.o = false;
                        }
                        boolean z7 = (this.l || this.m || this.n || this.o) ? false : true;
                        if (z7) {
                            if (!this.p) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z7;
                        z6 = z5;
                        z5 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.r = null;
                yv6 yv6Var = this.i;
                if (yv6Var != null) {
                    yv6Var.d();
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.p) {
                this.p = false;
                if (!this.l && !this.m && !this.n) {
                    if (!this.o) {
                        z = true;
                    }
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket i() {
        yv6 yv6Var = this.i;
        js3.m(yv6Var);
        TimeZone timeZone = ih9.a;
        ArrayList arrayList = yv6Var.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (js3.i(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.i = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        yv6Var.q = System.nanoTime();
        lz1 lz1Var = this.c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) lz1Var.d;
        ff8 ff8Var = (ff8) lz1Var.b;
        TimeZone timeZone2 = ih9.a;
        if (!yv6Var.j) {
            ff8Var.d((jp1) lz1Var.c, 0L);
            return null;
        }
        yv6Var.j = true;
        concurrentLinkedQueue.remove(yv6Var);
        if (concurrentLinkedQueue.isEmpty()) {
            ff8Var.a();
        }
        return yv6Var.e;
    }
}
