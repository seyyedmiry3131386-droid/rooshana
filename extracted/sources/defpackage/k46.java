package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class k46 extends j46 {
    public static final SparseIntArray D;
    public final ConstraintLayout B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.content, 2);
        sparseIntArray.put(rr6.logo_deselect, 3);
        sparseIntArray.put(rr6.logo, 4);
        sparseIntArray.put(rr6.text, 5);
        sparseIntArray.put(rr6.description, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k46(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, D);
        super(null, view, (CardView) objArrI0[0], (View) objArrI0[2], (MyketTextView) objArrI0[6], (ImageView) objArrI0[4], (ImageView) objArrI0[3], (MyketTextView) objArrI0[5]);
        this.C = -1L;
        this.v.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[1];
        this.B = constraintLayout;
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
            j = this.C;
            this.C = 0L;
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
            o40.D(i, this.B);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.C = 1L;
        }
        k0();
    }
}
