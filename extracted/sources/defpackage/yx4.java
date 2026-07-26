package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx4 extends i0 implements Runnable {
    public final Runnable h;

    public yx4(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // com.google.common.util.concurrent.b
    public final String i() {
        return "task=[" + this.h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            l(th);
            throw th;
        }
    }
}
