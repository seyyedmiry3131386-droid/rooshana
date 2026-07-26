package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class l43 extends k43 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.content, 4);
        sparseIntArray.put(rr6.banner, 5);
        sparseIntArray.put(rr6.label, 6);
        sparseIntArray.put(rr6.clickable_layout, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l43(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, D);
        super(null, view, (ScreenshotView) objArrI0[5], (FrameLayout) objArrI0[7], (ScreenshotView) objArrI0[4], (MyketTextView) objArrI0[1], (MovieLabelView) objArrI0[6], (MyketTextView) objArrI0[3], (MyketTextView) objArrI0[2]);
        this.C = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().n;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.y.setTextColor(i2);
            this.A.setTextColor(i);
            this.B.setTextColor(i2);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.C = 1L;
        }
        k0();
    }
}
