package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yy3 {
    public final Float a;
    public zy1 b;

    public yy3(Float f, zy1 zy1Var) {
        this.a = f;
        this.b = zy1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yy3)) {
            return false;
        }
        yy3 yy3Var = (yy3) obj;
        return yy3Var.a.equals(this.a) && js3.i(yy3Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
