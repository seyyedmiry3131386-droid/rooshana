package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class vb3 extends ub3 {
    public static final SparseIntArray A;
    public final FrameLayout y;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.section_title, 1);
        sparseIntArray.put(rr6.ad_info, 2);
        sparseIntArray.put(rr6.section_more_title, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vb3(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, A);
        super(null, view, (MyketAdInfoView) objArrI0[2], (SmallBoldTextButton) objArrI0[3], (MyketTextView) objArrI0[1]);
        this.z = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.y = frameLayout;
        frameLayout.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.p(this.y, i, null);
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
