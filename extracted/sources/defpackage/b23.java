package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b23 extends a79 {
    public final FrameLayout v;
    public final ImageView w;
    public final MyketTextView x;
    public final ConstraintLayout y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b23(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 4, null, null);
        FrameLayout frameLayout = (FrameLayout) objArrI0[2];
        ImageView imageView = (ImageView) objArrI0[3];
        MyketTextView myketTextView = (MyketTextView) objArrI0[1];
        this.v = frameLayout;
        this.w = imageView;
        this.x = myketTextView;
        this.z = -1L;
        this.v.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.y = constraintLayout;
        constraintLayout.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            uy6.p(this.v, i2, null);
            uy6.m(i2, this.y);
            uy6.n(i2, this.w);
            this.x.setTextColor(i);
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
