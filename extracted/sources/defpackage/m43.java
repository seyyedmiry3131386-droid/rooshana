package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m43 extends a79 {
    public final MyketTextView A;
    public final ScreenshotView v;
    public final FrameLayout w;
    public final FrameLayout x;
    public final View y;
    public final MovieLabelView z;

    public m43(ea1 ea1Var, View view, ScreenshotView screenshotView, FrameLayout frameLayout, FrameLayout frameLayout2, View view2, MovieLabelView movieLabelView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = frameLayout;
        this.x = frameLayout2;
        this.y = view2;
        this.z = movieLabelView;
        this.A = myketTextView;
    }
}
