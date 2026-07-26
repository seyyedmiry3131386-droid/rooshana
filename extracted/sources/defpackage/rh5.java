package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rh5 {
    public final boolean a;
    public final String b;

    public rh5(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh5)) {
            return false;
        }
        rh5 rh5Var = (rh5) obj;
        return this.a == rh5Var.a && js3.i(this.b, rh5Var.b);
    }

    public final int hashCode() {
        int i = (this.a ? 1231 : 1237) * 31;
        String str = this.b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NativeBackData(enabled=" + this.a + ", backCallback=" + this.b + ")";
    }
}
