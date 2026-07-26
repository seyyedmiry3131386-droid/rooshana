package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class f54 extends e54 {
    public static final SparseIntArray C;
    public final ConstraintLayout A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.progress_bar, 4);
        sparseIntArray.put(rr6.score, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f54(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, C);
        super(null, view, (MyketTextView) objArrI0[1], (MyketTextView) objArrI0[2], (ProgressBar) objArrI0[4], (MyketTextView) objArrI0[5], (MyketTextView) objArrI0[3]);
        this.B = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.A = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().p;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i2);
            this.w.setTextColor(i2);
            o40.D(i, this.A);
            this.z.setTextColor(i2);
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
