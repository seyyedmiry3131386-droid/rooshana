package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ha1 implements sx3 {
    public final sx3 b;
    public final sx3 c;

    public ha1(sx3 sx3Var, sx3 sx3Var2) {
        this.b = sx3Var;
        this.c = sx3Var2;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof ha1) {
            ha1 ha1Var = (ha1) obj;
            if (this.b.equals(ha1Var.b) && this.c.equals(ha1Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
