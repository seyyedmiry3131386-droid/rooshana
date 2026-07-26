package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy1 implements a39 {
    public final wb5 a;

    public oy1(wb5 wb5Var) {
        this.a = wb5Var;
    }

    @Override // defpackage.a39
    public final Object a(j56 j56Var) {
        return ((s08) this.a).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy1) && js3.i(this.a, ((oy1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
