package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class we extends at2 {
    public final X509TrustManager D;
    public final X509TrustManagerExtensions E;

    public we(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.D = x509TrustManager;
        this.E = x509TrustManagerExtensions;
    }

    @Override // defpackage.at2
    public final List T(String str, List list) throws SSLPeerUnverifiedException {
        js3.p(list, "chain");
        js3.p(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.E.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            js3.o(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof we) && ((we) obj).D == this.D;
    }

    public final int hashCode() {
        return System.identityHashCode(this.D);
    }
}
