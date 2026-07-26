package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.MyketWebView;
import ir.mservices.market.views.TryAgainView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b46 extends a79 {
    public final MyketTextView A;
    public final View B;
    public final View C;
    public final MyketWebView D;
    public final ImageView v;
    public final FrameLayout w;
    public final ImageView x;
    public final ConstraintLayout y;
    public final TryAgainView z;

    public b46(ea1 ea1Var, View view, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, ConstraintLayout constraintLayout, TryAgainView tryAgainView, MyketTextView myketTextView, View view2, View view3, MyketWebView myketWebView) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = frameLayout;
        this.x = imageView2;
        this.y = constraintLayout;
        this.z = tryAgainView;
        this.A = myketTextView;
        this.B = view2;
        this.C = view3;
        this.D = myketWebView;
    }
}
