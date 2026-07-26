package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class w31 extends a79 {
    public final /* synthetic */ int v;
    public final FrameLayout w;
    public long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(ea1 ea1Var, View view, FrameLayout frameLayout) {
        super(0, view, ea1Var);
        this.v = 0;
        this.w = frameLayout;
    }

    private final void n0() {
        synchronized (this) {
            this.x = 0L;
        }
    }

    private final void o0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().N : 0;
        if (j2 != 0) {
            this.w.setBackground(new ColorDrawable(i));
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
                int i = j2 != 0 ? sj8.b().N : 0;
                if (j2 != 0) {
                    this.w.setBackground(new ColorDrawable(i));
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(int i, View view) {
        super(0, view, null);
        this.v = i;
        switch (i) {
            case 2:
                Object[] objArrI0 = a79.i0(view, 1, null, null);
                super(0, view, null);
                this.x = -1L;
                FrameLayout frameLayout = (FrameLayout) objArrI0[0];
                this.w = frameLayout;
                frameLayout.setTag(null);
                l0(view);
                g0();
                break;
            default:
                Object[] objArrI02 = a79.i0(view, 1, null, null);
                this.x = -1L;
                FrameLayout frameLayout2 = (FrameLayout) objArrI02[0];
                this.w = frameLayout2;
                frameLayout2.setTag(null);
                l0(view);
                g0();
                break;
        }
    }
}
