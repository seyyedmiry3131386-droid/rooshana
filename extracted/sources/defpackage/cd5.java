package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class cd5 extends md {
    public static final SparseIntArray z;
    public final FrameLayout x;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.guideline, 3);
        sparseIntArray.put(rr6.icon, 4);
        sparseIntArray.put(rr6.balloon, 5);
        sparseIntArray.put(rr6.arrow, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cd5(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, z);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[1];
        super((ea1) null, view, constraintLayout, (MyketTextView) objArrI0[2]);
        this.y = -1L;
        ((ConstraintLayout) this.v).setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.x = frameLayout;
        frameLayout.setTag(null);
        ((MyketTextView) this.w).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().l;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            o40.D(i, (ConstraintLayout) this.v);
            uy6.p(this.x, i2, null);
            ((MyketTextView) this.w).setTextColor(i3);
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
