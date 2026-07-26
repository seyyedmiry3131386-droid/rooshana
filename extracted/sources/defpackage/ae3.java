package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class ae3 implements Closeable {
    public static final lr7 z;
    public final xd3 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final gf8 g;
    public final ff8 h;
    public final ff8 i;
    public final ff8 j;
    public final fz1 k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final af2 p;
    public final lr7 q;
    public lr7 r;
    public final kb0 s;
    public long t;
    public long u;
    public final wv8 v;
    public final ie3 w;
    public final zd3 x;
    public final LinkedHashSet y;

    static {
        lr7 lr7Var = new lr7();
        lr7Var.c(4, 65535);
        lr7Var.c(5, 16384);
        z = lr7Var;
    }

    public ae3(rb4 rb4Var) {
        this.a = (xd3) rb4Var.e;
        String str = (String) rb4Var.d;
        if (str == null) {
            js3.V("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        gf8 gf8Var = (gf8) rb4Var.b;
        this.g = gf8Var;
        this.h = gf8Var.d();
        this.i = gf8Var.d();
        this.j = gf8Var.d();
        this.k = fz1.p;
        this.p = (af2) rb4Var.f;
        lr7 lr7Var = new lr7();
        lr7Var.c(4, 16777216);
        this.q = lr7Var;
        this.r = z;
        this.s = new kb0(0);
        this.u = r0.a();
        wv8 wv8Var = (wv8) rb4Var.c;
        if (wv8Var == null) {
            js3.V("socket");
            throw null;
        }
        this.v = wv8Var;
        this.w = new ie3((sv6) wv8Var.d);
        this.x = new zd3(this, new de3((tv6) wv8Var.c));
        this.y = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.w.c);
        r6 = r2;
        r8.t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(int r9, boolean r10, defpackage.gh0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            ie3 r12 = r8.w
            r12.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            ie3 r4 = r8.w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            ie3 r4 = r8.w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae3.D(int, boolean, gh0, long):void");
    }

    public final void I(int i, ErrorCode errorCode) {
        ff8.c(this.h, this.c + '[' + i + "] writeSynReset", new p22(this, i, errorCode));
    }

    public final void J(final int i, final long j) {
        ff8.c(this.h, this.c + '[' + i + "] windowUpdate", new bp2() { // from class: td3
            @Override // defpackage.bp2
            public final Object invoke() {
                ae3 ae3Var = this.a;
                try {
                    ae3Var.w.J(i, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.d;
                    ae3Var.b(errorCode, errorCode, e);
                }
                return tx8.a;
            }
        });
    }

    public final void b(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = ih9.a;
        try {
            u(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new he3[0]);
                this.b.clear();
            }
        }
        he3[] he3VarArr = (he3[]) array;
        if (he3VarArr != null) {
            for (he3 he3Var : he3VarArr) {
                try {
                    he3Var.d(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((vp7) this.v.b).b).close();
        } catch (IOException unused4) {
        }
        this.h.g();
        this.i.g();
        this.j.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(ErrorCode.c, ErrorCode.h, null);
    }

    public final he3 d(int i) {
        he3 he3Var;
        synchronized (this) {
            he3Var = (he3) this.b.get(Integer.valueOf(i));
        }
        return he3Var;
    }

    public final void flush() {
        this.w.flush();
    }

    public final boolean g(long j) {
        synchronized (this) {
            if (this.f) {
                return false;
            }
            if (this.n < this.m) {
                if (j >= this.o) {
                    return false;
                }
            }
            return true;
        }
    }

    public final he3 k(int i) {
        he3 he3Var;
        synchronized (this) {
            he3Var = (he3) this.b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return he3Var;
    }

    public final void u(ErrorCode errorCode) {
        synchronized (this.w) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.w.k(this.d, errorCode, gh9.a);
            }
        }
    }

    public final void y(long j) {
        synchronized (this) {
            try {
                kb0.c(this.s, j, 0L, 2);
                long jB = this.s.b();
                if (jB >= this.q.a() / 2) {
                    J(0, jB);
                    kb0.c(this.s, 0L, jB, 1);
                }
                af2 af2Var = this.p;
                kb0 kb0Var = this.s;
                af2Var.getClass();
                js3.p(kb0Var, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
