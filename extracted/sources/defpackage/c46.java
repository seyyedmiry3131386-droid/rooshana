package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class c46 extends b46 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.content, 3);
        sparseIntArray.put(rr6.logo_type, 4);
        sparseIntArray.put(rr6.logo, 5);
        sparseIntArray.put(rr6.url_layout, 6);
        sparseIntArray.put(rr6.ic_lock_view, 7);
        sparseIntArray.put(rr6.ic_lock, 8);
        sparseIntArray.put(rr6.web_view, 9);
        sparseIntArray.put(rr6.try_again, 10);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().l;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            o40.D(i, this.y);
            this.A.setTextColor(i2);
            t61.s(i, this.B);
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
