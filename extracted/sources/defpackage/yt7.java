package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class yt7 {
    public static final wt7 Companion = new wt7();
    public final String a;
    public final String b;

    public /* synthetic */ yt7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, ut7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt7)) {
            return false;
        }
        yt7 yt7Var = (yt7) obj;
        return js3.i(this.a, yt7Var.a) && js3.i(this.b, yt7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("ShareModelDto(url=", this.a, ", title=", this.b, ")");
    }
}
