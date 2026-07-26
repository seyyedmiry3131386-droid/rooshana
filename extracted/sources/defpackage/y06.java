package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y06 extends a16 {
    public final Throwable a;

    public y06(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y06) && js3.i(this.a, ((y06) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g88.P("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
    }
}
