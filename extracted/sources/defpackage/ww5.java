package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww5 extends rq4 {
    public final sy6 p;

    public ww5(sy6 sy6Var) {
        this.p = sy6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ww5) {
            return js3.i(this.p, ((ww5) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    @Override // defpackage.rq4
    public final sy6 y() {
        return this.p;
    }
}
