package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final class kp4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final PlayerMovieData e;

    public kp4(String str, String str2, String str3, String str4, PlayerMovieData playerMovieData) {
        js3.p(str, "mediaId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = playerMovieData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp4)) {
            return false;
        }
        kp4 kp4Var = (kp4) obj;
        return js3.i(this.a, kp4Var.a) && js3.i(this.b, kp4Var.b) && js3.i(this.c, kp4Var.c) && js3.i(this.d, kp4Var.d) && js3.i(this.e, kp4Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + rm7.k(this.d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MediaItemState(mediaId=", this.a, ", title=", this.b, ", artist=");
        o40.I(this.c, ", posterUrl=", this.d, ", playerMovieData=", sbT);
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
