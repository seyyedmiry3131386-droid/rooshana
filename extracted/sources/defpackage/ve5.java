package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.FixedCoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ve5 extends a79 {
    public final AppBarLayout v;
    public final CollapsingToolbarLayout w;
    public final FixedCoordinatorLayout x;
    public final View y;

    public ve5(ea1 ea1Var, View view, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, FixedCoordinatorLayout fixedCoordinatorLayout, View view2) {
        super(0, view, ea1Var);
        this.v = appBarLayout;
        this.w = collapsingToolbarLayout;
        this.x = fixedCoordinatorLayout;
        this.y = view2;
    }
}
