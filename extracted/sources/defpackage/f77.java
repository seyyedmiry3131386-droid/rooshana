package defpackage;

import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class f77 {
    public w47 a;
    public Protocol b;
    public String d;
    public ww2 e;
    public c18 h;
    public g77 i;
    public g77 j;
    public g77 k;
    public long l;
    public long m;
    public ai0 n;
    public int c = -1;
    public j77 g = j77.a;
    public aq8 o = aq8.n0;
    public ay2 f = new ay2(0);

    public static void b(String str, g77 g77Var) {
        if (g77Var != null) {
            if (g77Var.i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (g77Var.j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (g77Var.k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final g77 a() {
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        w47 w47Var = this.a;
        if (w47Var == null) {
            throw new IllegalStateException("request == null");
        }
        Protocol protocol = this.b;
        if (protocol == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new g77(w47Var, protocol, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(by2 by2Var) {
        js3.p(by2Var, "headers");
        this.f = by2Var.d();
    }
}
