package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class g77 implements Closeable {
    public final w47 a;
    public final Protocol b;
    public final String c;
    public final int d;
    public final ww2 e;
    public final by2 f;
    public final j77 g;
    public final c18 h;
    public final g77 i;
    public final g77 j;
    public final g77 k;
    public final long l;
    public final long m;
    public final ai0 n;
    public final aq8 o;
    public jk0 p;
    public final boolean q;

    public g77(w47 w47Var, Protocol protocol, String str, int i, ww2 ww2Var, by2 by2Var, j77 j77Var, c18 c18Var, g77 g77Var, g77 g77Var2, g77 g77Var3, long j, long j2, ai0 ai0Var, aq8 aq8Var) {
        js3.p(w47Var, "request");
        js3.p(protocol, "protocol");
        js3.p(str, "message");
        js3.p(j77Var, "body");
        js3.p(aq8Var, "trailersSource");
        this.a = w47Var;
        this.b = protocol;
        this.c = str;
        this.d = i;
        this.e = ww2Var;
        this.f = by2Var;
        this.g = j77Var;
        this.h = c18Var;
        this.i = g77Var;
        this.j = g77Var2;
        this.k = g77Var3;
        this.l = j;
        this.m = j2;
        this.n = ai0Var;
        this.o = aq8Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.q = z;
    }

    public final jk0 b() {
        jk0 jk0Var = this.p;
        if (jk0Var != null) {
            return jk0Var;
        }
        int i = jk0.n;
        jk0 jk0VarU = wn5.U(this.f);
        this.p = jk0VarU;
        return jk0VarU;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final f77 d() {
        f77 f77Var = new f77();
        f77Var.c = -1;
        f77Var.g = j77.a;
        f77Var.o = aq8.n0;
        f77Var.a = this.a;
        f77Var.b = this.b;
        f77Var.c = this.d;
        f77Var.d = this.c;
        f77Var.e = this.e;
        f77Var.f = this.f.d();
        f77Var.g = this.g;
        f77Var.h = this.h;
        f77Var.i = this.i;
        f77Var.j = this.j;
        f77Var.k = this.k;
        f77Var.l = this.l;
        f77Var.m = this.m;
        f77Var.n = this.n;
        f77Var.o = this.o;
        return f77Var;
    }

    public final i77 g(long j) throws EOFException {
        j77 j77Var = this.g;
        tv6 tv6VarPeek = j77Var.d1().peek();
        gh0 gh0Var = new gh0();
        tv6VarPeek.request(j);
        long jMin = Math.min(j, tv6VarPeek.b.b);
        while (jMin > 0) {
            long jF0 = tv6VarPeek.f0(gh0Var, jMin);
            if (jF0 == -1) {
                throw new EOFException();
            }
            jMin -= jF0;
        }
        i77 i77Var = j77.a;
        return new i77(j77Var.g(), gh0Var.b, gh0Var);
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
