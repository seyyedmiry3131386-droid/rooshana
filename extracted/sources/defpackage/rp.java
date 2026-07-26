package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rp extends qp {
    public long w;

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.w = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.w = 1L;
        }
        k0();
    }
}
