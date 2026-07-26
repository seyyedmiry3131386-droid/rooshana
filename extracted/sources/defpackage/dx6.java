package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class dx6 extends cx6 {
    public static final SparseIntArray B;
    public long A;
    public final FrameLayout z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.card_view, 2);
        sparseIntArray.put(rr6.app_icon, 3);
        sparseIntArray.put(rr6.download_status, 4);
        sparseIntArray.put(rr6.download, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dx6(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, B);
        AppIconView appIconView = (AppIconView) objArrI0[3];
        MyketTextView myketTextView = (MyketTextView) objArrI0[1];
        super(null, view, appIconView, myketTextView, (FastDownloadView) objArrI0[5], (MyketTextView) objArrI0[4]);
        this.A = -1L;
        this.w.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.z = frameLayout;
        frameLayout.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i);
            uy6.p(this.z, i2, null);
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
