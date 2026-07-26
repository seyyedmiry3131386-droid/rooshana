package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iz6 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final View v;
    public final kc2 w;
    public final RecyclerView x;
    public final View y;
    public final ExtendedSwipeRefreshLayout z;

    public iz6(ea1 ea1Var, View view, View view2, kc2 kc2Var, RecyclerView recyclerView, View view3, ExtendedSwipeRefreshLayout extendedSwipeRefreshLayout) {
        super(1, view, ea1Var);
        this.v = view2;
        this.w = kc2Var;
        this.x = recyclerView;
        this.y = view3;
        this.z = extendedSwipeRefreshLayout;
    }
}
