package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class u89 extends t89 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.tabs, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u89(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 3, A);
        super(null, viewArr[0], (ImageView) objArrJ0[1], (TabLayout) objArrJ0[2], (FrameLayout) objArrJ0[0]);
        this.z = -1L;
        this.v.setTag(null);
        this.x.setTag(null);
        m0(viewArr);
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
