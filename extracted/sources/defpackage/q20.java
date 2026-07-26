package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q20 {
    public final String a;
    public final String b;

    public q20(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q20) {
            q20 q20Var = (q20) obj;
            if (this.a.equals(q20Var.a) && this.b.equals(q20Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return dw1.s(sb, this.b, "}");
    }
}
