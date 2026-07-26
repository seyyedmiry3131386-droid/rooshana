package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ar5 {
    public final int a;
    public final Integer b;

    public ar5(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar5)) {
            return false;
        }
        ar5 ar5Var = (ar5) obj;
        return this.a == ar5Var.a && js3.i(this.b, ar5Var.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
