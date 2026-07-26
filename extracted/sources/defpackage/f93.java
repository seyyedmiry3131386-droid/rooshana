package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class f93 extends x33 {
    public static final SparseIntArray y;
    public long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(rr6.header_shimmer, 2);
        sparseIntArray.put(rr6.header_title, 3);
        sparseIntArray.put(rr6.section_more_title, 4);
        sparseIntArray.put(rr6.recycler_view, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.m(i, this.w);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }
}
