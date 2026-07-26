package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i57 extends Thread {
    public final int a;

    public i57(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
