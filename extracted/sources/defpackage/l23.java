package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class l23 extends a79 {
    public final MyketTextView v;
    public long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l23(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 2, null, null);
        MyketTextView myketTextView = (MyketTextView) objArrI0[1];
        this.v = myketTextView;
        this.w = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.v.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.w;
            this.w = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            this.v.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.w = 1L;
        }
        k0();
    }
}
