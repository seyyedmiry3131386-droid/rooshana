package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class g63 extends z6 {
    public static final SparseIntArray A;
    public final FrameLayout y;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.guideline, 4);
        sparseIntArray.put(rr6.icon, 5);
        sparseIntArray.put(rr6.arrow, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g63(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, A);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[1];
        super(null, view, constraintLayout, (MyketTextView) objArrI0[3], (MyketTextView) objArrI0[2]);
        this.z = -1L;
        ((ConstraintLayout) this.v).setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.y = frameLayout;
        frameLayout.setTag(null);
        ((MyketTextView) this.w).setTag(null);
        ((MyketTextView) this.x).setTag(null);
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
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            AlphaColor alphaColor = sj8.b().I;
            Ripple ripple = sj8.b().O;
            int i4 = sj8.b().l;
            i3 = sj8.b().m;
            i = alphaColor != null ? alphaColor.a : 0;
            i = ripple.c;
            i2 = i;
            i = i4;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            o40.D(i, (ConstraintLayout) this.v);
            uy6.p(this.y, i, null);
            ((MyketTextView) this.w).setTextColor(i2);
            ((MyketTextView) this.x).setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
