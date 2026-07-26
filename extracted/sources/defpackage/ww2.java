package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.a;
import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class ww2 {
    public final TlsVersion a;
    public final gr0 b;
    public final List c;
    public final c24 d;

    public ww2(TlsVersion tlsVersion, gr0 gr0Var, List list, bp2 bp2Var) {
        js3.p(list, "localCertificates");
        this.a = tlsVersion;
        this.b = gr0Var;
        this.c = list;
        this.d = a.a(new uw2(0, bp2Var));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ww2)) {
            return false;
        }
        ww2 ww2Var = (ww2) obj;
        return ww2Var.a == this.a && js3.i(ww2Var.b, this.b) && js3.i(ww2Var.a(), a()) && js3.i(ww2Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(wu0.V(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                js3.o(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(wu0.V(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                js3.o(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
