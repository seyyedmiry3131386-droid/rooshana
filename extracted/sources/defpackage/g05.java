package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g05 extends a79 {
    public final SeriesBackground A;
    public final MyketTextView B;
    public final ProgressBar C;
    public final MovieWatchProgressBackgroundView D;
    public final FrameLayout v;
    public final View w;
    public final MovieLabelView x;
    public final ScreenshotView y;
    public final MyketTextView z;

    public g05(ea1 ea1Var, View view, FrameLayout frameLayout, View view2, MovieLabelView movieLabelView, ScreenshotView screenshotView, MyketTextView myketTextView, SeriesBackground seriesBackground, MyketTextView myketTextView2, ProgressBar progressBar, MovieWatchProgressBackgroundView movieWatchProgressBackgroundView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = view2;
        this.x = movieLabelView;
        this.y = screenshotView;
        this.z = myketTextView;
        this.A = seriesBackground;
        this.B = myketTextView2;
        this.C = progressBar;
        this.D = movieWatchProgressBackgroundView;
    }
}
