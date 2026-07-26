package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class f33 extends d33 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.app_icon, 5);
        sparseIntArray.put(rr6.ad_info, 6);
        sparseIntArray.put(rr6.app_info, 7);
        sparseIntArray.put(rr6.rate_btn, 8);
        sparseIntArray.put(rr6.ratingbar, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f33(View view) {
        Object[] objArrI0 = a79.i0(view, 10, null, E);
        super(null, view, (AppIconView) objArrI0[5], (AppInfoView) objArrI0[7], (MyketTextView) objArrI0[2], (MyketTextView) objArrI0[3], (FrameLayout) objArrI0[1], (BigTextButton) objArrI0[8], (MyketRatingBar) objArrI0[9], (ConstraintLayout) objArrI0[4]);
        this.D = -1L;
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
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
            this.x.setTextColor(i3);
            this.y.setTextColor(i);
            uy6.p(this.z, i2, null);
            uy6.m(i2, this.C);
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
