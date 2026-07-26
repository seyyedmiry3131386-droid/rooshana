package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.movie.download.MovieDownloadButton;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r43 extends a79 {
    public final ScreenshotView v;
    public final FrameLayout w;
    public final MovieDownloadButton x;
    public final MyketTextView y;
    public final MyketTextView z;

    public r43(ea1 ea1Var, View view, ScreenshotView screenshotView, FrameLayout frameLayout, MovieDownloadButton movieDownloadButton, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = frameLayout;
        this.x = movieDownloadButton;
        this.y = myketTextView;
        this.z = myketTextView2;
    }
}
