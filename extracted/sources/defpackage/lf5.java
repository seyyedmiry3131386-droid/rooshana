package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class lf5 extends kf5 {
    public long y;

    /* JADX WARN: Illegal instructions before constructor call */
    public lf5(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 2, null);
        super(null, viewArr[0], (ImageView) objArrJ0[0], (MyketTextView) objArrJ0[1]);
        this.y = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.y = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
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
        k0();
    }
}
