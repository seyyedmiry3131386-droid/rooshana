package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class yl3 extends xl3 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.icon, 4);
        sparseIntArray.put(rr6.title, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yl3(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, C);
        super(null, view, (MyketTextView) objArrI0[2], (ImageView) objArrI0[4], (FrameLayout) objArrI0[0], (MyketTextView) objArrI0[1], (ImageView) objArrI0[3], (MyketTextView) objArrI0[5]);
        this.B = -1L;
        this.v.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i);
            this.y.setTextColor(i);
            uy6.n(i2, this.z);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 1L;
        }
        k0();
    }
}
