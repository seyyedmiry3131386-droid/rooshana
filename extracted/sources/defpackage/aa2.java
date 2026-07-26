package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aa2 extends ca2 {
    public final Object c;

    public aa2(Object obj) {
        super(sj8.b().c, obj);
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa2) && js3.i(this.c, ((aa2) obj).c);
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Focus(value=" + this.c + ")";
    }
}
