package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class lk8 extends jk8 {
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
        int i;
        int i2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().Q;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i2);
            this.z.setBackground(new ColorDrawable(i));
            this.A.setTextColor(i2);
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
