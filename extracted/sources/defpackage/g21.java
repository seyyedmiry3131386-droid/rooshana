package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import coil3.network.ConnectivityChecker;

/* JADX INFO: loaded from: classes.dex */
public final class g21 implements ConnectivityChecker {
    public final /* synthetic */ int b;
    public final ConnectivityManager c;

    public /* synthetic */ g21(ConnectivityManager connectivityManager, int i) {
        this.b = i;
        this.c = connectivityManager;
    }

    @Override // coil3.network.ConnectivityChecker
    public final boolean a() {
        switch (this.b) {
            case 0:
                NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                }
                break;
            default:
                ConnectivityManager connectivityManager = this.c;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
                }
                break;
        }
        return false;
    }
}
