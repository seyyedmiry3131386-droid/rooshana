package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dk {
    public static final dk c;
    public final Object a;
    public final Object b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        c = new dk(fValueOf, fValueOf);
    }

    public dk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final dk a(boolean z) {
        return z ? new dk(this.b, this.a) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        return js3.i(this.a, dkVar.a) && js3.i(this.b, dkVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "AnimatedValue(from=" + this.a + ", to=" + this.b + ")";
    }
}
