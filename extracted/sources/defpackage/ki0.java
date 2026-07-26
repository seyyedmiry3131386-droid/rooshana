package defpackage;

import android.view.View;
import ir.mservices.market.views.BigEmptyRectangleButton;
import ir.mservices.market.views.BigFillRectangleButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ki0 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final BigEmptyRectangleButton v;
    public final BigFillRectangleButton w;
    public final /* synthetic */ int x;
    public long y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ki0(int i, View[] viewArr) {
        this.x = i;
        switch (i) {
            case 1:
                Object[] objArrJ0 = a79.j0(viewArr, 2, null);
                this(null, viewArr[0], (BigEmptyRectangleButton) objArrJ0[1], (BigFillRectangleButton) objArrJ0[0]);
                this.y = -1L;
                this.v.setTag(null);
                this.w.setTag(null);
                m0(viewArr);
                g0();
                break;
            default:
                Object[] objArrJ02 = a79.j0(viewArr, 2, null);
                this(null, viewArr[0], (BigEmptyRectangleButton) objArrJ02[1], (BigFillRectangleButton) objArrJ02[0]);
                this.y = -1L;
                this.v.setTag(null);
                this.w.setTag(null);
                m0(viewArr);
                g0();
                break;
        }
    }

    private final void n0() {
        synchronized (this) {
            this.y = 0L;
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
        switch (this.x) {
            case 0:
                n0();
                return;
            default:
                synchronized (this) {
                    this.y = 0L;
                    break;
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

    public ki0(ea1 ea1Var, View view, BigEmptyRectangleButton bigEmptyRectangleButton, BigFillRectangleButton bigFillRectangleButton) {
        super(0, view, ea1Var);
        this.v = bigEmptyRectangleButton;
        this.w = bigFillRectangleButton;
    }
}
