package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ga4 extends ja4 {
    public final Throwable b;

    public ga4(Throwable th) {
        super(false);
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ga4)) {
            return false;
        }
        ga4 ga4Var = (ga4) obj;
        return this.a == ga4Var.a && this.b.equals(ga4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a ? 1231 : 1237);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.a + ", error=" + this.b + ')';
    }
}
