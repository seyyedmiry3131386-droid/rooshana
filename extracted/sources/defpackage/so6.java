package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class so6 {
    public final Class a;
    public final Class b;

    public so6(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static so6 a(Class cls) {
        return new so6(ro6.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || so6.class != obj.getClass()) {
            return false;
        }
        so6 so6Var = (so6) obj;
        if (this.b.equals(so6Var.b)) {
            return this.a.equals(so6Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == ro6.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
