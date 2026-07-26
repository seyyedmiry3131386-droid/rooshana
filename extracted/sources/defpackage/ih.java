package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ih extends k96 implements y41 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public ih() {
        j48 j48Var;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            j48Var = new j48(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = tg.a;
            tg.a(hs5.class.getName(), 5, "unable to load android socket classes", e2);
            j48Var = null;
        }
        ArrayList arrayListJ0 = ew.J0(new d18[]{j48Var, new pi1(bi.f), new pi1(r21.a), new pi1(sf0.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListJ0) {
            if (((d18) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.y41
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.y41
    public final Context b() {
        return this.c;
    }

    @Override // defpackage.k96
    public final at2 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        we weVar = x509TrustManagerExtensions != null ? new we(x509TrustManager, x509TrustManagerExtensions) : null;
        return weVar != null ? weVar : new da0(d(x509TrustManager));
    }

    @Override // defpackage.k96
    public final bt8 d(X509TrustManager x509TrustManager) {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new hh(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // defpackage.k96
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object next;
        js3.p(list, "protocols");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((d18) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        d18 d18Var = (d18) next;
        if (d18Var != null) {
            d18Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.k96
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        js3.p(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.k96
    public final String g(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((d18) next).b(sSLSocket)) {
                break;
            }
        }
        d18 d18Var = (d18) next;
        if (d18Var != null) {
            return d18Var.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.k96
    public final boolean i(String str) {
        js3.p(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // defpackage.k96
    public final void j(String str, int i, Throwable th) {
        js3.p(str, "message");
        if (i == 5) {
            t0.n("OkHttp", str, th);
        }
    }

    @Override // defpackage.k96
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
