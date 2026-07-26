package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l85 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;

    public l85(long j, long j2, long j3, String str, String str2) {
        js3.p(str, "playId");
        js3.p(str2, "movieId");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l85)) {
            return false;
        }
        l85 l85Var = (l85) obj;
        return js3.i(this.a, l85Var.a) && js3.i(this.b, l85Var.b) && this.c == l85Var.c && this.d == l85Var.d && this.e == l85Var.e;
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        long j = this.c;
        int i = (iK + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        long j3 = this.e;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieWatchProgressEntity(playId=", this.a, ", movieId=", this.b, ", watchedTime=");
        sbT.append(this.c);
        sbT.append(", movieTotalTime=");
        sbT.append(this.d);
        sbT.append(", timestamp=");
        return bl4.s(this.e, ")", sbT);
    }
}
