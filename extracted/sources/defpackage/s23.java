package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class s23 extends r23 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.banner, 2);
        sparseIntArray.put(rr6.app_layout, 3);
        sparseIntArray.put(rr6.app_icon, 4);
        sparseIntArray.put(rr6.ad_info, 5);
        sparseIntArray.put(rr6.clickable_layout, 6);
        sparseIntArray.put(rr6.download_state_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s23(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, D);
        super(null, view, (MyketAdInfoView) objArrI0[5], (AppIconView) objArrI0[4], (View) objArrI0[3], (MyketTextView) objArrI0[1], (ScreenshotView) objArrI0[2], (FrameLayout) objArrI0[6], (FastDownloadView) objArrI0[7]);
        this.C = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.c(sj8.f).m : 0;
        if (j2 != 0) {
            this.y.setTextColor(i);
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
