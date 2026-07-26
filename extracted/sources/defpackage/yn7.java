package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class yn7 extends xn7 {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.button, 1);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().l : 0;
        if (j2 != 0) {
            this.v.setBackground(new ColorDrawable(i));
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }
}
