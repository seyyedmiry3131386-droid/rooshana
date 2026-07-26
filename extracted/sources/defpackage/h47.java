package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class h47 extends g47 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.title, 1);
        sparseIntArray.put(rr6.divider, 2);
        sparseIntArray.put(rr6.scroll_view, 3);
        sparseIntArray.put(rr6.content, 4);
        sparseIntArray.put(rr6.description, 5);
        sparseIntArray.put(rr6.radio_group, 6);
        sparseIntArray.put(rr6.otherTypeInput, 7);
        sparseIntArray.put(rr6.dialog_button, 8);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.D = 1L;
        }
        k0();
    }
}
