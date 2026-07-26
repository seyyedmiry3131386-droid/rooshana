package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j40 extends ik5 {
    public final Object a;
    public final long b;

    public j40(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return js3.i(this.a, j40Var.a) && this.b == j40Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.a + ", compositeKey=" + this.b + ')';
    }
}
