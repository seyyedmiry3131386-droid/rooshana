package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.StepView;

/* JADX INFO: loaded from: classes3.dex */
public final class co2 extends ao2 {
    public static final SparseIntArray H;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(rr6.step_1, 4);
        sparseIntArray.put(rr6.step_2, 5);
        sparseIntArray.put(rr6.step_3, 6);
        sparseIntArray.put(rr6.step_4, 7);
        sparseIntArray.put(rr6.dialog_button_component, 8);
        sparseIntArray.put(rr6.view_pager, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public co2(View view) {
        Object[] objArrI0 = a79.i0(view, 10, null, H);
        super(null, view, (MyketTextView) objArrI0[2], (DialogButtonComponent) objArrI0[8], (MyketTextView) objArrI0[3], (StepView) objArrI0[4], (StepView) objArrI0[5], (StepView) objArrI0[6], (StepView) objArrI0[7], (MyketTextView) objArrI0[1], (ViewPager2) objArrI0[9]);
        this.G = -1L;
        this.v.setTag(null);
        this.x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().A;
            i2 = sj8.b().q;
            i3 = sj8.b().n;
            i4 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i3);
            this.x.setTextColor(i);
            o40.D(i2, this.F);
            this.C.setTextColor(i4);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.G = 1L;
        }
        k0();
    }
}
