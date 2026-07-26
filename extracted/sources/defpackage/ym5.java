package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym5 {
    public final int a;
    public final long b;
    public final long c;
    public final rm5 d;
    public final b28 e;
    public final Object f;

    public ym5(int i, long j, long j2, rm5 rm5Var, b28 b28Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = rm5Var;
        this.e = b28Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5)) {
            return false;
        }
        ym5 ym5Var = (ym5) obj;
        return this.a == ym5Var.a && this.b == ym5Var.b && this.c == ym5Var.c && js3.i(this.d, ym5Var.d) && js3.i(this.e, ym5Var.e) && js3.i(this.f, ym5Var.f);
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iHashCode = (this.d.a.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        b28 b28Var = this.e;
        int iHashCode2 = (iHashCode + (b28Var == null ? 0 : b28Var.a.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ')';
    }
}
