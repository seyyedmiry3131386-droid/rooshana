package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class wr1 extends BroadcastReceiver {
    public String b;
    public final /* synthetic */ xr1 d;
    public boolean a = false;
    public long c = 0;

    public wr1(xr1 xr1Var) {
        this.d = xr1Var;
    }

    public final void a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.d.a.getSystemService("connectivity")).getActiveNetworkInfo();
        String string = activeNetworkInfo == null ? "No network" : activeNetworkInfo.toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!string.equals(this.b) || jCurrentTimeMillis - this.c > 500) {
            sb7.p(xr1.f, "Device network log", string);
            this.b = string;
            this.c = jCurrentTimeMillis;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a) {
            a();
        }
    }
}
