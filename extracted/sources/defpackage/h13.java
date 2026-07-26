package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class h13 extends g13 {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.recycler_view, 1);
        sparseIntArray.put(rr6.start_shadow, 2);
        sparseIntArray.put(rr6.end_shadow, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h13(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, z);
        super(null, view, (ImageView) objArrI0[3], (RecyclerView) objArrI0[1], (ImageView) objArrI0[2]);
        this.y = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.y = 0L;
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
