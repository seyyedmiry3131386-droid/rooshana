package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class a69 extends z59 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.bottom_view, 1);
        sparseIntArray.put(rr6.top_view, 2);
        sparseIntArray.put(rr6.play, 3);
        sparseIntArray.put(rr6.fullscreen, 4);
        sparseIntArray.put(rr6.exo_progress, 5);
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
