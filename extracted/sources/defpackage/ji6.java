package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ji6 extends ii6 {
    public static final SparseIntArray B;
    public long A;
    public final FrameLayout y;
    public final RelativeLayout z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.icon, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ji6(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, B);
        super(null, view, (ImageView) objArrI0[4], (ImageView) objArrI0[3], (MyketTextView) objArrI0[2]);
        this.A = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.y = frameLayout;
        frameLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArrI0[1];
        this.z = relativeLayout;
        relativeLayout.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
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
            j = this.A;
            this.A = 0L;
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
            uy6.p(this.y, i2, null);
            this.z.setBackground(new ColorDrawable(i));
            uy6.n(i2, this.w);
            this.x.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.A = 1L;
        }
        k0();
    }
}
