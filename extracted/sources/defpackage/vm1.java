package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class vm1 extends um1 {
    public static final SparseIntArray D;
    public final View B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.title, 3);
        sparseIntArray.put(rr6.scroll_view, 4);
        sparseIntArray.put(rr6.content, 5);
        sparseIntArray.put(rr6.radio_group, 6);
        sparseIntArray.put(rr6.dialogButton, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vm1(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, D);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI0[7];
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        LinearLayout linearLayout = (LinearLayout) objArrI0[0];
        RadioGroup radioGroup = (RadioGroup) objArrI0[6];
        super(null, view, dialogButtonComponent, myketTextView, linearLayout, radioGroup, (DialogHeaderComponent) objArrI0[3]);
        this.C = -1L;
        this.w.setTag(null);
        this.x.setTag(null);
        View view2 = (View) objArrI0[1];
        this.B = view2;
        view2.setTag(null);
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
            i = sj8.b().v;
            i2 = sj8.b().n;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i2);
            t61.s(i, this.B);
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
