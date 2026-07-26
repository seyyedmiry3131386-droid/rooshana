package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class kk8 extends jk8 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.layout, 3);
        sparseIntArray.put(rr6.top_layout, 4);
        sparseIntArray.put(rr6.top_space, 5);
        sparseIntArray.put(rr6.icon, 6);
        sparseIntArray.put(rr6.bottom_space, 7);
        sparseIntArray.put(rr6.recycler_view, 8);
        sparseIntArray.put(rr6.try_again, 9);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().m : 0;
        if (j2 != 0) {
            this.v.setTextColor(i);
            this.A.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.E = 1L;
        }
        k0();
    }
}
