package defpackage;

import androidx.concurrent.futures.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class pl0 implements n94 {
    public final WeakReference a;
    public final ol0 b = new ol0(this);

    public pl0(b bVar) {
        this.a = new WeakReference(bVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        b bVar = (b) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && bVar != null) {
            bVar.a = null;
            bVar.b = null;
            bVar.c.j(null);
        }
        return zCancel;
    }

    @Override // defpackage.n94
    public final void e(Runnable runnable, Executor executor) {
        this.b.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof c2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
