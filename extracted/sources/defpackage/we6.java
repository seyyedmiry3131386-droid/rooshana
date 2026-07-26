package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class we6 implements kj5 {
    public final String a;
    public final String b;
    public final String c;

    public we6(String str, String str2, String str3) {
        js3.p(str, "currentEpisodePlayId");
        js3.p(str2, "selectedSeasonId");
        js3.p(str3, "movieId");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we6)) {
            return false;
        }
        we6 we6Var = (we6) obj;
        return js3.i(this.a, we6Var.a) && js3.i(this.b, we6Var.b) && js3.i(this.c, we6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw1.s(rm7.t("OtherEpisodeBottomSheetNavKey(currentEpisodePlayId=", this.a, ", selectedSeasonId=", this.b, ", movieId="), this.c, ")");
    }

    public /* synthetic */ we6(String str, String str2) {
        this(str, "", str2);
    }
}
