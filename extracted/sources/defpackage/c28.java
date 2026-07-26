package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c28 implements hl {
    public final bi8 a;
    public final long b;
    public final fj2 c;
    public final si2 d;
    public final cj2 e;
    public final ph2 f;
    public final String g;
    public final long h;
    public final ba0 i;
    public final ci8 j;
    public final wc4 k;
    public final long l;
    public final qg8 m;
    public final ur7 n;
    public final aa6 o;
    public final iv1 p;

    public c28(long j, long j2, fj2 fj2Var, si2 si2Var, cj2 cj2Var, ph2 ph2Var, String str, long j3, ba0 ba0Var, ci8 ci8Var, wc4 wc4Var, long j4, qg8 qg8Var, ur7 ur7Var, aa6 aa6Var) {
        this(j != 16 ? new rv0(j) : ai8.a, j2, fj2Var, si2Var, cj2Var, ph2Var, str, j3, ba0Var, ci8Var, wc4Var, j4, qg8Var, ur7Var, aa6Var, null);
    }

    public final boolean a(c28 c28Var) {
        if (this == c28Var) {
            return true;
        }
        return jj8.a(this.b, c28Var.b) && js3.i(this.c, c28Var.c) && js3.i(this.d, c28Var.d) && js3.i(this.e, c28Var.e) && js3.i(this.f, c28Var.f) && js3.i(this.g, c28Var.g) && jj8.a(this.h, c28Var.h) && js3.i(this.i, c28Var.i) && js3.i(this.j, c28Var.j) && js3.i(this.k, c28Var.k) && zu0.c(this.l, c28Var.l) && js3.i(this.o, c28Var.o);
    }

    public final boolean b(c28 c28Var) {
        return js3.i(this.a, c28Var.a) && js3.i(this.m, c28Var.m) && js3.i(this.n, c28Var.n) && js3.i(this.p, c28Var.p);
    }

    public final c28 c(c28 c28Var) {
        if (c28Var == null) {
            return this;
        }
        bi8 bi8Var = c28Var.a;
        return d28.a(this, bi8Var.b(), bi8Var.e(), bi8Var.a(), c28Var.b, c28Var.c, c28Var.d, c28Var.e, c28Var.f, c28Var.g, c28Var.h, c28Var.i, c28Var.j, c28Var.k, c28Var.l, c28Var.m, c28Var.n, c28Var.o, c28Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c28)) {
            return false;
        }
        c28 c28Var = (c28) obj;
        return a(c28Var) && b(c28Var);
    }

    public final int hashCode() {
        bi8 bi8Var = this.a;
        long jB = bi8Var.b();
        int i = zu0.i;
        int iA = tw8.a(jB) * 31;
        ch0 ch0VarE = bi8Var.e();
        int iD = (jj8.d(this.b) + ((Float.floatToIntBits(bi8Var.a()) + ((iA + (ch0VarE != null ? ch0VarE.hashCode() : 0)) * 31)) * 31)) * 31;
        fj2 fj2Var = this.c;
        int i2 = (iD + (fj2Var != null ? fj2Var.a : 0)) * 31;
        si2 si2Var = this.d;
        int i3 = (i2 + (si2Var != null ? si2Var.a : 0)) * 31;
        cj2 cj2Var = this.e;
        int i4 = (i3 + (cj2Var != null ? cj2Var.a : 0)) * 31;
        ph2 ph2Var = this.f;
        int iHashCode = (i4 + (ph2Var != null ? ph2Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iD2 = (jj8.d(this.h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ba0 ba0Var = this.i;
        int iFloatToIntBits = (iD2 + (ba0Var != null ? Float.floatToIntBits(ba0Var.a) : 0)) * 31;
        ci8 ci8Var = this.j;
        int iHashCode2 = (iFloatToIntBits + (ci8Var != null ? ci8Var.hashCode() : 0)) * 31;
        wc4 wc4Var = this.k;
        int iD3 = t61.d((iHashCode2 + (wc4Var != null ? wc4Var.a.hashCode() : 0)) * 31, 31, this.l);
        qg8 qg8Var = this.m;
        int i5 = (iD3 + (qg8Var != null ? qg8Var.a : 0)) * 31;
        ur7 ur7Var = this.n;
        int iHashCode3 = (i5 + (ur7Var != null ? ur7Var.hashCode() : 0)) * 31;
        aa6 aa6Var = this.o;
        int iHashCode4 = (iHashCode3 + (aa6Var != null ? aa6Var.hashCode() : 0)) * 31;
        iv1 iv1Var = this.p;
        return iHashCode4 + (iv1Var != null ? iv1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        bi8 bi8Var = this.a;
        sb.append((Object) zu0.i(bi8Var.b()));
        sb.append(", brush=");
        sb.append(bi8Var.e());
        sb.append(", alpha=");
        sb.append(bi8Var.a());
        sb.append(", fontSize=");
        sb.append((Object) jj8.e(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) jj8.e(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        bl4.F(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public c28(bi8 bi8Var, long j, fj2 fj2Var, si2 si2Var, cj2 cj2Var, ph2 ph2Var, String str, long j2, ba0 ba0Var, ci8 ci8Var, wc4 wc4Var, long j3, qg8 qg8Var, ur7 ur7Var, aa6 aa6Var, iv1 iv1Var) {
        this.a = bi8Var;
        this.b = j;
        this.c = fj2Var;
        this.d = si2Var;
        this.e = cj2Var;
        this.f = ph2Var;
        this.g = str;
        this.h = j2;
        this.i = ba0Var;
        this.j = ci8Var;
        this.k = wc4Var;
        this.l = j3;
        this.m = qg8Var;
        this.n = ur7Var;
        this.o = aa6Var;
        this.p = iv1Var;
    }

    public c28(long j, long j2, fj2 fj2Var, si2 si2Var, cj2 cj2Var, ph2 ph2Var, String str, long j3, ba0 ba0Var, ci8 ci8Var, wc4 wc4Var, long j4, qg8 qg8Var, ur7 ur7Var, int i) {
        this((i & 1) != 0 ? zu0.h : j, (i & 2) != 0 ? jj8.c : j2, (i & 4) != 0 ? null : fj2Var, (i & 8) != 0 ? null : si2Var, (i & 16) != 0 ? null : cj2Var, (i & 32) != 0 ? null : ph2Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jj8.c : j3, (i & 256) != 0 ? null : ba0Var, (i & 512) != 0 ? null : ci8Var, (i & 1024) != 0 ? null : wc4Var, (i & 2048) != 0 ? zu0.h : j4, (i & 4096) != 0 ? null : qg8Var, (i & 8192) != 0 ? null : ur7Var, (aa6) null);
    }
}
