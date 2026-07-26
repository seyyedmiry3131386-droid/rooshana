package defpackage;

import coil3.decode.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class ib8 implements ti3 {
    public final wh3 a;
    public final pi3 b;
    public final DataSource c;
    public final ht4 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public ib8(wh3 wh3Var, pi3 pi3Var, DataSource dataSource, ht4 ht4Var, String str, boolean z, boolean z2) {
        this.a = wh3Var;
        this.b = pi3Var;
        this.c = dataSource;
        this.d = ht4Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.ti3
    public final pi3 a() {
        return this.b;
    }

    @Override // defpackage.ti3
    public final wh3 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib8)) {
            return false;
        }
        ib8 ib8Var = (ib8) obj;
        return js3.i(this.a, ib8Var.a) && js3.i(this.b, ib8Var.b) && this.c == ib8Var.c && js3.i(this.d, ib8Var.d) && js3.i(this.e, ib8Var.e) && this.f == ib8Var.f && this.g == ib8Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        ht4 ht4Var = this.d;
        int iHashCode2 = (iHashCode + (ht4Var == null ? 0 : ht4Var.hashCode())) * 31;
        String str = this.e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return bl4.A(sb, this.g, ')');
    }
}
