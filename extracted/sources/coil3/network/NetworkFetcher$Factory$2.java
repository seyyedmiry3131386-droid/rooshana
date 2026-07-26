package coil3.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import defpackage.dp2;
import defpackage.g21;
import defpackage.h21;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class NetworkFetcher$Factory$2 extends FunctionReferenceImpl implements dp2 {
    public static final NetworkFetcher$Factory$2 a = new NetworkFetcher$Factory$2();

    public NetworkFetcher$Factory$2() {
        super(1, h21.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager != null && ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return Build.VERSION.SDK_INT > 23 ? new g21(connectivityManager, 1) : new g21(connectivityManager, 0);
            } catch (Exception unused) {
            }
        }
        return ConnectivityChecker.a;
    }
}
