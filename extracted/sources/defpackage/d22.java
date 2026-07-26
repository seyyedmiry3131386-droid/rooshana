package defpackage;

import coil3.decode.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class d22 {
    public final wh3 a;
    public final boolean b;
    public final DataSource c;
    public final String d;

    public d22(wh3 wh3Var, boolean z, DataSource dataSource, String str) {
        this.a = wh3Var;
        this.b = z;
        this.c = dataSource;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d22)) {
            return false;
        }
        d22 d22Var = (d22) obj;
        return js3.i(this.a, d22Var.a) && this.b == d22Var.b && this.c == d22Var.c && js3.i(this.d, d22Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecuteResult(image=");
        sb.append(this.a);
        sb.append(", isSampled=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", diskCacheKey=");
        return bl4.y(sb, this.d, ')');
    }
}
