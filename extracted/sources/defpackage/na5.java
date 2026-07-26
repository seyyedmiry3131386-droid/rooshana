package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class na5 extends a79 {
    public static final /* synthetic */ int B = 0;
    public long A;
    public final ImageView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final ConstraintLayout y;
    public final View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na5(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 5, null, null);
        ImageView imageView = (ImageView) objArrI0[1];
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[3];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.v = imageView;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = constraintLayout;
        this.A = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        View view2 = (View) objArrI0[4];
        this.z = view2;
        view2.setTag(null);
        this.x.setTag(null);
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
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().v;
            i3 = sj8.b().n;
            i4 = sj8.b().l;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            uy6.n(i2, this.v);
            this.w.setTextColor(i3);
            t61.s(i, this.z);
            uy6.m(i2, this.x);
            o40.D(i4, this.y);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.A = 1L;
        }
        k0();
    }
}
