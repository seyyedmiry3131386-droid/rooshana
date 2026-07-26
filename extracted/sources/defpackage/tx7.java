package defpackage;

import android.net.ConnectivityManager;
import android.util.Log;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class tx7 implements sx7 {
    public boolean a;
    public final rx7 b;
    public final x41 c;
    public final d20 d = new d20(1, this);

    public tx7(x41 x41Var, rx7 rx7Var) {
        this.c = x41Var;
        this.b = rx7Var;
    }

    @Override // defpackage.sx7
    public final boolean a() {
        x41 x41Var = this.c;
        this.a = ((ConnectivityManager) x41Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) x41Var.get()).registerDefaultNetworkCallback(this.d);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                t0.n("ConnectivityMonitor", "Failed to register callback", e);
            }
            return false;
        }
    }

    @Override // defpackage.sx7
    public final void b() {
        ((ConnectivityManager) this.c.get()).unregisterNetworkCallback(this.d);
    }
}
