package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public final class y79 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final LottieAnimationView v;
    public final ImageView w;
    public final LoadingView x;
    public long y;

    /* JADX WARN: Illegal instructions before constructor call */
    public y79(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 3, null);
        View view = viewArr[0];
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrJ0[2];
        ImageView imageView = (ImageView) objArrJ0[0];
        LoadingView loadingView = (LoadingView) objArrJ0[1];
        super(0, view, null);
        this.v = lottieAnimationView;
        this.w = imageView;
        this.x = loadingView;
        this.y = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.y = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }
}
