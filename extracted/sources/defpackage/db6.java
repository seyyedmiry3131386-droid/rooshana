package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class db6 {
    public final vd2 a;

    public db6(vd2 vd2Var) {
        this.a = vd2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof db6) {
            return this.a.equals(((db6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
