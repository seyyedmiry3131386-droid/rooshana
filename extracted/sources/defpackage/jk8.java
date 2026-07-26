package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.TryAgainView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jk8 extends a79 {
    public static final /* synthetic */ int D = 0;
    public final MyketTextView A;
    public final View B;
    public final TryAgainView C;
    public final MyketTextView v;
    public final AppCompatImageView w;
    public final ConstraintLayout x;
    public final RecyclerView y;
    public final NestedScrollView z;

    public jk8(ea1 ea1Var, View view, MyketTextView myketTextView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, MyketTextView myketTextView2, View view2, TryAgainView tryAgainView) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = appCompatImageView;
        this.x = constraintLayout;
        this.y = recyclerView;
        this.z = nestedScrollView;
        this.A = myketTextView2;
        this.B = view2;
        this.C = tryAgainView;
    }
}
