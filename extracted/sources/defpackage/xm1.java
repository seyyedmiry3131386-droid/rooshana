package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class xm1 extends wm1 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.arrow, 4);
        sparseIntArray.put(rr6.input, 5);
        sparseIntArray.put(rr6.dialog_button, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xm1(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, C);
        super(null, view, (MyketTextView) objArrI0[1], (DialogButtonComponent) objArrI0[6], (MyketTextView) objArrI0[3], (MyketInputLayout) objArrI0[5], (MyketEditText) objArrI0[2]);
        this.B = -1L;
        this.v.setTag(null);
        this.x.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
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
            i = sj8.b().n;
            i2 = sj8.b().A;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i);
            this.x.setTextColor(i2);
            this.z.setTextColor(i);
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
