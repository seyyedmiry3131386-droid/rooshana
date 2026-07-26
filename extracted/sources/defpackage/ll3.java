package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ll3 extends kl3 {
    public static final SparseIntArray y;
    public long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(rr6.section_action, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ll3(View view) {
        Object[] objArrI0 = a79.i0(view, 3, null, y);
        super(null, view, (SmallFillOvalButton) objArrI0[2], (MyketTextView) objArrI0[1]);
        this.x = -1L;
        ((RelativeLayout) objArrI0[0]).setTag(null);
        this.w.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().N;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.w.setBackground(new ColorDrawable(i));
            this.w.setTextColor(i2);
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
