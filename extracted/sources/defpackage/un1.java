package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class un1 extends tn1 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.layout, 3);
        sparseIntArray.put(rr6.dialog_title, 4);
        sparseIntArray.put(rr6.dialog_img, 5);
        sparseIntArray.put(rr6.dialog_button, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public un1(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, B);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI0[6];
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[1];
        DialogHeaderComponent dialogHeaderComponent = (DialogHeaderComponent) objArrI0[4];
        super(null, view, dialogButtonComponent, myketTextView, myketTextView2, dialogHeaderComponent);
        this.A = -1L;
        this.w.setTag(null);
        this.x.setTag(null);
        ((FrameLayout) objArrI0[0]).setTag(null);
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
            i = sj8.b().n;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i2);
            this.x.setTextColor(i);
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
