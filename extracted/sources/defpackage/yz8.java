package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyMarketView;
import ir.mservices.market.views.MyketRecentDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class yz8 extends xz8 {
    public static final SparseIntArray G;
    public final ConstraintLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(rr6.schedule_layout, 4);
        sparseIntArray.put(rr6.schedule_icon, 5);
        sparseIntArray.put(rr6.schedule_animation, 6);
        sparseIntArray.put(rr6.recent_download_view, 7);
        sparseIntArray.put(rr6.my_market, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yz8(View view) {
        Object[] objArrI0 = a79.i0(view, 9, null, G);
        super(null, view, (ImageView) objArrI0[1], (MyMarketView) objArrI0[8], (MyketRecentDownloadView) objArrI0[7], (LottieAnimationView) objArrI0[6], (ImageView) objArrI0[5], (RelativeLayout) objArrI0[4], (MyketTextView) objArrI0[3], (MyketTextView) objArrI0[2]);
        this.F = -1L;
        this.v.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i3 = sj8.b().l;
            i4 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            uy6.n(i2, this.v);
            o40.D(i3, this.E);
            this.B.setTextColor(i);
            this.C.setTextColor(i4);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.F = 1L;
        }
        k0();
    }
}
