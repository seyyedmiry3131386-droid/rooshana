package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class c33 extends b33 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.card_view, 2);
        sparseIntArray.put(rr6.banner, 3);
        sparseIntArray.put(rr6.app_layout, 4);
        sparseIntArray.put(rr6.app_icon, 5);
        sparseIntArray.put(rr6.ad_info, 6);
        sparseIntArray.put(rr6.download_state_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c33(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, D);
        super(null, view, (MyketAdInfoView) objArrI0[6], (AppIconView) objArrI0[5], (RelativeLayout) objArrI0[4], (MyketTextView) objArrI0[1], (ImageView) objArrI0[3], (CardView) objArrI0[2], (FastDownloadView) objArrI0[7]);
        this.C = -1L;
        this.y.setTag(null);
        ((FrameLayout) objArrI0[0]).setTag(null);
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
