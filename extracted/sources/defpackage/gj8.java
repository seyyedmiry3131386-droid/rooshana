package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gj8 {
    public static final gj8 d = new gj8(0, 0, null, null, 0, 0, 0, 16777215);
    public final c28 a;
    public final p16 b;
    public final da6 c;

    public gj8(c28 c28Var, p16 p16Var, da6 da6Var) {
        this.a = c28Var;
        this.b = p16Var;
        this.c = da6Var;
    }

    public static gj8 a(gj8 gj8Var, long j, long j2, fj2 fj2Var, ph2 ph2Var, long j3, long j4, da6 da6Var, z64 z64Var, int i) {
        long jB = (i & 1) != 0 ? gj8Var.a.a.b() : j;
        long j5 = (i & 2) != 0 ? gj8Var.a.b : j2;
        fj2 fj2Var2 = (i & 4) != 0 ? gj8Var.a.c : fj2Var;
        c28 c28Var = gj8Var.a;
        si2 si2Var = c28Var.d;
        cj2 cj2Var = c28Var.e;
        ph2 ph2Var2 = (i & 32) != 0 ? c28Var.f : ph2Var;
        String str = c28Var.g;
        long j6 = (i & 128) != 0 ? c28Var.h : j3;
        ba0 ba0Var = c28Var.i;
        ci8 ci8Var = c28Var.j;
        wc4 wc4Var = c28Var.k;
        long j7 = c28Var.l;
        qg8 qg8Var = c28Var.m;
        ur7 ur7Var = c28Var.n;
        iv1 iv1Var = c28Var.p;
        p16 p16Var = gj8Var.b;
        int i2 = p16Var.a;
        int i3 = p16Var.b;
        long j8 = (i & 131072) != 0 ? p16Var.c : j4;
        di8 di8Var = p16Var.d;
        da6 da6Var2 = (i & 524288) != 0 ? gj8Var.c : da6Var;
        return new gj8(new c28(zu0.c(jB, c28Var.a.b()) ? c28Var.a : jB != 16 ? new rv0(jB) : ai8.a, j5, fj2Var2, si2Var, cj2Var, ph2Var2, str, j6, ba0Var, ci8Var, wc4Var, j7, qg8Var, ur7Var, da6Var2 != null ? da6Var2.a : null, iv1Var), new p16(i2, i3, j8, di8Var, da6Var2 != null ? da6Var2.b : null, (i & 1048576) != 0 ? p16Var.f : z64Var, p16Var.g, p16Var.h, p16Var.i), da6Var2);
    }

    public static gj8 e(gj8 gj8Var, long j, long j2, fj2 fj2Var, si2 si2Var, ph2 ph2Var, long j3, qg8 qg8Var, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? jj8.c : j2;
        fj2 fj2Var2 = (i2 & 4) != 0 ? null : fj2Var;
        si2 si2Var2 = (i2 & 8) != 0 ? null : si2Var;
        ph2 ph2Var2 = (i2 & 32) != 0 ? null : ph2Var;
        long j6 = (i2 & 128) != 0 ? jj8.c : j3;
        long j7 = zu0.h;
        qg8 qg8Var2 = (i2 & 4096) != 0 ? null : qg8Var;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? jj8.c : j4;
        c28 c28VarA = d28.a(gj8Var.a, j, null, Float.NaN, j5, fj2Var2, si2Var2, null, ph2Var2, null, j6, null, null, null, j7, qg8Var2, null, null, null);
        p16 p16VarA = q16.a(gj8Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (gj8Var.a == c28VarA && gj8Var.b == p16VarA) ? gj8Var : new gj8(c28VarA, p16VarA);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(gj8 gj8Var) {
        if (this != gj8Var) {
            return js3.i(this.b, gj8Var.b) && this.a.a(gj8Var.a);
        }
        return true;
    }

    public final gj8 d(gj8 gj8Var) {
        return (gj8Var == null || gj8Var.equals(d)) ? this : new gj8(this.a.c(gj8Var.a), this.b.a(gj8Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj8)) {
            return false;
        }
        gj8 gj8Var = (gj8) obj;
        return js3.i(this.a, gj8Var.a) && js3.i(this.b, gj8Var.b) && js3.i(this.c, gj8Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        da6 da6Var = this.c;
        return iHashCode + (da6Var != null ? da6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) zu0.i(b()));
        sb.append(", brush=");
        c28 c28Var = this.a;
        sb.append(c28Var.a.e());
        sb.append(", alpha=");
        sb.append(c28Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) jj8.e(c28Var.b));
        sb.append(", fontWeight=");
        sb.append(c28Var.c);
        sb.append(", fontStyle=");
        sb.append(c28Var.d);
        sb.append(", fontSynthesis=");
        sb.append(c28Var.e);
        sb.append(", fontFamily=");
        sb.append(c28Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(c28Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) jj8.e(c28Var.h));
        sb.append(", baselineShift=");
        sb.append(c28Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(c28Var.j);
        sb.append(", localeList=");
        sb.append(c28Var.k);
        sb.append(", background=");
        bl4.F(c28Var.l, ", textDecoration=", sb);
        sb.append(c28Var.m);
        sb.append(", shadow=");
        sb.append(c28Var.n);
        sb.append(", drawStyle=");
        sb.append(c28Var.p);
        sb.append(", textAlign=");
        p16 p16Var = this.b;
        sb.append((Object) of8.a(p16Var.a));
        sb.append(", textDirection=");
        sb.append((Object) ug8.a(p16Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) jj8.e(p16Var.c));
        sb.append(", textIndent=");
        sb.append(p16Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(p16Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) u64.a(p16Var.g));
        sb.append(", hyphens=");
        sb.append((Object) af3.a(p16Var.h));
        sb.append(", textMotion=");
        sb.append(p16Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gj8(c28 c28Var, p16 p16Var) {
        aa6 aa6Var = c28Var.o;
        w96 w96Var = p16Var.e;
        this(c28Var, p16Var, (aa6Var == null && w96Var == null) ? null : new da6(aa6Var, w96Var));
    }

    public gj8(long j, long j2, fj2 fj2Var, sh2 sh2Var, long j3, int i, long j4, int i2) {
        this(new c28((i2 & 1) != 0 ? zu0.h : j, (i2 & 2) != 0 ? jj8.c : j2, (i2 & 4) != 0 ? null : fj2Var, (si2) null, (cj2) null, (i2 & 32) != 0 ? null : sh2Var, (String) null, (i2 & 128) != 0 ? jj8.c : j3, (ba0) null, (ci8) null, (wc4) null, zu0.h, (qg8) null, (ur7) null, (aa6) null), new p16((32768 & i2) != 0 ? 0 : i, (65536 & i2) == 0 ? 5 : 0, (i2 & 131072) != 0 ? jj8.c : j4, null, null, null, 0, 0, null), null);
    }
}
