package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class me extends k96 implements y41 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public me() {
        ArrayList arrayListJ0 = ew.J0(new d18[]{Build.VERSION.SDK_INT >= 29 ? new ne() : null, new pi1(bi.f), new pi1(r21.a), new pi1(sf0.a)});
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // defpackage.k96
    public final boolean i(String str) {
        js3.p(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.k96
    public final void j(String str, int i, Throwable th) {
        js3.p(str, "message");
        if (i != 5) {
            boolean z = ih.e;
        } else {
            boolean z2 = ih.e;
            t0.n("OkHttp", str, th);
        }
    }

    @Override // defpackage.k96
    public final void k(Object obj, String str) {
        js3.p(str, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            js3.n(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            y32.f(obj).warnIfOpen();
        }
    }

    @Override // defpackage.k96
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
