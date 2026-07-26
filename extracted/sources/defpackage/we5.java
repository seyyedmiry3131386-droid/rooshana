package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.FixedCoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* JADX INFO: loaded from: classes3.dex */
public final class we5 extends ve5 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.full_background, 4);
        sparseIntArray.put(rr6.content, 5);
        sparseIntArray.put(rr6.myket_toolbar, 6);
        sparseIntArray.put(rr6.toolbar_layout, 7);
        sparseIntArray.put(rr6.fab, 8);
        sparseIntArray.put(rr6.mini_player_view, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public we5(View view) {
        Object[] objArrI0 = a79.i0(view, 10, null, A);
        AppBarLayout appBarLayout = (AppBarLayout) objArrI0[1];
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) objArrI0[2];
        FixedCoordinatorLayout fixedCoordinatorLayout = (FixedCoordinatorLayout) objArrI0[0];
        View view2 = (View) objArrI0[3];
        super(null, view, appBarLayout, collapsingToolbarLayout, fixedCoordinatorLayout, view2);
        this.z = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().p;
            i2 = sj8.b().N;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setBackground(new ColorDrawable(i2));
            this.w.setBackground(new ColorDrawable(i2));
            this.w.setStatusBarScrim(new ColorDrawable(i2));
            ((BottomNavigationView) this.y).setBackground(new ColorDrawable(i));
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
