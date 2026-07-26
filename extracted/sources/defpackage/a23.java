package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a23 extends z13 {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.image, 2);
        sparseIntArray.put(rr6.add_list, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a23(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, z);
        super(null, view, (SmallFillOvalButton) objArrI0[3], (ImageView) objArrI0[2], (MyketTextView) objArrI0[1]);
        this.y = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.x.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
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
