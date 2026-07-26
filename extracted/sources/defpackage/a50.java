package defpackage;

import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class a50 implements Runnable {
    public final nc2 a = new nc2(27);
    public final t32 b;
    public volatile boolean c;

    public a50(t32 t32Var) {
        this.b = t32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p46 p46VarY;
        while (true) {
            try {
                try {
                    p46VarY = this.a.y();
                } catch (InterruptedException e) {
                    t0.n("Event", Thread.currentThread().getName() + " was interruppted", e);
                    this.c = false;
                    return;
                }
                if (p46VarY == null) {
                    synchronized (this) {
                        p46VarY = this.a.x();
                        if (p46VarY == null) {
                            this.c = false;
                            this.c = false;
                            return;
                        }
                        t0.n("Event", Thread.currentThread().getName() + " was interruppted", e);
                        this.c = false;
                        return;
                    }
                }
                this.b.d(p46VarY);
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }
}
