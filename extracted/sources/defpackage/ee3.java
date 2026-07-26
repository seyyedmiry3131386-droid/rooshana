package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class ee3 implements by7 {
    public final boolean a;
    public final gh0 b = new gh0();
    public boolean c;
    public final /* synthetic */ he3 d;

    public ee3(he3 he3Var, boolean z) {
        this.d = he3Var;
        this.a = z;
    }

    @Override // defpackage.by7
    public final void X0(gh0 gh0Var, long j) {
        TimeZone timeZone = ih9.a;
        gh0 gh0Var2 = this.b;
        gh0Var2.X0(gh0Var, j);
        while (gh0Var2.b >= 16384) {
            b(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z) {
        long jMin;
        boolean z2;
        he3 he3Var = this.d;
        synchronized (he3Var) {
            he3Var.k.h();
            while (he3Var.d >= he3Var.e && !this.a && !this.c && he3Var.g() == null) {
                try {
                    try {
                        he3Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    he3Var.k.l();
                    throw th;
                }
            }
            he3Var.k.l();
            he3Var.b();
            jMin = Math.min(he3Var.e - he3Var.d, this.b.b);
            he3Var.d += jMin;
            z2 = z && jMin == this.b.b;
        }
        this.d.k.h();
        try {
            he3 he3Var2 = this.d;
            he3Var2.b.D(he3Var2.a, z2, this.b, jMin);
        } finally {
            this.d.k.l();
        }
    }

    @Override // defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        he3 he3Var = this.d;
        TimeZone timeZone = ih9.a;
        synchronized (he3Var) {
            if (this.c) {
                return;
            }
            boolean z = he3Var.g() == null;
            he3 he3Var2 = this.d;
            if (!he3Var2.i.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        b(true);
                    }
                } else if (z) {
                    he3Var2.b.D(he3Var2.a, true, null, 0L);
                }
            }
            he3 he3Var3 = this.d;
            synchronized (he3Var3) {
                this.c = true;
                he3Var3.notifyAll();
            }
            this.d.b.flush();
            this.d.a();
        }
    }

    @Override // defpackage.by7, java.io.Flushable
    public final void flush() {
        he3 he3Var = this.d;
        TimeZone timeZone = ih9.a;
        synchronized (he3Var) {
            he3Var.b();
        }
        while (this.b.b > 0) {
            b(false);
            this.d.b.flush();
        }
    }

    @Override // defpackage.by7
    public final dm8 i() {
        return this.d.k;
    }
}
