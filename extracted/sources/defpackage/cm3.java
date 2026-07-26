package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.BigTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class cm3 extends bm3 {
    public static final SparseIntArray y;
    public long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(rr6.layout, 1);
        sparseIntArray.put(rr6.more_text, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cm3(View view) {
        Object[] objArrI0 = a79.i0(view, 3, null, y);
        super(null, view, (FrameLayout) objArrI0[1], (BigTextButton) objArrI0[2]);
        this.x = -1L;
        ((FrameLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.x = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }
}
