package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e06 extends hs9 {
    public final int s;
    public final int t;
    public final int u;

    public e06(int i, int i2, int i3) {
        super(26);
        this.s = i;
        this.t = i2;
        this.u = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e06)) {
            return false;
        }
        e06 e06Var = (e06) obj;
        return this.s == e06Var.s && this.t == e06Var.t && this.u == e06Var.u;
    }

    public final int hashCode() {
        return this.s + this.t + this.u;
    }

    @Override // defpackage.hs9
    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i = this.s;
        o40.J(sb, i, " items (\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
        sb.append(this.t);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.u);
        sb.append("\n                    |)\n                    |");
        return g88.P(sb.toString());
    }
}
