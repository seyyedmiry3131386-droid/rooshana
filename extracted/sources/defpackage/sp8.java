package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sp8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public sp8(String str, String str2, String str3, String str4) {
        js3.p(str, "trailerUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sp8) {
            return js3.i(this.a, ((sp8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dw1.p(this.c, ", title=", this.d, ")", rm7.t("Trailer(trailerUrl=", this.a, ", thumbnailUrl=", this.b, ", miniThumbnailUrl="));
    }
}
