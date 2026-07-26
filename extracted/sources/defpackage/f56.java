package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class f56 extends md {
    public final /* synthetic */ int x;
    public long y;

    /* JADX WARN: Illegal instructions before constructor call */
    public f56(int i, View view) {
        this.x = i;
        switch (i) {
            case 1:
                Object[] objArrI0 = a79.i0(view, 3, null, null);
                super((ea1) null, view, (MyketTextView) objArrI0[2], (MyketTextView) objArrI0[1]);
                this.y = -1L;
                ((MyketTextView) this.v).setTag(null);
                ((LinearLayout) objArrI0[0]).setTag(null);
                ((MyketTextView) this.w).setTag(null);
                l0(view);
                g0();
                break;
            default:
                Object[] objArrI02 = a79.i0(view, 3, null, null);
                super((ea1) null, view, (MyketTextView) objArrI02[2], (MyketTextView) objArrI02[1]);
                this.y = -1L;
                ((MyketTextView) this.v).setTag(null);
                ((LinearLayout) objArrI02[0]).setTag(null);
                ((MyketTextView) this.w).setTag(null);
                l0(view);
                g0();
                break;
        }
    }

    private final void n0() {
        long j;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            ((MyketTextView) this.v).setTextColor(i);
            ((MyketTextView) this.w).setTextColor(i);
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
                int i = j2 != 0 ? sj8.b().n : 0;
                if (j2 != 0) {
                    ((MyketTextView) this.v).setTextColor(i);
                    ((MyketTextView) this.w).setTextColor(i);
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
}
