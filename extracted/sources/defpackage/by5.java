package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class by5 extends ay5 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.back, 2);
        sparseIntArray.put(rr6.avatar, 3);
        sparseIntArray.put(rr6.notification, 4);
        sparseIntArray.put(rr6.more, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public by5(View view) {
        Object[] objArrI0 = a79.i0(view, 6, null, C);
        super(null, view, (AvatarImageView) objArrI0[3], (ImageView) objArrI0[2], (ImageView) objArrI0[5], (MyketTextView) objArrI0[1], (ImageView) objArrI0[4]);
        this.B = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        this.y.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().m : 0;
        if (j2 != 0) {
            this.y.setTextColor(i);
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
