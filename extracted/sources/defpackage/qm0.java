package defpackage;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class qm0 {
    public boolean a;
    public boolean b;
    public Object c;

    public void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.b = true;
                tg1 tg1Var = (tg1) this.c;
                if (tg1Var != null) {
                    try {
                        Runnable runnable = (Runnable) tg1Var.b;
                        Transition transition = (Transition) tg1Var.c;
                        Runnable runnable2 = (Runnable) tg1Var.d;
                        if (runnable == null) {
                            transition.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.b = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.b = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
