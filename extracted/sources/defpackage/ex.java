package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ex implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public ex(yo9 yo9Var) {
        this.a = 4;
        this.b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "AsyncTaskSupport #" + ((AtomicInteger) this.b).getAndIncrement());
            case 1:
                return new Thread(runnable, "AsyncTaskSupport #" + ((AtomicInteger) this.b).getAndIncrement());
            case 2:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.b).getAndIncrement());
                return thread;
            case 3:
                return new Thread(runnable, "NeneAsyncTask #" + ((AtomicInteger) this.b).getAndIncrement());
            default:
                Thread threadNewThread = ((ThreadFactory) this.b).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
        }
    }

    public ex(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(1);
                break;
            case 2:
                this.b = new AtomicInteger(0);
                break;
            case 3:
                this.b = new AtomicInteger(1);
                break;
            default:
                this.b = new AtomicInteger(1);
                break;
        }
    }
}
