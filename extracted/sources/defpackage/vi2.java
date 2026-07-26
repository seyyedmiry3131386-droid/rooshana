package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class vi2 extends ui2 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.dialog_arrow, 1);
        sparseIntArray.put(rr6.title, 2);
        sparseIntArray.put(rr6.divider, 3);
        sparseIntArray.put(rr6.nested_scroll_view, 4);
        sparseIntArray.put(rr6.recycler_view, 5);
        sparseIntArray.put(rr6.button, 6);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.A = 0L;
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
