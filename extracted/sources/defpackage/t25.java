package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t25 extends u25 {
    public final int a;
    public final Integer b;

    public t25(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t25)) {
            return false;
        }
        t25 t25Var = (t25) obj;
        return this.a == t25Var.a && js3.i(this.b, t25Var.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Waiting(messageRes=" + this.a + ", progressPercentage=" + this.b + ")";
    }
}
