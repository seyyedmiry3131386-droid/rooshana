package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fy6 extends hy6 {
    public final ux6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy6(ux6 ux6Var) {
        super(ux6Var);
        js3.p(ux6Var, "_recommendationMovieList");
        this.b = ux6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy6) && js3.i(this.b, ((fy6) obj).b);
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    public final String toString() {
        return "Ending(_recommendationMovieList=" + this.b + ")";
    }
}
