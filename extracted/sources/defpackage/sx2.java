package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class sx2 extends rx2 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.title, 1);
        sparseIntArray.put(rr6.subtitle, 2);
        sparseIntArray.put(rr6.image_layout, 3);
        sparseIntArray.put(rr6.image, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sx2(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, B);
        super(null, view, (FrameLayout) objArrI0[3], (ImageView) objArrI0[4], (MyketTextView) objArrI0[2], (MyketTextView) objArrI0[1]);
        this.A = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
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
