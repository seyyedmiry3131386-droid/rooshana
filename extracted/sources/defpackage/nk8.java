package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class nk8 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final ImageView v;
    public final MyketTextView w;
    public final ConstraintLayout x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk8(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 3, null, null);
        ImageView imageView = (ImageView) objArrI0[1];
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        this.v = imageView;
        this.w = myketTextView;
        this.y = -1L;
        this.v.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.x = constraintLayout;
        constraintLayout.setTag(null);
        this.w.setTag(null);
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
            i = sj8.b().p;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            uy6.n(i2, this.v);
            o40.D(i, this.x);
            this.w.setTextColor(i3);
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
