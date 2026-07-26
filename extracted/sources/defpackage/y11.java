package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class y11 {
    public static final y11 e;
    public static final y11 f;
    public static final y11 g;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        gr0 gr0Var = gr0.r;
        gr0 gr0Var2 = gr0.s;
        gr0 gr0Var3 = gr0.t;
        gr0 gr0Var4 = gr0.l;
        gr0 gr0Var5 = gr0.n;
        gr0 gr0Var6 = gr0.m;
        gr0 gr0Var7 = gr0.o;
        gr0 gr0Var8 = gr0.q;
        gr0 gr0Var9 = gr0.p;
        List listC = br9.C(gr0Var, gr0Var2, gr0Var3, gr0Var4, gr0Var5, gr0Var6, gr0Var7, gr0Var8, gr0Var9);
        List listC2 = br9.C(gr0Var, gr0Var2, gr0Var3, gr0Var4, gr0Var5, gr0Var6, gr0Var7, gr0Var8, gr0Var9, gr0.j, gr0.k, gr0.h, gr0.i, gr0.f, gr0.g, gr0.e);
        x11 x11Var = new x11();
        gr0[] gr0VarArr = (gr0[]) listC.toArray(new gr0[0]);
        x11Var.c((gr0[]) Arrays.copyOf(gr0VarArr, gr0VarArr.length));
        TlsVersion tlsVersion = TlsVersion.c;
        TlsVersion tlsVersion2 = TlsVersion.d;
        x11Var.f(tlsVersion, tlsVersion2);
        x11Var.b = true;
        x11Var.a();
        x11 x11Var2 = new x11();
        gr0[] gr0VarArr2 = (gr0[]) listC2.toArray(new gr0[0]);
        x11Var2.c((gr0[]) Arrays.copyOf(gr0VarArr2, gr0VarArr2.length));
        x11Var2.f(tlsVersion, tlsVersion2);
        x11Var2.b = true;
        e = x11Var2.a();
        x11 x11Var3 = new x11();
        gr0[] gr0VarArr3 = (gr0[]) listC2.toArray(new gr0[0]);
        x11Var3.c((gr0[]) Arrays.copyOf(gr0VarArr3, gr0VarArr3.length));
        x11Var3.f(tlsVersion, tlsVersion2, TlsVersion.e, TlsVersion.f);
        x11Var3.b = true;
        f = x11Var3.a();
        g = new y11(false, false, null, null);
    }

    public y11(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        js3.m(enabledCipherSuites);
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = gh9.k(strArr, enabledCipherSuites, gr0.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            js3.o(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = gh9.k(enabledProtocols2, strArr2, yh5.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        js3.m(supportedCipherSuites);
        yg2 yg2Var = gr0.c;
        byte[] bArr = gh9.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (yg2Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            js3.o(str, "get(...)");
            js3.p(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            js3.o(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        x11 x11Var = new x11();
        x11Var.a = this.a;
        x11Var.c = strArr;
        x11Var.d = strArr2;
        x11Var.b = this.b;
        x11Var.d((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        x11Var.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        y11 y11VarA = x11Var.a();
        if (y11VarA.c() != null) {
            sSLSocket.setEnabledProtocols(y11VarA.d);
        }
        if (y11VarA.b() != null) {
            sSLSocket.setEnabledCipherSuites(y11VarA.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(gr0.b.x(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.b.getClass();
            arrayList.add(ol3.n(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y11)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        y11 y11Var = (y11) obj;
        boolean z = y11Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, y11Var.c) && Arrays.equals(this.d, y11Var.d) && this.b == y11Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return bl4.A(sb, this.b, ')');
    }
}
