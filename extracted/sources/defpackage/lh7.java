package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class lh7 extends s53 {
    public static final sk6 z;
    public final FrameLayout w;
    public final r28 x;
    public long y;

    static {
        sk6 sk6Var = new sk6(4);
        z = sk6Var;
        sk6Var.J(1, new String[]{"special_main_card"}, new int[]{3}, new int[]{js6.special_main_card});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lh7(View view) {
        Object[] objArrI0 = a79.i0(view, 4, z, null);
        super(null, view, (MyketTextView) objArrI0[2]);
        this.y = -1L;
        this.v.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.w = frameLayout;
        frameLayout.setTag(null);
        ((RelativeLayout) objArrI0[1]).setTag(null);
        r28 r28Var = (r28) objArrI0[3];
        this.x = r28Var;
        if (r28Var != null) {
            r28Var.q = this;
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
            this.v.setTextColor(i);
            uy6.p(this.w, i2, null);
        }
        this.x.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.y != 0) {
                    return true;
                }
                return this.x.e0();
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
        this.x.g0();
        k0();
    }
}
