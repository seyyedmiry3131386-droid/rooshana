package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku3 {
    public final Integer a;
    public final Object b;

    public ku3(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku3)) {
            return false;
        }
        ku3 ku3Var = (ku3) obj;
        return this.a.equals(ku3Var.a) && js3.i(this.b, ku3Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
