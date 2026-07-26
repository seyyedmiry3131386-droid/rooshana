package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class lm1 extends km1 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.layout, 2);
        sparseIntArray.put(rr6.header, 3);
        sparseIntArray.put(rr6.dialog_button, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lm1(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, B);
        super(null, view, (LinearLayout) objArrI0[2], (DialogButtonComponent) objArrI0[4], (DialogHeaderComponent) objArrI0[3], (MyketTextView) objArrI0[1]);
        this.A = -1L;
        this.x.setTag(null);
        ((FrameLayout) objArrI0[0]).setTag(null);
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
            this.x.setTextColor(i);
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
