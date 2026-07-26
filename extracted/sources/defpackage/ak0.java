package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class ak0 {
    public static final String k;
    public static final String l;
    public final se3 a;
    public final by2 b;
    public final String c;
    public final Protocol d;
    public final int e;
    public final String f;
    public final by2 g;
    public final ww2 h;
    public final long i;
    public final long j;

    static {
        k96 k96Var = k96.a;
        k96.a.getClass();
        k = "OkHttp-Sent-Millis";
        k96.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public ak0(t18 t18Var) throws IOException {
        se3 se3VarB;
        TlsVersion tlsVersionN;
        js3.p(t18Var, "rawSource");
        try {
            tv6 tv6VarJ = rf0.j(t18Var);
            String strY = tv6VarJ.Y(Long.MAX_VALUE);
            try {
                re3 re3Var = new re3(0);
                re3Var.e(null, strY);
                se3VarB = re3Var.b();
            } catch (IllegalArgumentException unused) {
                se3VarB = null;
            }
            if (se3VarB == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strY));
                k96 k96Var = k96.a;
                k96.a.j("cache corruption", 5, iOException);
                throw iOException;
            }
            this.a = se3VarB;
            this.c = tv6VarJ.Y(Long.MAX_VALUE);
            ay2 ay2Var = new ay2(0);
            int iM = rq4.M(tv6VarJ);
            for (int i = 0; i < iM; i++) {
                ay2Var.b(tv6VarJ.Y(Long.MAX_VALUE));
            }
            this.b = ay2Var.e();
            pg pgVarL = z67.l(tv6VarJ.Y(Long.MAX_VALUE));
            this.d = (Protocol) pgVarL.c;
            this.e = pgVarL.b;
            this.f = (String) pgVarL.d;
            ay2 ay2Var2 = new ay2(0);
            int iM2 = rq4.M(tv6VarJ);
            for (int i2 = 0; i2 < iM2; i2++) {
                ay2Var2.b(tv6VarJ.Y(Long.MAX_VALUE));
            }
            String str = k;
            String strG = ay2Var2.g(str);
            String str2 = l;
            String strG2 = ay2Var2.g(str2);
            ay2Var2.i(str);
            ay2Var2.i(str2);
            this.i = strG != null ? Long.parseLong(strG) : 0L;
            this.j = strG2 != null ? Long.parseLong(strG2) : 0L;
            this.g = ay2Var2.e();
            if (this.a.f()) {
                String strY2 = tv6VarJ.Y(Long.MAX_VALUE);
                if (strY2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strY2 + '\"');
                }
                gr0 gr0VarX = gr0.b.x(tv6VarJ.Y(Long.MAX_VALUE));
                List listA = a(tv6VarJ);
                List listA2 = a(tv6VarJ);
                if (tv6VarJ.b()) {
                    tlsVersionN = TlsVersion.g;
                } else {
                    ol3 ol3Var = TlsVersion.b;
                    String strY3 = tv6VarJ.Y(Long.MAX_VALUE);
                    ol3Var.getClass();
                    tlsVersionN = ol3.n(strY3);
                }
                js3.p(listA, "peerCertificates");
                js3.p(listA2, "localCertificates");
                this.h = new ww2(tlsVersionN, gr0VarX, ih9.j(listA2), new vw2(ih9.j(listA), 0));
            } else {
                this.h = null;
            }
            t18Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tv8.h(t18Var, th);
                throw th2;
            }
        }
    }

    public static List a(tv6 tv6Var) throws IOException {
        int iM = rq4.M(tv6Var);
        if (iM == -1) {
            return EmptyList.a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM);
            for (int i = 0; i < iM; i++) {
                String strY = tv6Var.Y(Long.MAX_VALUE);
                gh0 gh0Var = new gh0();
                ByteString byteString = ByteString.d;
                ByteString byteStringR = fv.r(strY);
                if (byteStringR == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                gh0Var.L0(byteStringR);
                arrayList.add(certificateFactory.generateCertificate(new fh0(gh0Var, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static void b(sv6 sv6Var, List list) throws IOException {
        try {
            sv6Var.i1(list.size());
            sv6Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                ByteString byteString = ByteString.d;
                js3.m(encoded);
                sv6Var.n0(fv.C(encoded).a());
                sv6Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void c(ry ryVar) {
        se3 se3Var = this.a;
        ww2 ww2Var = this.h;
        by2 by2Var = this.g;
        by2 by2Var2 = this.b;
        sv6 sv6VarI = rf0.i(ryVar.p(0));
        try {
            sv6VarI.n0(se3Var.i);
            sv6VarI.writeByte(10);
            sv6VarI.n0(this.c);
            sv6VarI.writeByte(10);
            sv6VarI.i1(by2Var2.size());
            sv6VarI.writeByte(10);
            int size = by2Var2.size();
            for (int i = 0; i < size; i++) {
                sv6VarI.n0(by2Var2.c(i));
                sv6VarI.n0(": ");
                sv6VarI.n0(by2Var2.f(i));
                sv6VarI.writeByte(10);
            }
            Protocol protocol = this.d;
            int i2 = this.e;
            String str = this.f;
            js3.p(protocol, "protocol");
            js3.p(str, "message");
            StringBuilder sb = new StringBuilder();
            if (protocol == Protocol.c) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            sv6VarI.n0(sb.toString());
            sv6VarI.writeByte(10);
            sv6VarI.i1(by2Var.size() + 2);
            sv6VarI.writeByte(10);
            int size2 = by2Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                sv6VarI.n0(by2Var.c(i3));
                sv6VarI.n0(": ");
                sv6VarI.n0(by2Var.f(i3));
                sv6VarI.writeByte(10);
            }
            sv6VarI.n0(k);
            sv6VarI.n0(": ");
            sv6VarI.i1(this.i);
            sv6VarI.writeByte(10);
            sv6VarI.n0(l);
            sv6VarI.n0(": ");
            sv6VarI.i1(this.j);
            sv6VarI.writeByte(10);
            if (se3Var.f()) {
                sv6VarI.writeByte(10);
                js3.m(ww2Var);
                sv6VarI.n0(ww2Var.b.a);
                sv6VarI.writeByte(10);
                b(sv6VarI, ww2Var.a());
                b(sv6VarI, ww2Var.c);
                sv6VarI.n0(ww2Var.a.a);
                sv6VarI.writeByte(10);
            }
            sv6VarI.close();
        } finally {
        }
    }

    public ak0(g77 g77Var) {
        by2 by2VarE;
        w47 w47Var = g77Var.a;
        this.a = w47Var.a;
        g77 g77Var2 = g77Var.i;
        js3.m(g77Var2);
        by2 by2Var = g77Var2.a.c;
        by2 by2Var2 = g77Var.f;
        Set setS = rq4.S(by2Var2);
        if (setS.isEmpty()) {
            by2VarE = by2.b;
        } else {
            ay2 ay2Var = new ay2(0);
            int size = by2Var.size();
            for (int i = 0; i < size; i++) {
                String strC = by2Var.c(i);
                if (setS.contains(strC)) {
                    ay2Var.a(strC, by2Var.f(i));
                }
            }
            by2VarE = ay2Var.e();
        }
        this.b = by2VarE;
        this.c = w47Var.b;
        this.d = g77Var.b;
        this.e = g77Var.d;
        this.f = g77Var.c;
        this.g = by2Var2;
        this.h = g77Var.e;
        this.i = g77Var.l;
        this.j = g77Var.m;
    }
}
