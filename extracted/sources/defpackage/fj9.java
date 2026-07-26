package defpackage;

import android.os.AsyncTask;
import androidx.loader.content.ModernAsyncTask$Status;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class fj9 {
    public ta4 a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile dx g;
    public volatile dx h;
    public final Semaphore i;
    public final Set j;

    public fj9(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            boolean z = this.b;
            if (!z) {
                if (z) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.g.getClass();
                this.g = null;
                return;
            }
            this.g.getClass();
            dx dxVar = this.g;
            dxVar.c.set(true);
            if (dxVar.a.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        dx dxVar = this.g;
        Executor executor = this.f;
        if (dxVar.b == ModernAsyncTask$Status.a) {
            dxVar.b = ModernAsyncTask$Status.b;
            executor.execute(dxVar.a);
            return;
        }
        int iOrdinal = dxVar.b.ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iOrdinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.g = new dx(this);
        b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
