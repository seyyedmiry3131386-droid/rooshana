package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class om2 extends nm2 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.content, 3);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().K;
            i2 = sj8.b().l;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            t61.s(i2, this.w);
            this.x.setBackground(new ColorDrawable(i));
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
