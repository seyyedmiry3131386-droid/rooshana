package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class y13 extends x13 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.like_anim, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y13(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, A);
        super(null, view, (ImageView) objArrI0[2], (ImageView) objArrI0[1], (LottieAnimationView) objArrI0[4], (MyketTextView) objArrI0[3]);
        this.z = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.y.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
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
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            uy6.n(i2, this.v);
            uy6.n(i2, this.w);
            this.y.setTextColor(i);
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
