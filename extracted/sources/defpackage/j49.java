package defpackage;

import java.math.BigInteger;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class j49 implements Comparable {
    public static final j49 f;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final c24 e = a.a(new yu7(10, this));

    static {
        new j49("", 0, 0, 0);
        f = new j49("", 0, 1, 0);
        new j49("", 1, 0, 0);
    }

    public j49(String str, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j49 j49Var = (j49) obj;
        js3.p(j49Var, "other");
        Object value = this.e.getValue();
        js3.o(value, "getValue(...)");
        Object value2 = j49Var.e.getValue();
        js3.o(value2, "getValue(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j49)) {
            return false;
        }
        j49 j49Var = (j49) obj;
        return this.a == j49Var.a && this.b == j49Var.b && this.c == j49Var.c;
    }

    public final int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String str = this.d;
        String strN = !f88.n0(str) ? dw1.n("-", str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        return dw1.k(this.c, strN, sb);
    }
}
