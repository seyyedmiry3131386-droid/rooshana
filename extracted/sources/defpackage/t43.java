package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t43 extends a79 {
    public final MyketTextView A;
    public final MyketTextView B;
    public final SeriesBackground C;
    public final MyketTextView D;
    public final MyketTextView E;
    public final ScreenshotView v;
    public final FrameLayout w;
    public final LoadingView x;
    public final ImageView y;
    public final MyketTextView z;

    public t43(ea1 ea1Var, View view, ScreenshotView screenshotView, FrameLayout frameLayout, LoadingView loadingView, ImageView imageView, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3, SeriesBackground seriesBackground, MyketTextView myketTextView4, MyketTextView myketTextView5) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = frameLayout;
        this.x = loadingView;
        this.y = imageView;
        this.z = myketTextView;
        this.A = myketTextView2;
        this.B = myketTextView3;
        this.C = seriesBackground;
        this.D = myketTextView4;
        this.E = myketTextView5;
    }
}
