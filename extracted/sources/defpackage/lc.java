package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class lc extends kc {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.content, 1);
        sparseIntArray.put(rr6.icon, 2);
        sparseIntArray.put(rr6.title, 3);
        sparseIntArray.put(rr6.message, 4);
        sparseIntArray.put(rr6.action, 5);
        sparseIntArray.put(rr6.click_view, 6);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 1L;
        }
        k0();
    }
}
