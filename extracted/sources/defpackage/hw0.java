package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.BigFillRectangleButton;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class hw0 extends gw0 {
    public static final SparseIntArray M;
    public final RelativeLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(rr6.scroll_view, 5);
        sparseIntArray.put(rr6.layout, 6);
        sparseIntArray.put(rr6.lottie_animation0, 7);
        sparseIntArray.put(rr6.lottie_animation1, 8);
        sparseIntArray.put(rr6.lottie_animation2, 9);
        sparseIntArray.put(rr6.lottie_animation3, 10);
        sparseIntArray.put(rr6.lottie_animation4, 11);
        sparseIntArray.put(rr6.lottie_animation5, 12);
        sparseIntArray.put(rr6.ratingbar, 13);
        sparseIntArray.put(rr6.comment, 14);
        sparseIntArray.put(rr6.button, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hw0(View view) {
        Object[] objArrI0 = a79.i0(view, 16, null, M);
        BigFillRectangleButton bigFillRectangleButton = (BigFillRectangleButton) objArrI0[15];
        MyketEditText myketEditText = (MyketEditText) objArrI0[14];
        MyketTextView myketTextView = (MyketTextView) objArrI0[4];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[3];
        super(null, view, bigFillRectangleButton, myketEditText, myketTextView, myketTextView2, (LottieAnimationView) objArrI0[7], (LottieAnimationView) objArrI0[8], (LottieAnimationView) objArrI0[9], (LottieAnimationView) objArrI0[10], (LottieAnimationView) objArrI0[11], (LottieAnimationView) objArrI0[12], (MyketTextView) objArrI0[1], (MyketRatingBar) objArrI0[13], (NestedScrollView) objArrI0[5], (MyketTextView) objArrI0[2]);
        this.L = -1L;
        this.x.setTag(null);
        this.y.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArrI0[0];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
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
            i = sj8.b().A;
            i2 = sj8.b().n;
            i3 = sj8.b().l;
            i4 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            this.x.setTextColor(i);
            this.y.setTextColor(i4);
            this.K.setBackground(new ColorDrawable(i3));
            this.F.setTextColor(i2);
            this.I.setTextColor(i4);
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
