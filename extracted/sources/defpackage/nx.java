package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class nx extends Thread {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ nx(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        ox oxVarS;
        switch (this.a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                dc0 dc0Var = ox.h;
                reentrantLock = ox.j;
                reentrantLock.lock();
                try {
                    oxVarS = cv.s();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
            if (oxVarS == ox.i) {
                ox.i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (oxVarS != null) {
                    oxVarS.k();
                }
            }
        }
    }

    public /* synthetic */ nx(String str) {
        super(str);
    }

    public /* synthetic */ nx(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
