package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class k83 extends j83 {
    public static final SparseIntArray A;
    public final FrameLayout x;
    public final RelativeLayout y;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.app_icon, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k83(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, A);
        super(null, view, (AppIconView) objArrI0[3], (MyketTextView) objArrI0[2]);
        this.z = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.x = frameLayout;
        frameLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArrI0[1];
        this.y = relativeLayout;
        relativeLayout.setTag(null);
        this.w.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
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
            Ripple ripple = sj8.b().O;
            i = sj8.b().l;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            uy6.p(this.x, i2, null);
            this.y.setBackground(new ColorDrawable(i));
            this.w.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
