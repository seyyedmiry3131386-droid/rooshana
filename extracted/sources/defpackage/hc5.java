package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hc5 extends a79 {
    public final ConstraintLayout A;
    public final ImageView v;
    public final ConstraintLayout w;
    public final LoadingView x;
    public final ImageView y;
    public final FrameLayout z;

    public hc5(ea1 ea1Var, View view, ImageView imageView, ConstraintLayout constraintLayout, LoadingView loadingView, ImageView imageView2, FrameLayout frameLayout, ConstraintLayout constraintLayout2) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = constraintLayout;
        this.x = loadingView;
        this.y = imageView2;
        this.z = frameLayout;
        this.A = constraintLayout2;
    }
}
