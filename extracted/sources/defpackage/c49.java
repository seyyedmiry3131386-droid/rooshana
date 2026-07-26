package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c49 {
    public final dl a;
    public final zy1 b;

    public c49(dl dlVar, zy1 zy1Var) {
        this.a = dlVar;
        this.b = zy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c49)) {
            return false;
        }
        c49 c49Var = (c49) obj;
        return js3.i(this.a, c49Var.a) && js3.i(this.b, c49Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
