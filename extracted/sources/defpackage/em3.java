package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class em3 extends dm3 {
    public static final sk6 z;
    public final FrameLayout x;
    public long y;

    static {
        sk6 sk6Var = new sk6(4);
        z = sk6Var;
        sk6Var.J(1, new String[]{"more_title_view"}, new int[]{3}, new int[]{js6.more_title_view});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public em3(View view) {
        Object[] objArrI0 = a79.i0(view, 4, z, null);
        super(null, view, (MyketTextView) objArrI0[2], (gy4) objArrI0[3]);
        this.y = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.x = frameLayout;
        frameLayout.setTag(null);
        ((LinearLayout) objArrI0[1]).setTag(null);
        this.v.setTag(null);
        gy4 gy4Var = this.w;
        if (gy4Var != null) {
            gy4Var.q = this;
        }
        l0(view);
        g0();
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
        long j2 = j & 2;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            uy6.p(this.x, i2, null);
            this.v.setTextColor(i);
        }
        this.w.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.y != 0) {
                    return true;
                }
                return this.w.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 2L;
        }
        this.w.g0();
        k0();
    }
}
