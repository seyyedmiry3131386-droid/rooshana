package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class l12 extends k12 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.hintBgLayout, 3);
        sparseIntArray.put(rr6.empty_icon, 4);
        sparseIntArray.put(rr6.action_button, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l12(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, A);
        BigFillOvalButton bigFillOvalButton = (BigFillOvalButton) objArrI0[5];
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrI0[4];
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[1];
        super(null, view, bigFillOvalButton, lottieAnimationView, myketTextView, myketTextView2);
        this.z = -1L;
        this.x.setTag(null);
        this.y.setTag(null);
        ((FrameLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
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
            this.x.setTextColor(i);
            this.y.setTextColor(i2);
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
