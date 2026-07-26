package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.ui.PlayerView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kg5 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final AppCompatImageView A;
    public final View v;
    public final ScreenshotView w;
    public final LoadingView x;
    public final MyketTextView y;
    public final PlayerView z;

    public kg5(ea1 ea1Var, View view, View view2, ScreenshotView screenshotView, LoadingView loadingView, MyketTextView myketTextView, PlayerView playerView, AppCompatImageView appCompatImageView) {
        super(0, view, ea1Var);
        this.v = view2;
        this.w = screenshotView;
        this.x = loadingView;
        this.y = myketTextView;
        this.z = playerView;
        this.A = appCompatImageView;
    }
}
