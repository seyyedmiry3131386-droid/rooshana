package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.compose.runtime.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d20 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                js3.p(network, "network");
                ((h) this.b).setValue(Boolean.TRUE);
                break;
            default:
                i29.f().post(new jw(1, this, true));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                js3.p(network, "network");
                ((h) this.b).setValue(Boolean.FALSE);
                break;
            default:
                i29.f().post(new jw(1, this, false));
                break;
        }
    }
}
