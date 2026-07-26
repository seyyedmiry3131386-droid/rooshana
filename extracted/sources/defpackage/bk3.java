package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bk3 {
    public final String a;
    public final boolean b;
    public final String c;

    public bk3(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk3)) {
            return false;
        }
        bk3 bk3Var = (bk3) obj;
        return js3.i(this.a, bk3Var.a) && this.b == bk3Var.b && js3.i(this.c, bk3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InActiveData(packageName=");
        sb.append(this.a);
        sb.append(", isActive=");
        sb.append(this.b);
        sb.append(", message=");
        return dw1.s(sb, this.c, ")");
    }
}
