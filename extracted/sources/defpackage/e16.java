package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e16 {
    public final List a;
    public final Integer b;
    public final rz5 c;
    public final int d;

    public e16(List list, Integer num, rz5 rz5Var, int i) {
        js3.p(list, "pages");
        this.a = list;
        this.b = num;
        this.c = rz5Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e16)) {
            return false;
        }
        e16 e16Var = (e16) obj;
        return js3.i(this.a, e16Var.a) && js3.i(this.b, e16Var.b) && js3.i(this.c, e16Var.c) && this.d == e16Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Integer num = this.b;
        return this.c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return dw1.q(sb, this.d, ')');
    }
}
