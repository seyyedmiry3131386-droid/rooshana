package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class xu6 extends wu6 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.radio_btn, 2);
        sparseIntArray.put(rr6.title, 3);
        sparseIntArray.put(rr6.subtitle, 4);
        sparseIntArray.put(rr6.action, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().k : 0;
        if (j2 != 0) {
            this.z.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.C = 1L;
        }
        k0();
    }
}
