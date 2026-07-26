package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o93 extends a79 {
    public final ImageView A;
    public final ScreenshotView v;
    public final MyketTextView w;
    public final ImageView x;
    public final SeriesBackground y;
    public final MyketTextView z;

    public o93(ea1 ea1Var, View view, ScreenshotView screenshotView, MyketTextView myketTextView, ImageView imageView, SeriesBackground seriesBackground, MyketTextView myketTextView2, ImageView imageView2) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = myketTextView;
        this.x = imageView;
        this.y = seriesBackground;
        this.z = myketTextView2;
        this.A = imageView2;
    }
}
