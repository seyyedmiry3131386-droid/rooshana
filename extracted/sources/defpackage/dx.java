package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask$Status;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dx implements Runnable {
    public static Handler f;
    public final /* synthetic */ fj9 e;
    public volatile ModernAsyncTask$Status b = ModernAsyncTask$Status.a;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final gx a = new gx(this, new bp1(1, this), 3);

    public dx(fj9 fj9Var) {
        this.e = fj9Var;
    }

    public final void a() {
        try {
            fj9 fj9Var = this.e;
            Iterator it = fj9Var.j.iterator();
            if (it.hasNext()) {
                ((GoogleApiClient) it.next()).getClass();
                throw new UnsupportedOperationException();
            }
            try {
                fj9Var.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e) {
            if (!this.c.get()) {
                throw e;
            }
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (dx.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new g6(this, obj, 23));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
