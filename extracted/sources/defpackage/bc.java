package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bc {
    public final List a;
    public final kt b;

    public bc(List list, kt ktVar) {
        js3.p(list, "itemsToAdd");
        this.a = list;
        this.b = ktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return js3.i(this.a, bcVar.a) && this.b.equals(bcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "After(itemsToAdd=" + this.a + ", predict=" + this.b + ")";
    }
}
