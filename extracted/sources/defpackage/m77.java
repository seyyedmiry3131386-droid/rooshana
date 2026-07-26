package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class m77 extends i7 {
    public static final SparseIntArray x;
    public final ConstraintLayout v;
    public long w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x = sparseIntArray;
        sparseIntArray.put(rr6.imagecell, 1);
        sparseIntArray.put(rr6.textTitle, 2);
        sparseIntArray.put(rr6.image, 3);
        sparseIntArray.put(rr6.description, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m77(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 5, null, x);
        this.w = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.v = constraintLayout;
        constraintLayout.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.w;
            this.w = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().l : 0;
        if (j2 != 0) {
            o40.D(i, this.v);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.w = 1L;
        }
        k0();
    }
}
