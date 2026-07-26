package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class vw6 extends uw6 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.dialog_arrow, 1);
        sparseIntArray.put(rr6.title, 2);
        sparseIntArray.put(rr6.divider, 3);
        sparseIntArray.put(rr6.recycler_view, 4);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.z = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
