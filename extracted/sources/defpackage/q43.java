package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class q43 extends a79 {
    public final MyketTextView v;
    public final /* synthetic */ int w;
    public final ConstraintLayout x;
    public long y;

    public q43(ea1 ea1Var, View view, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = myketTextView;
    }

    private final void n0() {
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
            i = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            uy6.m(i2, this.x);
            this.v.setTextColor(i);
        }
    }

    private final boolean o0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void p0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        switch (this.w) {
            case 0:
                n0();
                return;
            default:
                synchronized (this) {
                    j = this.y;
                    this.y = 0L;
                    break;
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
                    uy6.m(i2, this.x);
                    this.v.setTextColor(i);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        switch (this.w) {
            case 0:
                return o0();
            default:
                synchronized (this) {
                    try {
                        return this.y != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        switch (this.w) {
            case 0:
                p0();
                return;
            default:
                synchronized (this) {
                    this.y = 1L;
                    break;
                }
                k0();
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q43(int i, View view) {
        this.w = i;
        switch (i) {
            case 1:
                Object[] objArrI0 = a79.i0(view, 2, null, null);
                this(null, view, (MyketTextView) objArrI0[1]);
                this.y = -1L;
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
                this.x = constraintLayout;
                constraintLayout.setTag(null);
                this.v.setTag(null);
                l0(view);
                g0();
                break;
            default:
                Object[] objArrI02 = a79.i0(view, 2, null, null);
                this(null, view, (MyketTextView) objArrI02[1]);
                this.y = -1L;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI02[0];
                this.x = constraintLayout2;
                constraintLayout2.setTag(null);
                this.v.setTag(null);
                l0(view);
                g0();
                break;
        }
    }
}
