package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class fe3 implements t18 {
    public final long a;
    public boolean b;
    public final gh0 c = new gh0();
    public final gh0 d = new gh0();
    public boolean e;
    public final /* synthetic */ he3 f;

    public fe3(he3 he3Var, long j, boolean z) {
        this.f = he3Var;
        this.a = j;
        this.b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        he3 he3Var = this.f;
        synchronized (he3Var) {
            this.e = true;
            gh0 gh0Var = this.d;
            j = gh0Var.b;
            gh0Var.b();
            he3Var.notifyAll();
        }
        if (j > 0) {
            he3 he3Var2 = this.f;
            TimeZone timeZone = ih9.a;
            he3Var2.b.y(j);
        }
        this.f.a();
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws Throwable {
        boolean z;
        Throwable streamResetException;
        long jF0;
        js3.p(gh0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        do {
            he3 he3Var = this.f;
            synchronized (he3Var) {
                he3Var.b.getClass();
                ee3 ee3Var = he3Var.i;
                z = true;
                boolean z2 = ee3Var.c || ee3Var.a;
                if (z2) {
                    he3Var.j.h();
                }
                try {
                    if (he3Var.g() == null || this.b) {
                        streamResetException = null;
                    } else {
                        streamResetException = he3Var.m;
                        if (streamResetException == null) {
                            ErrorCode errorCodeG = he3Var.g();
                            js3.m(errorCodeG);
                            streamResetException = new StreamResetException(errorCodeG);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    gh0 gh0Var2 = this.d;
                    long j2 = gh0Var2.b;
                    if (j2 > 0) {
                        jF0 = gh0Var2.f0(gh0Var, Math.min(j, j2));
                        kb0.c(he3Var.c, jF0, 0L, 2);
                        long jB = he3Var.c.b();
                        if (streamResetException == null && jB >= he3Var.b.q.a() / 2) {
                            he3Var.b.J(he3Var.a, jB);
                            kb0.c(he3Var.c, 0L, jB, 1);
                        }
                        z = false;
                    } else {
                        if (this.b || streamResetException != null) {
                            z = false;
                        } else {
                            try {
                                he3Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jF0 = -1;
                    }
                } finally {
                    if (z2) {
                        he3Var.j.l();
                    }
                }
            }
            this.f.b.p.getClass();
        } while (z);
        if (jF0 != -1) {
            return jF0;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.f.j;
    }
}
