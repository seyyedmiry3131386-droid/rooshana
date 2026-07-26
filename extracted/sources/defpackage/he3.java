package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class he3 implements c18 {
    public final int a;
    public final ae3 b;
    public final kb0 c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final fe3 h;
    public final ee3 i;
    public final ge3 j;
    public final ge3 k;
    public ErrorCode l;
    public IOException m;

    public he3(int i, ae3 ae3Var, boolean z, boolean z2, by2 by2Var) {
        js3.p(ae3Var, "connection");
        this.a = i;
        this.b = ae3Var;
        this.c = new kb0(i);
        this.e = ae3Var.r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.h = new fe3(this, ae3Var.q.a(), z2);
        this.i = new ee3(this, z);
        this.j = new ge3(this);
        this.k = new ge3(this);
        if (by2Var == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(by2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = defpackage.ih9.a
            monitor-enter(r2)
            fe3 r0 = r2.h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            ee3 r0 = r2.i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.h
            r1 = 0
            r2.d(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            ae3 r0 = r2.b
            int r1 = r2.a
            r0.k(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he3.a():void");
    }

    public final void b() throws IOException {
        ee3 ee3Var = this.i;
        if (ee3Var.c) {
            throw new IOException("stream closed");
        }
        if (ee3Var.a) {
            throw new IOException("stream finished");
        }
        if (g() != null) {
            IOException iOException = this.m;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeG = g();
            js3.m(errorCodeG);
            throw new StreamResetException(errorCodeG);
        }
    }

    @Override // defpackage.c18
    public final t18 c() {
        return this.h;
    }

    public final void d(ErrorCode errorCode, IOException iOException) {
        if (e(errorCode, iOException)) {
            this.b.w.D(this.a, errorCode);
        }
    }

    public final boolean e(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = ih9.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.l = errorCode;
            this.m = iOException;
            notifyAll();
            if (this.h.b) {
                if (this.i.a) {
                    return false;
                }
            }
            this.b.k(this.a);
            return true;
        }
    }

    public final void f(ErrorCode errorCode) {
        if (e(errorCode, null)) {
            this.b.I(this.a, errorCode);
        }
    }

    public final ErrorCode g() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.l;
        }
        return errorCode;
    }

    public final boolean h() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                fe3 fe3Var = this.h;
                if (fe3Var.b || fe3Var.e) {
                    ee3 ee3Var = this.i;
                    if (ee3Var.a || ee3Var.c) {
                        if (this.g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c18
    public final by7 j() {
        return this.i;
    }

    public final void k(by2 by2Var, boolean z) {
        boolean zI;
        js3.p(by2Var, "headers");
        TimeZone timeZone = ih9.a;
        synchronized (this) {
            try {
                if (this.g && by2Var.a(":status") == null && by2Var.a(":method") == null) {
                    this.h.getClass();
                } else {
                    this.g = true;
                    this.f.add(by2Var);
                }
                if (z) {
                    this.h.b = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.b.k(this.a);
    }

    public final void l(ErrorCode errorCode) {
        synchronized (this) {
            if (g() == null) {
                this.l = errorCode;
                notifyAll();
            }
        }
    }
}
