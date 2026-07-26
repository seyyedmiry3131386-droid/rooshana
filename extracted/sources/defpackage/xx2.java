package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketNoPaddingTextView;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class xx2 extends wx2 {
    public static final SparseIntArray L;
    public final FrameLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(rr6.rate_layout, 8);
        sparseIntArray.put(rr6.ratingbar, 9);
        sparseIntArray.put(rr6.progressBar5, 10);
        sparseIntArray.put(rr6.progressBar4, 11);
        sparseIntArray.put(rr6.progressBar3, 12);
        sparseIntArray.put(rr6.progressBar2, 13);
        sparseIntArray.put(rr6.progressBar1, 14);
        sparseIntArray.put(rr6.barrier, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xx2(View view) {
        Object[] objArrI0 = a79.i0(view, 16, null, L);
        super(null, view, (ProgressBar) objArrI0[14], (ProgressBar) objArrI0[13], (ProgressBar) objArrI0[12], (ProgressBar) objArrI0[11], (ProgressBar) objArrI0[10], (MyketNoPaddingTextView) objArrI0[1], (MyketTextView) objArrI0[2], (ConstraintLayout) objArrI0[8], (MyketRatingBar) objArrI0[9], (MyketTextView) objArrI0[7], (MyketTextView) objArrI0[6], (MyketTextView) objArrI0[5], (MyketTextView) objArrI0[4], (MyketTextView) objArrI0[3]);
        this.K = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.J = frameLayout;
        frameLayout.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
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
        synchronized (this) {
            j = this.K;
            this.K = 0L;
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
            uy6.p(this.J, i2, null);
            this.A.setTextColor(i3);
            this.B.setTextColor(i);
            this.E.setTextColor(i);
            this.F.setTextColor(i);
            this.G.setTextColor(i);
            this.H.setTextColor(i);
            this.I.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.K = 1L;
        }
        k0();
    }
}
