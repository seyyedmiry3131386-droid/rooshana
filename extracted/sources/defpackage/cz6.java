package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import ir.mservices.market.views.TryAgainView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cz6 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final ExtendedSwipeRefreshLayout A;
    public final TryAgainView B;
    public final View v;
    public final kc2 w;
    public final ConstraintLayout x;
    public final RecyclerView y;
    public final View z;

    public cz6(ea1 ea1Var, View view, View view2, kc2 kc2Var, ConstraintLayout constraintLayout, RecyclerView recyclerView, View view3, ExtendedSwipeRefreshLayout extendedSwipeRefreshLayout, TryAgainView tryAgainView) {
        super(1, view, ea1Var);
        this.v = view2;
        this.w = kc2Var;
        this.x = constraintLayout;
        this.y = recyclerView;
        this.z = view3;
        this.A = extendedSwipeRefreshLayout;
        this.B = tryAgainView;
    }
}
