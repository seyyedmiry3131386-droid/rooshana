package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import ir.mservices.market.views.ElasticFrameLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u60 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final ImageView v;
    public final CoordinatorLayout w;
    public final ElasticFrameLayout x;
    public final NestedScrollView y;
    public final MyketTextView z;

    public u60(ea1 ea1Var, View view, ImageView imageView, CoordinatorLayout coordinatorLayout, ElasticFrameLayout elasticFrameLayout, NestedScrollView nestedScrollView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = coordinatorLayout;
        this.x = elasticFrameLayout;
        this.y = nestedScrollView;
        this.z = myketTextView;
    }
}
