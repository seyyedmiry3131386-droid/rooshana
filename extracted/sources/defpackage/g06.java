package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g06 extends hs9 {
    public final iz5 s;
    public final g96 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g06(iz5 iz5Var, g96 g96Var) {
        super(26);
        js3.p(g96Var, "previousList");
        this.s = iz5Var;
        this.t = g96Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g06)) {
            return false;
        }
        iz5 iz5Var = this.s;
        int i = iz5Var.c;
        g06 g06Var = (g06) obj;
        g96 g96Var = g06Var.t;
        iz5 iz5Var2 = g06Var.s;
        if (i != iz5Var2.c || iz5Var.d != iz5Var2.d || iz5Var.d() != iz5Var2.d() || iz5Var.b != iz5Var2.b) {
            return false;
        }
        g96 g96Var2 = this.t;
        if (((iz5) g96Var2).c != ((iz5) g96Var).c) {
            return false;
        }
        iz5 iz5Var3 = (iz5) g96Var2;
        iz5 iz5Var4 = (iz5) g96Var;
        return iz5Var3.d == iz5Var4.d && iz5Var3.d() == iz5Var4.d() && iz5Var3.b == iz5Var4.b;
    }

    public final int hashCode() {
        return this.t.hashCode() + this.s.hashCode();
    }

    @Override // defpackage.hs9
    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        iz5 iz5Var = this.s;
        sb.append(iz5Var.c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(iz5Var.d);
        sb.append("\n                    |       size: ");
        sb.append(iz5Var.d());
        sb.append("\n                    |       dataCount: ");
        sb.append(iz5Var.b);
        sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        g96 g96Var = this.t;
        sb.append(((iz5) g96Var).c);
        sb.append("\n                    |       placeholdersAfter: ");
        iz5 iz5Var2 = (iz5) g96Var;
        sb.append(iz5Var2.d);
        sb.append("\n                    |       size: ");
        sb.append(iz5Var2.d());
        sb.append("\n                    |       dataCount: ");
        sb.append(iz5Var2.b);
        sb.append("\n                    |   )\n                    |");
        return g88.P(sb.toString());
    }
}
