package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q48 implements sk {
    public final sk a;
    public final long b;

    public q48(sc2 sc2Var, long j) {
        this.a = sc2Var;
        this.b = j;
    }

    @Override // defpackage.sk
    public final x39 a(mt8 mt8Var) {
        return new r48(this.a.a(mt8Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q48)) {
            return false;
        }
        q48 q48Var = (q48) obj;
        return q48Var.b == this.b && js3.i(q48Var.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
