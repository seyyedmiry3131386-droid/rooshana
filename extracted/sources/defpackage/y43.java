package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.BigTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class y43 extends x43 {
    public static final SparseIntArray z;
    public final FrameLayout x;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.layout, 1);
        sparseIntArray.put(rr6.more, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y43(View view) {
        Object[] objArrI0 = a79.i0(view, 3, null, z);
        super(null, view, (ConstraintLayout) objArrI0[1], (BigTextButton) objArrI0[2]);
        this.y = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.x = frameLayout;
        frameLayout.setTag(null);
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
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.p(this.x, i, null);
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
