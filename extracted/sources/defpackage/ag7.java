package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ag7 {
    public static final zf7 Companion = new zf7();
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ ag7(int i, int i2, int i3, String str, String str2, String str3) {
        if (31 != (i & 31)) {
            wq2.S(i, 31, yf7.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag7)) {
            return false;
        }
        ag7 ag7Var = (ag7) obj;
        return this.a == ag7Var.a && this.b == ag7Var.b && js3.i(this.c, ag7Var.c) && js3.i(this.d, ag7Var.d) && js3.i(this.e, ag7Var.e);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int iK = rm7.k(this.d, (i + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        return iK + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = bl4.B(this.a, this.b, "ScreenshotDto(width=", ", height=", ", mainUrl=");
        o40.I(this.c, ", thumbnailUrl=", this.d, ", miniThumbnailUrl=", sbB);
        return dw1.s(sbB, this.e, ")");
    }
}
