package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class n43 extends m43 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.divider, 1);
        sparseIntArray.put(rr6.banner, 2);
        sparseIntArray.put(rr6.title, 3);
        sparseIntArray.put(rr6.banner_title_clickable, 4);
        sparseIntArray.put(rr6.banner_clickable, 5);
        sparseIntArray.put(rr6.label, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n43(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, C);
        super(null, view, (ScreenshotView) objArrI0[2], (FrameLayout) objArrI0[5], (FrameLayout) objArrI0[4], (View) objArrI0[1], (MovieLabelView) objArrI0[6], (MyketTextView) objArrI0[3]);
        this.B = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.B = 0L;
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
