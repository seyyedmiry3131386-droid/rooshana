package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ob9 extends nb9 {
    public static final SparseIntArray C;
    public final ConstraintLayout A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.icon, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ob9(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, C);
        super(null, view, (BigTextButton) objArrI0[2], (View) objArrI0[3], (ImageView) objArrI0[4], (MyketTextView) objArrI0[1]);
        this.B = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.A = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().c;
            Ripple ripple = sj8.b().O;
            i3 = sj8.b().v;
            i4 = sj8.b().n;
            i5 = sj8.b().p;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i);
            uy6.m(i2, this.v);
            t61.s(i3, this.w);
            o40.D(i5, this.A);
            this.y.setTextColor(i4);
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
