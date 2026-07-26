package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v58 implements a39 {
    public final Object a;

    public v58(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.a39
    public final Object a(j56 j56Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v58) && js3.i(this.a, ((v58) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
