package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class rd3 implements o42 {
    public static final by2 f;
    public final hs5 a;
    public final n42 b;
    public final wv8 c;
    public int d;
    public final nq0 e;

    static {
        by2 by2Var = by2.b;
        f = wu8.E("OkHttp-Response-Body", "Truncated");
    }

    public rd3(hs5 hs5Var, n42 n42Var, wv8 wv8Var) {
        js3.p(wv8Var, "socket");
        this.a = hs5Var;
        this.b = n42Var;
        this.c = wv8Var;
        this.e = new nq0((tv6) wv8Var.c);
    }

    @Override // defpackage.o42
    public final void a() {
        ((sv6) this.c.d).flush();
    }

    @Override // defpackage.o42
    public final boolean b() {
        return this.d == 6;
    }

    @Override // defpackage.o42
    public final long c(g77 g77Var) {
        if (!me3.a(g77Var)) {
            return 0L;
        }
        String strA = g77Var.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return ih9.e(g77Var);
    }

    @Override // defpackage.o42
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.o42
    public final f77 d(boolean z) {
        nq0 nq0Var = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        try {
            String strY = ((ph0) nq0Var.c).Y(nq0Var.b);
            nq0Var.b -= (long) strY.length();
            pg pgVarL = z67.l(strY);
            int i2 = pgVarL.b;
            f77 f77Var = new f77();
            f77Var.b = (Protocol) pgVarL.c;
            f77Var.c = i2;
            f77Var.d = (String) pgVarL.d;
            ay2 ay2Var = new ay2(0);
            while (true) {
                String strY2 = ((ph0) nq0Var.c).Y(nq0Var.b);
                nq0Var.b -= (long) strY2.length();
                if (strY2.length() == 0) {
                    break;
                }
                ay2Var.b(strY2);
            }
            f77Var.c(ay2Var.e());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return f77Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return f77Var;
            }
            this.d = 3;
            return f77Var;
        } catch (EOFException e) {
            throw new IOException(dw1.n("unexpected end of stream on ", this.b.h().a.h.h()), e);
        }
    }

    @Override // defpackage.o42
    public final t18 e(g77 g77Var) {
        w47 w47Var = g77Var.a;
        if (!me3.a(g77Var)) {
            return k(w47Var.a, 0L);
        }
        String strA = g77Var.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            se3 se3Var = w47Var.a;
            if (this.d == 4) {
                this.d = 5;
                return new od3(this, se3Var);
            }
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        long jE = ih9.e(g77Var);
        if (jE != -1) {
            return k(w47Var.a, jE);
        }
        se3 se3Var2 = w47Var.a;
        if (this.d != 4) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        this.d = 5;
        this.b.e();
        js3.p(se3Var2, "url");
        return new qd3(this, se3Var2);
    }

    @Override // defpackage.o42
    public final void f() {
        ((sv6) this.c.d).flush();
    }

    @Override // defpackage.o42
    public final c18 g() {
        return this.c;
    }

    @Override // defpackage.o42
    public final by7 h(w47 w47Var, long j) {
        js3.p(w47Var, "request");
        if ("chunked".equalsIgnoreCase(w47Var.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new nd3(this);
            }
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.d == 1) {
            this.d = 2;
            return new a92(this);
        }
        throw new IllegalStateException(("state: " + this.d).toString());
    }

    @Override // defpackage.o42
    public final n42 i() {
        return this.b;
    }

    @Override // defpackage.o42
    public final void j(w47 w47Var) {
        js3.p(w47Var, "request");
        Proxy.Type type = this.b.h().b.type();
        js3.o(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(w47Var.b);
        sb.append(' ');
        se3 se3Var = w47Var.a;
        if (se3Var.f() || type != Proxy.Type.HTTP) {
            String strB = se3Var.b();
            String strD = se3Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(se3Var);
        }
        sb.append(" HTTP/1.1");
        l(w47Var.c, sb.toString());
    }

    public final pd3 k(se3 se3Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new pd3(this, se3Var, j);
        }
        throw new IllegalStateException(("state: " + this.d).toString());
    }

    public final void l(by2 by2Var, String str) {
        js3.p(by2Var, "headers");
        js3.p(str, "requestLine");
        if (this.d != 0) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        wv8 wv8Var = this.c;
        sv6 sv6Var = (sv6) wv8Var.d;
        sv6 sv6Var2 = (sv6) wv8Var.d;
        sv6Var.n0(str);
        sv6Var.n0("\r\n");
        int size = by2Var.size();
        for (int i = 0; i < size; i++) {
            sv6Var2.n0(by2Var.c(i));
            sv6Var2.n0(": ");
            sv6Var2.n0(by2Var.f(i));
            sv6Var2.n0("\r\n");
        }
        sv6Var2.n0("\r\n");
        this.d = 1;
    }
}
