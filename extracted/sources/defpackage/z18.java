package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z18 implements f01, Iterable, dx3 {
    public final cz7 a;
    public final int b;
    public final i37 c;

    public z18(cz7 cz7Var, int i, qv2 qv2Var, i37 i37Var) {
        this.a = cz7Var;
        this.b = i;
        this.c = i37Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z18)) {
            return false;
        }
        z18 z18Var = (z18) obj;
        return z18Var.b == this.b && z18Var.a.equals(this.a) && z18Var.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y18(this.a, this.b, null, this.c);
    }
}
