package defpackage;

import io.sentry.android.core.t0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class gx extends FutureTask {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx(Object obj, Callable callable, int i) {
        super(callable);
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.a) {
            case 0:
                lx lxVar = (lx) this.b;
                AtomicBoolean atomicBoolean = lxVar.e;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    lxVar.d(obj);
                    return;
                } catch (InterruptedException e) {
                    t0.l(e, "AsyncTaskSupport");
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    lxVar.d(null);
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
                }
            case 1:
                mx mxVar = (mx) this.b;
                AtomicBoolean atomicBoolean2 = mxVar.e;
                try {
                    Object obj2 = get();
                    if (atomicBoolean2.get()) {
                        return;
                    }
                    mxVar.e(obj2);
                    return;
                } catch (InterruptedException e3) {
                    t0.l(e3, "AsyncTaskSupport");
                    return;
                } catch (CancellationException unused2) {
                    if (atomicBoolean2.get()) {
                        return;
                    }
                    mxVar.e(null);
                    return;
                } catch (ExecutionException e4) {
                    throw new RuntimeException("An error occured while executing doInBackground()", e4.getCause());
                }
            case 2:
                try {
                    if (!isCancelled()) {
                        try {
                            ((cg4) this.b).f((bg4) get());
                        } catch (InterruptedException | ExecutionException e5) {
                            ((cg4) this.b).f(new bg4(e5));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.b = null;
                }
            case 3:
                dx dxVar = (dx) this.b;
                AtomicBoolean atomicBoolean3 = dxVar.d;
                try {
                    Object obj3 = get();
                    if (atomicBoolean3.get()) {
                        return;
                    }
                    dxVar.b(obj3);
                    return;
                } catch (InterruptedException e6) {
                    t0.l(e6, "AsyncTask");
                    return;
                } catch (CancellationException unused3) {
                    if (atomicBoolean3.get()) {
                        return;
                    }
                    dxVar.b(null);
                    return;
                } catch (ExecutionException e7) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e7.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            default:
                vl5 vl5Var = (vl5) this.b;
                AtomicBoolean atomicBoolean4 = vl5Var.f;
                try {
                    Object obj4 = get();
                    if (atomicBoolean4.get()) {
                        return;
                    }
                    vl5.g.obtainMessage(1, new ul5(vl5Var, obj4)).sendToTarget();
                    return;
                } catch (InterruptedException unused4) {
                    jx jxVar = vl5.g;
                    return;
                } catch (CancellationException unused5) {
                    if (atomicBoolean4.get()) {
                        return;
                    }
                    vl5.g.obtainMessage(1, new ul5(vl5Var, null)).sendToTarget();
                    return;
                } catch (ExecutionException e8) {
                    throw new RuntimeException("An error occured while executing doInBackground()", e8.getCause());
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx(Callable callable) {
        super(callable);
        this.a = 2;
    }
}
