package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class wn1 extends vn1 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.arrow, 4);
        sparseIntArray.put(rr6.dialog_button, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wn1(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, B);
        super(null, view, (MyketTextView) objArrI0[2], (DialogButtonComponent) objArrI0[5], (MyketTextView) objArrI0[3], (MyketTextView) objArrI0[1]);
        this.A = -1L;
        this.v.setTag(null);
        this.x.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.y.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().n;
            i2 = sj8.b().A;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i);
            this.x.setTextColor(i2);
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
