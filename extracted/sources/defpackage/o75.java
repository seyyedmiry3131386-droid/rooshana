package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o75 {
    public final String a;

    public o75(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o75) && js3.i(this.a, ((o75) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return o40.y("MovieSummaryTitle(title=", this.a, ")");
    }
}
