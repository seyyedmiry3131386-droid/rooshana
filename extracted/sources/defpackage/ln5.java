package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class ln5 extends kn5 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.layout, 1);
        sparseIntArray.put(rr6.header, 2);
        sparseIntArray.put(rr6.recycler_view, 3);
        sparseIntArray.put(rr6.dialog_button, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ln5(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, B);
        super(null, view, (DialogButtonComponent) objArrI0[4], (DialogHeaderComponent) objArrI0[2], (ConstraintLayout) objArrI0[1], (RecyclerView) objArrI0[3]);
        this.A = -1L;
        ((FrameLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.A = 0L;
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
