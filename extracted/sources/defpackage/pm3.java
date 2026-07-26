package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pm3 {
    public final int a;
    public final Object b;

    public pm3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm3)) {
            return false;
        }
        pm3 pm3Var = (pm3) obj;
        return this.a == pm3Var.a && js3.i(this.b, pm3Var.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Object obj = this.b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
