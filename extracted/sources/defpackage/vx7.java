package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import io.sentry.android.core.t0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vx7 implements sx7 {
    public static final Executor g = AsyncTask.SERIAL_EXECUTOR;
    public final Context a;
    public final rx7 b;
    public final x41 c;
    public volatile boolean d;
    public volatile boolean e;
    public final in f = new in(4, this);

    public vx7(Context context, x41 x41Var, rx7 rx7Var) {
        this.a = context.getApplicationContext();
        this.c = x41Var;
        this.b = rx7Var;
    }

    @Override // defpackage.sx7
    public final boolean a() {
        g.execute(new ux7(this, 0));
        return true;
    }

    @Override // defpackage.sx7
    public final void b() {
        g.execute(new ux7(this, 1));
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            t0.n("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            return true;
        }
    }
}
