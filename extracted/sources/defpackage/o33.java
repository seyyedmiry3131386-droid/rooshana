package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AlphaAnimationView;

/* JADX INFO: loaded from: classes3.dex */
public final class o33 extends n33 {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.card_skeleton, 1);
        sparseIntArray.put(rr6.title_skeleton, 2);
        sparseIntArray.put(rr6.divider, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o33(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, z);
        super(null, view, (AlphaAnimationView) objArrI0[1], (View) objArrI0[3], (AlphaAnimationView) objArrI0[2]);
        this.y = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.y = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }
}
