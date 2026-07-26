package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class gl2 extends fl2 {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(rr6.btn_next, 1);
        sparseIntArray.put(rr6.btn_previous, 2);
        sparseIntArray.put(rr6.step1, 3);
        sparseIntArray.put(rr6.step2, 4);
        sparseIntArray.put(rr6.step3, 5);
        sparseIntArray.put(rr6.step4, 6);
        sparseIntArray.put(rr6.view_pager, 7);
        sparseIntArray.put(rr6.close, 8);
        sparseIntArray.put(rr6.done, 9);
        sparseIntArray.put(rr6.step_groups, 10);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.G = 1L;
        }
        k0();
    }
}
