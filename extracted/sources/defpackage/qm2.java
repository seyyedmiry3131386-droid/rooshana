package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class qm2 extends pm2 {
    public static final SparseIntArray A;
    public final View y;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.tab_layout, 2);
        sparseIntArray.put(rr6.view_pager, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qm2(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, A);
        super(null, view, (TabLayout) objArrI0[2], (ViewPager2) objArrI0[3]);
        this.z = -1L;
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        View view2 = (View) objArrI0[1];
        this.y = view2;
        view2.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().v : 0;
        if (j2 != 0) {
            t61.s(i, this.y);
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
