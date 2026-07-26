package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.BigFillRectangleButton;

/* JADX INFO: loaded from: classes3.dex */
public final class gs0 extends fs0 {
    public static final SparseIntArray z;
    public final FrameLayout x;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.button, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gs0(View view) {
        Object[] objArrI0 = a79.i0(view, 2, null, z);
        super(null, view, (BigFillRectangleButton) objArrI0[1]);
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
        int i = j2 != 0 ? sj8.b().l : 0;
        if (j2 != 0) {
            this.x.setBackground(new ColorDrawable(i));
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
