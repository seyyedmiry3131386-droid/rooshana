package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class u53 extends a79 {
    public final MyketTextView v;
    public final MyketTextView w;
    public long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u53(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 3, null, null);
        MyketTextView myketTextView = (MyketTextView) objArrI0[1];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[2];
        this.v = myketTextView;
        this.w = myketTextView2;
        this.x = -1L;
        this.v.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.w.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().m : 0;
        if (j2 != 0) {
            this.v.setTextColor(i);
            this.w.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }
}
