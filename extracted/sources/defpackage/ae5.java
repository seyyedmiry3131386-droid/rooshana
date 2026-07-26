package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ae5 extends zd5 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.indicator, 1);
        sparseIntArray.put(rr6.pager, 2);
        sparseIntArray.put(rr6.shadow, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ae5(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, A);
        super(null, view, (TabLayout) objArrI0[1], (ViewPager2) objArrI0[2], (View) objArrI0[3]);
        this.z = -1L;
        ((RelativeLayout) objArrI0[0]).setTag(null);
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
