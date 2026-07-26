package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class f50 extends a79 {
    public final /* synthetic */ int v;
    public final MyketTextView w;
    public long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f50(ea1 ea1Var, View view, MyketTextView myketTextView, int i) {
        super(0, view, ea1Var);
        this.v = i;
        this.w = myketTextView;
    }

    private final void n0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().E : 0;
        if (j2 != 0) {
            this.w.setTextColor(i);
        }
    }

    private final void o0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            this.w.setTextColor(i);
        }
    }

    private final boolean p0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean q0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void r0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }

    private final void s0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        switch (this.v) {
            case 0:
                n0();
                return;
            case 1:
                o0();
                return;
            default:
                synchronized (this) {
                    j = this.x;
                    this.x = 0L;
                    break;
                }
                long j2 = j & 1;
                int i = j2 != 0 ? sj8.b().m : 0;
                if (j2 != 0) {
                    this.w.setTextColor(i);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        switch (this.v) {
            case 0:
                return p0();
            case 1:
                return q0();
            default:
                synchronized (this) {
                    try {
                        return this.x != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        switch (this.v) {
            case 0:
                r0();
                return;
            case 1:
                s0();
                return;
            default:
                synchronized (this) {
                    this.x = 1L;
                    break;
                }
                k0();
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f50(View view) {
        this.v = 2;
        Object[] objArrI0 = a79.i0(view, 2, null, null);
        this(null, view, (MyketTextView) objArrI0[1], 2);
        this.x = -1L;
        ((LinearLayout) objArrI0[0]).setTag(null);
        this.w.setTag(null);
        l0(view);
        g0();
    }
}
