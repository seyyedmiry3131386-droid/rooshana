package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class pj7 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final BigTextButton v;
    public final MyketTextView w;
    public final /* synthetic */ int x;
    public final ConstraintLayout y;
    public long z;

    public pj7(ea1 ea1Var, View view, BigTextButton bigTextButton, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = bigTextButton;
        this.w = myketTextView;
    }

    private final void n0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().q;
            Ripple ripple = sj8.b().O;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            uy6.m(i2, this.v);
            o40.D(i, this.y);
            this.w.setTextColor(i3);
        }
    }

    private final boolean o0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void p0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        switch (this.x) {
            case 0:
                n0();
                return;
            default:
                synchronized (this) {
                    j = this.z;
                    this.z = 0L;
                    break;
                }
                long j2 = j & 1;
                if (j2 != 0) {
                    i = sj8.b().q;
                    Ripple ripple = sj8.b().O;
                    i3 = sj8.b().m;
                    i2 = ripple.c;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                }
                if (j2 != 0) {
                    uy6.m(i2, this.v);
                    o40.D(i, this.y);
                    this.w.setTextColor(i3);
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
                        return this.z != 0;
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
                    this.z = 1L;
                    break;
                }
                k0();
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pj7(int i, View view) {
        this.x = i;
        switch (i) {
            case 1:
                Object[] objArrI0 = a79.i0(view, 3, null, null);
                this(null, view, (BigTextButton) objArrI0[2], (MyketTextView) objArrI0[1]);
                this.z = -1L;
                this.v.setTag(null);
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
                this.y = constraintLayout;
                constraintLayout.setTag(null);
                this.w.setTag(null);
                l0(view);
                g0();
                break;
            default:
                Object[] objArrI02 = a79.i0(view, 3, null, null);
                this(null, view, (BigTextButton) objArrI02[2], (MyketTextView) objArrI02[1]);
                this.z = -1L;
                this.v.setTag(null);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI02[0];
                this.y = constraintLayout2;
                constraintLayout2.setTag(null);
                this.w.setTag(null);
                l0(view);
                g0();
                break;
        }
    }
}
