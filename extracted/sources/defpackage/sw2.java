package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class sw2 implements Executor {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public sw2() {
        jx jxVar = new jx(Looper.getMainLooper(), 4, false);
        Looper.getMainLooper();
        this.b = jxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((jx) this.b).post(runnable);
                break;
            case 1:
                ((Executor) this.b).execute(new o6(runnable, 1));
                break;
            default:
                ((jx) this.b).post(runnable);
                break;
        }
    }

    public sw2(Looper looper) {
        this.b = new jx(looper, 7);
    }

    public sw2(ExecutorService executorService) {
        this.b = executorService;
    }
}
