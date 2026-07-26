package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class y23 extends x23 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.space, 1);
        sparseIntArray.put(rr6.banner, 2);
        sparseIntArray.put(rr6.clickable_layout, 3);
        sparseIntArray.put(rr6.app_layout, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y23(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, A);
        super(null, view, (LinearLayout) objArrI0[4], (ScreenshotView) objArrI0[2], (FrameLayout) objArrI0[3], (View) objArrI0[1]);
        this.z = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.z = 0L;
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
