package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b71 extends s {
    public static final gv c = new gv(9);
    public final String b;

    public b71() {
        super(c);
        this.b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b71) && js3.i(this.b, ((b71) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return bl4.y(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
