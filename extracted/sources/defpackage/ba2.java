package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ba2 extends ca2 {
    public final Object c;

    public ba2(Object obj) {
        super(sj8.b().w, obj);
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba2) && js3.i(this.c, ((ba2) obj).c);
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Normal(value=" + this.c + ")";
    }
}
