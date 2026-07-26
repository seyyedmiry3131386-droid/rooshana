package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j95 {
    public Class a;
    public Class b;
    public Class c;

    public j95(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j95.class != obj.getClass()) {
            return false;
        }
        j95 j95Var = (j95) obj;
        return this.a.equals(j95Var.a) && this.b.equals(j95Var.b) && i29.b(this.c, j95Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
