package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t01 implements a39 {
    public final dp2 a;

    public t01(dp2 dp2Var) {
        this.a = dp2Var;
    }

    @Override // defpackage.a39
    public final Object a(j56 j56Var) {
        return this.a.invoke(j56Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t01) && js3.i(this.a, ((t01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
