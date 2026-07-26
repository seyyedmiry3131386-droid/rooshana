package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k43 extends a79 {
    public final MyketTextView A;
    public final MyketTextView B;
    public final ScreenshotView v;
    public final FrameLayout w;
    public final ScreenshotView x;
    public final MyketTextView y;
    public final MovieLabelView z;

    public k43(ea1 ea1Var, View view, ScreenshotView screenshotView, FrameLayout frameLayout, ScreenshotView screenshotView2, MyketTextView myketTextView, MovieLabelView movieLabelView, MyketTextView myketTextView2, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = frameLayout;
        this.x = screenshotView2;
        this.y = myketTextView;
        this.z = movieLabelView;
        this.A = myketTextView2;
        this.B = myketTextView3;
    }
}
