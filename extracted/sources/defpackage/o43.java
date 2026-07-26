package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o43 extends a79 {
    public final ProgressBar A;
    public final MovieWatchProgressBackgroundView B;
    public final ScreenshotView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final SeriesBackground y;
    public final MyketTextView z;

    public o43(ea1 ea1Var, View view, ScreenshotView screenshotView, MyketTextView myketTextView, MyketTextView myketTextView2, SeriesBackground seriesBackground, MyketTextView myketTextView3, ProgressBar progressBar, MovieWatchProgressBackgroundView movieWatchProgressBackgroundView) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = seriesBackground;
        this.z = myketTextView3;
        this.A = progressBar;
        this.B = movieWatchProgressBackgroundView;
    }
}
