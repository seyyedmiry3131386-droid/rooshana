package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class n13 extends m13 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.app_icon, 2);
        sparseIntArray.put(rr6.ad_info, 3);
        sparseIntArray.put(rr6.category, 4);
        sparseIntArray.put(rr6.app_info, 5);
        sparseIntArray.put(rr6.download_view, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n13(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, C);
        super(null, view, (MyketAdInfoView) objArrI0[3], (AppIconView) objArrI0[2], (AppInfoView) objArrI0[5], (MyketTextView) objArrI0[1], (MyketTextView) objArrI0[4], (FastDownloadView) objArrI0[6]);
        this.B = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().m : 0;
        if (j2 != 0) {
            this.y.setTextColor(i);
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
