package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class f25 extends d25 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.back, 3);
        sparseIntArray.put(rr6.poster, 4);
        sparseIntArray.put(rr6.button, 5);
        sparseIntArray.put(rr6.search, 6);
        sparseIntArray.put(rr6.more, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().n;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.A.setTextColor(i);
            this.B.setTextColor(i2);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.D = 1L;
        }
        k0();
    }
}
