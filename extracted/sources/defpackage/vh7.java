package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyMarketView;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketRecentDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class vh7 extends uh7 {
    public static final SparseIntArray M;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(rr6.my_market, 10);
        sparseIntArray.put(rr6.recent_download_view, 11);
        sparseIntArray.put(rr6.dynamic_layout, 12);
        sparseIntArray.put(rr6.dynamic_barrier, 13);
        sparseIntArray.put(rr6.search_input_layout, 14);
        sparseIntArray.put(rr6.logo, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vh7(View view) {
        Object[] objArrI0 = a79.i0(view, 16, null, M);
        ImageView imageView = (ImageView) objArrI0[6];
        ImageView imageView2 = (ImageView) objArrI0[8];
        View view2 = (View) objArrI0[5];
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrI0[1];
        super(null, view, imageView, imageView2, view2, lottieAnimationView, (ImageView) objArrI0[2], (FrameLayout) objArrI0[12], (MyketTextView) objArrI0[3], (ImageView) objArrI0[15], (View) objArrI0[9], (MyMarketView) objArrI0[10], (MyketRecentDownloadView) objArrI0[11], (MyketEditText) objArrI0[7], (View) objArrI0[4], (ConstraintLayout) objArrI0[14]);
        this.L = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
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
            j = this.L;
            this.L = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i3 = sj8.b().l;
            i4 = sj8.b().p;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            uy6.n(i2, this.v);
            uy6.n(i2, this.w);
            t61.s(i3, this.x);
            uy6.n(i2, this.y);
            uy6.n(i2, this.z);
            this.B.setTextColor(i);
            uy6.n(i2, this.B);
            t61.s(i4, this.D);
            o40.D(i3, this.K);
            this.G.setTextColor(i);
            this.G.setHintTextColor(i);
            t61.s(i3, this.H);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.L = 1L;
        }
        k0();
    }
}
