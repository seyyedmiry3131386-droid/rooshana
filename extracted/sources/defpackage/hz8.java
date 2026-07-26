package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class hz8 extends gz8 {
    public static final SparseIntArray z;
    public final ConstraintLayout w;
    public final MyketTextView x;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.icon, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hz8(View view) {
        Object[] objArrI0 = a79.i0(view, 3, null, z);
        super(null, view, (LottieAnimationView) objArrI0[2]);
        this.y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.w = constraintLayout;
        constraintLayout.setTag(null);
        MyketTextView myketTextView = (MyketTextView) objArrI0[1];
        this.x = myketTextView;
        myketTextView.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
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
            o40.D(i, this.w);
            this.x.setTextColor(i2);
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
