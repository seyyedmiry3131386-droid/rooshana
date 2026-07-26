package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ka2 extends ja2 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.app_icon, 6);
        sparseIntArray.put(rr6.appLayout, 7);
        sparseIntArray.put(rr6.status_text, 8);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            this.y.setTextColor(i);
            this.z.setTextColor(i);
            this.B.setTextColor(i);
            this.C.setTextColor(i);
            this.D.setTextColor(i);
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
