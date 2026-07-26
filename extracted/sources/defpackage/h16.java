package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h16 {
    public final Object a;
    public final Object b;

    public h16(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h16)) {
            return false;
        }
        h16 h16Var = (h16) obj;
        return Objects.equals(h16Var.a, this.a) && Objects.equals(h16Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
