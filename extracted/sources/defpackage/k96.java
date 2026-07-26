package defpackage;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k96 {
    public static volatile k96 a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : tg.b.entrySet()) {
                tg.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        k96 meVar = me.e ? new me() : null;
        if (meVar == null) {
            meVar = ih.e ? new ih() : null;
        }
        if (meVar == null) {
            throw new IllegalStateException(rm7.n(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        a = meVar;
        b = Logger.getLogger(hs5.class.getName());
    }

    public abstract at2 c(X509TrustManager x509TrustManager);

    public bt8 d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new ra0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        js3.p(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i, Throwable th);

    public void k(Object obj, String str) {
        js3.p(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        js3.o(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
