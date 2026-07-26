package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.BindAutoCompleteView;

/* JADX INFO: loaded from: classes3.dex */
public final class is0 extends hs0 {
    public static final SparseIntArray z;
    public final ConstraintLayout x;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.input, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public is0(View view) {
        Object[] objArrI0 = a79.i0(view, 3, null, z);
        BindAutoCompleteView bindAutoCompleteView = (BindAutoCompleteView) objArrI0[1];
        super(null, view, bindAutoCompleteView);
        this.y = -1L;
        this.v.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.x = constraintLayout;
        constraintLayout.setTag(null);
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
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().n;
            i2 = sj8.b().l;
            i3 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i3);
            this.v.setHintTextColor(i);
            o40.D(i2, this.x);
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
