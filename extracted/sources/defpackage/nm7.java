package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nm7 extends kf0 {
    public final boolean a;
    public final String b;
    public final bp2 c;

    public nm7(boolean z, String str, bp2 bp2Var) {
        js3.p(str, "title");
        this.a = z;
        this.b = str;
        this.c = bp2Var;
    }

    @Override // defpackage.kf0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm7)) {
            return false;
        }
        nm7 nm7Var = (nm7) obj;
        return this.a == nm7Var.a && js3.i(this.b, nm7Var.b) && js3.i(this.c, nm7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, (this.a ? 1231 : 1237) * 31, 31);
    }

    public final String toString() {
        return "SelectableBottomSheetItemData(isSelected=" + this.a + ", title=" + this.b + ", onClick=" + this.c + ")";
    }
}
