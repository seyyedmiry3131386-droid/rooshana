package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class so5 extends ro5 {
    public static final SparseIntArray A;
    public final ConstraintLayout y;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.image, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public so5(View view) {
        Object[] objArrI0 = a79.i0(view, 3, null, A);
        super(null, view, (LottieAnimationView) objArrI0[2], (MyketTextView) objArrI0[1]);
        this.z = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.y = constraintLayout;
        constraintLayout.setTag(null);
        this.w.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().l;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            o40.D(i, this.y);
            this.w.setTextColor(i2);
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
