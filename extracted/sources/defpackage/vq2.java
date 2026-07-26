package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class vq2 extends uq2 {
    public static final SparseIntArray C;
    public final ConstraintLayout A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.content, 2);
        sparseIntArray.put(rr6.logo_deselect, 3);
        sparseIntArray.put(rr6.logo, 4);
        sparseIntArray.put(rr6.text, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vq2(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, C);
        super(null, view, (CardView) objArrI0[0], (View) objArrI0[2], (ImageView) objArrI0[4], (ImageView) objArrI0[3], (MyketTextView) objArrI0[5]);
        this.B = -1L;
        this.v.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[1];
        this.A = constraintLayout;
        constraintLayout.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().l;
            i2 = sj8.b().N;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setCardBackgroundColor(i2);
            o40.D(i, this.A);
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
