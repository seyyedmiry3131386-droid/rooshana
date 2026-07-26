package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z92 extends ca2 {
    public final Object c;

    public z92(Object obj) {
        super(sj8.b().A, obj);
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z92) && js3.i(this.c, ((z92) obj).c);
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.c + ")";
    }
}
