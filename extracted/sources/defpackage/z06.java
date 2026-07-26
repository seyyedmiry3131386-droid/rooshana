package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class z06 extends a16 implements Iterable, dx3 {
    public final List a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;

    static {
        new z06(EmptyList.a, null, null, 0, 0);
    }

    public z06(List list, Object obj, Object obj2, int i, int i2) {
        js3.p(list, "data");
        this.a = list;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z06)) {
            return false;
        }
        z06 z06Var = (z06) obj;
        return js3.i(this.a, z06Var.a) && js3.i(this.b, z06Var.b) && js3.i(this.c, z06Var.c) && this.d == z06Var.d && this.e == z06Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return ((((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.d) * 31) + this.e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.a;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(a.p0(list));
        sb.append("\n                    |   last Item: ");
        sb.append(a.v0(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.c);
        sb.append("\n                    |   prevKey: ");
        sb.append(this.b);
        sb.append("\n                    |   itemsBefore: ");
        sb.append(this.d);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.e);
        sb.append("\n                    |) ");
        return g88.P(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z06(List list, Integer num) {
        this(list, null, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
        js3.p(list, "data");
    }
}
