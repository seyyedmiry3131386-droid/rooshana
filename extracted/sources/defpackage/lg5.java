package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class lg5 extends kg5 {
    public static final SparseIntArray E;
    public final ConstraintLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.image_view, 3);
        sparseIntArray.put(rr6.clickView, 4);
        sparseIntArray.put(rr6.loading, 5);
        sparseIntArray.put(rr6.video_action_image, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lg5(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, E);
        super(null, view, (View) objArrI0[4], (ScreenshotView) objArrI0[3], (LoadingView) objArrI0[5], (MyketTextView) objArrI0[2], (PlayerView) objArrI0[1], (AppCompatImageView) objArrI0[6]);
        this.D = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 1;
        int i2 = 0;
        if (j2 != 0) {
            AlphaColor alphaColor = sj8.b().J;
            AlphaColor alphaColor2 = sj8.b().I;
            i = alphaColor != null ? alphaColor.a : 0;
            if (alphaColor2 != null) {
                i2 = alphaColor2.a;
            }
        } else {
            i = 0;
        }
        if (j2 != 0) {
            this.y.setTextColor(i2);
            o40.D(i, this.C);
            this.z.setBackground(new ColorDrawable(i));
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
