package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class nc4 extends mc4 {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.content_layout, 1);
        sparseIntArray.put(rr6.icon, 2);
        sparseIntArray.put(rr6.text, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nc4(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, z);
        super(null, view, (ImageView) objArrI0[2], (ConstraintLayout) objArrI0[1], (MyketTextView) objArrI0[3]);
        this.y = -1L;
        ((FrameLayout) objArrI0[0]).setTag(null);
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
