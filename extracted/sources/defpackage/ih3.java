package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ih3 extends kf0 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final bp2 e;

    public ih3(int i, String str, String str2, bp2 bp2Var, int i2) {
        str2 = (i2 & 4) != 0 ? "" : str2;
        boolean zN0 = (i2 & 8) != 0 ? true ^ f88.n0(str2) : true;
        js3.p(str, "title");
        js3.p(str2, "label");
        js3.p(bp2Var, "onClick");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = zN0;
        this.e = bp2Var;
    }

    @Override // defpackage.kf0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih3)) {
            return false;
        }
        ih3 ih3Var = (ih3) obj;
        return this.a == ih3Var.a && js3.i(this.b, ih3Var.b) && js3.i(this.c, ih3Var.c) && this.d == ih3Var.d && js3.i(this.e, ih3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((rm7.k(this.c, rm7.k(this.b, this.a * 31, 31), 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "IconBottomSheetItemData(icon=" + this.a + ", title=" + this.b + ", label=" + this.c + ", showArrow=" + this.d + ", onClick=" + this.e + ")";
    }
}
