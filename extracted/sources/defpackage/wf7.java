package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wf7 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public wf7(int i, int i2, String str, String str2, String str3) {
        js3.p(str2, "thumbnailUrl");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wf7) {
            return js3.i(this.d, ((wf7) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sbB = bl4.B(this.a, this.b, "Screenshot(width=", ", height=", ", mainUrl=");
        o40.I(this.c, ", thumbnailUrl=", this.d, ", miniThumbnailUrl=", sbB);
        return dw1.s(sbB, this.e, ")");
    }
}
