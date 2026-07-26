package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class w47 {
    public final se3 a;
    public final String b;
    public final by2 c;
    public final b57 d;
    public final b47 e;
    public jk0 f;

    public w47(rb4 rb4Var) {
        js3.p(rb4Var, "builder");
        se3 se3Var = (se3) rb4Var.b;
        if (se3Var == null) {
            throw new IllegalStateException("url == null");
        }
        this.a = se3Var;
        this.b = (String) rb4Var.c;
        this.c = ((ay2) rb4Var.d).e();
        this.d = (b57) rb4Var.e;
        this.e = (b47) rb4Var.f;
    }

    public final jk0 a() {
        jk0 jk0Var = this.f;
        if (jk0Var != null) {
            return jk0Var;
        }
        int i = jk0.n;
        jk0 jk0VarU = wn5.U(this.c);
        this.f = jk0VarU;
        return jk0VarU;
    }

    public final rb4 b() {
        rb4 rb4Var = new rb4(false);
        rb4Var.b = this.a;
        rb4Var.c = this.b;
        rb4Var.e = this.d;
        rb4Var.f = this.e;
        rb4Var.d = this.c.d();
        return rb4Var;
    }

    public final String toString() {
        StringBuilder sbA = o40.A(32, "Request{method=");
        sbA.append(this.b);
        sbA.append(", url=");
        sbA.append(this.a);
        by2 by2Var = this.c;
        if (by2Var.size() != 0) {
            sbA.append(", headers=[");
            int i = 0;
            for (Object obj : by2Var) {
                int i2 = i + 1;
                if (i < 0) {
                    br9.P();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                if (i > 0) {
                    sbA.append(", ");
                }
                sbA.append(str);
                sbA.append(':');
                if (gh9.l(str)) {
                    str2 = "██";
                }
                sbA.append(str2);
                i = i2;
            }
            sbA.append(']');
        }
        j12 j12Var = j12.d;
        b47 b47Var = this.e;
        if (!js3.i(b47Var, j12Var)) {
            sbA.append(", tags=");
            sbA.append(b47Var);
        }
        sbA.append('}');
        return sbA.toString();
    }
}
