package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class d93 extends i7 {
    public static final SparseIntArray w;
    public long v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w = sparseIntArray;
        sparseIntArray.put(rr6.default_application_icon, 1);
        sparseIntArray.put(rr6.default_application_title, 2);
        sparseIntArray.put(rr6.default_application_category, 3);
        sparseIntArray.put(rr6.default_application_ratingbar, 4);
        sparseIntArray.put(rr6.default_application_rate_btn, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.v = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.v = 1L;
        }
        k0();
    }
}
