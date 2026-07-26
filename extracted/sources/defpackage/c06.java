package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class c06 extends hs9 {
    public final int s;
    public final ArrayList t;
    public final int u;
    public final int v;

    public c06(int i, int i2, int i3, ArrayList arrayList) {
        super(26);
        this.s = i;
        this.t = arrayList;
        this.u = i2;
        this.v = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c06)) {
            return false;
        }
        c06 c06Var = (c06) obj;
        return this.s == c06Var.s && this.t.equals(c06Var.t) && this.u == c06Var.u && this.v == c06Var.v;
    }

    public final int hashCode() {
        return this.t.hashCode() + this.s + this.u + this.v;
    }

    @Override // defpackage.hs9
    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        ArrayList arrayList = this.t;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.s);
        sb.append("\n                    |   first item: ");
        sb.append(a.p0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(a.v0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.u);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.v);
        sb.append("\n                    |)\n                    |");
        return g88.P(sb.toString());
    }
}
