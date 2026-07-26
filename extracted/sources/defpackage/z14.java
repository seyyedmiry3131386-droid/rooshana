package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class z14 extends x14 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.right_line, 2);
        sparseIntArray.put(rr6.left_line, 3);
        sparseIntArray.put(rr6.image_indicator, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z14(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, B);
        super(null, view, (ImageView) objArrI0[4], (View) objArrI0[3], (View) objArrI0[2], (MyketTextView) objArrI0[1]);
        this.A = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.y.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            this.y.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.A = 1L;
        }
        k0();
    }
}
