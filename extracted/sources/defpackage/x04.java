package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.NumberPickerView;

/* JADX INFO: loaded from: classes3.dex */
public final class x04 extends w04 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.year_picker, 1);
        sparseIntArray.put(rr6.month_picker, 2);
        sparseIntArray.put(rr6.day_picker, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x04(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, A);
        super(null, view, (NumberPickerView) objArrI0[3], (NumberPickerView) objArrI0[2], (NumberPickerView) objArrI0[1]);
        this.z = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.z = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
