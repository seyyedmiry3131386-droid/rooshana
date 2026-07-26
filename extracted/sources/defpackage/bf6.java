package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bf6 implements kj5 {
    public final String a;
    public final pj3 b;

    public bf6(pj3 pj3Var, String str) {
        js3.p(str, "title");
        js3.p(pj3Var, "items");
        this.a = str;
        this.b = pj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf6)) {
            return false;
        }
        bf6 bf6Var = (bf6) obj;
        return js3.i(this.a, bf6Var.a) && js3.i(this.b, bf6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SingleSelectionBottomSheetNavKey(title=" + this.a + ", items=" + this.b + ")";
    }
}
