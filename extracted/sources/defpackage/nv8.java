package defpackage;

import ir.mservices.market.app.home.data.HomeDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX INFO: loaded from: classes.dex */
public final class nv8 {
    public final ph2 a;
    public final fj2 b;
    public final int c;
    public final int d;
    public final Object e;

    public nv8(ph2 ph2Var, fj2 fj2Var, int i, int i2, Object obj) {
        this.a = ph2Var;
        this.b = fj2Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv8)) {
            return false;
        }
        nv8 nv8Var = (nv8) obj;
        return js3.i(this.a, nv8Var.a) && js3.i(this.b, nv8Var.b) && this.c == nv8Var.c && this.d == nv8Var.d && js3.i(this.e, nv8Var.e);
    }

    public final int hashCode() {
        ph2 ph2Var = this.a;
        int iHashCode = (((((((ph2Var == null ? 0 : ph2Var.hashCode()) * 31) + this.b.a) * 31) + this.c) * 31) + this.d) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = ApplicationStateDto.STATE_NONE;
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = HomeDto.MAIN;
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
