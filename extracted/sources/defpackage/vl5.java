package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import nene.downloadmanager.downloader.async.AsyncTaskCanceledException;
import nene.downloadmanager.downloader.async.NeneAsyncTask$Status;
import nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vl5 {
    public static final jx g;
    public final fx b;
    public final gx c;
    public NeneDownloadFailException a = null;
    public volatile NeneAsyncTask$Status d = NeneAsyncTask$Status.a;
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean f = new AtomicBoolean();

    static {
        eh5.a("NeneAsyncTask");
        g = new jx();
    }

    public vl5() {
        fx fxVar = new fx(2, this);
        this.b = fxVar;
        this.c = new gx(this, fxVar, 4);
    }

    public final void a() throws AsyncTaskCanceledException {
        if (this.e.get()) {
            throw new AsyncTaskCanceledException("Task canceled " + z27.f());
        }
    }

    public abstract Object b(Object... objArr);

    public final void c(ThreadPoolExecutor threadPoolExecutor, Object... objArr) {
        if (this.d != NeneAsyncTask$Status.a) {
            int iOrdinal = this.d.ordinal();
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iOrdinal == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.d = NeneAsyncTask$Status.b;
        this.b.b = objArr;
        threadPoolExecutor.execute(this.c);
    }

    public abstract void d(Object obj);

    public abstract void e(Object obj);

    public final void g(Object... objArr) {
        if (this.e.get()) {
            return;
        }
        g.obtainMessage(2, new ul5(this, objArr)).sendToTarget();
    }

    public void f(Object... objArr) {
    }
}
