package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class y73 extends x73 {
    public static final SparseIntArray C;
    public final FrameLayout A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.dismiss, 3);
        sparseIntArray.put(rr6.approve, 4);
        sparseIntArray.put(rr6.avatar, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y73(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, C);
        super(null, view, (SmallEmptyMediumTextOvalButton) objArrI0[4], (AvatarImageView) objArrI0[5], (SmallFillOvalButton) objArrI0[3], (MyketTextView) objArrI0[2], (MyketTextView) objArrI0[1]);
        this.B = -1L;
        this.y.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.A = frameLayout;
        frameLayout.setTag(null);
        this.z.setTag(null);
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
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.y.setTextColor(i);
            uy6.p(this.A, i2, null);
            this.z.setTextColor(i3);
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
