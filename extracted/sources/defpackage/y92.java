package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y92 extends ca2 {
    public final String c;

    public y92(String str) {
        super(sj8.b().q, str);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y92) && js3.i(this.c, ((y92) obj).c);
    }

    public final int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Disable(value=" + ((Object) this.c) + ")";
    }
}
