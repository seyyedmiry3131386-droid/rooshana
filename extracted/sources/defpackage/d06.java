package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d06 extends hs9 {
    public final int s;
    public final int t;
    public final int u;
    public final int v;

    public d06(int i, int i2, int i3, int i4) {
        super(26);
        this.s = i;
        this.t = i2;
        this.u = i3;
        this.v = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d06)) {
            return false;
        }
        d06 d06Var = (d06) obj;
        return this.s == d06Var.s && this.t == d06Var.t && this.u == d06Var.u && this.v == d06Var.v;
    }

    public final int hashCode() {
        return this.s + this.t + this.u + this.v;
    }

    @Override // defpackage.hs9
    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i = this.t;
        sb.append(i);
        sb.append(" items (\n                    |   startIndex: ");
        o40.J(sb, this.s, "\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
        sb.append(this.u);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.v);
        sb.append("\n                    |)\n                    |");
        return g88.P(sb.toString());
    }
}
