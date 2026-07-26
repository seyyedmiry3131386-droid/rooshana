package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class p23 extends o23 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.space, 3);
        sparseIntArray.put(rr6.app_icon, 4);
        sparseIntArray.put(rr6.app_title, 5);
        sparseIntArray.put(rr6.category, 6);
        sparseIntArray.put(rr6.rate_btn, 7);
        sparseIntArray.put(rr6.ratingbar, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p23(View view) {
        Object[] objArrI0 = a79.i0(view, 9, null, E);
        super(null, view, (AppIconView) objArrI0[4], (MyketTextView) objArrI0[5], (MyketTextView) objArrI0[6], (ConstraintLayout) objArrI0[1], (BigTextButton) objArrI0[7], (MyketRatingBar) objArrI0[8], (ConstraintLayout) objArrI0[2], (View) objArrI0[3]);
        this.D = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.B.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.m(i, this.y);
            uy6.m(i, this.B);
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
