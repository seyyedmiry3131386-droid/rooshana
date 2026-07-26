package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ag5 extends zf5 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.update_animation, 1);
        sparseIntArray.put(rr6.title, 2);
        sparseIntArray.put(rr6.description, 3);
        sparseIntArray.put(rr6.dialog_button, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ag5(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, C);
        super(null, view, (MyketTextView) objArrI0[3], (DialogButtonComponent) objArrI0[4], (LinearLayout) objArrI0[0], (MyketTextView) objArrI0[2], (LottieAnimationView) objArrI0[1]);
        this.B = -1L;
        this.x.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.B = 0L;
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
