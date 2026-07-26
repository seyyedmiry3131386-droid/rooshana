package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class v82 implements p42 {
    public final fw6 a;
    public final gf8 b;
    public final long c;
    public long d;
    public final CopyOnWriteArrayList e;
    public final LinkedBlockingDeque f;

    public v82(fw6 fw6Var, gf8 gf8Var) {
        js3.p(gf8Var, "taskRunner");
        this.a = fw6Var;
        this.b = gf8Var;
        this.c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.d = Long.MIN_VALUE;
        this.e = new CopyOnWriteArrayList();
        this.f = new LinkedBlockingDeque();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.e;
        Iterator it = copyOnWriteArrayList.iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            va7 va7Var = (va7) it.next();
            va7Var.cancel();
            va7 va7VarA = va7Var.a();
            if (va7VarA != null) {
                this.a.p.addLast(va7VarA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final ua7 b() {
        va7 n82Var;
        fw6 fw6Var = this.a;
        if (fw6Var.a(null)) {
            try {
                n82Var = fw6Var.b();
            } catch (Throwable th) {
                n82Var = new n82(th);
            }
            if (n82Var.b()) {
                return new ua7(n82Var, null, null, 6);
            }
            if (n82Var instanceof n82) {
                return ((n82) n82Var).a;
            }
            this.e.add(n82Var);
            this.b.d().d(new u82(ih9.b + " connect " + fw6Var.i.h.h(), n82Var, this), 0L);
        }
        return null;
    }

    @Override // defpackage.p42
    public final yv6 d() throws IOException {
        ua7 ua7VarB;
        long j;
        ua7 ua7Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.e.isEmpty() && !this.a.a(null)) {
                    a();
                    js3.m(iOException);
                    throw iOException;
                }
                if (this.a.k.q) {
                    throw new IOException("Canceled");
                }
                hl5 hl5Var = this.b.a;
                long jNanoTime = System.nanoTime();
                long j2 = this.d - jNanoTime;
                if (this.e.isEmpty() || j2 <= 0) {
                    ua7VarB = b();
                    j = this.c;
                    this.d = jNanoTime + j;
                } else {
                    j = j2;
                    ua7VarB = null;
                }
                if (ua7VarB == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.e;
                    if (copyOnWriteArrayList.isEmpty() || (ua7Var = (ua7) this.f.poll(j, timeUnit)) == null) {
                        ua7VarB = null;
                    } else {
                        copyOnWriteArrayList.remove(ua7Var.a);
                        ua7VarB = ua7Var;
                    }
                    if (ua7VarB == null) {
                    }
                }
                boolean z = false;
                if (ua7VarB.b == null && ua7VarB.c == null) {
                    a();
                    if (!ua7VarB.a.b()) {
                        ua7VarB = ua7VarB.a.g();
                    }
                    if (ua7VarB.b == null && ua7VarB.c == null) {
                        z = true;
                    }
                    if (z) {
                        return ua7VarB.a.c();
                    }
                }
                Throwable th = ua7VarB.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        wu8.f(iOException, th);
                    }
                }
                va7 va7Var = ua7VarB.b;
                if (va7Var != null) {
                    this.a.p.addFirst(va7Var);
                }
            } finally {
                a();
            }
        }
    }

    @Override // defpackage.p42
    public final fw6 f() {
        return this.a;
    }
}
