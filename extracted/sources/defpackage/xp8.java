package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xp8 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final ImageView A;
    public final MyketTextView B;
    public final ImageView v;
    public final FrameLayout w;
    public final BigFillOvalButton x;
    public final ScreenshotView y;
    public final SeriesBackground z;

    public xp8(ea1 ea1Var, View view, ImageView imageView, FrameLayout frameLayout, BigFillOvalButton bigFillOvalButton, ScreenshotView screenshotView, SeriesBackground seriesBackground, ImageView imageView2, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = frameLayout;
        this.x = bigFillOvalButton;
        this.y = screenshotView;
        this.z = seriesBackground;
        this.A = imageView2;
        this.B = myketTextView;
    }
}
