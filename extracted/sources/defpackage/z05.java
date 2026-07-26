package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class z05 extends a79 {
    public final ConstraintLayout v;
    public final MyketTextView w;
    public final /* synthetic */ int x;
    public long y;

    public z05(ea1 ea1Var, View view, ConstraintLayout constraintLayout, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = myketTextView;
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
            i = sj8.b().n;
            i2 = sj8.b().l;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            o40.D(i2, this.v);
            this.w.setTextColor(i);
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
        switch (this.x) {
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
                    i = sj8.b().n;
                    i2 = sj8.b().l;
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (j2 != 0) {
                    o40.D(i2, this.v);
                    this.w.setTextColor(i);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        switch (this.x) {
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
        switch (this.x) {
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
    public z05(int i, View view) {
        this.x = i;
        switch (i) {
            case 1:
                Object[] objArrI0 = a79.i0(view, 3, null, null);
                this(null, view, (ConstraintLayout) objArrI0[1], (MyketTextView) objArrI0[2]);
                this.y = -1L;
                this.v.setTag(null);
                ((FrameLayout) objArrI0[0]).setTag(null);
                this.w.setTag(null);
                l0(view);
                g0();
                break;
            default:
                Object[] objArrI02 = a79.i0(view, 3, null, null);
                this(null, view, (ConstraintLayout) objArrI02[1], (MyketTextView) objArrI02[2]);
                this.y = -1L;
                this.v.setTag(null);
                ((FrameLayout) objArrI02[0]).setTag(null);
                this.w.setTag(null);
                l0(view);
                g0();
                break;
        }
    }
}
