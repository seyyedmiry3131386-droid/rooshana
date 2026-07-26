package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class g43 extends a79 {
    public final MyketTextView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g43(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 4, null, null);
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[1];
        MyketTextView myketTextView3 = (MyketTextView) objArrI0[3];
        this.v = myketTextView;
        this.w = myketTextView2;
        this.x = myketTextView3;
        this.y = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
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
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().n;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i2);
            this.w.setTextColor(i2);
            this.x.setTextColor(i);
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
