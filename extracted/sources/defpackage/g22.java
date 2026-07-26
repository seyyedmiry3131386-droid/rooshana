package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g22 implements sx3 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final sx3 g;
    public final Map h;
    public final sv5 i;
    public int j;

    public g22(Object obj, sx3 sx3Var, int i, int i2, Map map, Class cls, Class cls2, sv5 sv5Var) {
        ok4.p(obj, "Argument must not be null");
        this.b = obj;
        this.g = sx3Var;
        this.c = i;
        this.d = i2;
        ok4.p(map, "Argument must not be null");
        this.h = map;
        ok4.p(cls, "Resource class must not be null");
        this.e = cls;
        ok4.p(cls2, "Transcode class must not be null");
        this.f = cls2;
        ok4.p(sv5Var, "Argument must not be null");
        this.i = sv5Var;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof g22) {
            g22 g22Var = (g22) obj;
            if (this.b.equals(g22Var.b) && this.g.equals(g22Var.g) && this.d == g22Var.d && this.c == g22Var.c && this.h.equals(g22Var.h) && this.e.equals(g22Var.e) && this.f.equals(g22Var.f) && this.i.equals(g22Var.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
