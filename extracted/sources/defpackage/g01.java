package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g01 implements f01 {
    public final c01 a;

    public g01(c01 c01Var) {
        this.a = c01Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g01) {
            return js3.i(this.a, ((g01) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
