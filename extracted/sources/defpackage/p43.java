package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public final class p43 extends o43 {
    public static final SparseIntArray E;
    public final FrameLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.series_background, 4);
        sparseIntArray.put(rr6.banner, 5);
        sparseIntArray.put(rr6.watchProgressBackground, 6);
        sparseIntArray.put(rr6.watchProgress, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p43(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, E);
        super(null, view, (ScreenshotView) objArrI0[5], (MyketTextView) objArrI0[3], (MyketTextView) objArrI0[2], (SeriesBackground) objArrI0[4], (MyketTextView) objArrI0[1], (ProgressBar) objArrI0[7], (MovieWatchProgressBackgroundView) objArrI0[6]);
        this.D = -1L;
        this.w.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.C = frameLayout;
        frameLayout.setTag(null);
        this.x.setTag(null);
        this.z.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i);
            uy6.p(this.C, i2, null);
            this.x.setTextColor(i);
            this.z.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.D = 1L;
        }
        k0();
    }
}
