package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class tl5 extends sl5 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.arrow, 4);
        sparseIntArray.put(rr6.scroll_view, 5);
        sparseIntArray.put(rr6.dialog_button, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tl5(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, C);
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI0[6];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[3];
        LinearLayout linearLayout = (LinearLayout) objArrI0[0];
        super(null, view, myketTextView, dialogButtonComponent, myketTextView2, linearLayout, (MyketTextView) objArrI0[1]);
        this.B = -1L;
        this.v.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
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
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().A;
            i2 = sj8.b().n;
            i3 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i2);
            this.x.setTextColor(i);
            this.z.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 1L;
        }
        k0();
    }
}
