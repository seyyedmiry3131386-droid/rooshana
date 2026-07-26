package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ o6(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(10);
                this.b.run();
                break;
            case 1:
                try {
                    this.b.run();
                } catch (Exception e) {
                    wn5.G("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 2:
                this.b.run();
                break;
            default:
                Process.setThreadPriority(0);
                this.b.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
