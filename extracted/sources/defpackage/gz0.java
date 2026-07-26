package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gz0 {
    public final int a;
    public final Integer b;

    public gz0(int i, j27 j27Var, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz0)) {
            return false;
        }
        gz0 gz0Var = (gz0) obj;
        return this.a == gz0Var.a && js3.i(null, null) && js3.i(this.b, gz0Var.b);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + 0) * 31;
        Integer num = this.b;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ')';
    }
}
