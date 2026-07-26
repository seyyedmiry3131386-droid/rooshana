package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mb1 extends pb1 {
    public final Throwable a;

    public mb1(Throwable th) {
        js3.p(th, "error");
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb1) && js3.i(this.a, ((mb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fail(error=" + this.a + ")";
    }
}
