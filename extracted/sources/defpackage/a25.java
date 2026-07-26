package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class a25 extends z15 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.bg_content, 2);
        sparseIntArray.put(rr6.tab_layout, 3);
        sparseIntArray.put(rr6.shadow, 4);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().N : 0;
        if (j2 != 0) {
            this.z.setBackground(new ColorDrawable(i));
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 1L;
        }
        k0();
    }
}
