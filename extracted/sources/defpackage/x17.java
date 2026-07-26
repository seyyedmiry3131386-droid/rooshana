package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.AlphaColor;

/* JADX INFO: loaded from: classes3.dex */
public final class x17 extends w17 {
    public static final SparseIntArray B;
    public long A;
    public final ConstraintLayout z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(rr6.shimmer_avatar, 1);
        sparseIntArray.put(rr6.shimmer_nickname, 2);
        sparseIntArray.put(rr6.shimmer_description_1, 3);
        sparseIntArray.put(rr6.shimmer_description_2, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x17(View view) {
        Object[] objArrI0 = a79.i0(view, 5, null, B);
        super(null, view, (View) objArrI0[1], (View) objArrI0[3], (View) objArrI0[4], (View) objArrI0[2]);
        this.A = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.z = constraintLayout;
        constraintLayout.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        AlphaColor alphaColor;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 1;
        int i = (j2 == 0 || (alphaColor = sj8.b().J) == null) ? 0 : alphaColor.a;
        if (j2 != 0) {
            o40.D(i, this.z);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.A = 1L;
        }
        k0();
    }
}
