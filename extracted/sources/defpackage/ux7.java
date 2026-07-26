package defpackage;

import android.content.IntentFilter;
import android.util.Log;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class ux7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx7 b;

    public /* synthetic */ ux7(vx7 vx7Var, int i) {
        this.a = i;
        this.b = vx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vx7 vx7Var = this.b;
                vx7Var.d = vx7Var.c();
                try {
                    vx7 vx7Var2 = this.b;
                    vx7Var2.a.registerReceiver(vx7Var2.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.b.e = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        t0.n("ConnectivityMonitor", "Failed to register", e);
                    }
                    this.b.e = false;
                    return;
                }
                break;
            case 1:
                if (this.b.e) {
                    this.b.e = false;
                    vx7 vx7Var3 = this.b;
                    vx7Var3.a.unregisterReceiver(vx7Var3.f);
                    break;
                }
                break;
            default:
                boolean z = this.b.d;
                vx7 vx7Var4 = this.b;
                vx7Var4.d = vx7Var4.c();
                if (z != this.b.d) {
                    vx7 vx7Var5 = this.b;
                    i29.f().post(new jw(2, vx7Var5, vx7Var5.d));
                }
                break;
        }
    }
}
