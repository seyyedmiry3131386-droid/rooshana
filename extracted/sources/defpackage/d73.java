package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class d73 extends c73 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.install, 4);
        sparseIntArray.put(rr6.size, 5);
        sparseIntArray.put(rr6.review, 6);
        sparseIntArray.put(rr6.category, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().v : 0;
        if (j2 != 0) {
            t61.s(i, this.w);
            t61.s(i, this.x);
            t61.s(i, this.y);
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
