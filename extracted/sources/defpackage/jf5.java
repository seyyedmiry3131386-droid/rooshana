package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class jf5 extends if5 {
    public static final SparseIntArray y;
    public long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(rr6.instagram, 1);
        sparseIntArray.put(rr6.telegram, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jf5(View view) {
        Object[] objArrI0 = a79.i0(view, 3, null, y);
        super(null, view, (ImageView) objArrI0[1], (ImageView) objArrI0[2]);
        this.x = -1L;
        ((LinearLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.x = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }
}
