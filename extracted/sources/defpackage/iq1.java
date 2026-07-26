package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class iq1 extends hq1 {
    public static final SparseIntArray x;
    public long w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x = sparseIntArray;
        sparseIntArray.put(rr6.divider, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public iq1(View view) {
        Object[] objArrI0 = a79.i0(view, 2, null, x);
        super(null, view, (View) objArrI0[1]);
        this.w = -1L;
        ((FrameLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.w = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.w = 1L;
        }
        k0();
    }
}
