package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vl0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;

    public vl0(int i, String str, String str2, int i2, long j) {
        js3.p(str, "url");
        js3.p(str2, "type");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl0)) {
            return false;
        }
        vl0 vl0Var = (vl0) obj;
        return this.a == vl0Var.a && js3.i(this.b, vl0Var.b) && js3.i(this.c, vl0Var.c) && this.d == vl0Var.d && this.e == vl0Var.e;
    }

    public final int hashCode() {
        int iK = (rm7.k(this.c, rm7.k(this.b, this.a * 31, 31), 31) + this.d) * 31;
        long j = this.e;
        return iK + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackUrlEntity(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", retryCount=");
        sb.append(this.d);
        sb.append(", timestamp=");
        return bl4.s(this.e, ")", sb);
    }
}
