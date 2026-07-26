package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ir.mservices.market.views.MovieNewTagView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SmallMovieOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v43 extends a79 {
    public final MovieNewTagView A;
    public final MyketTextView B;
    public final ProgressBar C;
    public final ScreenshotView v;
    public final FrameLayout w;
    public final SmallMovieOvalButton x;
    public final MyketTextView y;
    public final View z;

    public v43(ea1 ea1Var, View view, ScreenshotView screenshotView, FrameLayout frameLayout, SmallMovieOvalButton smallMovieOvalButton, MyketTextView myketTextView, View view2, MovieNewTagView movieNewTagView, MyketTextView myketTextView2, ProgressBar progressBar) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = frameLayout;
        this.x = smallMovieOvalButton;
        this.y = myketTextView;
        this.z = view2;
        this.A = movieNewTagView;
        this.B = myketTextView2;
        this.C = progressBar;
    }
}
