package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q93 extends a79 {
    public final ProgressBar A;
    public final MovieWatchProgressBackgroundView B;
    public final ConstraintLayout v;
    public final MyketTextView w;
    public final ScreenshotView x;
    public final SeriesBackground y;
    public final MyketTextView z;

    public q93(ea1 ea1Var, View view, ConstraintLayout constraintLayout, MyketTextView myketTextView, ScreenshotView screenshotView, SeriesBackground seriesBackground, MyketTextView myketTextView2, ProgressBar progressBar, MovieWatchProgressBackgroundView movieWatchProgressBackgroundView) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = myketTextView;
        this.x = screenshotView;
        this.y = seriesBackground;
        this.z = myketTextView2;
        this.A = progressBar;
        this.B = movieWatchProgressBackgroundView;
    }
}
