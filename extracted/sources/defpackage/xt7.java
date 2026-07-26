package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class xt7 {
    public static final vt7 Companion = new vt7();
    public final String a;
    public final String b;

    public /* synthetic */ xt7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, tt7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt7)) {
            return false;
        }
        xt7 xt7Var = (xt7) obj;
        return js3.i(this.a, xt7Var.a) && js3.i(this.b, xt7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("ShareModelDto(url=", this.a, ", title=", this.b, ")");
    }
}
