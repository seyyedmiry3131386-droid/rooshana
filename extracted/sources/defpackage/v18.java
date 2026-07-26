package defpackage;

import coil3.decode.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class v18 implements ta2 {
    public final ui3 a;
    public final String b;
    public final DataSource c;

    public v18(ui3 ui3Var, String str, DataSource dataSource) {
        this.a = ui3Var;
        this.b = str;
        this.c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v18)) {
            return false;
        }
        v18 v18Var = (v18) obj;
        return js3.i(this.a, v18Var.a) && js3.i(this.b, v18Var.b) && this.c == v18Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ')';
    }
}
