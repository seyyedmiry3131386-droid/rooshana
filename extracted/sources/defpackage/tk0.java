package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk0 {
    public final qi8 a;

    public tk0(qi8 qi8Var) {
        this.a = qi8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk0)) {
            return false;
        }
        qi8 qi8Var = this.a;
        ll llVar = qi8Var.a;
        qi8 qi8Var2 = ((tk0) obj).a;
        return js3.i(llVar, qi8Var2.a) && qi8Var.b.c(qi8Var2.b) && js3.i(qi8Var.c, qi8Var2.c) && qi8Var.d == qi8Var2.d && qi8Var.e == qi8Var2.e && qi8Var.f == qi8Var2.f && js3.i(qi8Var.g, qi8Var2.g) && qi8Var.h == qi8Var2.h && qi8Var.i == qi8Var2.i && h31.b(qi8Var.j, qi8Var2.j);
    }

    public final int hashCode() {
        qi8 qi8Var = this.a;
        int iHashCode = qi8Var.a.hashCode() * 31;
        gj8 gj8Var = qi8Var.b;
        c28 c28Var = gj8Var.a;
        int iD = jj8.d(c28Var.b) * 31;
        fj2 fj2Var = c28Var.c;
        int i = (iD + (fj2Var != null ? fj2Var.a : 0)) * 31;
        si2 si2Var = c28Var.d;
        int i2 = (i + (si2Var != null ? si2Var.a : 0)) * 31;
        cj2 cj2Var = c28Var.e;
        int i3 = (i2 + (cj2Var != null ? cj2Var.a : 0)) * 31;
        ph2 ph2Var = c28Var.f;
        int iHashCode2 = (i3 + (ph2Var != null ? ph2Var.hashCode() : 0)) * 31;
        String str = c28Var.g;
        int iD2 = (jj8.d(c28Var.h) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ba0 ba0Var = c28Var.i;
        int iFloatToIntBits = (iD2 + (ba0Var != null ? Float.floatToIntBits(ba0Var.a) : 0)) * 31;
        ci8 ci8Var = c28Var.j;
        int iHashCode3 = (iFloatToIntBits + (ci8Var != null ? ci8Var.hashCode() : 0)) * 31;
        wc4 wc4Var = c28Var.k;
        int iHashCode4 = (iHashCode3 + (wc4Var != null ? wc4Var.a.hashCode() : 0)) * 31;
        long j = c28Var.l;
        int i4 = zu0.i;
        int iD3 = t61.d(iHashCode4, 31, j);
        aa6 aa6Var = c28Var.o;
        int iHashCode5 = (gj8Var.b.hashCode() + ((iD3 + (aa6Var != null ? aa6Var.hashCode() : 0)) * 31)) * 31;
        da6 da6Var = gj8Var.c;
        int iHashCode6 = (qi8Var.i.hashCode() + ((qi8Var.h.hashCode() + ((qi8Var.g.hashCode() + ((((((rm7.i((iHashCode5 + (da6Var != null ? da6Var.hashCode() : 0) + iHashCode) * 31, 31, qi8Var.c) + qi8Var.d) * 31) + (qi8Var.e ? 1231 : 1237)) * 31) + qi8Var.f) * 31)) * 31)) * 31)) * 31;
        long j2 = qi8Var.j;
        return ((int) (j2 ^ (j2 >>> 32))) + iHashCode6;
    }
}
