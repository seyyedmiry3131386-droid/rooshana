package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hp0 extends ip0 {
    public final Throwable a;

    public hp0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hp0) {
            return js3.i(this.a, ((hp0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ip0
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
