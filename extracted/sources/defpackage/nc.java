package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class nc extends mc {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.content, 1);
        sparseIntArray.put(rr6.message, 2);
        sparseIntArray.put(rr6.image, 3);
        sparseIntArray.put(rr6.action, 4);
        sparseIntArray.put(rr6.click_view, 5);
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
