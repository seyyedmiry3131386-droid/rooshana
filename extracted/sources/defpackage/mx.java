package defpackage;

import android.os.Looper;
import ir.mservices.market.version2.core.async.AsyncTaskSupport$Status;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mx {
    public static final ThreadPoolExecutor f;
    public static volatile kx g;
    public static jx h;
    public final fx a;
    public final gx b;
    public volatile AsyncTaskSupport$Status c = AsyncTaskSupport$Status.a;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ex exVar = new ex(1);
        f = new ThreadPoolExecutor(iAvailableProcessors + 1, (iAvailableProcessors * 2) + 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), exVar);
        g = new kx(1);
    }

    public mx() {
        fx fxVar = new fx(1, this);
        this.a = fxVar;
        this.b = new gx(this, fxVar, 1);
    }

    public abstract Object a(Object... objArr);

    public final void b(Object... objArr) {
        kx kxVar = g;
        if (this.c != AsyncTaskSupport$Status.a) {
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iOrdinal == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.c = AsyncTaskSupport$Status.b;
        this.a.b = objArr;
        kxVar.execute(this.b);
    }

    public final void e(Object obj) {
        jx jxVar;
        synchronized (mx.class) {
            try {
                if (h == null) {
                    h = new jx(Looper.getMainLooper(), 1, false);
                }
                jxVar = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        jxVar.obtainMessage(1, new ix(this, obj)).sendToTarget();
    }

    public void c() {
    }

    public void d(Object obj) {
    }
}
