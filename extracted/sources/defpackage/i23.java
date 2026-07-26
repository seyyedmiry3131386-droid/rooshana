package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketRadioButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class i23 extends a79 {
    public final ConstraintLayout A;
    public long B;
    public final CardView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final MyketRadioButton z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i23(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 6, null, null);
        CardView cardView = (CardView) objArrI0[0];
        MyketTextView myketTextView = (MyketTextView) objArrI0[4];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[3];
        MyketTextView myketTextView3 = (MyketTextView) objArrI0[2];
        MyketRadioButton myketRadioButton = (MyketRadioButton) objArrI0[5];
        this.v = cardView;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = myketTextView3;
        this.z = myketRadioButton;
        this.B = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[1];
        this.A = constraintLayout;
        constraintLayout.setTag(null);
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
        int i3;
        int i4;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().q;
            i2 = sj8.b().n;
            i3 = sj8.b().l;
            i4 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i4);
            this.x.setTextColor(i4);
            o40.D(i, this.A);
            this.y.setTextColor(i4);
            this.z.setBackground(new ColorDrawable(i3));
            this.z.setTextColor(i2);
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
