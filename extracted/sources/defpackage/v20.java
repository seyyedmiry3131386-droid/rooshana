package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public final long a;
    public final d30 b;
    public final l20 c;

    public v20(long j, d30 d30Var, l20 l20Var) {
        this.a = j;
        this.b = d30Var;
        this.c = l20Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v20) {
            v20 v20Var = (v20) obj;
            if (this.a == v20Var.a && this.b.equals(v20Var.b) && this.c.equals(v20Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
