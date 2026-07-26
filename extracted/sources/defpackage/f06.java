package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class f06 extends hs9 {
    public final ArrayList s;
    public final int t;
    public final int u;

    public f06(ArrayList arrayList, int i, int i2) {
        super(26);
        this.s = arrayList;
        this.t = i;
        this.u = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f06)) {
            return false;
        }
        f06 f06Var = (f06) obj;
        return this.s.equals(f06Var.s) && this.t == f06Var.t && this.u == f06Var.u;
    }

    public final int hashCode() {
        return this.s.hashCode() + this.t + this.u;
    }

    @Override // defpackage.hs9
    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        ArrayList arrayList = this.s;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(a.p0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(a.v0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.t);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.u);
        sb.append("\n                    |)\n                    |");
        return g88.P(sb.toString());
    }
}
