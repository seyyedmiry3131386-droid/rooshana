package defpackage;

import android.util.SparseIntArray;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class dl2 extends md {
    public static final SparseIntArray y;
    public long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(rr6.crop_image, 2);
        sparseIntArray.put(rr6.loading, 3);
        sparseIntArray.put(rr6.crop_buttons, 4);
        sparseIntArray.put(rr6.crop_rotate_left, 5);
        sparseIntArray.put(rr6.crop_rotate_right, 6);
        sparseIntArray.put(rr6.crop_done, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().v : 0;
        if (j2 != 0) {
            t61.s(i, (View) this.v);
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
