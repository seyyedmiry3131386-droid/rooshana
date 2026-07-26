package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class rl1 extends ql1 {
    public static final sk6 y;
    public final FrameLayout w;
    public long x;

    static {
        sk6 sk6Var = new sk6(2);
        y = sk6Var;
        sk6Var.J(0, new String[]{"more_title_view"}, new int[]{1}, new int[]{js6.more_title_view});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rl1(View view) {
        Object[] objArrI0 = a79.i0(view, 2, y, null);
        super(null, view, (gy4) objArrI0[1]);
        this.x = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.w = frameLayout;
        frameLayout.setTag(null);
        gy4 gy4Var = this.v;
        if (gy4Var != null) {
            gy4Var.q = this;
        }
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
        long j2 = j & 2;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.p(this.w, i, null);
        }
        this.v.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.x != 0) {
                    return true;
                }
                return this.v.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 2L;
        }
        this.v.g0();
        k0();
    }
}
