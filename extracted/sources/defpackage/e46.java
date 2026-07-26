package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class e46 extends d46 {
    public static final SparseIntArray N;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(rr6.logo, 8);
        sparseIntArray.put(rr6.logo_type, 9);
        sparseIntArray.put(rr6.barrier, 10);
        sparseIntArray.put(rr6.discount, 11);
        sparseIntArray.put(rr6.discount_badge, 12);
        sparseIntArray.put(rr6.app_icon, 13);
        sparseIntArray.put(rr6.payment_price, 14);
        sparseIntArray.put(rr6.recycler_view, 15);
        sparseIntArray.put(rr6.dialog_button, 16);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().v;
            i2 = sj8.b().n;
            i3 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i3);
            this.A.setTextColor(i2);
            t61.s(i, this.B);
            this.C.setTextColor(i2);
            this.D.setTextColor(i2);
            t61.s(i, this.E);
            this.K.setTextColor(i2);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.M = 1L;
        }
        k0();
    }
}
