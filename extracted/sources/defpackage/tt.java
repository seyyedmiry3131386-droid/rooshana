package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class tt extends a79 {
    public final ConstraintLayout v;
    public final MyketTextView w;
    public final MyketTextView x;
    public long y;

    public tt(ea1 ea1Var, View view, ConstraintLayout constraintLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = myketTextView;
        this.x = myketTextView2;
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
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            uy6.m(i2, this.v);
            this.w.setTextColor(i);
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
