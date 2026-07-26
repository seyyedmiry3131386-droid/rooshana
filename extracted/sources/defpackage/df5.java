package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class df5 extends cf5 {
    public long B;

    /* JADX WARN: Illegal instructions before constructor call */
    public df5(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 5, null);
        super(null, viewArr[0], (MyketTextView) objArrJ0[4], (LoadingView) objArrJ0[0], (AppCompatImageView) objArrJ0[1], (LottieAnimationView) objArrJ0[3], (AppCompatImageView) objArrJ0[2]);
        this.B = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        m0(viewArr);
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
        int i = j2 != 0 ? sj8.b().E : 0;
        if (j2 != 0) {
            this.v.setTextColor(i);
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
