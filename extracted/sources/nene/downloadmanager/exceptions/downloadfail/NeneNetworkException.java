package nene.downloadmanager.exceptions.downloadfail;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import defpackage.am5;
import defpackage.bl4;
import defpackage.dh5;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class NeneNetworkException extends NeneDownloadFailException {
    public static NeneNetworkException c(int i, IOException iOException, String str) {
        NeneNetworkException neneNetworkNotConnectedException;
        if (i > 0) {
            StringBuilder sbC = bl4.C(str);
            sbC.append(i > 0 ? bl4.q(i, " (HTTP status code: ", ")") : "");
            String string = sbC.toString();
            neneNetworkNotConnectedException = i == 401 ? new NeneNetworkUnauthorizedException(string) : (i < 400 || i > 499) ? (i < 500 || i > 599) ? new NeneNetworkException(string) : new NeneNetworkServer5xxException(string) : new NeneNetworkServer4xxException(string);
        } else {
            Context context = dh5.a;
            int i2 = am5.a;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            neneNetworkNotConnectedException = (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? new NeneNetworkNotConnectedException(str) : e(iOException) ? new NeneNetworkBadResponseException(str) : new NeneNetworkException(str);
        }
        if (iOException != null) {
            neneNetworkNotConnectedException.initCause(iOException);
        }
        return neneNetworkNotConnectedException;
    }

    public static boolean e(Throwable th) {
        if (th == null) {
            return false;
        }
        return th.getClass().getName().startsWith("javax.net.ssl.") || e(th.getCause());
    }

    @Override // nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException
    public int a() {
        return 133;
    }
}
