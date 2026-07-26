package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class jw0 extends iw0 {
    public static final SparseIntArray E;
    public final View C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.header, 3);
        sparseIntArray.put(rr6.scroll_view, 4);
        sparseIntArray.put(rr6.star_hint, 5);
        sparseIntArray.put(rr6.ratingbar, 6);
        sparseIntArray.put(rr6.dialog_button, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jw0(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, E);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI0[7];
        MyketTextView myketTextView = (MyketTextView) objArrI0[2];
        DialogHeaderComponent dialogHeaderComponent = (DialogHeaderComponent) objArrI0[3];
        LinearLayout linearLayout = (LinearLayout) objArrI0[0];
        MyketRatingBar myketRatingBar = (MyketRatingBar) objArrI0[6];
        super(null, view, dialogButtonComponent, myketTextView, dialogHeaderComponent, linearLayout, myketRatingBar, (MyketTextView) objArrI0[5]);
        this.D = -1L;
        this.w.setTag(null);
        this.y.setTag(null);
        View view2 = (View) objArrI0[1];
        this.C = view2;
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
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().v;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i2);
            t61.s(i, this.C);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.D = 1L;
        }
        k0();
    }
}
