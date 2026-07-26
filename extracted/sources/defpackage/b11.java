package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class b11 {
    public final td8 a;
    public boolean b;

    public b11() {
        this(td8.a);
    }

    public final synchronized void a() {
        while (!this.b) {
            this.a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j <= 0) {
            return this.b;
        }
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 < jElapsedRealtime) {
            b();
        } else {
            boolean z = false;
            while (!this.b && jElapsedRealtime < j2) {
                try {
                    this.a.getClass();
                    wait(j2 - jElapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.a.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.b;
    }

    public final synchronized boolean d() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public b11(td8 td8Var) {
        this.a = td8Var;
    }
}
