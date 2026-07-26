package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o91 {
    public final so6 a;
    public final boolean b;

    public o91(so6 so6Var, boolean z) {
        this.a = so6Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o91) {
            o91 o91Var = (o91) obj;
            if (o91Var.a.equals(this.a) && o91Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
