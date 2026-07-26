package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ii5 extends i7 {
    public static final SparseIntArray w;
    public long v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w = sparseIntArray;
        sparseIntArray.put(rr6.content, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii5(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 2, null, w);
        this.v = -1L;
        ((FrameLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.v = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.v = 1L;
        }
        k0();
    }
}
