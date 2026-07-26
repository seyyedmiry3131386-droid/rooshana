package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.widget.FrameLayout;
import androidx.core.view.insets.ProtectionLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a7 extends z6 {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.comment_frame, 2);
        sparseIntArray.put(rr6.toolbar, 3);
        sparseIntArray.put(rr6.content, 4);
        sparseIntArray.put(rr6.shadow, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().l;
            i2 = sj8.b().N;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            ((FrameLayout) this.v).setBackground(new ColorDrawable(i2));
            ((ProtectionLayout) this.w).setBackground(new ColorDrawable(i));
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
