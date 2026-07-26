package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 {
    public final Integer a;
    public final m8 b;

    public i8(Integer num, m8 m8Var) {
        this.a = num;
        this.b = m8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return js3.i(this.a, i8Var.a) && js3.i(this.b, i8Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "AdAppInfo(collapseDelay=" + this.a + ", application=" + this.b + ")";
    }
}
