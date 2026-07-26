package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AvatarImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class p13 extends o13 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.first_avatar, 1);
        sparseIntArray.put(rr6.second_avatar, 2);
        sparseIntArray.put(rr6.third_avatar, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p13(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, A);
        super(null, view, (AvatarImageView) objArrI0[1], (AvatarImageView) objArrI0[2], (AvatarImageView) objArrI0[3]);
        this.z = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.z = 0L;
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
