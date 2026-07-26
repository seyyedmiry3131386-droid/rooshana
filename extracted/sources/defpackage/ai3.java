package defpackage;

import coil3.decode.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class ai3 implements ta2 {
    public final wh3 a;
    public final boolean b;
    public final DataSource c;

    public ai3(wh3 wh3Var, boolean z, DataSource dataSource) {
        this.a = wh3Var;
        this.b = z;
        this.c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai3)) {
            return false;
        }
        ai3 ai3Var = (ai3) obj;
        return js3.i(this.a, ai3Var.a) && this.b == ai3Var.b && this.c == ai3Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ')';
    }
}
