package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class l84 extends k84 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.content_view, 2);
        sparseIntArray.put(rr6.icon, 3);
        sparseIntArray.put(rr6.description, 4);
        sparseIntArray.put(rr6.ad_info, 5);
        sparseIntArray.put(rr6.download_state_view, 6);
        sparseIntArray.put(rr6.app_info, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l84(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, D);
        MyketAdInfoView myketAdInfoView = (MyketAdInfoView) objArrI0[5];
        AppInfoView appInfoView = (AppInfoView) objArrI0[7];
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        super(null, view, myketAdInfoView, appInfoView, frameLayout, (MyketTextView) objArrI0[4], (FastDownloadView) objArrI0[6], (AppIconView) objArrI0[3], (MyketTextView) objArrI0[1]);
        this.C = -1L;
        this.x.setTag(null);
        this.B.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
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
            uy6.p(this.x, i2, null);
            this.B.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.C = 1L;
        }
        k0();
    }
}
