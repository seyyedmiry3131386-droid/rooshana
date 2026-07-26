package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class vp8 {
    public static final up8 Companion = new up8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ vp8(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, tp8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp8)) {
            return false;
        }
        vp8 vp8Var = (vp8) obj;
        return js3.i(this.a, vp8Var.a) && js3.i(this.b, vp8Var.b) && js3.i(this.c, vp8Var.c) && js3.i(this.d, vp8Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return dw1.p(this.c, ", title=", this.d, ")", rm7.t("TrailerDto(trailerUrl=", this.a, ", thumbnailUrl=", this.b, ", miniThumbnailUrl="));
    }
}
