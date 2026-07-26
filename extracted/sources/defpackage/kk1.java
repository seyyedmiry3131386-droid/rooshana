package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class kk1 {
    public static final jk1 Companion = new jk1();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ kk1(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, ik1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return js3.i(this.a, kk1Var.a) && js3.i(this.b, kk1Var.b) && js3.i(this.c, kk1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw1.s(rm7.t("DetailStreamerDto(title=", this.a, ", avatarUrl=", this.b, ", streamerKey="), this.c, ")");
    }
}
