package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class om extends nm {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.divider, 2);
        sparseIntArray.put(rr6.icon, 3);
        sparseIntArray.put(rr6.title, 4);
        sparseIntArray.put(rr6.download, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.p(this.v, i, null);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.A = 1L;
        }
        k0();
    }
}
